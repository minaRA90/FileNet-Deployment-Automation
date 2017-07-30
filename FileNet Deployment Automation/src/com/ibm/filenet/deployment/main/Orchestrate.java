package com.ibm.filenet.deployment.main;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import com.ibm.filenet.deployment.config.Config;
import com.ibm.filenet.deployment.factory.DeploymentOperationFactory;
import com.ibm.filenet.deployment.operations.DeploymentOperation;
import com.ibm.filenet.deployment.utils.IOUtil;

public class Orchestrate {

	private static final String resourcesPackagePath="/com/ibm/filenet/deployment/resources";
	public static JAXBContext jaxbContext;
	private DeploymentOperationFactory operationFactory;
	private DeploymentOperation operation;
	private Marshaller marshaller;
	private IOUtil ioUtil;
	private Config config;
	private String deploymentWorkSpace;
	private String deploymentManagerPath;
	private String deploymentTreeLocation;
	
	
	static {
		try {
			jaxbContext = JAXBContext.newInstance("com.ibm.filenet.deployment.operations.impl:com.ibm.filenet.deployment.config");
		} catch (JAXBException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) throws Exception {
	
		 //String configPath = args[0];
		 String configPath = "C:\\Users\\Administrator\\Desktop\\Config.xml";
		 
        
		Orchestrate orchestra = new Orchestrate(configPath);
		//orchestra.createSourceEnvironment();
		//orchestra.createDestinationEnvironment();
		orchestra.createSourceDestinationPair();
	
	}
	
	public Orchestrate(String configPath) throws Exception{
		
		operationFactory = new DeploymentOperationFactory();
		ioUtil = new IOUtil();
		
	     //read config file and create config object	
		InputStream in = new FileInputStream(configPath);
		marshaller = jaxbContext.createMarshaller();
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

		Unmarshaller unMarchaller = jaxbContext.createUnmarshaller();
		config = (Config)unMarchaller.unmarshal(in);
		
		//create deploymnet workspace folder
		 ioUtil.createFolder("FNDeployment",config.getDeploymentWorkspace());
		 deploymentWorkSpace = config.getDeploymentWorkspace()+"\\FNDeployment";
		 deploymentManagerPath = config.getDeploymentManagerPath();
		 deploymentTreeLocation = config.getDeploymentTreeLocation();

	}
		
	public boolean createSourceEnvironment() {
		
		try{
			//create source environment
			config.setName("Source Environment");
	        config.setConnection(config.getSourceConnection());
			operation = operationFactory.createDeploymentOperation("com.ibm.filenet.deployment.operations.impl.CreateEnvironment", config);

			ioUtil.createFile(deploymentWorkSpace,"createSourceEnvironmentOp.xml");
			File file = new File(deploymentWorkSpace+"\\createSourceEnvironmentOp.xml");
			FileOutputStream fop = new FileOutputStream(file);
			marshaller.marshal(operation,fop);
			ioUtil.cmdExecuteCommand(deploymentManagerPath," -p admin -o "+deploymentWorkSpace+"\\createSourceEnvironmentOp.xml");
			
		}catch(Exception e){
			System.out.println("System Exception Occured while creating deploymnet operation");
			e.printStackTrace();
		}
		
		return true;
	}
	
	public boolean createDestinationEnvironment(){
		
		try{
			//create destination environment 
			config.setName("Destination Environment");
	        config.setConnection(config.getDestinationConnection());
	        operation = operationFactory.createDeploymentOperation("com.ibm.filenet.deployment.operations.impl.CreateEnvironment", config);
		
			ioUtil.createFile(deploymentWorkSpace,"createDestinationEnvironmentOp.xml");
			File file = new File(deploymentWorkSpace+"\\createDestinationEnvironmentOp.xml");
			FileOutputStream fop = new FileOutputStream(file);
			marshaller.marshal(operation,fop);
			ioUtil.cmdExecuteCommand(deploymentManagerPath,"-p $RV#Saib -o "+deploymentWorkSpace+"\\createDestinationEnvironmentOp.xml");
			
		}catch(Exception e){
			System.out.println("System Exception Occured while creating deploymnet operation");
			e.printStackTrace();
		}
		return true;
	}
	
	public boolean createSourceDestinationPair() throws Exception{
		
		String pairName = config.getPair();
		String pairPath = deploymentTreeLocation+"\\Pairs\\";
		
		ioUtil.createFolder(pairName,pairPath);
		pairPath+=pairName;
		
		InputStream source = getClass().getResourceAsStream(resourcesPackagePath+"/PairConfig.xml");	
		Path to = Paths.get(pairPath+"/PairConfig.xml");
        Files.copy(source,to, StandardCopyOption.REPLACE_EXISTING);
        
		source = getClass().getResourceAsStream(resourcesPackagePath+"/DataMap_ObjectStore.xml");	
		to = Paths.get(pairPath+"/DataMap_ObjectStore.xml");
        Files.copy(source,to, StandardCopyOption.REPLACE_EXISTING);
        
        source = getClass().getResourceAsStream(resourcesPackagePath+"/DataMap_Principal.xml");	
		to = Paths.get(pairPath+"/DataMap_Principal.xml");
        Files.copy(source,to, StandardCopyOption.REPLACE_EXISTING);
        
        
        source = getClass().getResourceAsStream(resourcesPackagePath+"/DataMap_ConnectionPoint.xml");	
		to = Paths.get(pairPath+"/DataMap_ConnectionPoint.xml");
        Files.copy(source,to, StandardCopyOption.REPLACE_EXISTING);
        
        source = getClass().getResourceAsStream(resourcesPackagePath+"/DataMap_Service.xml");	
		to = Paths.get(pairPath+"/DataMap_Service.xml");
        Files.copy(source,to, StandardCopyOption.REPLACE_EXISTING);


		return true;
	}

}

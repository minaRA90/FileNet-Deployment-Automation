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

import com.ibm.filenet.deployment.assets.Manifest;
import com.ibm.filenet.deployment.config.Config;
import com.ibm.filenet.deployment.factory.DeploymentOperationFactory;
import com.ibm.filenet.deployment.factory.ExportManifestFactory;
import com.ibm.filenet.deployment.operations.DeploymentOperation;
import com.ibm.filenet.deployment.utils.IOUtil;

public class DeploymentManager {

	private static final String resourcesPackagePath="/com/ibm/filenet/deployment/resources";
	public static JAXBContext jaxbContext;
	private DeploymentOperationFactory operationFactory;
	private ExportManifestFactory manifestFactory;
	private DeploymentOperation operation;
	private Marshaller marshaller;
	private IOUtil ioUtil;
	private Config config;
	private String deploymentWorkSpace;
	private String deploymentManagerPath;
	private String deploymentTreeLocation;
	
	
	static {
		try {
			jaxbContext = JAXBContext.newInstance("com.ibm.filenet.deployment.operations:com.ibm.filenet.deployment.config:com.ibm.filenet.deployment.assets");
		} catch (JAXBException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) throws Exception {
	
		 //String configPath = args[0];
		 String configPath = "C:\\Users\\Administrator\\Desktop\\Config.xml";
		 
        
		   DeploymentManager deploymentManager = new DeploymentManager();
		   deploymentManager.init(configPath);
		// deploymentManager.createSourceEnvironment();
		// deploymentManager.createDestinationEnvironment();
		// deploymentManager.createSourceDestinationPair();
		   deploymentManager.createExportManifest();
		   deploymentManager.exportDeployDataSet();
		
	}
	
	public void init(String configPath) throws Exception{
		
		operationFactory = new DeploymentOperationFactory();
		manifestFactory = new ExportManifestFactory();
		ioUtil = new IOUtil();
		
	     //read config file and create config object	
		InputStream in = new FileInputStream(configPath);
		marshaller = jaxbContext.createMarshaller();
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

		Unmarshaller unMarchaller = jaxbContext.createUnmarshaller();
		config = (Config)unMarchaller.unmarshal(in);
		
		//create deployment workspace folder
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
			operation = operationFactory.createDeploymentOperation("com.ibm.filenet.deployment.operations.CreateEnvironment", config);

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
	        operation = operationFactory.createDeploymentOperation("com.ibm.filenet.deployment.operations.CreateEnvironment", config);
		
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

	public boolean createExportManifest() throws Exception {
		
		String sourceAssetsPath = config.getDeploymentTreeLocation();
		sourceAssetsPath+="\\Environments\\Source Environment\\Assets";
		String exportManifestPath = sourceAssetsPath+"\\ExportManifests";
		
		
		ioUtil.createFolder("ExportManifests", sourceAssetsPath);
		File file = new File(exportManifestPath+"\\Manifest.xml");
		FileOutputStream fop = new FileOutputStream(file);
		
		Manifest manifest = manifestFactory.createExportManifest(config);	
		marshaller.marshal(manifest,fop);
		
		
		config.setDeployDataSet(sourceAssetsPath+"\\CEAssets");
		config.setExportManifest(exportManifestPath+"\\Manifest.xml");
		
		return true;
	}
	
	public boolean exportDeployDataSet() throws Exception{
		//delete contents of Assets Folder
	
		
		//
		
		config.setEnvironment("Source Environment");
        config.setConnection(config.getSourceConnection());
        operation = operationFactory.createDeploymentOperation("com.ibm.filenet.deployment.operations.ExportDeployDataSet", config);
	
		ioUtil.createFile(deploymentWorkSpace,"ExportDeployDataSettOp.xml");
		File file = new File(deploymentWorkSpace+"\\ExportDeployDataSettOp.xml");
		FileOutputStream fop = new FileOutputStream(file);
		marshaller.marshal(operation,fop);
		ioUtil.cmdExecuteCommand(deploymentManagerPath,"-p $RV#Saib -o "+deploymentWorkSpace+"\\ExportDeployDataSettOp.xml");

		return true;
	}

}

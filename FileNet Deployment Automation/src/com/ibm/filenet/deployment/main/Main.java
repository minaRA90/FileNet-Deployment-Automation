package com.ibm.filenet.deployment.main;


import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

import com.ibm.filenet.deployment.config.Config;
import com.ibm.filenet.deployment.factory.DeploymentOperationFactory;
import com.ibm.filenet.deployment.operations.DeploymentOperation;

public class Main {
	
	public static String deploymentTreeLocation = "C:\\IBM\\FileNet\\ContentEngine\\tools\\deploy\\P8DeploymentData";
	public static void main(String[] args) throws Exception {

		Config config = new Config();
		config.setDeploymentTreeLocation(deploymentTreeLocation);
		
		config.setDeleteDestinationFilesOnError("true");
		config.setDeployDataSet("TestDeployDataSet");
		config.setEnvironment("Test Environment");
		config.setExportManifest("C:\\Test Environment\\Assets\\ExportManifests\\TestManifest");
		config.setVersion("5.2.1");
		
		
		DeploymentOperationFactory factory = new DeploymentOperationFactory();
		DeploymentOperation operation =factory.createDeploymentOperation("com.ibm.filenet.deployment.operations.ExportDeployDataSet",config);
		
		
		JAXBContext jaxbContext = JAXBContext.newInstance("com.ibm.filenet.deployment.operations");
		Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

		// output pretty printed
		jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

		jaxbMarshaller.marshal(operation, System.out);
		
	}
	
}

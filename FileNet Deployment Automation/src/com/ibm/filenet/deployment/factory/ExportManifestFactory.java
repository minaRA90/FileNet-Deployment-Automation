package com.ibm.filenet.deployment.factory;

import java.util.List;

import com.ibm.filenet.deployment.assets.ClassDefinitionAsset;
import com.ibm.filenet.deployment.assets.Manifest;
import com.ibm.filenet.deployment.config.Config;
import com.ibm.filenet.deployment.utils.FileNetUtil;

public class ExportManifestFactory {

	public Manifest createExportManifest(Config config){
		
		Manifest manifest = new Manifest();
		FileNetUtil fnUtil = new FileNetUtil();
		List<String> symbolicNames = config.getSymbolicNames();
		List<ClassDefinitionAsset> classDefinitions= fnUtil.retrieveClassDefinitionAssets(symbolicNames);
		//retrieve list of asset types
		
		manifest.setClassDefinitions(classDefinitions);
		manifest.setFdmVersion(config.getVersion());
		manifest.setObjectStore(config.getPrimaryObjectStore());
		
		return manifest;
	}
}

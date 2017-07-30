package com.ibm.filenet.deployment.enums;

public enum Exceptions {

	DEPLOYMENT_DIR_CREATION_FAILED("Failed to create Deployment Directory"),
	DEPLOYMENT_FILE_CREATION_FAILED("Failed to create Deployment File");
	
	
	private String eText;

	private Exceptions(String eText) {
		this.eText = eText;
	}
	
	public String toString(){
		return eText+ " : ";
	}
	
	
}

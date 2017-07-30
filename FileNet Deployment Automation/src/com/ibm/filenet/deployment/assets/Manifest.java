package com.ibm.filenet.deployment.assets;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "SavedManifest")
public class Manifest {

	@XmlAttribute(name ="primaryObjectStore")
	protected String objectStore;
	
	@XmlAttribute(name="FDMVersion")
	protected String fdmVersion;
	
	@XmlElementWrapper(name= "ClassDefinitions")
	@XmlElement(name="ClassDefinition")
	protected List<ClassDefinitionAsset> classDefinitions = new ArrayList<>();

	public String getObjectStore() {
		return objectStore;
	}

	public void setObjectStore(String objectStore) {
		this.objectStore = objectStore;
	}
	
	public String getFdmVersion() {
		return fdmVersion;
	}
	
	public void setFdmVersion(String fdmVersion) {
		this.fdmVersion = fdmVersion;
	}

	public List<ClassDefinitionAsset> getClassDefinitions() {
		return classDefinitions;
	}

	public void setClassDefinitions(List<ClassDefinitionAsset> classDefinitions) {
		this.classDefinitions = classDefinitions;
	}
	
}

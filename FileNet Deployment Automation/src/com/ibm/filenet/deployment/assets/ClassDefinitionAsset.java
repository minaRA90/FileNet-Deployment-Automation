package com.ibm.filenet.deployment.assets;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;




import com.ibm.filenet.deployment.xml.IncludeOptions;


@XmlAccessorType(XmlAccessType.FIELD)
public class ClassDefinitionAsset {

	@XmlAttribute(name = "objectStore")
	protected String objectStoreName;
	
	@XmlElement(name = "Name")
	protected String name;
	
	@XmlElement(name = "Id")
	protected String id;
	
	@XmlElement(name ="IncludeOptions")
	protected  IncludeOptions includeOptions = new IncludeOptions();


	public String getObjectStoreName() {
		return objectStoreName;
	}

	public void setObjectStoreName(String objectStoreName) {
		this.objectStoreName = objectStoreName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public IncludeOptions getIncludeOptions() {
		return includeOptions;
	}

	public void setIncludeOptions(IncludeOptions includeOptions) {
		this.includeOptions = includeOptions;
	}
	
	
}

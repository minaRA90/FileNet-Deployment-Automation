//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.2-147 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.05.08 at 11:54:51 AM EEST 
//


package com.ibm.filenet.deployment.operations;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="Environment" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/all>
 *       &lt;attribute ref="{}mode use="required""/>
 *       &lt;attribute name="includeStoragePolicies" type="{}boolean" />
 *       &lt;attribute name="includeStorageAreas" type="{}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {

})
@XmlRootElement(name = "RetrieveObjectStoreInfoFromDomain")
public class RetrieveObjectStoreInfoFromDomain implements IOperation {

    @XmlElement(name = "Environment", required = true)
    protected String environment;
    @XmlAttribute(name = "mode", required = true)
    protected String mode;
    @XmlAttribute(name = "includeStoragePolicies")
    protected String includeStoragePolicies;
    @XmlAttribute(name = "includeStorageAreas")
    protected String includeStorageAreas;

    /**
     * Gets the value of the environment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnvironment() {
        return environment;
    }

    /**
     * Sets the value of the environment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnvironment(String value) {
        this.environment = value;
    }

    /**
     * Gets the value of the mode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMode() {
        return mode;
    }

    /**
     * Sets the value of the mode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMode(String value) {
        this.mode = value;
    }

    /**
     * Gets the value of the includeStoragePolicies property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIncludeStoragePolicies() {
        return includeStoragePolicies;
    }

    /**
     * Sets the value of the includeStoragePolicies property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIncludeStoragePolicies(String value) {
        this.includeStoragePolicies = value;
    }

    /**
     * Gets the value of the includeStorageAreas property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIncludeStorageAreas() {
        return includeStorageAreas;
    }

    /**
     * Sets the value of the includeStorageAreas property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIncludeStorageAreas(String value) {
        this.includeStorageAreas = value;
    }

}

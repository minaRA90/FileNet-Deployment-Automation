package com.ibm.filenet.deployment.operations;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

import com.ibm.filenet.deployment.operations.ConvertDeployDataSet;
import com.ibm.filenet.deployment.operations.CreateEnvironment;
import com.ibm.filenet.deployment.operations.ExpandDeployPackage;
import com.ibm.filenet.deployment.operations.ExportDeployDataSet;
import com.ibm.filenet.deployment.operations.GenerateAuditReport;
import com.ibm.filenet.deployment.operations.ImportDeployDataSet;
import com.ibm.filenet.deployment.operations.MapData;
import com.ibm.filenet.deployment.operations.ReassignObjectStore;
import com.ibm.filenet.deployment.operations.RetrieveConnectionPointInfoFromDeployDataSet;
import com.ibm.filenet.deployment.operations.RetrieveConnectionPointInfoFromDomain;
import com.ibm.filenet.deployment.operations.RetrieveInfoFromEnvironment;
import com.ibm.filenet.deployment.operations.RetrieveObjectStoreInfoFromDeployDataSet;
import com.ibm.filenet.deployment.operations.RetrieveObjectStoreInfoFromDomain;
import com.ibm.filenet.deployment.operations.RetrievePrincipalInfoFromDeployDataSet;
import com.ibm.filenet.deployment.operations.RetrievePrincipalInfoFromDomain;
import com.ibm.filenet.deployment.operations.RetrieveServiceInfoFromDeployDataSet;


/**
* This object contains factory methods for each 
* Java content interface and Java element interface 
* generated in the com.ibm.filenet.deployment.java package. 
* <p>An ObjectFactory allows you to programatically 
* construct new instances of the Java representation 
* for XML content. The Java representation of XML 
* content can consist of schema derived interfaces 
* and classes representing the binding of schema 
* type definitions, element declarations and model 
* groups.  Factory methods for each of these are 
* provided in this class.
* 
*/
@XmlRegistry
public class ObjectFactory {

 private final static QName _SourceDeployDataSet_QNAME = new QName("", "SourceDeployDataSet");
 private final static QName _WorkflowConfigurationOption_QNAME = new QName("", "WorkflowConfigurationOption");
 private final static QName _UpgradeDeploymentTree_QNAME = new QName("", "UpgradeDeploymentTree");
 private final static QName _OptionSetPath_QNAME = new QName("", "OptionSetPath");
 private final static QName _CreateOption_QNAME = new QName("", "CreateOption");
 private final static QName _UpdateOption_QNAME = new QName("", "UpdateOption");
 private final static QName _AuditOption_QNAME = new QName("", "AuditOption");
 private final static QName _ConvertedDeployDataSet_QNAME = new QName("", "ConvertedDeployDataSet");

 /**
  * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.ibm.filenet.deployment.java
  * 
  */
 public ObjectFactory() {
 }

 
 /**
  * Create an instance of {@link RetrieveObjectStoreInfoFromDeployDataSet }
  * 
  */
 public RetrieveObjectStoreInfoFromDeployDataSet createRetrieveObjectStoreInfoFromDeployDataSet() {
     return new RetrieveObjectStoreInfoFromDeployDataSet();
 }

 /**
  * Create an instance of {@link CreateEnvironment }
  * 
  */
 public CreateEnvironment createCreateEnvironment() {
     return new CreateEnvironment();
 }

 /**
  * Create an instance of {@link ReassignObjectStore.DestinationEnvironment }
  * 
  */
 public ReassignObjectStore.DestinationEnvironment createReassignObjectStoreDestinationEnvironment() {
     return new ReassignObjectStore.DestinationEnvironment();
 }

 
 /**
  * Create an instance of {@link com.ibm.filenet.deployment.xml.DestinationEnvironment }
  * 
  */
 public com.ibm.filenet.deployment.xml.DestinationEnvironment createDestinationEnvironment() {
     return new com.ibm.filenet.deployment.xml.DestinationEnvironment();
 }

 
 /**
  * Create an instance of {@link GenerateAuditReport.AuditReport }
  * 
  */
 public GenerateAuditReport.AuditReport createGenerateAuditReportAuditReport() {
     return new GenerateAuditReport.AuditReport();
 }

 /**
  * Create an instance of {@link ImportDeployDataSet }
  * 
  */
 public ImportDeployDataSet createImportDeployDataSet() {
     return new ImportDeployDataSet();
 }

 /**
  * Create an instance of {@link ReassignObjectStore.SourceEnvironment }
  * 
  */
 public ReassignObjectStore.SourceEnvironment createReassignObjectStoreSourceEnvironment() {
     return new ReassignObjectStore.SourceEnvironment();
 }

 /**
  * Create an instance of {@link GenerateAuditReport }
  * 
  */
 public GenerateAuditReport createGenerateAuditReport() {
     return new GenerateAuditReport();
 }

 
 /**
  * Create an instance of {@link DeploymentOperation }
  * 
  */
 public DeploymentOperation createDeploymentOperation() {
     return new DeploymentOperation();
 }

 /**
  * Create an instance of {@link ExpandDeployPackage }
  * 
  */
 public ExpandDeployPackage createExpandDeployPackage() {
     return new ExpandDeployPackage();
 }

 /**
  * Create an instance of {@link ExportDeployDataSet }
  * 
  */
 public ExportDeployDataSet createExportDeployDataSet() {
     return new ExportDeployDataSet();
 }

 /**
  * Create an instance of {@link RetrieveConnectionPointInfoFromDeployDataSet }
  * 
  */
 public RetrieveConnectionPointInfoFromDeployDataSet createRetrieveConnectionPointInfoFromDeployDataSet() {
     return new RetrieveConnectionPointInfoFromDeployDataSet();
 }

 /**
  * Create an instance of {@link RetrieveInfoFromEnvironment }
  * 
  */
 public RetrieveInfoFromEnvironment createRetrieveInfoFromEnvironment() {
     return new RetrieveInfoFromEnvironment();
 }

 /**
  * Create an instance of {@link MapData }
  * 
  */
 public MapData createMapData() {
     return new MapData();
 }

 /**
  * Create an instance of {@link ConvertDeployDataSet }
  * 
  */
 public ConvertDeployDataSet createConvertDeployDataSet() {
     return new ConvertDeployDataSet();
 }
 
 /**
  * Create an instance of {@link CreateDeployPackage }
  * 
  */
 public CreateDeployPackage createCreateDeployPackage() {
     return new CreateDeployPackage();
 }


 /**
  * Create an instance of {@link RetrievePrincipalInfoFromDeployDataSet }
  * 
  */
 public RetrievePrincipalInfoFromDeployDataSet createRetrievePrincipalInfoFromDeployDataSet() {
     return new RetrievePrincipalInfoFromDeployDataSet();
 }


 /**
  * Create an instance of {@link com.ibm.filenet.deployment.xml.SourceEnvironment }
  * 
  */
 public com.ibm.filenet.deployment.xml.SourceEnvironment createSourceEnvironment() {
     return new com.ibm.filenet.deployment.xml.SourceEnvironment();
 }

 /**
  * Create an instance of {@link RetrieveServiceInfoFromDeployDataSet }
  * 
  */
 public RetrieveServiceInfoFromDeployDataSet createRetrieveServiceInfoFromDeployDataSet() {
     return new RetrieveServiceInfoFromDeployDataSet();
 }


 /**
  * Create an instance of {@link RetrieveConnectionPointInfoFromDomain }
  * 
  */
 public RetrieveConnectionPointInfoFromDomain createRetrieveConnectionPointInfoFromDomain() {
     return new RetrieveConnectionPointInfoFromDomain();
 }

 /**
  * Create an instance of {@link ReassignObjectStore }
  * 
  */
 public ReassignObjectStore createReassignObjectStore() {
     return new ReassignObjectStore();
 }

 /**
  * Create an instance of {@link RetrievePrincipalInfoFromDomain }
  * 
  */
 public RetrievePrincipalInfoFromDomain createRetrievePrincipalInfoFromDomain() {
     return new RetrievePrincipalInfoFromDomain();
 }

 /**
  * Create an instance of {@link RetrieveObjectStoreInfoFromDomain }
  * 
  */
 public RetrieveObjectStoreInfoFromDomain createRetrieveObjectStoreInfoFromDomain() {
     return new RetrieveObjectStoreInfoFromDomain();
 }

 /**
  * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
  * 
  */
 @XmlElementDecl(namespace = "", name = "SourceDeployDataSet")
 public JAXBElement<String> createSourceDeployDataSet(String value) {
     return new JAXBElement<String>(_SourceDeployDataSet_QNAME, String.class, null, value);
 }

 /**
  * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
  * 
  */
 @XmlElementDecl(namespace = "", name = "WorkflowConfigurationOption", defaultValue = "Merge")
 public JAXBElement<String> createWorkflowConfigurationOption(String value) {
     return new JAXBElement<String>(_WorkflowConfigurationOption_QNAME, String.class, null, value);
 }

 /**
  * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
  * 
  */
 @XmlElementDecl(namespace = "", name = "UpgradeDeploymentTree")
 public JAXBElement<Object> createUpgradeDeploymentTree(Object value) {
     return new JAXBElement<Object>(_UpgradeDeploymentTree_QNAME, Object.class, null, value);
 }

 /**
  * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
  * 
  */
 @XmlElementDecl(namespace = "", name = "OptionSetPath")
 public JAXBElement<String> createOptionSetPath(String value) {
     return new JAXBElement<String>(_OptionSetPath_QNAME, String.class, null, value);
 }

 /**
  * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
  * 
  */
 @XmlElementDecl(namespace = "", name = "CreateOption", defaultValue = "CreateAlways")
 public JAXBElement<String> createCreateOption(String value) {
     return new JAXBElement<String>(_CreateOption_QNAME, String.class, null, value);
 }

 /**
  * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
  * 
  */
 @XmlElementDecl(namespace = "", name = "UpdateOption", defaultValue = "UpdateIfNewer")
 public JAXBElement<String> createUpdateOption(String value) {
     return new JAXBElement<String>(_UpdateOption_QNAME, String.class, null, value);
 }

 /**
  * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
  * 
  */
 @XmlElementDecl(namespace = "", name = "AuditOption", defaultValue = "ImportOnly")
 public JAXBElement<String> createAuditOption(String value) {
     return new JAXBElement<String>(_AuditOption_QNAME, String.class, null, value);
 }

 /**
  * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
  * 
  */
 @XmlElementDecl(namespace = "", name = "ConvertedDeployDataSet")
 public JAXBElement<String> createConvertedDeployDataSet(String value) {
     return new JAXBElement<String>(_ConvertedDeployDataSet_QNAME, String.class, null, value);
 }

}

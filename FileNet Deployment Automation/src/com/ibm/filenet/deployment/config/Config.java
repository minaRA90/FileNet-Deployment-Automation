package com.ibm.filenet.deployment.config;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

import com.ibm.filenet.deployment.xml.Connection;
import com.ibm.filenet.deployment.xml.LDAPDataSource;

@XmlRootElement(name="Config")
@XmlAccessorType(XmlAccessType.FIELD)
public class Config {

	@XmlElementWrapper(name="SymbolicNames")
	@XmlElement(name="name")
	protected List<String> symbolicNames;
	
	@XmlElement (name ="deploymentTreeLocation")
	protected String deploymentTreeLocation;
	
	@XmlElement(name= "version")
	protected String version;
	
	@XmlElement(name = "testConnection")
	protected String testConnection;
	
	@XmlElement(name ="storePassword")
	protected String storePassword ;
	
	@XmlElement(name = "SourceConnection")
	protected Connection sourceConnection;
	
	@XmlElement(name = "DestinationConnection")
	protected Connection destinationConnection;
	
	@XmlElement(name ="Mode")
	protected String mode;
		
	@XmlElement(name ="deleteDestinationFilesOnError")
	protected String deleteDestinationFilesOnError;
	
	@XmlElement (name ="primarySourceObjectStore")
	protected String primaryObjectStore;
	
	@XmlElement (name ="SourceEnvironment")
	protected String sourceEnvironment;
	
	@XmlElement (name ="DestinationEnvironment")
	protected String destinationEnvironment;
	
	@XmlElement(name="LDAPDataSource")
	protected LDAPDataSource ldapDataSource;
	
	@XmlElement(name="pair")
	protected String pair;
	
	@XmlElement(name="useStoragePolicyMap")
	protected String useStoragePolicyMap;
	
	@XmlElement(name="useStorageAreaMap")
	protected String useStorageAreaMap;
	
	@XmlElement(name="analysisFailuresLimit")
	protected String analysisFailuresLimit;
	
	@XmlElement(name="deleteAnalysisResultsFileOnError")
	protected String deleteAnalysisResultsFileOnError;
	
	@XmlElement(name="importUpdateOption")
	protected String importUpdateOption;
	
	@XmlElement(name="generateDetailedReport")
	protected String generateDetailedReport;
	
	@XmlElement(name ="AnalysisReportFileName")
	protected String analysisReportFileName;
	
	@XmlElement(name="OptionSetPath")
	protected String optionSetPath;
	
	@XmlElement(name="overwritePackage")
	protected String overwritePackage;
	
	@XmlElement(name="includeHalf-Maps")
	protected String includeHalfMaps;
	
	@XmlElement(name="DeployPackage")
	protected String deployPackage;
	
	@XmlElement(name="halfMapMode")
	protected String halfMapMode;
	
	@XmlElement(name="deploymentWorkspace")
	protected String deploymentWorkspace;
	
	@XmlElement(name="deploymentManagerPath")
	protected String deploymentManagerPath;
	
	
	/**
	 * Config values that need to be updated dynamically or changes according to operation
	 */
    protected String exportManifest;
	protected String deployDataSet;
	protected String SourceDeployDataset;
	protected String ConvertedDeployDataset;
	
	//Connection to environment which deployment operation will execute.
	protected Connection connection;
	
	//retrieve info from environment type (i.e service , halfMap, etc).
	protected String type;
	//environment name that most operations will use.
	protected String environment;
	//environment name that will be used in create environment operation
	public String name;
	
/************************************** Getters and Setters ***********************/	
		
	public List<String> getSymbolicNames() {
		return symbolicNames;
	}
	public void setSymbolicNames(List<String> symbolicNames) {
		this.symbolicNames = symbolicNames;
	}
	public String getDeploymentTreeLocation() {
		return deploymentTreeLocation;
	}
	public void setDeploymentTreeLocation(String deploymentTreeLocation) {
		this.deploymentTreeLocation = deploymentTreeLocation;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public String getTestConnection() {
		return testConnection;
	}
	public void setTestConnection(String testConnection) {
		this.testConnection = testConnection;
	}
	public String getStorePassword() {
		return storePassword;
	}
	public void setStorePassword(String storePassword) {
		this.storePassword = storePassword;
	}
	public Connection getSourceConnection() {
		return sourceConnection;
	}
	public void setSourceConnection(Connection sourceConnection) {
		this.sourceConnection = sourceConnection;
	}
	public Connection getDestinationConnection() {
		return destinationConnection;
	}
	public void setDestinationConnection(Connection destinationConnection) {
		this.destinationConnection = destinationConnection;
	}
	public String getMode() {
		return mode;
	}
	public void setMode(String mode) {
		this.mode = mode;
	}
	public String getDeleteDestinationFilesOnError() {
		return deleteDestinationFilesOnError;
	}
	public void setDeleteDestinationFilesOnError(
			String deleteDestinationFilesOnError) {
		this.deleteDestinationFilesOnError = deleteDestinationFilesOnError;
	}
	public String getPrimaryObjectStore() {
		return primaryObjectStore;
	}
	public void setPrimaryObjectStore(String primaryObjectStore) {
		this.primaryObjectStore = primaryObjectStore;
	}
	public String getSourceEnvironment() {
		return sourceEnvironment;
	}
	public void setSourceEnvironment(String sourceEnvironment) {
		this.sourceEnvironment = sourceEnvironment;
	}
	public String getDestinationEnvironment() {
		return destinationEnvironment;
	}
	public void setDestinationEnvironment(String destinationEnvironment) {
		this.destinationEnvironment = destinationEnvironment;
	}
	public LDAPDataSource getLdapDataSource() {
		return ldapDataSource;
	}
	public void setLdapDataSource(LDAPDataSource ldapDataSource) {
		this.ldapDataSource = ldapDataSource;
	}
	public String getPair() {
		return pair;
	}
	public void setPair(String pair) {
		this.pair = pair;
	}
	public String getUseStoragePolicyMap() {
		return useStoragePolicyMap;
	}
	public void setUseStoragePolicyMap(String useStoragePolicyMap) {
		this.useStoragePolicyMap = useStoragePolicyMap;
	}
	public String getUseStorageAreaMap() {
		return useStorageAreaMap;
	}
	public void setUseStorageAreaMap(String useStorageAreaMap) {
		this.useStorageAreaMap = useStorageAreaMap;
	}
	public String getAnalysisFailuresLimit() {
		return analysisFailuresLimit;
	}
	public void setAnalysisFailuresLimit(String analysisFailuresLimit) {
		this.analysisFailuresLimit = analysisFailuresLimit;
	}
	public String getDeleteAnalysisResultsFileOnError() {
		return deleteAnalysisResultsFileOnError;
	}
	public void setDeleteAnalysisResultsFileOnError(
			String deleteAnalysisResultsFileOnError) {
		this.deleteAnalysisResultsFileOnError = deleteAnalysisResultsFileOnError;
	}
	public String getImportUpdateOption() {
		return importUpdateOption;
	}
	public void setImportUpdateOption(String importUpdateOption) {
		this.importUpdateOption = importUpdateOption;
	}
	public String getGenerateDetailedReport() {
		return generateDetailedReport;
	}
	public void setGenerateDetailedReport(String generateDetailedReport) {
		this.generateDetailedReport = generateDetailedReport;
	}
	public String getAnalysisReportFileName() {
		return analysisReportFileName;
	}
	public void setAnalysisReportFileName(String analysisReportFileName) {
		this.analysisReportFileName = analysisReportFileName;
	}
	public String getOptionSetPath() {
		return optionSetPath;
	}
	public void setOptionSetPath(String optionSetPath) {
		this.optionSetPath = optionSetPath;
	}
	public String getOverwritePackage() {
		return overwritePackage;
	}
	public void setOverwritePackage(String overwritePackage) {
		this.overwritePackage = overwritePackage;
	}
	public String getIncludeHalfMaps() {
		return includeHalfMaps;
	}
	public void setIncludeHalfMaps(String includeHalfMaps) {
		this.includeHalfMaps = includeHalfMaps;
	}
	public String getDeployPackage() {
		return deployPackage;
	}
	public void setDeployPackage(String deployPackage) {
		this.deployPackage = deployPackage;
	}
	public String getHalfMapMode() {
		return halfMapMode;
	}
	public void setHalfMapMode(String halfMapMode) {
		this.halfMapMode = halfMapMode;
	}
	public String getExportManifest() {
		return exportManifest;
	}
	public void setExportManifest(String exportManifest) {
		this.exportManifest = exportManifest;
	}
	public String getDeployDataSet() {
		return deployDataSet;
	}
	public void setDeployDataSet(String deployDataSet) {
		this.deployDataSet = deployDataSet;
	}
	public String getSourceDeployDataset() {
		return SourceDeployDataset;
	}
	public void setSourceDeployDataset(String sourceDeployDataset) {
		SourceDeployDataset = sourceDeployDataset;
	}
	public String getConvertedDeployDataset() {
		return ConvertedDeployDataset;
	}
	public void setConvertedDeployDataset(String convertedDeployDataset) {
		ConvertedDeployDataset = convertedDeployDataset;
	}
	public Connection getConnection() {
		return connection;
	}
	public void setConnection(Connection connection) {
		this.connection = connection;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getEnvironment() {
		return environment;
	}
	public void setEnvironment(String environment) {
		this.environment = environment;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDeploymentWorkspace() {
		return deploymentWorkspace;
	}
	public void setDeploymentWorkspace(String deploymentWorkspace) {
		this.deploymentWorkspace = deploymentWorkspace;
	}
	public String getDeploymentManagerPath() {
		return deploymentManagerPath;
	}
	public void setDeploymentManagerPath(String deploymentManagerPath) {
		this.deploymentManagerPath = deploymentManagerPath;
	}	
	
	
}

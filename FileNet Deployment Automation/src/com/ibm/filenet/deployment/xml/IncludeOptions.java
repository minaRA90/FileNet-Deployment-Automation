package com.ibm.filenet.deployment.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class IncludeOptions {

	    @XmlElement(name ="IncludeMarkingSets")
	    private String IncludeMarkingSets = "0";

	    @XmlElement(name ="IncludeSubscriptions")
	    private String IncludeSubscriptions="0";
	    
	    @XmlElement(name ="IncludeSystemClasses")
	    private String IncludeSystemClasses="0";
	    
	    @XmlElement(name ="IncludeSubClasses")
	    private String IncludeSubClasses="0";
	    
	    @XmlElement(name ="IncludeEventActions")
	    private String IncludeEventActions="0";

	    @XmlElement(name ="IncludeChangePreprocessorActions")
	    private String IncludeChangePreprocessorActions="0";

	    @XmlElement(name ="IncludeAnnotations")
	    private String IncludeAnnotations="0";
	    
	    @XmlElement(name ="IncludeUserThumbnails")
	    private String IncludeUserThumbnails="0";

	    @XmlElement(name ="IncludeCVLs")
	    private String IncludeCVLs="0";

	    @XmlElement(name ="IncludeGlobalPropDefs")
	    private String IncludeGlobalPropDefs="0";

	    @XmlElement(name ="IncludeLifeCycleActions")
	    private String IncludeLifeCycleActions="0";
	    
	    @XmlElement(name ="IncludeLifeCyclePolicies")
	    private String IncludeLifeCyclePolicies="0";
	    
	    @XmlElement(name ="IncludeSecurityObjects")
	    private String IncludeSecurityObjects="0";
	    
	    @XmlElement(name ="IncludeContentOfFolder")
	    private String IncludeContentOfFolder="0";
	    
	    @XmlElement(name ="IncludeDocs")
	    private String IncludeDocs="0";
	    
	    @XmlElement(name ="IncludeRelationshipsToContainingFolders")
	    private String IncludeRelationshipsToContainingFolders="0";
	    
	    @XmlElement(name ="IncludeRCRs")
	    private String IncludeRCRs="0";
	    
	    @XmlElement(name ="IncludeParentFolders")
	    private String IncludeParentFolders="0";
	    
	    @XmlElement(name ="IncludeDocVers")
	    private String IncludeDocVers="0";
	    
	    @XmlElement(name ="IncludeObjects")
	    private String IncludeObjects="0";
	    
	    @XmlElement(name ="IncludeSubFolders")
	    private String IncludeSubFolders="0";
	    
	    @XmlElement(name ="IncludeCompoundDocs")
	    private String IncludeCompoundDocs="0";
	    
	    @XmlElement(name ="IncludeClasses")
	    private String IncludeClasses="0";
	    
	    @XmlElement(name ="IncludeDocumentComments")
	    private String IncludeDocumentComments="0";
	    
	    @XmlElement(name ="IncludeFollowers")
	    private String IncludeFollowers="0";
	    
	    @XmlElement(name ="IncludeRecommendations")
	    private String IncludeRecommendations="0";

	    @XmlElement(name ="IncludeTags")
	    private String IncludeTags="0";
	    	    
	    public String getIncludeGlobalPropDefs ()
	    {
	        return IncludeGlobalPropDefs;
	    }

	    public void setIncludeGlobalPropDefs (String IncludeGlobalPropDefs)
	    {
	        this.IncludeGlobalPropDefs = IncludeGlobalPropDefs;
	    }

	    public String getIncludeTags ()
	    {
	        return IncludeTags;
	    }

	    public void setIncludeTags (String IncludeTags)
	    {
	        this.IncludeTags = IncludeTags;
	    }

	    public String getIncludeRecommendations ()
	    {
	        return IncludeRecommendations;
	    }

	    public void setIncludeRecommendations (String IncludeRecommendations)
	    {
	        this.IncludeRecommendations = IncludeRecommendations;
	    }

	    public String getIncludeSubFolders ()
	    {
	        return IncludeSubFolders;
	    }

	    public void setIncludeSubFolders (String IncludeSubFolders)
	    {
	        this.IncludeSubFolders = IncludeSubFolders;
	    }

	    public String getIncludeParentFolders ()
	    {
	        return IncludeParentFolders;
	    }

	    public void setIncludeParentFolders (String IncludeParentFolders)
	    {
	        this.IncludeParentFolders = IncludeParentFolders;
	    }

	    public String getIncludeDocs ()
	    {
	        return IncludeDocs;
	    }

	    public void setIncludeDocs (String IncludeDocs)
	    {
	        this.IncludeDocs = IncludeDocs;
	    }

	    public String getIncludeDocumentComments ()
	    {
	        return IncludeDocumentComments;
	    }

	    public void setIncludeDocumentComments (String IncludeDocumentComments)
	    {
	        this.IncludeDocumentComments = IncludeDocumentComments;
	    }

	    public String getIncludeRelationshipsToContainingFolders ()
	    {
	        return IncludeRelationshipsToContainingFolders;
	    }

	    public void setIncludeRelationshipsToContainingFolders (String IncludeRelationshipsToContainingFolders)
	    {
	        this.IncludeRelationshipsToContainingFolders = IncludeRelationshipsToContainingFolders;
	    }

	    public String getIncludeObjects ()
	    {
	        return IncludeObjects;
	    }

	    public void setIncludeObjects (String IncludeObjects)
	    {
	        this.IncludeObjects = IncludeObjects;
	    }

	    public String getIncludeCVLs ()
	    {
	        return IncludeCVLs;
	    }

	    public void setIncludeCVLs (String IncludeCVLs)
	    {
	        this.IncludeCVLs = IncludeCVLs;
	    }

	    public String getIncludeSystemClasses ()
	    {
	        return IncludeSystemClasses;
	    }

	    public void setIncludeSystemClasses (String IncludeSystemClasses)
	    {
	        this.IncludeSystemClasses = IncludeSystemClasses;
	    }

	    public String getIncludeUserThumbnails ()
	    {
	        return IncludeUserThumbnails;
	    }

	    public void setIncludeUserThumbnails (String IncludeUserThumbnails)
	    {
	        this.IncludeUserThumbnails = IncludeUserThumbnails;
	    }

	    public String getIncludeRCRs ()
	    {
	        return IncludeRCRs;
	    }

	    public void setIncludeRCRs (String IncludeRCRs)
	    {
	        this.IncludeRCRs = IncludeRCRs;
	    }

	    public String getIncludeClasses ()
	    {
	        return IncludeClasses;
	    }

	    public void setIncludeClasses (String IncludeClasses)
	    {
	        this.IncludeClasses = IncludeClasses;
	    }

	    public String getIncludeMarkingSets ()
	    {
	        return IncludeMarkingSets;
	    }

	    public void setIncludeMarkingSets (String IncludeMarkingSets)
	    {
	        this.IncludeMarkingSets = IncludeMarkingSets;
	    }

	    public String getIncludeSecurityObjects ()
	    {
	        return IncludeSecurityObjects;
	    }

	    public void setIncludeSecurityObjects (String IncludeSecurityObjects)
	    {
	        this.IncludeSecurityObjects = IncludeSecurityObjects;
	    }

	    public String getIncludeSubscriptions ()
	    {
	        return IncludeSubscriptions;
	    }

	    public void setIncludeSubscriptions (String IncludeSubscriptions)
	    {
	        this.IncludeSubscriptions = IncludeSubscriptions;
	    }

	    public String getIncludeCompoundDocs ()
	    {
	        return IncludeCompoundDocs;
	    }

	    public void setIncludeCompoundDocs (String IncludeCompoundDocs)
	    {
	        this.IncludeCompoundDocs = IncludeCompoundDocs;
	    }

	    public String getIncludeChangePreprocessorActions ()
	    {
	        return IncludeChangePreprocessorActions;
	    }

	    public void setIncludeChangePreprocessorActions (String IncludeChangePreprocessorActions)
	    {
	        this.IncludeChangePreprocessorActions = IncludeChangePreprocessorActions;
	    }

	    public String getIncludeEventActions ()
	    {
	        return IncludeEventActions;
	    }

	    public void setIncludeEventActions (String IncludeEventActions)
	    {
	        this.IncludeEventActions = IncludeEventActions;
	    }

	    public String getIncludeContentOfFolder ()
	    {
	        return IncludeContentOfFolder;
	    }

	    public void setIncludeContentOfFolder (String IncludeContentOfFolder)
	    {
	        this.IncludeContentOfFolder = IncludeContentOfFolder;
	    }

	    public String getIncludeSubClasses ()
	    {
	        return IncludeSubClasses;
	    }

	    public void setIncludeSubClasses (String IncludeSubClasses)
	    {
	        this.IncludeSubClasses = IncludeSubClasses;
	    }

	    public String getIncludeLifeCycleActions ()
	    {
	        return IncludeLifeCycleActions;
	    }

	    public void setIncludeLifeCycleActions (String IncludeLifeCycleActions)
	    {
	        this.IncludeLifeCycleActions = IncludeLifeCycleActions;
	    }

	    public String getIncludeFollowers ()
	    {
	        return IncludeFollowers;
	    }

	    public void setIncludeFollowers (String IncludeFollowers)
	    {
	        this.IncludeFollowers = IncludeFollowers;
	    }

	    public String getIncludeDocVers ()
	    {
	        return IncludeDocVers;
	    }

	    public void setIncludeDocVers (String IncludeDocVers)
	    {
	        this.IncludeDocVers = IncludeDocVers;
	    }

	    public String getIncludeAnnotations ()
	    {
	        return IncludeAnnotations;
	    }

	    public void setIncludeAnnotations (String IncludeAnnotations)
	    {
	        this.IncludeAnnotations = IncludeAnnotations;
	    }

	    public String getIncludeLifeCyclePolicies ()
	    {
	        return IncludeLifeCyclePolicies;
	    }

	    public void setIncludeLifeCyclePolicies (String IncludeLifeCyclePolicies)
	    {
	        this.IncludeLifeCyclePolicies = IncludeLifeCyclePolicies;
	    }


	    @Override
	    public String toString()
	    {
	        return "ClassPojo [IncludeGlobalPropDefs = "+IncludeGlobalPropDefs+", IncludeTags = "+IncludeTags+", IncludeRecommendations = "+IncludeRecommendations+", IncludeSubFolders = "+IncludeSubFolders+", IncludeParentFolders = "+IncludeParentFolders+", IncludeDocs = "+IncludeDocs+", IncludeDocumentComments = "+IncludeDocumentComments+", IncludeRelationshipsToContainingFolders = "+IncludeRelationshipsToContainingFolders+", IncludeObjects = "+IncludeObjects+", IncludeCVLs = "+IncludeCVLs+", IncludeSystemClasses = "+IncludeSystemClasses+", IncludeUserThumbnails = "+IncludeUserThumbnails+", IncludeRCRs = "+IncludeRCRs+", IncludeClasses = "+IncludeClasses+", IncludeMarkingSets = "+IncludeMarkingSets+", IncludeSecurityObjects = "+IncludeSecurityObjects+", IncludeSubscriptions = "+IncludeSubscriptions+", IncludeCompoundDocs = "+IncludeCompoundDocs+", IncludeChangePreprocessorActions = "+IncludeChangePreprocessorActions+", IncludeEventActions = "+IncludeEventActions+", IncludeContentOfFolder = "+IncludeContentOfFolder+", IncludeSubClasses = "+IncludeSubClasses+", IncludeLifeCycleActions = "+IncludeLifeCycleActions+", IncludeFollowers = "+IncludeFollowers+", IncludeDocVers = "+IncludeDocVers+", IncludeAnnotations = "+IncludeAnnotations+", IncludeLifeCyclePolicies = "+IncludeLifeCyclePolicies+"]";
	    }
	}

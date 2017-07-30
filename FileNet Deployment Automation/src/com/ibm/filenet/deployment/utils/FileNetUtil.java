package com.ibm.filenet.deployment.utils;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.security.auth.Subject;

import com.filenet.api.admin.ClassDefinition;
import com.filenet.api.collection.IndependentObjectSet;
import com.filenet.api.constants.GuidConstants;
import com.filenet.api.core.Connection;
import com.filenet.api.core.Domain;
import com.filenet.api.core.Factory;
import com.filenet.api.core.ObjectStore;
import com.filenet.api.query.SearchSQL;
import com.filenet.api.query.SearchScope;
import com.filenet.api.util.UserContext;
import com.ibm.filenet.deployment.assets.ClassDefinitionAsset;

public class FileNetUtil {
	
	public static final String fnurl="http://localhost:9081/wsi/FNCEWS40MTOM/";
	public static final String stanza ="FileNetP8WSI";
	public static final String username="admin";
	public static final String password ="admin";
	public static final String objectStoreName ="FNOS1";
	
	public ObjectStore getObjectStore(){
		
		Connection connection = Factory.Connection.getConnection(fnurl);
		UserContext userContext = UserContext.get();
		Subject subject = UserContext.createSubject(connection, username, password, stanza);
		userContext.pushSubject(subject);
		Domain domain = Factory.Domain.getInstance(connection, null);
		ObjectStore objectStore = Factory.ObjectStore.fetchInstance(domain, objectStoreName, null);
		
		return objectStore;
	}
	
	@SuppressWarnings("unchecked")
	public List<ClassDefinitionAsset> retrieveClassDefinitionAssets(List<String> filter){
		
		List<ClassDefinitionAsset> assets = new ArrayList<ClassDefinitionAsset>();
		ObjectStore os =getObjectStore();
		SearchSQL sqlObject = new SearchSQL();
		String objectStoreName = os.get_Name();
		sqlObject.setFromClauseInitialValue(GuidConstants.Class_ClassDefinition.toString(),"CD",true);
		sqlObject.setSelectList("CD.DisplayName,CD.SymbolicName,CD.Id");
		
		if(filter != null && !filter.isEmpty()){
			String whereClause="";
			for (String symbolicName : filter) {
				whereClause+="'"+symbolicName+"'"+",";
			}
			whereClause = whereClause.substring(0,whereClause.lastIndexOf(","));
			sqlObject.setWhereClause("CD.IsSystemOwned = false AND CD.SymbolicName IN ("+whereClause+")");
			
		}else{
			sqlObject.setWhereClause("CD.IsSystemOwned = false");
		}
			
		SearchScope searchScope = new SearchScope(os);
		IndependentObjectSet myObjects = searchScope.fetchObjects(sqlObject, null,null, true);
		
		Iterator<ClassDefinition> iterator = myObjects.iterator();	
		while (iterator.hasNext()) {
			ClassDefinition fnClassDefinition = (ClassDefinition) iterator.next();
			
			ClassDefinitionAsset cd = new ClassDefinitionAsset();
			cd.setId(fnClassDefinition.get_Id().toString());
			cd.setName(fnClassDefinition.get_DisplayName());
			cd.setObjectStoreName(objectStoreName);
			assets.add(cd);
		}

		return assets;
		
	}
}

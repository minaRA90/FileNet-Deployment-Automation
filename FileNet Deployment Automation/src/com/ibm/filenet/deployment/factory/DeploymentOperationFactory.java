package com.ibm.filenet.deployment.factory;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

import com.ibm.filenet.deployment.config.Config;
import com.ibm.filenet.deployment.operations.DeploymentOperation;
import com.ibm.filenet.deployment.operations.IOperation;

public class DeploymentOperationFactory {

	@SuppressWarnings("rawtypes")
	public DeploymentOperation createDeploymentOperation(String operationClassName, Config config) {

		DeploymentOperation deploymentOperation = new DeploymentOperation();
		IOperation operation = null;
		try {
			Class operationClass = Class.forName(operationClassName);
			operation = (IOperation) operationClass.newInstance();

			Field[] fields = operation.getClass().getDeclaredFields();
			for (Field field : fields) {
				String name = field.getName();
				// Construct getter & setter method names from field name
				name = name.substring(0, 1).toUpperCase() + name.substring(1);
				String getterMethodName = "get" + name;
				String setterMethodName = "set" + name;
				Method configMethod;
                System.out.println(getterMethodName); 
				configMethod = config.getClass().getDeclaredMethod(getterMethodName);
				Object configValue = configMethod.invoke(config);
				Method deploymentOperationMethod = operation.getClass().getDeclaredMethod(setterMethodName,configValue.getClass());
				deploymentOperationMethod.invoke(operation, configValue);
			}

		} catch (Exception e) {

			System.out.println("System Exception Occured while creating deploymnet operation");
			e.printStackTrace();
		}

		deploymentOperation.setOperation(operation);
		deploymentOperation.setVersion(config.getVersion());
		deploymentOperation.setDeploymentTreeLocation(config.getDeploymentTreeLocation());

		return deploymentOperation;
	}

	@Deprecated
	public void specialConfigValuesHandling(String operationClassName,
			IOperation operation, Config config) throws Exception {

	}

}

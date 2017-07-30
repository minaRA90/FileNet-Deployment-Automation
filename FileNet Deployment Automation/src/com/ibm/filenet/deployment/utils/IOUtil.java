package com.ibm.filenet.deployment.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import com.ibm.filenet.deployment.enums.Exceptions;

public class IOUtil {

	public Path createFolder(String folderName, String path){
		
		Path newDirectoryPath = Paths.get(path+"//"+folderName);

		if (!Files.exists(newDirectoryPath)) {
		    try {
		        Files.createDirectory(newDirectoryPath);
		    } catch (IOException e) {
		        System.err.println(Exceptions.DEPLOYMENT_DIR_CREATION_FAILED.toString()+e);
		        e.printStackTrace();
		    }
		}
		
		return newDirectoryPath;
	}
	
	public void createFile(String directory,String fileName){
		
		Path newFilePath = Paths.get(directory,fileName);
		
		try {
			 if (Files.exists(newFilePath)) {
				 Files.delete(newFilePath);
			 }
			 
	       Files.createFile(newFilePath);
	       
	    } catch (IOException e) {
	        System.err.println(Exceptions.DEPLOYMENT_FILE_CREATION_FAILED.toString()+e);
	    }
	}
	
	
	public void cmdExecuteCommand(String deploymentManagerPath,String command) throws IOException{
		
		
        ProcessBuilder builder = new ProcessBuilder("cmd.exe", "/c", "cd "+deploymentManagerPath+" && DeploymentManagerCmd.bat "+command);
        builder.directory(new File(deploymentManagerPath));
        builder.redirectErrorStream(true);
        Process proc = builder.start();
     		
        BufferedReader stdInput = new BufferedReader(new InputStreamReader(proc.getInputStream()));
		BufferedReader stdError = new BufferedReader(new InputStreamReader(proc.getErrorStream()));

		// read the output from the command
		System.out.println("Here is the standard output of the command:\n");
		String s = null;
		while ((s = stdInput.readLine()) != null) {
		    System.out.println(s);
		}

		// read any errors from the attempted command
		System.out.println("Here is the standard error of the command (if any):\n");
		while ((s = stdError.readLine()) != null) {
		    System.out.println(s);
		}
		
	} 
}

package com.citibank.main.domain;

import java.io.File;
import java.sql.Date;

public class MyFileMetadata {
  private String path = "C:/javatraining/hello.txt";
  public void  printFileMetadata() {
	  File file = new File(path);
	  
	  if(file.exists()) {
		  System.out.println("File Name ::" + file.getName());
		  System.out.println("File path ::" + file.getAbsolutePath());
		  System.out.println("File size ::" + file.length());
		  System.out.println("File open ::" + file.canExecute());
		  System.out.println("File write ::" + file.canWrite());
		  System.out.println("File read ::" + file.canRead());
		  Date lastModifiedDate = new Date(file.lastModified());
		  System.out.println("last modified ::" + file.lastModified());
	  }else
	  {
		  System.out.println("File Dosent Exits");
		  System.out.println("Enter Valid Path");
	  }
  }
}

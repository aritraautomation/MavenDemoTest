package org.qa.seleniumDemo;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo {

	 @BeforeClass
	 public void login(){
		 System.out.println("Login the application");
	 }
	 
	 @Test(dataProvider="dataprovidermethod")
		 public void getTest(String param){
		 	System.out.println("The parameter value is: " + param);			 
		 }
	 
	 
	 
	 @DataProvider
	 public Object[][] dataprovidermethod(){
		 return new Object[][]{{"one"},{"two"}};
	 }

}

package org.qa.seleniumDemo;

import java.io.FileNotFoundException;
import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.qa.demo.Xls_Reader;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ReadExcel {
	
	static Xls_Reader reader;
	
	public static ArrayList<Object> getDataFromExcel(){
	
	//public static void main(String[] args){
		
		ArrayList<Object> getData = new ArrayList<Object>();	
	   
		String sheetName = "sheet1";
		 
		try{
			reader = new Xls_Reader("/Automation/MavenDemoTests/TestData2.xlsx");			
		   }catch(Exception e){
			   e.printStackTrace();
		   }	  
	 
	  int rowCount = reader.getRowCount(sheetName);	  
	  System.out.println(rowCount);
	  
	  for(int row=2; row<=rowCount;row++){
	  
	  String emailAddress = reader.getCellData(sheetName, "EmailAddress", row);
	  System.out.println(emailAddress);
	  
	  String password = reader.getCellData(sheetName, "Password", row);
	  System.out.println(password);
	  
	  Object obj[] = {emailAddress,password};	  
	  getData.add(obj);  
	  
	 }
	  return getData;

	}
}

package org.qa.seleniumDemo;

import org.testng.ITestContext;
import org.testng.annotations.Test;

public class DataTransaferWithStaticVariable {
	
	public static String fullName = "";
	
	@Test(priority =1)
	public void generateData(){
		String firstName = "Naveen";
		fullName = firstName;
	}
	
	@Test(priority=2)
	public void getData(){
		
		String middleName = "Reddy";
		
		fullName = fullName + " " + middleName;
		
		System.out.println("Name is " + fullName);
	}

}

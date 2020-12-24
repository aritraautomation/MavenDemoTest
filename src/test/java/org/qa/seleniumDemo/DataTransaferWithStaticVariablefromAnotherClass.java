package org.qa.seleniumDemo;

import org.testng.annotations.Test;

public class DataTransaferWithStaticVariablefromAnotherClass {
	
	@Test(priority=3)
	public void getDataFromAnotherClass(){
		
		String lastName = "Phalkar";
		
		DataTransaferWithStaticVariable.fullName = DataTransaferWithStaticVariable.fullName + " " + lastName;
		
		System.out.println("Full Name is " + DataTransaferWithStaticVariable.fullName );
		
	}

}

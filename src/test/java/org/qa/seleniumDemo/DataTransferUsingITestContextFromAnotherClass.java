package org.qa.seleniumDemo;

import org.testng.ITestContext;
import org.testng.annotations.Test;

public class DataTransferUsingITestContextFromAnotherClass {
	
	@Test(priority=3)
	public void getDataFromAnotherClass(ITestContext context){
	
	String lastName = "Mahajan";
	
	String NM =(String)context.getAttribute("Name");
	String FullName = NM + " " +  lastName;
	
	System.out.println(FullName);
}

}

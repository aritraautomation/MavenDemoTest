package org.qa.seleniumDemo;

import org.testng.ITestContext;
import org.testng.annotations.Test;

public class DataTransferUsingITestContext {
	
	@Test(priority =1)
	public void generateData(ITestContext context){
		String firstName = "Ämod";
		context.setAttribute("FirstName", firstName);
	}
	
	@Test(priority=2)
	public void getData(ITestContext context){
		
		String middleName = "Kumar";
		
		String FN =(String)context.getAttribute("FirstName");
		
		String name = FN + " " +  middleName;
		System.out.println(name);
		
		context.setAttribute("Name",name);		
			
		}
	}


package org.qa.seleniumDemo;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersExampleAtClonstructor {
	
	String param1;
	String param2;
	String param3;
	String param4;
	
	@Parameters({"BeforeClass","TestMethodA","TestMethodB","AfterClass"})
	public ParametersExampleAtClonstructor(String s1,String s2,String s3,String s4){
		
		param1 = s1;
		param2 = s2;
		param3 = s3;
		param4 = s4;		
	}
	
	@BeforeClass
	public void setup(){
		System.out.println("Before Class method parameter : " + param1);
	}
	
	@Test
	public void testMethodA(){
		System.out.println("testMethodA parameter : " + param2);
	}
	
	@Test
	public void testMethodB(){
		System.out.println("testMethodB parameter : " + param3);
	}

	@AfterClass
	public void tearDown(){
		System.out.println("Before Class method parameter : " + param4);
	}

}

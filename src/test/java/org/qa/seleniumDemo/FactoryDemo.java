package org.qa.seleniumDemo;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

public class FactoryDemo {
	public String param = "";
	
	public FactoryDemo(String param){
		this.param = param;
	}
	
	@BeforeClass
	public void setup(){
		System.out.println("Login the application");
	}
	
	@Test
	public void getTest(String param){
	 	System.out.println("The parameter value is: " + param);			 
	 }
}

/*class FactoryTestDemo {
	@Factory
	public Object[] getFactory(){
		return new Object[]{
			new FactoryDemo("one"),
			new FactoryDemo("two")
		};
	}

}*/
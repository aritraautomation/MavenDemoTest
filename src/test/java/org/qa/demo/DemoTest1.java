package org.qa.demo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoTest1 {

	@Test
	public void multi(){
		System.out.println("MULTI");
		int a =10;
		int b = 20;

		Assert.assertEquals(200,a*b);
	}
	
	@Test
	public void div(){
		System.out.println("DIV");
		int a =10;
		int b = 20;

		Assert.assertEquals(2,b/a);
	}
	
	
}

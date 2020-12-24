package org.qa.seleniumDemo;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import junit.framework.Assert;

public class AssertDemo {
	
	@Test
	void test1(){
		
		SoftAssert softassert = new SoftAssert();
		System.out.println("SoftAssert will be started");
		softassert.assertTrue(false);
		System.out.println("SoftAssert Executed");
		
		softassert.assertAll();		
	}
	
	@Test
	void test2(){
		
		System.out.println("HardAssert will be started");
		Assert.assertTrue(false);
		System.out.println("HardAssert Executed");
		
	}

}

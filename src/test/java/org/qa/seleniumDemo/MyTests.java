package org.qa.seleniumDemo;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
import org.testng.annotations.Test;

import junit.framework.Assert;


public class MyTests{
	
	/*@Test(retryAnalyzer = analyzer.RetryAnalyzer.class)
	public void m1(){
		Assert.assertEquals(false, true);
	}
	
	@Test(retryAnalyzer = analyzer.RetryAnalyzer.class)
	public void m2(){
		Assert.assertEquals(false, true);*/

	
	
	@Test
	public void m3(){
		Assert.assertEquals(false, true);
	}
	
	@Test
	public void m4(){
		Assert.assertEquals(false, true);
	}
}



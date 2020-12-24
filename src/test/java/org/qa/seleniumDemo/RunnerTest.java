package org.qa.seleniumDemo;

import org.testng.TestNG;

public class RunnerTest {
	
	static TestNG testNg;
	public static void main(String[] args) {
		
		testNg = new TestNG();
		
		testNg.setTestClasses(new Class[] {AssertDemo.class,BarCodeRead.class});
		testNg.run();

	}

}

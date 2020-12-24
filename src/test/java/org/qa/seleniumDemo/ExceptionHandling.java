package org.qa.seleniumDemo;

import org.testng.annotations.Test;

public class ExceptionHandling {
	
	@Test(expectedExceptions=ArithmeticException.class)
	void test(){
		int i = 10/0;
	}

}

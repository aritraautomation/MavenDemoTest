package org.qa.seleniumDemo;

import org.testng.annotations.Test;

public class PriorityDemo {
	
	@Test(priority=1)
	void D(){
		System.out.println("D method");
	}
	

	@Test(priority=1)
	void B(){
		System.out.println("B method");
	}
	

	@Test(priority=1)
	void C(){
		System.out.println("C method");
	}

}

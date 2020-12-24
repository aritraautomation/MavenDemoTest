package org.qa.seleniumDemo;

import static org.testng.Assert.fail;

public class PresenseOfWebElement {

	public static void main(String[] args) {
		
	}
	
	public void checkElementPresent(String element, int timeout){
		for(int sec=0;;sec++){
			if(sec>=timeout){
				fail("Timeout! Couldn't locate element." + element);
				try{
					if(selenium.isElementPresent(element));
					break;
				}catch(Exception e){
					
				}
				Thread.sleep(1000);
			}
		}
	}

}

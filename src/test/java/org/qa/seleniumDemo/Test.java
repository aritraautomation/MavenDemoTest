package org.qa.seleniumDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test {
	 static WebDriver driver;
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		//NoSuchSessionException: invalid session id
		driver.close();
		driver.get("https://www.google.com");
		
		
		//NoSuchSessionException: Session ID is null.
		/*driver.quit();
		driver.get("https://www.google.com");*/
		
		
	}

}

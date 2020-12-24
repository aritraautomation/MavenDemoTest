package org.qa.seleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CRMLoginDemo {
	
	
	public static void main(String[] args) {
		WebDriver driver = null;

		System.setProperty("webdriver.chrome.driver", "/Automation/MavenDemoTests/lib/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://ui.freecrm.com/");
		
		driver.findElement(By.name("email")).sendKeys("aritrafromfkk@yahoo.co.in");
		
		driver.findElement(By.name("password")).sendKeys("Test@123");
		
		driver.findElement(By.xpath("//div[contains(text(),'Login')]")).click();
		
	}

}

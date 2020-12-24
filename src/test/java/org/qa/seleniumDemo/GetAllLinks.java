package org.qa.seleniumDemo;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetAllLinks {
	static WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();

		driver =new ChromeDriver();
		
		 driver.get("http://www.zlti.com");
		 
		 driver.manage().window().maximize();
		 
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
		 List<WebElement> allLinks = driver.findElements(By.tagName("link"));
		 System.out.println("Total Links Count-->" + allLinks.size());
		 
		 /*for(int i=0;i<allLinks.size();i++){
			 String links = allLinks.get(i).getAttribute("href");
			 System.out.println(links);
		 }*/
		 
		 for(WebElement links:allLinks){
			 //System.out.println(links.getText() + " " + links.getAttribute("href"));
		 }
		 
		 //driver.quit();
		
	}

}

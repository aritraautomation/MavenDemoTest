package org.qa.seleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PageLoadTest {
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://accounts.google.com/signin");
		driver.findElement(By.id("identifierId")).sendKeys("aritraauotmation");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		boolean state = js.executeScript("return document.readyState").toString().equals("complete");
		
		if(state){
			System.out.println("page is loaded completely");
		}
		else{
			System.out.println("page is not loaded completely");
		}		
		
	}

}

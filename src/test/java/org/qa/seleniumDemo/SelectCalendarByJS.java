package org.qa.seleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectCalendarByJS {
	static WebDriver driver;
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.spicejet.com/");
		
		WebElement element = driver.findElement(By.id("ctl00_mainContent_txt_Fromdate"));
		String dateVal = "22-07-2020";
		
		selectDate(driver,element,dateVal);
		
		driver.quit();		
		
	}
	
	static void selectDate(WebDriver driver,WebElement element,String dateVal){
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].setAttribute('value','"+dateVal+"');",element);
	}

}

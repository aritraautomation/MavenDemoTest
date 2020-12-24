package org.qa.seleniumDemo;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CSVDataDrivenTesting {
	
WebDriver driver;
	
	@BeforeMethod
	public void setup() throws InterruptedException{
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://app.hubspot.com/login");
		
		Thread.sleep(10000);
	}
	
	@DataProvider
	public Iterator getTestData() throws IOException{
		ArrayList<Object> testData = ReadDataFromCSVFile.getDataFromCSVFile();
		return testData.iterator();
	}
	
	@Test(dataProvider="getTestData")
	public void hubspotJson(String emailAddress, String password){
		
		driver.findElement(By.xpath("//input[@id='username']")).clear();			
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys(emailAddress);
		
		driver.findElement(By.xpath("//input[@id='password']")).clear();
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);	
	}
	
	@AfterMethod
	public void tearDown(){
		driver.close();
	}

}

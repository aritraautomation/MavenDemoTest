package org.qa.seleniumDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class calendarSelectByJS {
	
	
	public static void main(String[] args) throws InterruptedException {
		//WebElement ele = null;
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.spicejet.com/");
		
		driver.manage().window().maximize();
		//driver.switchTo().frame("destination_publishing_iframe_spicejet_0");
		
		WebElement caledarDate = driver.findElement(By.xpath("//div[@class='picker-first2']/input[@id='ctl00_mainContent_view_date1']"));

		
		//List<WebElement> caledarDate = driver.findElements(By.xpath("//input[@id='ctl00_mainContent_view_date1']"));
		/*System.out.println(caledarDate);
		
		for(int i=0;i<caledarDate.size();i++){
			String s = caledarDate.get(i).getText();
			System.out.println(s);
			if(caledarDate.size()>0){
				ele = caledarDate.get(0);
			}
		}*/
		
		String date = "29/12";
		
		Thread.sleep(1000);
		
		selectDateByJS(driver,caledarDate,date);
		
	}
	
	public static void selectDateByJS(WebDriver driver,WebElement element,String date){
		
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		
		js.executeScript("arguments[0].setAttribute('value','"+ date +"');", element);
		
		//js.executeScript("arguments[0].value("+ date +");", element);
	}

}

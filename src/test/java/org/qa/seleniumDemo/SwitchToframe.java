package org.qa.seleniumDemo;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.util.SystemOutLogger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SwitchToframe {
	
	static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("http://demo.guru99.com/test/guru99home/");
		
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		//total number of iframes in the webpage
		int frameCount = driver.findElements(By.tagName("ïframe")).size();
		
		System.out.println(frameCount);
		
		for(int i=0;i<frameCount;i++){
			driver.switchTo().frame(i);
			
			List<WebElement> elements = driver.findElements(By.xpath("html/body/a/img"));
			
			int totalElemets = elements.size();
			
			System.out.println("Index of Frame where element is located" + totalElemets);
			
			//TargetLocator f =driver.switchTo();
			
			driver.switchTo().defaultContent();
		}
	}

}

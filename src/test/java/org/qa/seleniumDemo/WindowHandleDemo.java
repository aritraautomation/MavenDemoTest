package org.qa.seleniumDemo;

import java.util.Iterator;
import java.util.Set;

import org.apache.poi.util.SystemOutLogger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandleDemo {
	
	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://www.toolsqa.com/automation-practice-switch-windows/");
		String parentWindow=driver.getWindowHandle();
		System.out.println(parentWindow);
		
		WebElement button = driver.findElement(By.id("button1"));
		
		for(int i=0;i<3;i++){
			button.click();
			Thread.sleep(3000);
		}
		
		Set<String> allWindowHandles = driver.getWindowHandles();
		
		Iterator<String> itr = allWindowHandles.iterator();
		
		while(itr.hasNext()){
				String fChildWindow = itr.next();
				driver.switchTo().window(fChildWindow);
				System.out.println(fChildWindow);
		}
		
		/*for(String handles:allWindowHandles){
			System.out.println(handles);
			driver.switchTo().window(handles);
			
			//String firstChildWindow = driver.getWindowHandle();
		}*/
		
	}

}

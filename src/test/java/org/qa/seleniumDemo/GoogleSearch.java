package org.qa.seleniumDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class GoogleSearch {

	//public static void main(String[] args) throws InterruptedException {
	
	@Test
	public void demo1()throws InterruptedException{
		
		WebDriverManager.chromedriver().setup();
		
		//System.setProperty("webdriver.chrome.driver", "/Automation/MavenDemoTests/lib/chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://www.google.com");
		
		driver.findElement(By.name("q")).sendKeys("test");
		Thread.sleep(2000);
		//List<WebElement> list = driver.findElements(By.xpath("//ul[@role='listbox']//li/descendant::div[@class='sbl1']"));
		List<WebElement> list = driver.findElements(By.xpath("//ul[@role='listbox']/li"));
		System.out.println(list.size());
		
		for (int i=0;i<list.size();i++){
			System.out.println(list.get(i).getText());
			if (list.get(i).getText().contains("test cricket")){
				list.get(i).click();
				break;
			}
		}
		
		driver.close();
	}

}

package org.qa.seleniumDemo;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GmailDemo {

	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
				
		driver.get("https://accounts.google.com/signin");		
	
		driver.findElement(By.id("identifierId")).sendKeys("aritraauotmation");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@id='identifierNext']/div/button")).click();
		//driver.findElement(By.xpath("//span[text()='Next']")).click();
		
		Thread.sleep(6000);
		driver.findElement(By.name("password")).sendKeys("Password@123");
		driver.findElement(By.xpath("//div[@id='passwordNext']/div/button")).click();
		//driver.findElement(By.xpath("//span[text()='Next']")).click();
		
		String text = driver.findElement(By.xpath("//a[@role='button']/img")).getText();
		System.out.println(text);
		
		
	
		driver.close();
		
		/*while(input.hasNextLine()){
			System.out.println(input.nextLine());*/
				
			
		}

}

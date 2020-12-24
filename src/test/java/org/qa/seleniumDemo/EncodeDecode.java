package org.qa.seleniumDemo;

import org.apache.commons.codec.binary.Base64;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EncodeDecode {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.nopcommerce.com/login");
		
		driver.findElement(By.id("Email")).sendKeys("pavanoltraining@gmail.com");
		driver.findElement(By.id("Password")).sendKeys(decodePassword("dGVzdDEyMw=="));
		//driver.findElement(By.cssSelector("input.button-1 login-button")).click();
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
			
		//driver.quit();
		
	}
	
	static String decodePassword(String encodedPassword){
		byte[] decodedPassword = Base64.decodeBase64(encodedPassword);
		return (new String(decodedPassword));
	}

}

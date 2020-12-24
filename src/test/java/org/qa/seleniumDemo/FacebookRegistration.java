package org.qa.seleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookRegistration {
	
	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//a[@id='u_0_2']")).click();
		
		Thread.sleep(5000);
		
		//driver.findElement(By.xpath("//button[@id='u_1_s']/parent::div/parent::div/child::div[1]/div/div[1]")).sendKeys("AS"); --not working
		
		driver.findElement(By.id("u_1_b")).sendKeys("Sachin");  //working
		
		driver.findElement(By.id("u_1_d")).sendKeys("Savek");
		
		driver.findElement(By.cssSelector("input#u_1_g")).sendKeys("9831678236");
		driver.findElement(By.cssSelector("input#password_step_input")).sendKeys("password@123");
		
		Select day = new Select(driver.findElement(By.cssSelector("select#day")));
		day.selectByValue("2");
		
		Select month = new Select(driver.findElement(By.cssSelector("select#month")));
		month.selectByVisibleText("Oct");
		
		Select year = new Select(driver.findElement(By.cssSelector("select#year")));
		year.selectByValue("1990");
		
		
		driver.findElement(By.xpath("//label[text()='Male']/following-sibling::input")).click();		

		driver.findElement(By.xpath("//button[@id='u_1_s']")).click();
		
		/*driver.findElement(By.id("email")).sendKeys("ACVV");
		
		driver.findElement(By.id("pass")).sendKeys("VBBCC");
		
		driver.findElement(By.id("u_0_b")).click();*/
		
		
	}

}

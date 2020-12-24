package org.qa.seleniumDemo;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenshotElement1 {
	
	public static void main(String[] args) throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();		
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://app.hubspot.com/login");
		Thread.sleep(4000);
		
		WebElement email = driver.findElement(By.cssSelector("input[id=username]"));
		//WebElement email = driver.findElement(By("username"));
		
		//WebElement email = driver.findElement(By.id("username"));
		
		WebElement password = driver.findElement(By.id("password"));
		WebElement logIn = driver.findElement(By.id("loginBtn"));
		WebElement forgetLink = driver.findElement(By.linkText("Forgot my password"));
		//WebElement hupSpotForm = driver.findElement(By.xpath("//*[@id='hs-login'][0]"));
		//WebElement hupSpotForm = driver.findElement(By.xpath("//form"));
	
		
		email.sendKeys("aritras@gmail.com");
		password.sendKeys("aritras@gmail.com");
		
		takeElementScreesnhot(email,"email");
		takeElementScreesnhot(password,"password");
		takeElementScreesnhot(forgetLink,"forgetLink");
		takeElementScreesnhot(logIn,"logIn");
		//takeElementScreesnhot(hupSpotForm,"hupSpotForm");
		
		driver.quit();
	}

	public static void takeElementScreesnhot(WebElement element, String fileName)
	{
		File srcFile = element.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(srcFile, new File("./target/screenshot/" + fileName + ".png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}	

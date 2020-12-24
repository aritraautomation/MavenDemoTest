package org.qa.seleniumDemo;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;

public class TakeImageAShot {

	public static void main(String[] args) throws IOException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		WebElement logoImage = driver.findElement(By.xpath("//div[@id='divLogo']/img"));
		
		Screenshot imageScreenshot = new AShot().takeScreenshot(driver, logoImage);
		
		ImageIO.write(imageScreenshot.getImage(), "png", new File("/Automation/MavenDemoTests/OrangeLogo.png"));
		
		File f = new File("/Automation/MavenDemoTests/OrangeLogo.png");
		
		if(f.exists()){
			System.out.println("Image file captured");
		}else{
			System.out.println("Image File Not exist");
		}
		
		driver.quit();
	}

}

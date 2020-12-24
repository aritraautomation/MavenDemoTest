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

public class CaptureLogoImageAshot {

	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com");
		
		driver.manage().window().maximize();
		
		WebElement imageLogo = driver.findElement(By.xpath("//div[@id='divLogo']/img"));
		
		//Taking Screenshot
		Screenshot imageScreenshot = new AShot().takeScreenshot(driver, imageLogo);
		
		ImageIO.write(imageScreenshot.getImage(), "png", new File("/Automation/MavenDemoTests/OrnageHRMLogo.png"));
		
		File f = new File("/Automation/MavenDemoTests/OrnageHRMLogo.png");
		
		if(f.exists()){
			System.out.println("Image File Exist");
		}else{
			System.out.println("Image File Not Exist");
		}
		
		driver.quit();
	}

}



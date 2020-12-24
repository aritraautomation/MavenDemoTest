package org.qa.seleniumDemo;

import java.awt.image.BufferedImage;
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
import ru.yandex.qatools.ashot.comparison.ImageDiff;
import ru.yandex.qatools.ashot.comparison.ImageDiffer;

public class CompareImagesByAShot {

	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();		
		
		driver.get("https://opensource-demo.orangehrmlive.com");		
		driver.manage().window().maximize();
		
		BufferedImage expectedImage = ImageIO.read(new File("/Automation/MavenDemoTests/OrnageHRMLogo.png"));
		
		WebElement imageLogo = driver.findElement(By.xpath("//div[@id='divLogo']/img"));

		Screenshot imageScreenshot = new AShot().takeScreenshot(driver, imageLogo);
		BufferedImage actualImage = imageScreenshot.getImage();
		
		ImageDiffer imdiffr = new ImageDiffer();		
		ImageDiff imDiff = imdiffr.makeDiff(expectedImage, actualImage);
		
		if(imDiff.hasDiff()==true){
			System.out.println("Images are Not Same");
		}else{
			System.out.println("Images are Same");
		}
		driver.quit();
	}

}

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

public class ImnageCompare {

	public static void main(String[] args) throws IOException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		BufferedImage expectedImage = ImageIO.read(new File("/Automation/MavenDemoTests/OrnageHRMLogo.png"));
		
		WebElement element = driver.findElement(By.xpath("//div[@id='divLogo']/img"));
		
		Screenshot imageSc = new AShot().takeScreenshot(driver, element);
		
		BufferedImage actualImage = imageSc.getImage();
		
		ImageDiffer imDiffer = new ImageDiffer();
		
		ImageDiff imDiff = imDiffer.makeDiff(expectedImage, actualImage);
		
		if(imDiff.hasDiff()==true){
			System.out.println("Images are not same");
		}else{
			System.out.println("Images are same");
		}
		driver.quit();
		
		
		
		
	}

}

package org.qa.seleniumDemo;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.google.zxing.BinaryBitmap;
import com.google.zxing.LuminanceSource;
import com.google.zxing.MultiFormatReader;
import com.google.zxing.NotFoundException;
import com.google.zxing.Result;
import com.google.zxing.client.j2se.BufferedImageLuminanceSource;
import com.google.zxing.common.HybridBinarizer;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BarCodeRead {

	//public static void main(String[] args) throws IOException, NotFoundException {
	
	WebDriver driver;
		
	@BeforeClass
	public void setUp(){
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://barcode.tec-it.com/en");
	}
	
	@Test
	public void barCodeReadTest() throws IOException, NotFoundException{
	
		String barCodeURL = driver.findElement(By.tagName("img")).getAttribute("src");		
		System.out.println("Bar Code URL : " + barCodeURL );
		
		URL url = new URL(barCodeURL);
		
		BufferedImage bufferedImage = ImageIO.read(url);
		
		LuminanceSource bufferedImageLuminance = new BufferedImageLuminanceSource(bufferedImage);
		BinaryBitmap binaryBitmap = new BinaryBitmap(new HybridBinarizer(bufferedImageLuminance));
		
		Result result = new MultiFormatReader().decode(binaryBitmap);
		
		System.out.println(result.getText());
		
	}
		
	@AfterClass
	public void tearDown(){
		driver.close();
	}
		
		
		
}



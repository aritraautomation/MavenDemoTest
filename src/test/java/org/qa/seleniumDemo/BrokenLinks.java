package org.qa.seleniumDemo;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.http.HttpConnection;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrokenLinks {
	
	static WebDriver driver;
	
	public static void main(String[] args) {
		
		HttpURLConnection hc = null;
		int responseCode =200;
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("http://www.zlti.com");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		List<WebElement> allLinks=driver.findElements(By.tagName("link"));
		
		System.out.println("Total Number of Links in the page-->" + allLinks.size());
		
		for(int i=0;i<allLinks.size();i++){
			String links = allLinks.get(i).getAttribute("href");
			System.out.println(links);
			
			try {
				hc =(HttpURLConnection)new URL("http://www.zlti.com").openConnection();
				hc.setRequestMethod("HEAD");
				hc.connect();
				responseCode = hc.getResponseCode();
				System.out.println(responseCode);
				
				if(responseCode>=400){
					System.out.println("Links are broken");
				}else{
					System.out.println("Links are valid");
				}
				
			} catch (MalformedURLException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		driver.close();

	}

}

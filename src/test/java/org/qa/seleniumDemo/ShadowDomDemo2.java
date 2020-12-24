package org.qa.seleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ShadowDomDemo2 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://shop.polymer-project.org/");
		
		WebElement shopApp = driver.findElement(By.tagName("shop-app"));
		
		WebElement shadowDOM1 = getShadowDOM(shopApp,driver);
		
		WebElement ironPages = shadowDOM1.findElement(By.tagName("iron-pages"));
		
		WebElement shopHome = ironPages.findElement(By.tagName("shop-home"));
		
		WebElement shadowDOM2 = getShadowDOM(shopHome,driver);
		
		shadowDOM2.findElement(By.cssSelector("div:nth-child(2)>shop-button>a")).click();	
		
		driver.close();
	}
	
	static WebElement getShadowDOM(WebElement element,WebDriver driver){
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement shadowDOM = (WebElement) js.executeScript("return arguments[0].shadowRoot", element);
		
		return shadowDOM;
		
	}

}

package org.qa.seleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ShadowDomDemo {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://books-pwakit.appspot.com/");
		
		WebElement bookApp = driver.findElement(By.tagName("book-app")); //Shadow Host
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement shadowDom = (WebElement)js.executeScript("return arguments[0].shadowRoot", bookApp);
		
		WebElement appHeader = shadowDom.findElement(By.tagName("app-header"));
		
		WebElement appToolbar = appHeader.findElement(By.cssSelector("app-toolbar.toolbar-bottom"));
		
		WebElement bookInputDecorator = appToolbar.findElement(By.tagName("book-input-decorator"));
		
		bookInputDecorator.findElement(By.cssSelector("input#input")).sendKeys("ShadowDom Tutorial");
		
		driver.close();
		
	}

}

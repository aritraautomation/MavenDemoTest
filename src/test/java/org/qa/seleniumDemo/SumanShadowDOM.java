package org.qa.seleniumDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SumanShadowDOM {
		static WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://books-pwakit.appspot.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		WebElement shadowHost = driver.findElement(By.tagName("book-app"));

		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement shadowRoot = (WebElement)js.executeScript("return arguments[0].shadowRoot", shadowHost);

		WebElement appHeader = shadowRoot.findElement(By.tagName("app-header"));
		WebElement appToolbar = appHeader.findElement(By.cssSelector("app-toolbar.toolbar-bottom"));
		WebElement bookInputDecorator = appToolbar.findElement(By.tagName("book-input-decorator"));
		WebElement ele = bookInputDecorator.findElement(By.cssSelector("input#input"));
		ele.sendKeys("Suman");  
	}

}

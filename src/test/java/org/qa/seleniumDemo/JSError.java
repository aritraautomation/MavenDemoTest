package org.qa.seleniumDemo;

//import java.sql.Date;
import java.util.Date;
import java.util.logging.Level;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.logging.LogEntry;
import org.openqa.selenium.logging.LogType;
import org.openqa.selenium.logging.LoggingPreferences;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JSError {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setUp(){
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(CapabilityType.BROWSER_NAME, BrowserType.CHROME);
		
		LoggingPreferences loggingPrefs = new LoggingPreferences();
		loggingPrefs.enable(LogType.BROWSER, Level.ALL);
		
		cap.setCapability(CapabilityType.LOGGING_PREFS,loggingPrefs );
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver(cap);		
	}
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
	
	
	public void extractJSLogsInfo(){
		LogEntries logentries = driver.manage().logs().get(LogType.BROWSER);
		
		for(LogEntry entry:logentries){
			System.out.println(new Date(entry.getTimestamp())+" "+entry.getLevel()+" "+entry.getMessage());
		}
	}
	
	@Test
	public void testMethod() throws InterruptedException{
		driver.get("https://facebook.com/");
		Thread.sleep(6000);
		extractJSLogsInfo();
	}

}

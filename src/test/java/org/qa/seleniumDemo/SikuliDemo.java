package org.qa.seleniumDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SikuliDemo {
	
	public static void main(String[] args) throws FindFailed{
		
		WebDriver driver;
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.get("https://www.youtube.com/watch?v=OtQAMoXYqes");
		
		//driver.get("https://www.google.com/");
		
		driver.manage().window().maximize();
		
		Screen s = new Screen();
		
		Pattern pause = new Pattern("pause.PNG");
		
		s.wait(pause, 10);
		
		s.click();
		s.click();
		
		/*Pattern googleText = new Pattern("googleText.PNG");
		s.wait(googleText, 10);
		
		s.type(googleText, "Selenium");*/
	
		
		
	}

}

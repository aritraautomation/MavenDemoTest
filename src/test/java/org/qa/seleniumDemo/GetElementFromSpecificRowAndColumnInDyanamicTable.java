package org.qa.seleniumDemo;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetElementFromSpecificRowAndColumnInDyanamicTable {
		static WebDriver driver;

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		driver =new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		driver.manage().window().maximize();
			
		//*[@id="customers"]/tbody/tr[4]/td[3]
		
		//to find 3rd rows values
		
		WebElement tableRow = driver.findElement(By.xpath("//table[@id='customers']/tbody/tr[4]"));
		
		System.out.println("3rd Row values--> " + tableRow.getText());
		
		//to find 3rd row and 3rd column
		
		WebElement cellIneed = tableRow.findElement(By.xpath("//table[@id='customers']/tbody/tr[4]/td[3]"));
		
		System.out.println("3rd Row and 3rd Column value---> " + cellIneed.getText());
		
	}

}



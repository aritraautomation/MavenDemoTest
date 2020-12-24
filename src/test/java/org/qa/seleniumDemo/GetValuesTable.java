package org.qa.seleniumDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetValuesTable {
	
	static WebDriver driver;
	
	public static void main(String[] args) {
			
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://demo.guru99.com/test/table.html");
		
		List<WebElement> rows = driver.findElements(By.xpath("//table/tbody/tr"));
		//List<WebElement> rows = driver.findElements(By.tagName("tr"));
		
		int rowCount=rows.size();
		
		System.out.println("Total Rows are : " + rowCount);
		
		for(int i=0;i<rowCount;i++){
			//List<WebElement> cols=driver.findElements(By.xpath("//table/tbody/tr[i]/td"));
			List<WebElement> cols=rows.get(i).findElements(By.tagName("td"));
			System.out.println("Number of Columns in " + i + " row : " + cols.size());
			
			for(int j=0;j<cols.size();j++){
				String cellText = cols.get(j).getText();
				System.out.println("Cell Value of row number " + i + " and column number " + j + " is " + cellText);
			}
			
		}
		
		
		
		
		
		
		
	}

}

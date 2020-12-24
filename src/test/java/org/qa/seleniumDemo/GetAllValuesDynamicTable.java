package org.qa.seleniumDemo;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetAllValuesDynamicTable {
	static WebDriver driver;
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://demo.guru99.com/test/table.html");

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//html/body/table/tbody/tr[1]/td[1]
		//html/body/table/tbody/tr[2]/td[1]
		
		List<WebElement> rows = driver.findElements(By.tagName("tr"));
		
		int rowCount = rows.size();
		
		System.out.println("Total Number of rows-- " + rowCount);
		
		for(int i=0;i<rowCount; i++){
			List<WebElement> columns = rows.get(i).findElements(By.tagName("td"));
			
			int colCount = columns.size();
			System.out.println("Number of cells In Row " + i + " are " + colCount);
			
			for(int j=0;j<colCount;j++){
				String cellText = columns.get(j).getText();
				
				System.out.println("Cell Value of row number " + i + " and column number " + j + " Is " + cellText);
			}
		}
		
	}

}

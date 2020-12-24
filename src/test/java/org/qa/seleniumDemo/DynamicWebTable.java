package org.qa.seleniumDemo;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DynamicWebTable {
	static WebDriver driver;
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();	
		
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		driver.manage().window().maximize();
		
		//find out number of rows in a WebTable
		WebElement customerTable = driver.findElement(By.xpath("//table[@id='customers']/tbody"));
		List<WebElement> customerList = customerTable.findElements(By.tagName("tr"));
		
		System.out.println(customerList.size());
		
		//Another way to find out number of rows in a WebTable
		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr"));
		int rowCount = rows.size();
		
		System.out.println("Total Number of rows in a WebTable is : " + rowCount);
		
		
				
		//*[@id="customers"]/tbody/tr[2]/td[1]
		//*[@id="customers"]/tbody/tr[3]/td[1]
		//*[@id="customers"]/tbody/tr[4]/td[1]
		
		String beforeXpath = "//*[@id='customers']/tbody/tr[";
		String afterXpath = "]/td[1]";
		
		//print company name
		for(int i=2; i<=customerList.size();i++){
			 String actualXpath = beforeXpath+i+afterXpath;
			 WebElement element = driver.findElement(By.xpath(actualXpath));
			 
			 System.out.println(element.getText());
			 			 
			 if (element.getText().equals("Ernst Handel")){
				 System.out.println("company name : " + 
						 element.getText() + "is found at position : " + (i-1));
				 break;
			 }
				 
			 
		}
		
		System.out.println("****************");
		//print Contact name		
		//*[@id="customers"]/tbody/tr[2]/td[2]		
		
		String afterXpathContact = "]/td[2]";
		
				for(int i=2; i<=customerList.size();i++){
					 String actualXpath = beforeXpath+i+afterXpathContact;
					 WebElement element = driver.findElement(By.xpath(actualXpath));
					 
					 System.out.println(element.getText());							 
				}	
				
			System.out.println("****************");
			
		//*[@id="customers"]/tbody/tr[2]/td[3]
			String afterXpathCountry = "]/td[3]";
				
				for(int i=2; i<=customerList.size();i++){
					 String actualXpath = beforeXpath+i+afterXpathCountry;
					 WebElement element = driver.findElement(By.xpath(actualXpath));
					 
					 System.out.println(element.getText());							 
				}
				
				
				
				//Hnadle dynamic cols
				//*[@id="customers"]/tbody/tr[1]/th[1]
				//*[@id="customers"]/tbody/tr[1]/th[2]
				//*[@id="customers"]/tbody/tr[1]/th[3]
				
				
			String beforeXpathCols = "//*[@id='customers']/tbody/tr[1]/th[";
			String afterXpathCols = "]";
			
			List<WebElement> cols = driver.findElements(By.xpath("//table[@id='customers']/"
					+ "tbody/tr[1]/th"));
			int colsCount = cols.size();
			System.out.println("Total Number of Cols are : " + colsCount);
			
			for(int i=1;i<=colsCount; i++){
				WebElement colsValues = driver.findElement(By.xpath(beforeXpathCols+i
						+afterXpathCols));
				
				System.out.println("Column values are : " + colsValues.getText());
			}
			
			
	}
	
}

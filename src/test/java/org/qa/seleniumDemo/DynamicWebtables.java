package org.qa.seleniumDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DynamicWebtables {
	static WebDriver driver;
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr"));
		
		int rowCount = rows.size();
		System.out.println("Total Number of Rows : " + rowCount);
		
		//*[@id="customers"]/tbody/tr[2]/td[1]
		//*[@id="customers"]/tbody/tr[3]/td[1]
		
		boolean flag = false;
		
		String before_xpath = "//*[@id='customers']/tbody/tr[";
		String after_xpath = "]/td[1]";
		System.out.println("Company names as below : ");
		for(int i=2;i<=rowCount;i++){
			String company = driver.findElement(By.xpath(before_xpath+i+after_xpath)).getText();			
			System.out.println(company);			
			
			if(company.equals("Island Trading")){
				System.out.println("Company Name: "+ company + "is found at location : " + (i-1));
				break;
			}
						
		}
		
		//*[@id="customers"]/tbody/tr[2]/td[2]
		
		String before_xpath1 = "//*[@id='customers']/tbody/tr[";
		String after_xpath1 = "]/td[2]";
		System.out.println("******************* ");
		System.out.println("Contact as below : ");
		for(int i=2;i<=rowCount;i++){
			String contact = driver.findElement(By.xpath(before_xpath1+i+after_xpath1)).getText();			
			System.out.println(contact);
		}
		
		
		String before_xpath2 = "//*[@id='customers']/tbody/tr[";
		String after_xpath2 = "]/td[3]";
		System.out.println("******************* ");
		System.out.println("Country Names as below : ");
		for(int i=2;i<=rowCount;i++){
			String company = driver.findElement(By.xpath(before_xpath2+i+after_xpath2)).getText();			
			System.out.println(company);
		}
		
		
		//third row and third column in a web table 
		
		WebElement tableRow = driver.findElement(By.xpath("//table[@id='customers']/tbody/tr[4]/td[3]"));
		
		System.out.println("3rd row 3rd column value is : " + tableRow.getText() );
		
		
		//third row values in a web table 
		
		WebElement thirdRowValue = driver.findElement(By.xpath("//table[@id='customers']/tbody/tr[4]"));
		
		System.out.println("3rd row values is : " + thirdRowValue.getText() );
		
	}
	
}

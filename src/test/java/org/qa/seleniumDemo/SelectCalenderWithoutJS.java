package org.qa.seleniumDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectCalenderWithoutJS {

	static WebDriver driver;
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.spicejet.com/");
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//WebElement element = driver.findElement(By.id("ctl00_mainContent_txt_Fromdate"));
		
		String date = "22-08-2020";
		
		String[] dateArr = date.split("-");
		
		String day = dateArr[0];
		String month = dateArr[1];
		String year = dateArr[2];
		
		
		
		//driver.findElement(By.xpath("//input[@class='ctl00_mainContent_txt_Fromdate')/button[@class='ui-datepicker-trigger']")).click();
		//driver.findElement(By.xpath("//body/form[@id='aspnetForm']/div[@class='maincontainer']/div[@id='wrapper']/div[@id='mainContents']/div[@id='new-homepage']/div[@id='home_banner']/div[@class='home_flight_search']/div[@id='content-change']/div[@class='book']/div[@id='flightSearchContainer']/div[@class='picker-first2']/button[1]"))
		
		driver.findElement(By.xpath("//div[@id='flightSearchContainer']/div[@class='picker-first2']/button[1]")).click();

		//driver.findElement(By.xpath("//button[@class='ui-datepicker-trigger'][0]")).click();
		driver.findElement(By.xpath("//a[@class='ui-datepicker-next ui-corner-all']//span[contains(text(),'Next')]")).click();
		
		//*[@id="ui-datepicker-div"]/div[1]/table/tbody/tr[1]/td[7]/a
		
		//*[@id="ui-datepicker-div"]/div[1]/table/tbody/tr[2]/td[1]/a
		//*[@id="ui-datepicker-div"]/div[1]/table/tbody/tr[2]/td[4]/a
		//*[@id="ui-datepicker-div"]/div[1]/table/tbody/tr[2]/td[7]/a
		
		String before_xpath = "//*[@id='ui-datepicker-div']/div[1]/table/tbody/tr[";
		String after_xpath = "]/td[";
		
		boolean flag = false;
				
		for(int row =2;row<=7;row++){
			for(int col=1;col<=7;col++){
				String dayVal = driver.findElement(By.xpath(before_xpath+row+after_xpath+col+"]/a")).getText();
				
				System.out.println(dayVal);
				
				if(dayVal.equals(day)){
					driver.findElement(By.xpath(before_xpath+row+after_xpath+col+"]/a")).click();
					flag = true;
					break;
				}
			}
				if(flag){
					break;
				}
				
				
			}
		}
		
		
		
		
	}



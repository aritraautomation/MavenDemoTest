package org.qa.seleniumDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Locators {
		static WebDriver driver;
		
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://money.rediff.com/gainers/bse/daily/groupa");
		
		
		//self axes: Select the current node
		
		System.out.println("*****self**********");
		
		String text = driver.findElement(By.xpath("//a[contains(text(),'Cipla')]/self::a")).getText();
		System.out.println(text);//Cipla
		
		
		//parent axes: Select the parent of the current node (always one)	
		
		System.out.println("*****parent**********");
		
		text = driver.findElement(By.xpath("//a[contains(text(),'Cipla')]/parent::td")).getText();
		System.out.println(text);//Cipla
		
		
		//child axes: Select all children of the current node (one or many)
		
		System.out.println("*****child**********");
		
		text = driver.findElement(By.xpath("//a[contains(text(),'Cipla')]/ancestor::tr/child::td")).getText();
		System.out.println(text);//Cipla
		
		List<WebElement> ty = driver.findElements(By.xpath("//a[contains(text(),'Cipla')]/ancestor::tr/child::td"));
		System.out.println(ty.size());//5
		
		
		//ancestor axes: Select all ancestor (parent, grandparent etc)
		
		System.out.println("*****ancestor**********");
		
		text = driver.findElement(By.xpath("//a[contains(text(),'Cipla')]/ancestor::tr")).getText();
		System.out.println(text);//Cipla A 752.05 806.85 + 7.29
		
		
		//descendant axes:: Select all descendants (children,grandchildren etc) of the current node
		
		System.out.println("*****descendant**********");
		
		ty = driver.findElements(By.xpath("//a[contains(text(),'Cipla')]/ancestor::tr/descendant::*"));
		System.out.println(ty.size());//7
		
		text = driver.findElement(By.xpath("//a[contains(text(),'Cipla')]/ancestor::tr/descendant::*")).getText();
		System.out.println(text);//Cipla
		
		//Following axes: Selects everything in the document after closing tag of the current node
		
		System.out.println("*****following**********");
		
		ty = driver.findElements(By.xpath("//a[contains(text(),'Cipla')]/ancestor::tr/following::*"));
		System.out.println(ty.size());//1816
		
		ty = driver.findElements(By.xpath("//a[contains(text(),'Cipla')]/ancestor::tr/following::tr"));
		System.out.println(ty.size());//208
		
		
		//following-sibling axes: Selects all siblings after the current node
		
		System.out.println("*****following-sibling**********");
		
		ty = driver.findElements(By.xpath("//a[contains(text(),'Cipla')]/ancestor::tr/following-sibling::tr"));
		System.out.println(ty.size());//206
		
		ty = driver.findElements(By.xpath("//a[contains(text(),'Cipla')]/ancestor::tr/following-sibling::*"));
		System.out.println(ty.size());//206
		
		
		//Preceding axes:Select all nodes that appear before the current node in the document
		
		System.out.println("*****preceding**********");
		
		ty = driver.findElements(By.xpath("//a[contains(text(),'Cipla')]/ancestor::tr/preceding::*"));
		System.out.println(ty.size());//222
		
		ty = driver.findElements(By.xpath("//a[contains(text(),'Cipla')]/ancestor::tr/preceding::tr"));
		System.out.println(ty.size());//7
		
		
		//preceding-sibling axes: Selects all siblings before the current node
		
		System.out.println("*****preceding-sibling**********");
		
		ty = driver.findElements(By.xpath("//a[contains(text(),'Cipla')]/ancestor::tr/preceding-sibling::*"));
		System.out.println(ty.size());//6
		
		ty = driver.findElements(By.xpath("//a[contains(text(),'Cipla')]/ancestor::tr/preceding-sibling::tr"));
		System.out.println(ty.size());//6
		
		driver.close();
		
		
		//div[contains(@class,'gb_Uf gb_Wa gb_Hg gb_i')]/a[@role='button']/img
	}

}

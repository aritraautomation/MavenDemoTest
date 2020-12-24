package org.qa.seleniumDemo;

import java.util.Scanner;
//import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SAPDemo {
	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		Scanner input = new Scanner(System.in);
		
		System.out.println("please provide FB username and password : ");		
		String fbusername = input.nextLine();	
		String fbpassword = input.nextLine();
		
		System.out.println("please provide Linkedin username and password : ");		
		String linkedinUsername = input.nextLine();	
		String linkedinPassword = input.nextLine();
		
		System.out.println("please provide Gmail username and password : ");		
		String gmailusername = input.nextLine();	
		String gmailpassword = input.nextLine();
				
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com/");		 			 
		driver.findElement(By.id("email")).sendKeys(fbusername);		
		driver.findElement(By.id("pass")).sendKeys(fbpassword);		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		Thread.sleep(3000);
		
		driver.switchTo().newWindow(WindowType.WINDOW);
		
		
		driver.navigate().to("https://www.linkedin.com/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys(linkedinUsername);
		driver.findElement(By.id("password")).sendKeys(linkedinPassword);
		driver.findElement(By.xpath("//button[text()='Sign in']")).click();
		
		
		Thread.sleep(3000);
		
		driver.switchTo().newWindow(WindowType.WINDOW);
		
		driver.navigate().to("https://accounts.google.com/signin");		
		driver.manage().window().maximize();
		driver.findElement(By.id("identifierId")).sendKeys(gmailusername);
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys(gmailpassword);
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		
		String text = driver.findElement(By.xpath("//a[@role='button']/img")).getText();
		System.out.println(text);
		
		
		input.close();
		driver.quit();
		
		/*while(input.hasNextLine()){
			System.out.println(input.nextLine());*/
				
			
		}
	}



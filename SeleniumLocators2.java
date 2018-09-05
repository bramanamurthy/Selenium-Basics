package com.seleniumLocatore;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumLocators2 
{
	public static void main(String[] args)
		{		
			System.setProperty("webdriver.chrome.driver", "D:\\Ramana\\Selenium Artifects\\BrowserDrivers\\chromedriver.exe");		
			WebDriver driver=new ChromeDriver(); 
		  
			//To launch the URL
			driver.get("https://login.salesforce.com/?locale=in");
			
			//To maximize the Window
			driver.manage().window().maximize();
			
			//If the attribute 'class' value contains space, we cannot use it to identify the object using locator classname
			//We will get the exception 'Compound class names not permitted' when we enable the below line
			//driver.findElement(By.className("input r4 wide mb16 mt8 username")).sendKeys("brasa");
			
			//To enter the username in the edit field
			driver.findElement(By.id("username")).sendKeys("b.ramanamurthy87@gmail.com");
			
			//To enter the password in the edit field			
			driver.findElement(By.id("password")).sendKeys("welcome");			
			
			//To click on the login button		
			driver.findElement(By.name("Login")).click();
			
			//Multiple values - Selenium identifies the first one - Scans from top left
			//When there are two fileds having same property slenium identifies the first matching element and enters the value
			//We can use facebook username field as the class is same for the both Username and Password fields
		}
}

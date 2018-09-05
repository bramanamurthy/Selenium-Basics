package com.handlingWebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class HandlingStaticDropDown {

	public static void main(String[] args)
	{		
		System.setProperty("webdriver.chrome.driver", "D:\\Ramana\\Selenium Artifects\\BrowserDrivers\\chromedriver.exe");		
		WebDriver driver=new ChromeDriver(); 
	  
		//To launch the URL
		driver.get("https://www.spicejet.com/");
		
		//To maximize the Window
		driver.manage().window().maximize();	
	
		/*
		 * 
		 * When you open a drop down you will see all the options preloaded inside it.
		 * Whenever you see 'select' tag , the webelement is static drop down
		 * 
		 * There is a class available in Selenium to work with static drop down
		 * 
		 */		
		Select s=new Select(driver.findElement(By.xpath("//div[@class='currency-dropdown']/select")));
		s.selectByValue("USD");
		
		s.selectByIndex(0);	
		
		s.selectByVisibleText("AED");
	}

}

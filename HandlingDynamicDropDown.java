package com.handlingWebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class HandlingDynamicDropDown {

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
		
		driver.findElement(By.cssSelector("#ctl00_mainContent_ddl_originStation1_CTXT")).click();		
		
		driver.findElement(By.xpath("//a[@value='GOI']")).click();
		
		//driver.findElement(By.xpath("//a[@value='PNQ']")).click();
		
		//When we run the script, it fails at step 33 sayin the element is not visible.
		// Becaues the developer reusing the same code in both the drop downs.
		// So, in line 33 it will try to identify the same element from the first dropdown options
		
		//To overcome this we need to change the Xpath to refer the second instance of the WebElement
		
		driver.findElement(By.xpath("(//a[@value='PNQ'])[2]")).click();
		
		
	}

}

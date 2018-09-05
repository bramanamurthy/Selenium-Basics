package com.seleniumLocatore;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathAndCss2 
{
	public static void main(String[] args)
		{		
			System.setProperty("webdriver.chrome.driver", "D:\\Ramana\\Selenium Artifects\\BrowserDrivers\\chromedriver.exe");		
			WebDriver driver=new ChromeDriver(); 
		  
			//To launch the URL
			driver.get("http://www.rediff.com/");
			
			//To maximize the Window
			driver.manage().window().maximize();
			
			/*
				Xpath Syntax:
				//tagName[@attributeName='attributeValue']   -> To match SPECIFIC tag with given attributeName
				//*[@attributeName='attributeValue']   -> To match ANY tag with given attributeName
				
				CSS Syntax:
				tagName[attributeName='attributeValue']
				tagName#idAttributeValue
				tagName.classAttributeValue				
				
				//XPATH with contains method
				//tagName[contains(@attributeName,'attributeValue')] 
				Example -> //input[contains(@id,'Login')]
				
				//Regular Expression with CSS
				tagName[attributeName*,'attributeValue'] 
				input[id*='Login']
			*/			
			
			driver.findElement(By.cssSelector("a[title*='Sign in']")).click();
			driver.findElement(By.xpath("//input[@id='login1']")).sendKeys("bure.ramanamurthy");		
			driver.findElement(By.cssSelector("input#password")).sendKeys("Welcome");
			driver.findElement(By.xpath("//input[contains(@name,'procee')]")).click();
		}
}

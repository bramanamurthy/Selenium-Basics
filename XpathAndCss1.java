package com.seleniumLocatore;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathAndCss1 
{
	public static void main(String[] args)
		{		
			System.setProperty("webdriver.chrome.driver", "D:\\Ramana\\Selenium Artifects\\BrowserDrivers\\chromedriver.exe");		
			WebDriver driver=new ChromeDriver(); 
		  
			//To launch the URL
			driver.get("https://login.salesforce.com/?locale=in");
			
			//To maximize the Window
			driver.manage().window().maximize();
			/*			
			//tagName[@attributeName='attribute value'] - Xpath ((With Tag Name)
			//*[@attributeName='attribute value'] -Xpath (With Regular Expression. * refers to any tag with the given attribute match)
			driver.findElement(By.xpath("//input[@type='email']")).sendKeys("bure.ramanana@gmail.com");
			
			tagName[attributeName='attribute value'] - CSS
			[attributeName='attribute value'] - CSS (Without tagName)
			tagName#idValue   - (Example input#input r4 wide mb16 mt8 username)
			tagName.ClassValue
			 */
			driver.findElement(By.cssSelector("input[id='password']")).sendKeys("Welcome");
		
		
			/*			 				 
			 Xpath Syntax:
			tagName[@attributeName='attributeValue']   -> To match SPECIFIC tag with given attributeName
			*[@attributeName='attributeValue']   -> To match ANY tag with given attributeName

			CSS Syntax:
			tagName[attributeName='attributeValue']
			[attributeName='attributeValue']
			tagName#idAttributeValue
			tagName.classAttributeValue			
			*/		
		}
}

package com.seleniumLocatore;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathAndCss5 
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
			 * 
			 * 1) [id='username']			 * 
			 * 2) #username  -> We can use the '#' to refer the ID of the webelement (Syntax #idValue)
			 * 3) .fl.small  -> We can use the '.' to refer the class name of the
			 *  WebElement(Forgot password WebElement link) (Syntax .classValue)
			 * Note: IF there is a space in the class value, we should replace it with the '.'
			 * Note: CSS is 10 times faster than XPATH
			 * 
			 * 
			 */			
			
			driver.findElement(By.cssSelector("[id='username']")).click();
			driver.findElement(By.cssSelector("[id='username']")).sendKeys("busdsdsd");
			
			driver.findElement(By.cssSelector("[id='password']")).click();
			driver.findElement(By.cssSelector("[id='password']")).sendKeys("edsx");			
			
			driver.findElement(By.cssSelector("[class='fl small']")).click();
			driver.findElement(By.cssSelector(".fl.small")).click();			
		}
}

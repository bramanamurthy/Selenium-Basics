package com.seleniumLocatore;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathAndCss3 
{
	public static void main(String[] args)
		{		
			System.setProperty("webdriver.chrome.driver", "D:\\Ramana\\Selenium Artifects\\BrowserDrivers\\chromedriver.exe");		
			WebDriver driver=new ChromeDriver(); 
		  
			//To launch the URL
			driver.get("https://www.google.co.in/");
			
			//To maximize the Window
			driver.manage().window().maximize();		
			
			//Parent and Child Relationship Xpath
			//Define Xpath to the parent/tagNames			
			
			driver.findElement(By.xpath("//div[@class='lst-c']/div/div[2]/div/input")).click();
			driver.findElement(By.xpath("//div[@class='lst-c']/div/div[2]/div/input")).sendKeys("Hello");
			
			
			/*
			 * Relative Xpath - > Finding the Xpath without depending on Parent or child relationship
			 * Example :  //input[@id='username']
			 *
			 *  
			 * Absolute Xpath - > Traversing from the element parent tag using parent child relation
			 * Example :  //div[@class='lst-c']/div/div[2]/div/input
			 * 
			 * http://www.qaclickacademy.com/interview.php
			 * //section/div/div/div/div/ul/li[2]
			 * 
			 * //body//section/div/div/div/div/ul/li[2]
			 * 
			 * 
			 * Note: Relative is more preferred than Absolute
			 *  
			 */	
		}
}

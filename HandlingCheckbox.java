package com.handlingWebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class HandlingCheckbox {

	public static void main(String[] args)
	{		
		System.setProperty("webdriver.chrome.driver", "D:\\Ramana\\Selenium Artifects\\BrowserDrivers\\chromedriver.exe");		
		WebDriver driver=new ChromeDriver(); 
	  
		//To launch the URL
		driver.get("https://www.spicejet.com/");
		
		//To maximize the Window
		driver.manage().window().maximize();
		
		//isSelected is used to check whether the checkbox is selected by default or not
		
		System.out.println("Before Clicking "+driver.findElement(By.cssSelector("#ctl00_mainContent_chk_friendsandfamily")).isSelected());		
		driver.findElement(By.cssSelector("#ctl00_mainContent_chk_friendsandfamily")).click();
		System.out.println("After Clicking "+driver.findElement(By.cssSelector("#ctl00_mainContent_chk_friendsandfamily")).isSelected());			
	}

}

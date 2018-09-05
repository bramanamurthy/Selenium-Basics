package com.handlingWebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class HandlingRadioButton {

	public static void main(String[] args)
	{		
		System.setProperty("webdriver.chrome.driver", "D:\\Ramana\\Selenium Artifects\\BrowserDrivers\\chromedriver.exe");		
		WebDriver driver=new ChromeDriver(); 
	  
		//To launch the URL
		driver.get("http://www.echoecho.com/htmlforms10.htm");
		
		//To maximize the Window
		driver.manage().window().maximize();
		
		//Clicking on the radio button << Cheese >>
		driver.findElement(By.xpath("//input[@value='Cheese']")).click();
		
		//Finding the total no of radio buttons
		System.out.println(driver.findElements(By.xpath("//input[@name='group1']")).size());
		
		
	}

}

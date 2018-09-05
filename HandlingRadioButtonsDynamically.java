package com.handlingWebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class HandlingRadioButtonsDynamically {

	public static void main(String[] args)
	{		
		System.setProperty("webdriver.chrome.driver", "D:\\Ramana\\Selenium Artifects\\BrowserDrivers\\chromedriver.exe");		
		WebDriver driver=new ChromeDriver(); 
	  
		// To launch the URL
		driver.get("http://www.echoecho.com/htmlforms10.htm");
		
		// To maximize the Window
		driver.manage().window().maximize();
		
		// Clicking on the radio button << Cheese >>
		driver.findElement(By.xpath("//input[@value='Cheese']")).click();
		
		// Finding the total no of radio buttons size and iterate and click on each radio button
		int count=driver.findElements(By.xpath("//input[@name='group1']")).size();		
		for(int i=0;i<count;i++)
		{
			driver.findElements(By.xpath("//input[@name='group1']")).get(i).click();
		}
		
		//getting the attribute value of the each element and storing into variable 'val'
		//clicking the element when the values equals to 'Butter'
		int count1=driver.findElements(By.xpath("//input[@name='group1']")).size();		
		for(int i=0;i<count1;i++)
		{			
			String val=driver.findElements(By.xpath("//input[@name='group1']")).get(i).getAttribute("value");
			System.out.println(val);			
			if(val.equals("Butter"))
			{
				driver.findElements(By.xpath("//input[@name='group1']")).get(i).click();
			}
		}		
	}
}

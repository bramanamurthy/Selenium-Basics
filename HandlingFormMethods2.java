package com.handlingWebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class HandlingFormMethods2 {

	public static void main(String[] args)
	{		
		System.setProperty("webdriver.chrome.driver", "D:\\Ramana\\Selenium Artifects\\BrowserDrivers\\chromedriver.exe");		
		WebDriver driver=new ChromeDriver(); 
	  
		//To launch the URL
		driver.get("https://www.makemytrip.com/");
		
		//To maximize the Window
		driver.manage().window().maximize();
		
		//To click on the 'Multi City'		
		driver.findElement(By.xpath("//*[@id='multicity']/label")).click();
		
		/*
		 * getText() is used to get the text of the WebElement
		 * 
		 */
		System.out.println(driver.findElement(By.cssSelector("div[class='hp-widget-top']")).getText());		
		
		
		System.out.println(driver.findElement(By.xpath("//*[@id='multicity']/label")).isEnabled());//true
		
		/*
		 * isEnabled is the method used to verify the objects in the wepage is in enable or disable mode
		 * true - Enabled
		 * false - Disabled 
		 * 
		 */		
		
		/*
		 *isDisplayed will return 'true' if the Element is present in code base and in visible mode
		 *isDisplayed will return 'false' if the Element is present in code base but NOT in visible mode
		 *isDisplayed will through error if the Element identification is incorrect. It will not return 'false'-> Refer line no 55
		 * 
		 */
		
		//isDisabled is removed from Selenium 3.0
		
		System.out.println(driver.findElement(By.xpath("//*[@id='multicity']/label")).isDisplayed());//true
		
		// To validate the object present on the WebPage or Code base we need to use the below
		int count=driver.findElements(By.xpath("//*[@id='multicitydddd']/label")).size();
		if(count==0)
		{
			System.out.println("The given element is not at all present in the application");			
		}

		System.out.println(driver.findElement(By.xpath("//*[@id='multicitydddd']/label")).isDisplayed());//Error
		
		
	}

}

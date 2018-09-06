package com.synchronization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class DifferentWaitsInSelenium {

	public static void main(String[] args)
	{		
		System.setProperty("webdriver.chrome.driver", "D:\\Ramana\\Selenium Artifects\\BrowserDrivers\\chromedriver.exe");		
		WebDriver driver=new ChromeDriver(); 
	  
		//To launch the URL
		driver.get("https://alaskatrips.poweredbygps.com/g/pt/hotels?MDPCID=ALASKA-US.TPS.BRAND.hotels.HOTEL");
		
		//To maximize the Window
		driver.manage().window().maximize();
		/*
		 * 1) Implicit Wait:
		 * Advantages:
		 * -> Hey wait for n number of seconds before you throw exception
		 * -> The scope of the implicit wait is Global
		 * -> It is applicable until the driver object is killed
		 * -> When the object is not able to identify. It will keep on listening to DOM until it finds the Element. 
		 * -> If it finds the Element early than the given time, it will proceed with the next step.
		 * Disadvantages:
		 * -> As it is a Global wait it will apply to all the elements.Hence there are chances to miss the performance defects
		 * 
		 * 2) Explicit Wait:
		 * -> It is applied to the specific WebElement. It is not a global Wait. 
		 * 
		 * -> The ideal solution for wait is combination of both implicit and explicit wait
		 * 
		 * 3) Thread.sleep():
		 * -> It is not part of Selenium.
		 * -> It is part of Java. It is hard coded wait and it will wait for the specified time.
		 * -> It halts the Java program for the specified time.
		 * 
		 * 4)Fluent Wait:
		 * -> 
		 * 
		 */
		
		//implicit wait declared for '5' seconds
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		//To enter the value in the << Destination >>field		
		driver.findElement(By.xpath("//input[@name='PlaceName']")).sendKeys("nyc");
		driver.findElement(By.xpath("//input[@name='PlaceName']")).sendKeys(Keys.TAB);		
		driver.findElement(By.xpath("//input[@id='H-fromDate']")).sendKeys(Keys.ENTER);
		
		//Explicit wait declaration. Here this wait is applicable only for the target element link given in the step 59
		WebDriverWait wait=new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[@class='flex-link'])[1]")));
		driver.findElement(By.xpath("(//a[@class='flex-link'])[1]")).click();
	}

}

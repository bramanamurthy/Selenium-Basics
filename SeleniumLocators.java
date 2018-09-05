package com.seleniumLocatore;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class SeleniumLocators {

	@SuppressWarnings("deprecation")
	public static void main(String[] args)
	{		
		System.setProperty("webdriver.gecko.driver", "D:\\Ramana\\Selenium Artifects\\BrowserDrivers\\geckodriver.exe");		
		 
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities = DesiredCapabilities.firefox();
		capabilities.setBrowserName("firefox");
		capabilities.setVersion("your firefox version");
		capabilities.setPlatform(Platform.WINDOWS);
		capabilities.setCapability("marionette", false);
	
		WebDriver driver = new FirefoxDriver(capabilities);
		  
		driver.get("http://automationpractice.com/index.php");
		
		driver.findElement(By.className("login")).click();
		
		//To identify the WebElement 'Email' with the locator 'id'
		driver.findElement(By.id("email")).sendKeys("b.ramanamurthy87@gmail.com");
		
		//To identify the WebElement 'password' with the locator 'name'
		driver.findElement(By.name("passwd")).sendKeys("selenium");
		
		//To identify the WebElement 'logout' with the locator 'name'
		driver.findElement(By.name("SubmitLogin")).click();		
		
		//To identify the WebElement 'logout' with the locator 'className'		
		driver.findElement(By.className("logout")).click();
		
		//To identify the WebElement 'Forgot your password?' with the locator 'linkText'
		driver.findElement(By.linkText("Forgot your password?")).click();;
		
		//To close the browser
		//driver.close();

	}

}

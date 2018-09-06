package com.handlingWebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class HandlingFormMethods1 {

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
		
		//Before clicking on the 'One Way' button
		System.out.println(driver.findElement(By.cssSelector("input[class='multiCityInputFrom checkSpecialCharacters ui-autocomplete-input']")).isDisplayed());
		
		//To click on the button 'one way'
		driver.findElement(By.xpath("//label[text()='one way']")).click();
		
		//After clicking on the 'One Way' button
		System.out.println(driver.findElement(By.cssSelector("input[class='multiCityInputFrom checkSpecialCharacters ui-autocomplete-input']")).isDisplayed());		
		
	}

}

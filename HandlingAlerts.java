package com.handlingWebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class HandlingAlerts {

	public static void main(String[] args)
	{		
		System.setProperty("webdriver.chrome.driver", "D:\\Ramana\\Selenium Artifects\\BrowserDrivers\\chromedriver.exe");		
		WebDriver driver=new ChromeDriver(); 
	  
		//To launch the URL
		driver.get("http://www.tizag.com/javascriptT/javascriptalert.php");
		
		//To maximize the Window
		driver.manage().window().maximize();
		
		
		/*JAVA ALERTS:
		 * If we are unable to spy the alert pop-up , it means the pop up is Java pop-up and we need to use Alert class to handle it.
		 * 
		 * Sometimes, we get a web alerts and we can handle them as how we handle the WebElements
		 * 
		 */
		
		//To click on the button 'Confirmation Alert'
		driver.findElement(By.xpath("/html/body/table[3]/tbody/tr[1]/td[2]/table/tbody/tr/td/div[4]/form/input")).click();
		
		//To get the text of the pop up
		System.out.println(driver.switchTo().alert().getText());
		
		// Now we have to switch the control to 'Alert' and click on 'OK' button		
		driver.switchTo().alert().accept();//accept -> OK,YES,DONE
		
		//driver.switchTo().alert().dismiss();//dismiss -> CANCEL
		
		//To enter the value to the pop up
		//driver.switchTo().alert().sendKeys("text to enter in pou up"); 
	}

}

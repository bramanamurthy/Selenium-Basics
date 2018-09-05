package com.seleniumLocatore;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathAndCss4 
{
	public static void main(String[] args)
		{		
			System.setProperty("webdriver.chrome.driver", "D:\\Ramana\\Selenium Artifects\\BrowserDrivers\\chromedriver.exe");		
			WebDriver driver=new ChromeDriver(); 
		  
			//To launch the URL
			driver.get("http://www.qaclickacademy.com/interview.php");
			
			//To maximize the Window
			driver.manage().window().maximize();	
			/*
			 * 
			 * 1)Traversing between siblings using 'following-sibling'
			 *  
			 * -> Using this we can traverse between siblings
			 * 
			 * Example: //*[@id="tablist1-tab1"]/following-sibling::li[2]
			 * 
			 * 2) Traversing to parent from child using 'parent'
			 * Example: //*[@id="tablist1-tab1"]/parent::ul
			 * 
			 * Note: We cannot traverse back using CSS. Only using Xpath we can travese back to parent from child
			 * 
			 * 3) Using text() method to identify the xpath
			 * Example: //*[text()=' Selenium '] or  //li[text()=' Selenium ']
			 * Note: Whenever you don't have attributes in your hand or if that attributes are not dynamic
			 * OR they are abnormal like with a lot of extra hundred characters 
			 * if you see such kind of things then only we have to use this text() method 
 			 *
			 */
			
			//To click on the Appium
			driver.findElement(By.xpath("//*[@id='tablist1-tab1']")).click();
			
			//To click on the Selenium
			//Xpath using following-sibling
			driver.findElement(By.xpath("//*[@id='tablist1-tab1']/following-sibling::li[1]")).click();
			
			//To click on the Soap UI
			//Xpath using following-sibling
			driver.findElement(By.xpath("//*[@id='tablist1-tab1']/following-sibling::li[2]")).click();
			
			//To click on the Testing
			//Xpath using following-sibling
			driver.findElement(By.xpath("//*[@id='tablist1-tab1']/following-sibling::li[3]")).click();
						
			//To identify the parent of the element tag ul
			driver.findElement(By.xpath("//*[@id='tablist1-tab1']/parent::ul")).click();			
			
			//To identify the element 'Selenium' using text() method of xpath
			driver.findElement(By.xpath("//*[text()=' Selenium ']")).click();
			
			//To identify the element 'Soap UI' using text() method of xpath
			driver.findElement(By.xpath("//li[text()=' Soap UI ']")).click();
			
			//To identify the element 'Soap UI' using text() method of xpath
			driver.findElement(By.xpath("//*[text()=' Testing ']")).click();
			
			/*
			 * package Tests;

				import java.util.List;
				
				import org.openqa.selenium.By;
				import org.openqa.selenium.WebDriver;
				import org.openqa.selenium.WebElement;
				import org.openqa.selenium.chrome.ChromeDriver;
				import org.openqa.selenium.firefox.FirefoxDriver;
				
				public class testit {
				
				public static void main(String[] args) throws InterruptedException {
				// TODO Auto-generated method stub
				System.setProperty("webdriver.chrome.driver","C:\\work\\chromedriver.exe");
				WebDriver driver =new ChromeDriver();
				driver.get("http://www.qaclickacademy.com/interview.php");
				driver.findElement(By.xpath("//li[text()=' Selenium ']")).click();
				
				driver.findElement(By.xpath("//ul[@class='responsive-tabs__list']/li[1]/following-sibling::li[2]")).click();
				
				System.out.println(driver.findElement(By.xpath(".//*[@id='tablist1-tab2']/parent::ul")).getAttribute("role"));
				//
				
				}
				}
			 */
			
		}
}

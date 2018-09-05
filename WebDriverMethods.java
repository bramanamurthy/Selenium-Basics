import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethods {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Ramana\\Selenium Artifects\\BrowserDrivers\\chromedriver.exe");		
		WebDriver driver=new ChromeDriver();
		
		//Launching the 'google' page	 
		driver.get("https://www.google.com");
		
		//To get the title of the page
		System.out.println(driver.getTitle());
		
		//To get the current URL of the page
		System.out.println(driver.getCurrentUrl());
		
		//To get the page source of the launched pageSource
		//System.out.println(driver.getPageSource());
		
		//Navigating to 'Yahoo'	
		driver.get("https://www.yahoo.com");
		
		//Navigating back to 'Google'		
		driver.navigate().back();

		//Navigating back to 'Forward'		
		driver.navigate().forward();
		
		//Closing the current browser		
		driver.close();
		
		//Closing all the browsers opened by Selenium Script	
		driver.quit();
	}

}

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launching_ChromeBrowser {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		//Selenium Code
		
		//Creating Driver object for Chrome Browser
		
		// We will strictly implement methods of WebDriver
		
		/*
		 * Class name=X
		 * 
		 * X driver=new X();
		 * 
		 */
		// Invoking the respective .exe file of the chosen browser
		System.setProperty("webdriver.chrome.driver", "D:\\Ramana\\Selenium Artifects\\BrowserDrivers\\chromedriver.exe");		
		WebDriver driver=new ChromeDriver(); 
		 
		driver.get("https://www.google.com");
		
		//To get the title of the page
		String strTitle=driver.getTitle();
		System.out.println("Title of the page: "+strTitle);	
		
	}

}

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Launching_FirefoxBrowser {

	@SuppressWarnings("deprecation")
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		//Selenium Code
		
		//Creating Driver object for Firefox Browser
		
		// We will strictly implement methods of WebDriver
		
		/*
		 * Class name=X
		 * 
		 * X driver=new X();
		 * 
		 */
		// Invoking the respective .exe file of the chosen browser
		System.setProperty("webdriver.gecko.driver", "D:\\Ramana\\Selenium Artifects\\BrowserDrivers\\geckodriver.exe");		
		 
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities = DesiredCapabilities.firefox();
		capabilities.setBrowserName("firefox");
		capabilities.setVersion("your firefox version");
		capabilities.setPlatform(Platform.WINDOWS);
		capabilities.setCapability("marionette", false);
	
		WebDriver driver = new FirefoxDriver(capabilities);
		 
		driver.get("https://www.google.com");
	
		//To get the title of the page
		String strTitle=driver.getTitle();
		System.out.println("Title of the page: "+strTitle);	
		
	}

}

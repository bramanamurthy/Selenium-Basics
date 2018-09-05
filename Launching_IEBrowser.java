import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Launching_IEBrowser {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		//Selenium Code
		
		//Creating Driver object for IE Browser
		
		// We will strictly implement methods of WebDriver
		
		/*
		 * Class name=X
		 * 
		 * X driver=new X();
		 * 
		 */
		// Invoking the respective .exe file of the chosen browser
		System.setProperty("webdriver.ie.driver", "D:\\Ramana\\Selenium Artifects\\BrowserDrivers\\IEDriverServer.exe");		
		WebDriver driver=new InternetExplorerDriver(); 
		 
		driver.get("https://www.google.com");
		
		//To get the title of the page
		String strTitle=driver.getTitle();
		System.out.println("Title of the page: "+strTitle);	
		
	}

}

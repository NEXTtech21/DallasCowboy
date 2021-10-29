package Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class BrowserFactory1 {
	static  WebDriver driver;
	public BrowserFactory1 (WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver,this);
	}

		public static WebDriver BrowserFactory(String browserName, String url) { 
		if (browserName.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Mamun\\Downloads\\chromedriver_win32\\chromedriver.exe");
		   WebDriver  driver= new ChromeDriver();		
		}
		
		else if (browserName.equalsIgnoreCase("FireFox")) {
			 System.setProperty("webdriver.Geco.driver", "C:\\Users\\Mamun\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new FirefoxDriver();
		     
		}
		
		else if (browserName.equalsIgnoreCase("internetexplorer"))
		{
			System.setProperty("webdriver.internetexplorer.driver","C:\\Users\\Mamun\\Download\\chromedriver_win32\\chromedriver.exe");
		  WebDriver driver= new InternetExplorerDriver();
		  
		}
		
	driver.get("https://demo.oscommerce.com");
	return driver;
	
		
		
	}

}

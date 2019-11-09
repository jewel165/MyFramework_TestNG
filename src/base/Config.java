package base;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import driverFunctions.Functions;


public class Config extends Functions  {
	
	
	@Parameters("browser")
	@BeforeMethod(alwaysRun = true)
	//@Parameters("browser", "chrome")
		
public void setupbrowser(String browserName) {
		
		if(browserName.equalsIgnoreCase("chrome")) {
			//System.setProperty("webdriver.chrome.driver","/Users/jewel/git/MyFramework004/Drivers/chromedriver");
			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//Drivers//chromedriver");
			driver = new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("firefox")){
			//System.setProperty("webdriver.gecko.driver","/Users/jewel/GitHub/TestNG_Framework_FB/Divers/geckodriver");
			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//Drivers//geckodriver.exe");

			
			driver = new FirefoxDriver();
		}
		
		//System.setProperty("webdriver.chrome.driver","/Users/jewel/Downloads/chromedriver");
		//driver = new ChromeDriver();
		driver.get("http://www.amazon.com");
		pageload();
		maxscreen();
		wttime();
		DltCookies();
		
	}	

	


	@AfterMethod(alwaysRun = true)
	public void close() {
		driver.quit();
	}


}
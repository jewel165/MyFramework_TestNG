package base;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import driverFunctions.Functions;

public class Config extends Functions {

	//public String driverpath ="‎⁨‎⁨‎⁨‎⁨‎⁨Macintosh HD⁩ ▸ ⁨Users⁩ ▸ ⁨jewel⁩ ▸ ⁨eclipse-workspace⁩⁩⁩⁩"; 
	//public WebDriver driver;
	
	
	@BeforeMethod
	public void setup() {
		//System.setProperty("webdriver.gecko.driver","/Users/jewel/eclipse-workspace/geckodriver");
		//driver = new FirefoxDriver();
		
		System.setProperty("webdriver.chrome.driver","/Users/jewel/Downloads/chromedriver");
		driver = new ChromeDriver();
		driver.get("http://wwww.amazon.com");
		pageload();
		maxscreen();
		wttime();
	}	


	

	@AfterMethod
	public void close() {
		driver.quit();
	}

}

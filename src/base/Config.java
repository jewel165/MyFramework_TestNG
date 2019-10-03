package base;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import driverFunctions.Functions;

public class Config  {

	//public String driverpath ="‎⁨‎⁨‎⁨‎⁨‎⁨Macintosh HD⁩ ▸ ⁨Users⁩ ▸ ⁨jewel⁩ ▸ ⁨eclipse-workspace⁩⁩⁩⁩"; 
	public WebDriver driver;
	

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


	private void wttime() {
		// TODO Auto-generated method stub

	}


	private void maxscreen() {
		// TODO Auto-generated method stub

	}


	private void pageload() {
		// TODO Auto-generated method stub

	}

	@AfterMethod
	public void close() {
		driver.quit();
	}

}

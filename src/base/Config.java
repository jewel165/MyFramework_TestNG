package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import driverFunctions.Functions;

public class Config extends Functions {

	public WebDriver driver;
	

	@BeforeMethod
	public void setup() {
		System.setProperty("webdriver.gecko.driver","‎⁨‎⁨‎⁨‎⁨Macintosh HD⁩ ▸ ⁨Users⁩ ▸ ⁨jewel⁩⁩⁩");
		driver = new FirefoxDriver();
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
	public void closebroswer() {
		driver.quit();
	}

}

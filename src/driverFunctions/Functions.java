package driverFunctions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import base.Config;
import locators.AmazonLoc;
import testData.Values;

public class Functions extends Config {




	AmazonLoc lc= new AmazonLoc();
	Values vl = new Values();


	public String properres;
	//pageload
	public void pageload() {
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	}

	public void maxscreen() {
		driver.manage().window().maximize();
	}

	public void wttime() {
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
	}

	//All Clicks
	public void clickonaccount() {
		driver.findElement(By.xpath(lc.Account)).click();
	}
	public void clickonsignin()	{
		driver.findElement(By.xpath(lc.Log_cont)).click();
	}

	public void SignInSubmit() {
		driver.findElement(By.xpath(lc.signin)).click();
	}
	public void createaccount() {
		//driver.findElement(By.xpath()).click();
	
	}
	
	public void clickonNav() {
		driver.findElement(By.xpath(lc.NavMenu)).click();
	}
	
	public void clcikonSignout() {
		driver.findElement(By.xpath(lc.SnOutBtn));
	}

	public void clickonsearch() {
		driver.findElement(By.xpath(lc.searchbutton)).click();
	}
	//	all type-in
	public void tpiphone() {
		driver.findElement(By.xpath(lc.srcbar)).sendKeys(vl.SearchIph);

	}

	public void TpEmail( ) {
		driver.findElement(By.xpath(lc.Log_email)).sendKeys(vl.eml);
	}

	public void TpPassword() {
		driver.findElement(By.xpath(lc.Log_Pass)).sendKeys(vl.pass01);
	}

	//	Search ressult field
	public void srcresult() {
		String result01=	driver.findElement(By.xpath(lc.srcressult)).getText();
		String properres = result01.replaceAll("^\"|\"$", "");
		System.out.println(properres);


	}
	
	//Log-in Varification
	
	public void VerifyLogin() {
		 String HldName = driver.findElement(By.xpath(lc.AccHolder)).getText();
		 System.out.println(HldName);
		 Assert.assertEquals(HldName, vl.AccGreeting);
		 
		 
	}


	//HomepageRandom
	public void logo01() {
	boolean aa = 	driver.findElement(By.xpath(lc.Logo)).isDisplayed();
	boolean ab = 	driver.findElement(By.xpath(lc.Logo)).isEnabled();
	
	}





}


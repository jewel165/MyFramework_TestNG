package testSet;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import base.Config;
import driverFunctions.Functions;
import locators.AmazonLoc;
import testData.Values;

public class AmazonHmPage extends Functions {

	Functions dd = new Functions();
	AmazonLoc al = new AmazonLoc();
	Values vl = new Values();

	@Test (groups = {"smoke","regression"})
	public void AzHomepage() {
		String url=	driver.getCurrentUrl();
		System.out.println(url);
	}



	@Test (groups = {"smoke"})
	public void tittle() {
		String acttittle = 	driver.getTitle();
		System.out.println(acttittle);

	}

	@Test(groups = {"smoke","regression"})
	public void AzLogin() {
		clickonaccount();
		TpEmail();
		// String aaa =  driver.findElement(By.xpath(al.Log_email)).getText();
		// System.out.println(aaa);
		clickonsignin();
		TpPassword();
		SignInSubmit();
		VerifyLogin();
	}



	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

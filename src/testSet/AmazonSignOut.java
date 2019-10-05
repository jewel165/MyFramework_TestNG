package testSet;

import org.testng.annotations.Test;

import driverFunctions.Functions;
import locators.AmazonLoc;
import testData.Values;

public class AmazonSignOut extends Functions  {
	
	Functions dd = new Functions();
	AmazonLoc al = new AmazonLoc();
	Values vl = new Values();
	
	@Test
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
	
	@Test (dependsOnMethods="AzLogin")
	public void SignOut() {
		//clickonNav();
		//clcikonSignout();
		clickonNav();
		clcikonSignout();
	}

}

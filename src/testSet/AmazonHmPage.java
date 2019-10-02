package testSet;

import org.testng.annotations.Test;

import base.Config;
import driverFunctions.Functions;
import locators.AmazonLoc;
import testData.Values;

public class AmazonHmPage extends Config {

	Functions df = new Functions();
	AmazonLoc al = new AmazonLoc();
	Values vl = new Values();
	
	@Test
	public void AzHomepage() {
		String url=	driver.getCurrentUrl();
		System.out.println(url);
	}

	//	@Test(priority=1)
	//	public void Azsignup() {
	//		clickonaccount(al.Account);
	//		clickonsignin(al.signin);
	//		createaccount(al.crtacc);
	//	
	//	}

	
		

	@Test
	public void tittle() {
		String acttittle = 	driver.getTitle();
		System.out.println(acttittle);

	}

	

	
}

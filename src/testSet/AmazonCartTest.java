package testSet;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.Config;
import driverFunctions.Functions;
import locators.AmazonLoc;
import testData.Values;

public class AmazonCartTest extends Config {
	
	AmazonLoc lv = new AmazonLoc();
	Values vl02 = new Values();
	
	
	
	
	@Test(groups = {"Smoke","Regression","Random"})
	public void AddToCart() {
		driver.findElement(By.xpath(lv.srcbar)).sendKeys(vl02.iph);
		driver.findElement(By.xpath(lv.searchbutton)).click();
		driver.findElement(By.xpath(lv.SrcList)).click();
		driver.findElement(By.id(lv.AddC)).click();
		driver.findElement(By.id(lv.AddExt)).click();
		String Confir = 	driver.findElement(By.xpath(lv.AddConf)).getText();
		String Confirmation = Confir.trim();
		//System.out.println(Confirmation);
		Assert.assertEquals(Confirmation, vl02.CartAddConf);
		
	}

}

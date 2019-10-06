package testSet;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import driverFunctions.Functions;
import locators.AmazonLoc;
import testData.Values;

public class AmazonCartTest extends Functions {
	
	AmazonLoc lv = new AmazonLoc();
	Values vl02 = new Values();
	
	
	@Test
	public void AddToCart() {
		driver.findElement(By.xpath(lv.srcbar)).sendKeys(vl02.iph);
		driver.findElement(By.xpath(lv.searchbutton)).click();
		driver.findElement(By.xpath(lv.SrcList)).click();
		
	driver.findElement(By.id(lv.AddC));
		
	}

}

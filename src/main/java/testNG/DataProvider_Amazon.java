package testNG;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.base.BaseClass;
import org.bouncycastle.asn1.dvcs.Data;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider_Amazon extends BaseClass{

	@BeforeClass
	
	private void tc1() {

		launchBrowser();
		windowMaximize();
	}
	
	@DataProvider (name = "amazon")
	public Object[][] tc3() {
		return new Object[][] {
			
			{"Cat food"},
			{"TV"},
			{"AC"},
			{"Mobile"},
			{"xbox"},

		};
	}
	
	
	@Test(dataProvider =  "amazon" )
	
	private void tc2(String e) throws AWTException {

		launchUrl("https://www.amazon.in/");
		
		WebElement sear = d.findElement(By.id("twotabsearchtextbox"));
		
		sear.sendKeys(e);
		
		Robot r = new Robot();
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

	}
	
}

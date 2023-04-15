package testNG;

import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameter extends BaseClass {
	
	
	@DataProvider(name = "sample")
	private Object[][] data() {
		return new Object [] [] {
			{"abc","123"},
			{"happy","15489"},
			{"prasanth","154984"},
			{"hi","184945"},


		};
	}
	
	
@Test(dataProvider = "sample" )
	
	private void tc2(String em, String pas) {
		launchUrl("https://www.facebook.com/");
		
		WebElement email = d.findElement(By.id("email"));
		email.sendKeys(em);
		WebElement pass = d.findElement(By.id("pass"));
		pass.sendKeys(pas);
		}
	
	
	
	@Parameters({"useName","pas"})
	@Test
	
	private void tc1(@Optional("hi") String e,@Optional("123") String p) {
		launchUrl("https://www.facebook.com/");
		
		WebElement email = d.findElement(By.id("email"));
		email.sendKeys(e);
		WebElement pass = d.findElement(By.id("pass"));
		pass.sendKeys(p);
		}
	
@Test(dataProvider = "amazon",dataProviderClass = DataProvider_Amazon.class)
private void tc3(String e) {

	System.out.println(e);
}
	
	
	
	
	@BeforeClass
	
	private void tc2() {

		launchBrowser();
		windowMaximize();
	}
	
}

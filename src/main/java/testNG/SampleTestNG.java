package testNG;

import java.util.Date;

import org.apache.poi.util.SystemOutLogger;
import org.base.BaseClass;
import org.pom.Pom_getters_setters;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SampleTestNG extends BaseClass {
	
	@Test(invocationCount = 3)
	
	private void tc1() {
		launchUrl("https://www.facebook.com/");
		
		String pageTitle = pageTitle();
		Assert.assertEquals(pageTitle.contains("facebook"), "Check your page title");
		
		Pom_getters_setters f = new Pom_getters_setters();
		passText("prasanth", f.getEmail());
		passText("Inmakes", f.getPassword());
	}
	
	@Test(priority = -15)

	private void tc2() {

	launchUrl("https://www.facebook.com/");
	
	String pageTitle2 = pageTitle();
	//SoftAssert
	SoftAssert s = new SoftAssert();
	
	s.assertTrue(pageTitle2.contains("FaceBook"), "Check your page title");
	Pom_getters_setters f = new Pom_getters_setters();
	passText("prasanth", f.getEmail());
	passText("Inmakes", f.getPassword());
	s.assertAll();
	
	}	
	
	@Test

	private void tc3() {

		launchUrl("https://www.amazon.in/");
		
	}
	
	@BeforeMethod
	
	private void stTime() {
		Date d = new Date();
		System.out.println(d);

	}
	
	@AfterMethod
	
	private void endTime() {
		Date d = new Date();
		System.out.println(d);
	}
	
	@BeforeClass
	
	private void launchTheBrowser() {
		launchBrowser();
		windowMaximize();
	}


@AfterClass

private void closeTheBrowser() {
	System.out.println("close browser");

}
}
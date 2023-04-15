package testNG;

import java.util.Date;

import org.base.BaseClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG_part_3 extends BaseClass{
	
	@Test (enabled = false)
	
	private void tc1() {

		launchUrl("https://mail.google.com/");
	}
	

	@Test (invocationCount = 10)
	
	private void tc5() {

		launchUrl("https://inmakes.com/");
	}
	
	@Test
	
	private void tc2() {

		launchUrl("https://www.redbus.in/");
	}
	
	@BeforeClass
	
	private void launch() {

		launchBrowser();
		windowMaximize();
	}
	
	@AfterClass
		
	private void close() {

		System.out.println("Close browser");
	}
	
	@BeforeMethod
	
	private void startTime() {

		Date d = new Date();
		System.out.println(d);
	}
	
	
	@AfterMethod
	
	private void endTime() {

		Date d = new Date();
		System.out.println(d);
	}
	
	
	
}

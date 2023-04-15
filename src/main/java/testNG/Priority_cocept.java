package testNG;

import org.base.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Priority_cocept extends BaseClass {

	@Test(priority = -4)
	private void tc1() {

		launchUrl("https://www.amazon.in/");
	}

	@Test(priority = -1)

	private void tc2() {

		launchUrl("https://inmakes.com/");
	}

	@Test(priority = 1)

	private void tc3() {

		launchUrl("https://www.redbus.in/");
	}
	
	@Test

	private void tc4() {

		launchUrl("https://www.flipkart.com/");
	}

	@Test(priority = 2)

	private void tc5() {

		launchUrl("https://mail.google.com/");
	}

	@Test(priority = -2)

	private void tc6() {

		launchUrl("https://www.youtube.com/");
	}
	
	@Test(priority = -3)

	private void tc7() {

		launchUrl("https://www.facebook.com/");
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

}

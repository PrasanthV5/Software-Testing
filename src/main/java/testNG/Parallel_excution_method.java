package testNG;

import org.base.BaseClass;
import org.testng.annotations.Test;

public class Parallel_excution_method extends BaseClass {

	@Test

	private void tc1() {
		System.out.println("TC3 " + Thread.currentThread().getId());

		launchBrowser();
		windowMaximize();
		launchUrl("https://www.facebook.com/");
	}

	@Test

	private void tc2() {
		System.out.println("TC2 " + Thread.currentThread().getId());

		launchBrowser();
		windowMaximize();
		launchUrl("https://www.flipkart.com/");
	}

	@Test

	private void tc3() {
		System.out.println("TC3 " + Thread.currentThread().getId());

		launchBrowser();
		windowMaximize();
		launchUrl("https://www.amazon.in/");
		
	}

}

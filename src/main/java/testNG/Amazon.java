package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\eclipse-workspace\\SeleniumInmakes\\drivers\\chromedriver.exe");

		WebDriver d = new ChromeDriver();

		d.get("https://www.amazon.in/");

		d.manage().window().maximize();

		Actions a = new Actions(d);

		WebElement prime = d.findElement(By.xpath("//span[text()='Prime']"));

		a.moveToElement(prime).perform();
		
		Thread.sleep(3000);
		WebElement body = d.findElement(By.id("multiasins-img-link"));
		
		body.click();
	}
}
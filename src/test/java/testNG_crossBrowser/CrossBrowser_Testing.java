package testNG_crossBrowser;

import org.base.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CrossBrowser_Testing extends BaseClass {
	
	
	@Parameters ("browser")
	@Test
	
	private void tc1(String b) {
		WebDriver d;
		if (b.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			d = new ChromeDriver();
		}
		else	if (b.equals("fireFox")) {
			WebDriverManager.firefoxdriver().setup();
			d = new FirefoxDriver();
		}
		
		else
		{
			WebDriverManager.edgedriver().setup();
			d= new EdgeDriver();
		}
		
	d.get("https://www.amazon.in/");
	d.manage().window().maximize();
	
	}
	
	

}

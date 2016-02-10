package saucepackage;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SauceLabTest {

	@Test
	public void setup() throws MalformedURLException{
		DesiredCapabilities dc = new DesiredCapabilities().firefox();
		dc.setCapability("version", "5");
		dc.setCapability("platform", "XP");
		
		WebDriver driver = new RemoteWebDriver(
				new URL("http://saucelabid:accesskey@ondemand.saucelabs.com:80/wd/hub"),
				dc);
		
		driver.get("http://www.google.com/");
		System.out.println(driver.getTitle());
		
		
	}
	

}

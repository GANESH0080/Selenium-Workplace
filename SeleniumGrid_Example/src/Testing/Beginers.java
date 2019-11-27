package Testing;

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.*;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Beginers {
	WebDriver driver;
	String baseUrl, hubURL;

	@BeforeTest
	public void setUp() throws MalformedURLException {
		/*
		 * System.setProperty("webdriver.firefox.marionette",
		 * "D:\\Imp Downloads\\geckodriver-v0.22.0-win64\\geckodriver.exe");
		 * WebDriver driver = new FirefoxDriver();
		 */

		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32_2.35\\chromedriver.exe");

		baseUrl = "http://test.cogitate.us/PPE.Test/";
		hubURL = "http://192.168.0.214:4444/wd/hub";

		// Define Desire capabilities
		DesiredCapabilities capability = new DesiredCapabilities();
		capability = DesiredCapabilities.chrome();
		capability.setBrowserName("chrome");
		capability.setVersion("76.0.3809.10");
		capability.setPlatform(Platform.WIN10);

		driver = new RemoteWebDriver(new URL(hubURL), DesiredCapabilities.chrome());

	}

	@AfterTest
	public void afterTest() {
		driver.quit();
	}

	@Test
	public void simpletest() {
		driver.get(baseUrl);
	}
}
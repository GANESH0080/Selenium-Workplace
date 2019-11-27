package Testcase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import POMTestingPages.LoginPage;
import POMTestingPages.QuoteProcess;
import POMTestingPages.QuoteProcessOne;
import POMTestingPages.VerifyHomePage;

public class Testcases {
	WebDriver driver;
	LoginPage objlogin;
	VerifyHomePage objhomepage;
	QuoteProcess objQuoteProcess;
	QuoteProcessOne objQuote;

	@BeforeTest
	public void BrowserSetup() throws InterruptedException {

		DesiredCapabilities capabilities = DesiredCapabilities.firefox();
		capabilities.setCapability("marionette", true);
		// System.setProperty("webdriver.gecko.driver", "D:\\Imp
		// Downloads\\geckodriver-v0.22.0-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://test.cogitate.us/PPE.Test/");

	}

	@Test(priority = 0)
	public void LoginIntoApplication() throws InterruptedException {
		objlogin = new LoginPage(driver);
		objlogin.login("ih.jbutler", "10#Hammer");
	}

	@Test(priority = 1)
	public void VerifyHomePage() {
		objhomepage = new VerifyHomePage(driver);
		// Verify home page
		AssertJUnit.assertTrue(objhomepage.Homepage().contains("Jeff Buttler   |   "));
	}

	@Test(priority = 2)
	public void SearchAddressForQuote() throws InterruptedException {
		objQuoteProcess = new QuoteProcess(driver);
		objQuoteProcess.SearchAddress();

	}

	@Test(priority = 3)
	public void ChangeAddressForQuote() throws InterruptedException {
		objQuote = new QuoteProcessOne(driver);
		objQuote.FindAddress("229 8th Ave Dr SW Hickory, NC 28602 USA");

	}

	@AfterTest
	public void Browserfinish() {
		objlogin = new LoginPage(driver);
		objlogin.browserclose();

	}

}

package LandingPage;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import POM.LoginPagePOM;
import TestBase.ReadExcelData;
import TestBase.TestBase;


public class LoginInPPE {
	static WebDriver driver;
	
	
	@Test(priority=1)
	public static void verifyLogin() {
	    TestBase obj1 = new TestBase();
		driver = obj1.setUpBrowser();
		LoginPagePOM obj = new LoginPagePOM();
		obj.typeUserName(driver);
		obj.typePassword(driver);
		obj.clickLoginButton(driver);
	}

	@Test(priority=2)
	public static void closeBrowser() {
		driver.close();
	}
	public static void main(String[] args) throws Exception
	{ 
		verifyLogin();
		closeBrowser();
	
		ReadExcelData.ProcessExcelData();
		
		
	}
	}


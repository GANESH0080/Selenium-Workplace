package TestBase;

import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import FileReaders.ConfigFileReader;

// Base class includes commonly used methods across many test scripts!
// Ex Setupmethod() to define chromedriver.exe path, browser initialisation part, browser maximize part
// getScreenshot(String name) method defines the code to take screenshot
// So if you are using these methods from the base class and there is any change in chromedriver.exe path or 
// screenshot folder then you need to update the new path in Base class methods and not in all test scripts!

public class TestBase {
    WebDriver driver;

	
   @Test(priority=0)
	public WebDriver setUpBrowser() {
		Properties prop = ConfigFileReader.ReadConfigFile();
		String browserPath = (prop.getProperty("ChromeDriverPath"));
		String AppURL = (prop.getProperty("URL"));
		System.setProperty("webdriver.chrome.driver", browserPath);
		WebDriver driver = new ChromeDriver();
		driver.get(AppURL);
		driver.manage().window().maximize();
	    System.out.println(driver instanceof WebDriver);
	    return driver;
	}
}


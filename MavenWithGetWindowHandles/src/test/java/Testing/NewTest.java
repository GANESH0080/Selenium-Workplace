package Testing;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

public class NewTest {
	public static WebDriver driver;

	@Test
	public void f() {
		driver.get("http://toolsqa.wpengine.com/automation-practice-switch-windows/");

		// Store and Print the name of the First window on the console

		String handle = driver.getWindowHandle();

		System.out.println(handle);

		// Click on the Button "New Message Window"

		driver.findElement(By.xpath("//*[@id='content']/p[3]/button")).click();

		// Store and Print the name of all the windows open

		Set handles = driver.getWindowHandles();

		System.out.println(handles);

		// Pass a window handle to the other window

		for (String handle1 : driver.getWindowHandles()) {

			System.out.println(handle1);

			driver.switchTo().window(handle1);

		}
	}

	@BeforeClass
	public void beforeClass() {
		driver = new FirefoxDriver();
	}

	@AfterClass
	public void afterClass() {
		driver.close();

		// Close Original window

		driver.quit();
	}

}

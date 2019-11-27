package OLA;

import io.appium.java_client.android.AndroidDriver;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class OLAApplicationTesting {
	@SuppressWarnings("rawtypes")
	private static AndroidDriver driver;

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) throws MalformedURLException, InterruptedException {

		File classpathRoot = new File(System.getProperty("user.dir"));
		System.out.println("Classpath Root:" + classpathRoot.getAbsolutePath());
		File appDir = new File(classpathRoot, "/Apps/Amazon/");
		File app = new File(appDir, "ola.apk");

		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(CapabilityType.BROWSER_NAME, "");
		capabilities.setCapability("deviceName", "G3");
		capabilities.setCapability("platformVersion", "6.0.0");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("app", app.getAbsolutePath());
		// How to find Apppackage & Appactivity of App : http://www.automationtestinghub.com/apppackage-and-appactivity-name/
		capabilities.setCapability("appPackage", "com.olacabs.customer");
		capabilities.setCapability("appActivity", "com.olacabs.customer.ui.SplashActivity");
		driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(1000);
		driver.findElement(By.id("com.olacabs.customer:id/continue_with_phone_number")).click();
		Thread.sleep(2000);
		driver.findElement(By.className("android.widget.EditText")).click();
		Thread.sleep(1000);
		driver.findElement(By.className("android.widget.EditText")).sendKeys("9768180080");
		Thread.sleep(1000);
		driver.findElement(By.id("com.olacabs.customer:id/blackButton")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("Amazon password")).sendKeys("kalamboli");
		driver.hideKeyboard();
		Thread.sleep(1000);
		driver.findElement(By.className("android.widget.Button")).click();
		Thread.sleep(1000);
	}

}

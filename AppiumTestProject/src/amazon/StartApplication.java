package amazon;
 
import io.appium.java_client.android.AndroidDriver;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
 
public class StartApplication {
 
		@SuppressWarnings("rawtypes")
		private static AndroidDriver driver;
		@SuppressWarnings("rawtypes")
		public static void main(String[] args) throws MalformedURLException, InterruptedException {
 
		   // File classpathRoot = new File(System.getProperty("user.dir"));
		   // System.out.println(classpathRoot);
		   // System.out.println("Classpath Root:" + classpathRoot.getAbsolutePath());
			File appDir = new File("D:/SeleniumWorkspace/AppiumTestProject/Apps/Amazon/");
			File app = new File(appDir, "Amazon_India.apk");
 
			DesiredCapabilities capabilities = new DesiredCapabilities();
			capabilities.setCapability(CapabilityType.BROWSER_NAME, "");
			capabilities.setCapability("deviceName", "G3");
			capabilities.setCapability("platformVersion", "6.0.0");
			capabilities.setCapability("platformName", "Android");
			capabilities.setCapability("app", app.getAbsolutePath());
			// How to find Apppackage & Appactivity of App : http://www.automationtestinghub.com/apppackage-and-appactivity-name/
			capabilities.setCapability("appPackage", "in.amazon.mShop.android.shopping");
			capabilities.setCapability("appActivity", "com.amazon.mShop.home.HomeActivity");
			driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			Thread.sleep(1000);
			driver.findElement(By.className("android.widget.Button")).click();
			Thread.sleep(1000);
			driver.findElement(By.className("android.widget.EditText")).click();
			Thread.sleep(1000);
			driver.findElement(By.className("android.widget.EditText")).sendKeys("ganusalunkhe@gmail.com");
			Thread.sleep(1000);
			driver.findElement(By.name("Amazon password")).click();
			Thread.sleep(1000);
			driver.findElement(By.name("Amazon password")).sendKeys("kalamboli");
			driver.hideKeyboard();	
			Thread.sleep(1000);
			driver.findElement(By.className("android.widget.Button")).click();
			Thread.sleep(1000);
			driver.findElement(By.className("android.widget.ImageView")).click();
			Thread.sleep(1000);
			String ActualStr = driver.findElement(By.id("in.amazon.mShop.android.shopping:id/gno_greeting_text_view")).getText();
			System.out.println(ActualStr);

			
	}
 
}
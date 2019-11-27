package BrownNBrown_Package;
import io.appium.java_client.android.AndroidDriver;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
 
public class BrownNNrown_Login {

 
		@SuppressWarnings("rawtypes")
		private static AndroidDriver driver;
		@SuppressWarnings("rawtypes")
		public static void main(String[] args) throws MalformedURLException, InterruptedException {
 
		    File classpathRoot = new File(System.getProperty("user.dir"));
		    System.out.println("Classpath Root:" + classpathRoot.getAbsolutePath());
			File appDir = new File(classpathRoot, "/Apps/Amazon/");
			File app = new File(appDir, "app-release.apk");
 
			DesiredCapabilities capabilities = new DesiredCapabilities();
			capabilities.setCapability(CapabilityType.BROWSER_NAME, "");
			capabilities.setCapability("deviceName", "G3");
			capabilities.setCapability("platformVersion", "6.0.0");
			capabilities.setCapability("platformName", "Android");
			capabilities.setCapability("app", app.getAbsolutePath());
			// How to find Apppackage & Appactivity of App : http://www.automationtestinghub.com/apppackage-and-appactivity-name/
			capabilities.setCapability("appPackage", "us.cogitate.brownnbrown");
		    capabilities.setCapability("appActivity", "us.cogitate.brownnbrown.client.login.Login");
			
			driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			Thread.sleep(1000);
			

			
	}
 
}
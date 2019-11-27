package Testing_SSO;

import java.awt.AWTException;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login_In_SSO_n_Upload_Product_Logo 
        {
	    public static void main(String[] args) throws InterruptedException, AWTException, IOException
	    {
		//STEP 1: Declaration and instantiation of objects/variables
	    WebDriver driver = new FirefoxDriver();
	    //STEP 2: Maximize the firefox browser
	    driver.manage().window().maximize();
	    //STEP 3: Declaring the actual base URL
	    String baseUrl = "http://cogitate.us:8065/";
	    //STEP 4: Launch Firefox and direct it to the Base URL
	    driver.get(baseUrl);
	    //Waiting time
	    Thread.sleep(2000);
	    //STEP 5: Declaring the Expected URL
	    String ExpUrl = "http://cogitate.us:8065/";
	    //STEP 6: Verifyiing URL
	    if(baseUrl.equals(ExpUrl))
	    {
	    System.out.println("Pass");
	    }
	    else
	    {
	    System.out.println("Fail");
	    }
	    //STEP 7: Clicking on USERNAME field
	    driver.findElement(By.xpath("//*[@id='txtUserID']")).click();
	    //Waiting time
	    Thread.sleep(2000);
	    //STEP 8: Entering USERNAME in username field
	    driver.findElement(By.xpath("//*[@id='txtUserID']")).sendKeys("superadmin");
	    //Waiting time
	    Thread.sleep(2000);
	    //STEP 9: Initializing Webelemrnt
	    WebElement webElement = driver.findElement(By.xpath("//*[@id='txtPassword']"));
	    //STEP 10: Pressing TAB key
	    webElement.sendKeys(Keys.TAB);
	    //STEP 11: Entering PASSWORD in username field
	    driver.findElement(By.xpath("//*[@id='txtPassword']")).sendKeys("password");
	    //Waiting time
	    Thread.sleep(1000);
	    //STEP 12: Clicking on LOGIN button
	    driver.findElement(By.xpath("//*[@id='btnSubmit']")).click(); 
	
	    WebDriverWait wait = new WebDriverWait(driver, 60);// 1 minute 
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='navbar']/li[1]/a")));
	    //driver.findElement(By.id("order_billing_name")).sendKeys(a.getName());
	    
	    driver.findElement(By.xpath("//*[@id='navbar']/li[1]/a")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//*[@id='btnAddProducts']")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//*[@id='fimguplaod']")).click();
	    Thread.sleep(2000);
	    // Calling AutoIT script
	    Runtime.getRuntime().exec("D:\\Auto_it.exe");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//*[@id='btnPreview']")).click();
	    Thread.sleep(2000);
	    driver.quit();   
	    }
}
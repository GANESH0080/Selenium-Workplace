package Sprint_Testing;

import java.awt.AWTException;
import java.io.File;
import java.io.IOException;
import java.sql.SQLException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Analytics_Page_Screenshot
{
public static void main(String[] args) throws InterruptedException, AWTException, ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException, IOException
{    
//STEP 1: Declaration and instantiation of objects/variables
WebDriver driver = new FirefoxDriver();
//STEP 2: Maximize the firefox browser
driver.manage().window().maximize();
//STEP 3: Declaring the actual base URL
String baseUrl = "http://test.cogitate.us/PPE.Test/";
//STEP 4: Launch Firefox and direct it to the Base URL
driver.get(baseUrl);
//Waiting time
Thread.sleep(2000);
//STEP 5: Declaring the Expected URL
String ExpUrl = "http://cogitate.us:8066/";
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
driver.findElement(By.xpath("//*[@id='txtUserName']")).click();
//Waiting time
Thread.sleep(2000);
//STEP 8: Entering USERNAME in username field
driver.findElement(By.xpath("//*[@id='txtUserName']")).sendKeys("ih.william");
//Waiting time
Thread.sleep(2000);
//STEP 9: Initializing Webelemrnt
WebElement webElement = driver.findElement(By.xpath("//*[@id='txtPassword']"));
//STEP 10: Pressing TAB key
webElement.sendKeys(Keys.TAB);
//STEP 11: Entering PASSWORD in username field
driver.findElement(By.xpath("//*[@id='txtPassword']")).sendKeys("10#Hammer");
//Waiting time
Thread.sleep(1000);
//STEP 12: Clicking on LOGIN button
driver.findElement(By.xpath("//*[@id='btnSubmit']")).click();
String Explogger = "Welcome : ih.william";
String Actlogger = driver.findElement(By.xpath("//*[@id='_AgentUI']/div[2]/div")).getText();
System.out.println(Actlogger);
if(Explogger.contains(Actlogger))
{
System.out.println("PASS: Logged_In user is same as Expected");
}
else 
{ 
System.out.println("FAIL : Logged_In user is not same as Expected");
}
driver.findElement(By.xpath("//*[@id='linkAnalytics']/img[1]")).click();

Thread.sleep(2000);

driver.findElement(By.xpath("html/body/div[5]/div/div/div[2]/button[2]")).click();


File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//Now you can do whatever you need to do with it, for example copy somewhere
FileUtils.copyFile(scrFile, new File("D:\\screenshot.jpg"));

}
}
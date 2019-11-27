package TestNGOnePack;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ClassOne {
 
 WebDriver driver = new FirefoxDriver();
  
 //@BeforeMethod defines this method has to run before every @Test methods
 @BeforeMethod
 public void openbrowser() throws InterruptedException { 
  driver.manage().window().maximize();
  driver.get("http://13.90.102.191:8066");
  driver.findElement(By.xpath("//*[@id='txtUserName']")).sendKeys("ih.jbutler");
  driver.findElement(By.xpath("//*[@id='txtPassword']")).sendKeys("10#Hammer");
  driver.findElement(By.xpath("//*[@id='btnSubmit']")).click();
  Thread.sleep(2000);
  driver.findElement(By.xpath("//*[@id='txtAddressAutoComplete']")).sendKeys("208 Summit Dr, Whiteville, NC 28472, USA");
  driver.findElement(By.xpath("//*[@id='btnSearchAddress']")).click();
  driver.findElement(By.xpath("//*[@id='btnGetQuote']")).click();
 }

 //@AfterMethod defines this method has to run after every @Test methods
 @AfterMethod
 public void closebrowser() {
  System.out.print("\nBrowser close");
  driver.quit();
 }
 
 @Test
 public void testmethodone() {
   String title = driver.getTitle();
   System.out.print("Current page title is : "+title);
   System.out.print("\n'TestNGOne -> TestNGOnePack -> ClassOne -> testmethodone' has been executed successfully");
 }
}
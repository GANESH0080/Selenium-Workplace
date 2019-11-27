package Sprint_Testing;

import java.awt.AWTException;
import java.sql.SQLException;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class View_Form_Application_Status_Page
     {
     public static void main(String[] args) throws InterruptedException, AWTException, ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException
     {    
     //STEP 1: Declaration and instantiation of objects/variables
     WebDriver driver = new FirefoxDriver();
     //STEP 2: Maximize the firefox browser
     driver.manage().window().maximize();
     //STEP 3: Declaring the actual base URL
     String baseUrl = "http://40.76.199.146:8066/?Message=MSG1004";
     //STEP 4: Launch Firefox and direct it to the Base URL
     driver.get(baseUrl);
     //Waiting time
     Thread.sleep(2000);
     //STEP 5: Declaring the Expected URL
     String ExpUrl = "http://40.76.199.146:8066/?Message=MSG1004";
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
     driver.findElement(By.xpath("//*[@id='FormLogin']/div/div[2]/input[1]")).click();
     //Waiting time
     Thread.sleep(2000);
     //STEP 8: Entering USERNAME in username field
     driver.findElement(By.xpath("//*[@id='FormLogin']/div/div[2]/input[1]")).sendKeys("ih.william");
     //Waiting time
     Thread.sleep(2000);
     //STEP 9: Initializing Webelemrnt
     WebElement webElement = driver.findElement(By.xpath("//*[@id='FormLogin']/div/div[2]/input[2]"));
     //STEP 10: Pressing TAB key
     webElement.sendKeys(Keys.TAB);
     //STEP 11: Entering PASSWORD in username field
     driver.findElement(By.xpath("//*[@id='FormLogin']/div/div[2]/input[2]")).sendKeys("password");
     //Waiting time
     Thread.sleep(1000);
     //STEP 12: Clicking on LOGIN button
     driver.findElement(By.xpath("//*[@id='FormLogin']/div/div[2]/button")).click();
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
     driver.findElement(By.xpath("//*[@id='btnViewForms']")).click();
     Thread.sleep(2000);
     String expectedS = "To be integrated after discussion with Bell & Clements." ;
     String actualS = driver.findElement(By.xpath("html/body/div[4]/div/div/div[1]/div")).getText();
     System.out.println(actualS);
     if(expectedS .contains(actualS)) 
     {
     System.out.println("PASS : Message is same as expected");
     }
     else
     {
     System.out.println("FAIL : Message is not same as expected");
     }
     Thread.sleep(2000);
     driver.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/button")).click();
     Thread.sleep(2000);
     driver.findElement(By.xpath("//*[@id='dataTableRetrieveQuote_wrapper']/div[2]/div/div/div[1]/div/table/thead/tr/th[1]")).click();
     Thread.sleep(2000);
     driver.findElement(By.xpath("html/body/div[2]/div[1]/div[2]/div/div/div[3]/div/div[2]/div/div/div[1]/div/table/thead/tr/th[1]")).click();
     Thread.sleep(2000);
     driver.findElement(By.xpath("//*[@id='dataTableRetrieveQuote_wrapper']/div[2]/div/div/div[1]/div/table/thead/tr/th[6]")).click();
     Thread.sleep(3000);
     driver.findElement(By.xpath("//*[@id='dataTableRetrieveQuote_wrapper']/div[2]/div/div/div[1]/div/table/thead/tr/th[6]")).click();
     Thread.sleep(3000);
     driver.findElement(By.xpath("//*[@id='dataTableRetrieveQuote_paginate']/ul/li[3]/a")).click();
     Thread.sleep(3000);
     driver.findElement(By.xpath("//*[@id='dataTableRetrieveQuote_previous']/a")).click();
     Thread.sleep(2000);
     driver.findElement(By.xpath("//*[@id='_AgentUI']/div[2]/a")).click();
 	 Thread.sleep(2000);
 	 driver.quit();
     }
  }
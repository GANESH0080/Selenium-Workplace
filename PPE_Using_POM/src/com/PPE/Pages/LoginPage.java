package com.PPE.Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
/**
 * @author gsalunkhe
 * This class will store all the locators and methods of login page.
 */
public class LoginPage 
   {
   // STEP 1 :Initialize element or Locators
   WebDriver driver;
   By USERNAME = By.id("txtUserName");	
   By PASSWORD = By.xpath("//*[@id='txtPassword']");
   By LOGIN_BUTTON = By.name("name");
   // STEPS 2: Creating Constructor
   public LoginPage(WebDriver driver)
   {
   this.driver = driver;
   }
   //STEPS 3: Creating Method
   public void Loggin(String UID, String PASWRD)
   {
   driver.findElement(USERNAME).sendKeys(UID);
   driver.findElement(PASSWORD).sendKeys(PASWRD);
   driver.findElement(LOGIN_BUTTON).click();
   }
}
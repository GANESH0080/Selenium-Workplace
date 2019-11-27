package com.PPE.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Search_Address
       {
	// STEP 1: Initilize elements or Locators 
	   WebDriver driver;
	   By SEARCH_ADDRESS_FIELD= By.id("txtAddressAutoComplete");	
	   By CLICK_SEARCH_BUTTON = By.id("btnSearchAddress");
	   By INVALID_ADDRESS_MESSAGE = By.xpath("//*[@id='toast-container']/div");
	   By INVALID_ADDRESS_POPUP_CLOSE = By.id("btnCancel");
	   By INVALID_ADDRESS_ZIPCODE_FIELD = By.xpath("//*[@id='txtZip']");
	   By INVALID_ADDRESS_STREET_FIELD = By.xpath("//*[@id='txtStreet']");
	   By PROPERTY_TYPE_FIELD = By.id("ddlPropertyType");
	   By GET_QUOTE_BUTTON = By.id("btnGetQuote");
	   
	   // STEPS 2: Creating Constructor
	   public Search_Address(WebDriver driver)
	   {
	   this.driver = driver;
	   }
       //STEPS 3: Creating Method for entering blank address in Search address field
	   public void enterAddress(String Addrss, String Zipcode) throws InterruptedException
	   {
	   driver.findElement(SEARCH_ADDRESS_FIELD).sendKeys(Addrss);
	   driver.findElement(CLICK_SEARCH_BUTTON).click(); 
	  
	   
	   // verify that the “Cancel button” is displayed and enabled
	   boolean searchIconPresence = driver.findElement(By.id("btnCancel")).isDisplayed();
	   boolean searchIconEnabled = driver.findElement(By.id("btnCancel")).isEnabled();  
	   if (searchIconPresence==true && searchIconEnabled==true) 		   	   
	   {
		String ActualStr = "Enter a valid property address.";	   
		   String ExpectedStr = driver.findElement(INVALID_ADDRESS_MESSAGE).getText();
		   System.out.println(ExpectedStr);
		   if (ActualStr.contentEquals(ExpectedStr))
		   {
		   System.out.println("Incorrect Address validation message is CORRECT");
		   }
		   else
		   {
		   System.out.println("Incorrect Address validation message is INCORRECT");
		   } 	
		   
		   driver.findElement(INVALID_ADDRESS_ZIPCODE_FIELD).sendKeys(Zipcode);
		   // click on the Cancel button
		   WebElement searchIcon = driver.findElement(By.id("btnCancel"));
		   searchIcon.click();
		   }
	   }
	   }
       
      
		  
		   
	   
	   

	
       

       
		  
	
	   
	   
  
	   

	   

     
       
       
package com.PPE.Pages;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class Quote_Page 
{
	  @SuppressWarnings("unused")
	private static final char[] PolicyID = null;
	WebDriver driver;
      By PROPERTY_TYPE_FIELD = By.id("ddlPropertyType");
	  By GET_QUOTE_BUTTON = By.id("btnGetQuote");
	  By MULTIPLE_PROPERTY = By.xpath("//*[@id='ddlPropertyType']/option[3]");
	  By INVALID_ADDRESS_PROPERTY_FIELD_MESSAGE= By.xpath("//*[@id='toast-container']/div/div[2]");
	  By HOME_YEAR_FIELD= By.id("txtYearHomeBuild");
	  By Teeee= By.xpath("//*[@id='txtPropertyValuetion']");	  
	  By INVALID_ADDRESS_HOMEBUILDYEAR_MESSAGE = By.xpath("//*[@id='toast-container']/div/div[2]");
	  By PROTECTION_CLASS_FIELD = By.xpath("//*[@id='ddlProtectionClass']");
	  By CONSTRUCTION_TYPE_FIELD= By.xpath("//*[@id='ddlConstructionType']");
	  
	  // STEPS 2: Creating Constructor
	  public Quote_Page(WebDriver driver)
	  {
	  this.driver = driver;
	  }
	  
	  
	  public void Quotepage(String HomeYear, String testingyyy) throws InterruptedException
	  {
	  Select drpCountry = new Select(driver.findElement(PROPERTY_TYPE_FIELD));
	  drpCountry.selectByValue("2");
	  Thread.sleep(3000);
	  String Actual_Property_Field_Str = "Insured not eligible for quote. The system does not support ‘Multi-Family’ Property Type.";	   
	  String Expected_Property_Field_Str = driver.findElement(INVALID_ADDRESS_PROPERTY_FIELD_MESSAGE).getText();
	  System.out.println(Expected_Property_Field_Str);
	  if (Actual_Property_Field_Str.contentEquals(Expected_Property_Field_Str))
	  {
	  System.out.println("Incorrect Address validation message is CORRECT");
	  }
	  else
	  {
	  System.out.println("Incorrect Address validation message is INCORRECT");
	  } 
	  drpCountry.selectByValue("1");
	  Thread.sleep(2000);  
	  driver.findElement(HOME_YEAR_FIELD).clear();
	  driver.findElement(Teeee).click();
	  Thread.sleep(1000);
	  
	  
	  String Actual_HOMEBUILDYEAR_Field_Str = "Insured not eligible for quote. The system does not support home builds before 1967.";	   
	  String Expected_HOMEBUILDYEAR_Field_Str = driver.findElement(INVALID_ADDRESS_HOMEBUILDYEAR_MESSAGE).getText();
	  System.out.println(Expected_HOMEBUILDYEAR_Field_Str);
	  if (Actual_HOMEBUILDYEAR_Field_Str.contentEquals(Expected_HOMEBUILDYEAR_Field_Str))
	  {
	  System.out.println("Incorrect Address validation message is CORRECT");
	  }
	  else
	  {
	  System.out.println("Incorrect Address validation message is INCORRECT");
	  }   
	  driver.findElement(HOME_YEAR_FIELD).sendKeys(HomeYear); 	  
	 

	  driver.findElement(Teeee).sendKeys(Keys.CONTROL,"a",Keys.DELETE);
	 
	  Thread.sleep(2000);	  
	  driver.findElement(Teeee).sendKeys(testingyyy);
	  

	  Thread.sleep(2000);
	  
	  Select drpProtectionClass = new Select(driver.findElement(PROTECTION_CLASS_FIELD));
	  drpProtectionClass.selectByValue("7");
	 Thread.sleep(3000);
	  
	  
	  
	
	  Select drpConstruction_Type = new Select(driver.findElement(CONSTRUCTION_TYPE_FIELD));
	  drpConstruction_Type.selectByValue("3");
	  
	  driver.findElement(GET_QUOTE_BUTTON).click();
	
	  
	  Connection conn = null;
	    String dbName = "DID_DEV";
	    String url = String.format("jdbc:sqlserver://cts01db01.database.windows.net:1433;database=%s;user=ctsindia@cts01db01;password=cts@india20!6",dbName);
	    Statement stmt = null;
	    ResultSet result = null;
	    String driver1 = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
	    try 
	    {
	    Class.forName(driver1).newInstance();
	    conn = DriverManager.getConnection(url);
	    stmt = conn.createStatement();
	    result = null;
	    result = stmt.executeQuery(" select top 1 * from PPE_PremiumDetails where CoverageCode like 'TP' ");
	  
	    while(result.next()){
	    	 String RaterPremium =result.getString("RaterPremium");
	    	 System.out.println("PolicyID is" +RaterPremium);
	    	 
	    	 
	    }
	    //Close db connection
	    conn.close();
	    }
	    catch (Exception e) 
	    {
	    e.printStackTrace();
	    }
	    	
	   
	    
	    
	    
	    
	    
	    }
	  
	  
}	
	  


package com.PPE.testcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import com.PPE.Pages.Search_Address;

public class Verify_Search_Address_Fuctionality {
	   WebDriver driver;
	   public Verify_Search_Address_Fuctionality(WebDriver drver)
	   {
	   this.driver = drver;
	   }
	@Test
		public void verifyaddress() throws InterruptedException
		{
		Search_Address address = new Search_Address(driver);
		address.enterAddress("", "12345");
		Thread.sleep(1000);	
		address.enterAddress("jjniojj","12345");
		Thread.sleep(1000);
		address.enterAddress("70 Fields Rd Pinehurst, NC 28374 USA","1425");
		Verify_Quote_Page Testing = new Verify_Quote_Page(driver);
		Testing.verifyQuote();
		}
	}
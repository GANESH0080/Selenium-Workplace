package com.PPE.testcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.PPE.Pages.Quote_Page;


public class Verify_Quote_Page 
    {
	WebDriver driver;
    public Verify_Quote_Page(WebDriver drver)
    {
    this.driver = drver;
    }
@Test
    public void verifyQuote() throws InterruptedException
    {
	Quote_Page Quotes = new Quote_Page(driver);
    // Quotes.Quotepage("1980","");
    //Quotes.Quotepage("","");
    Quotes.Quotepage("1980","200000");
	
	
    }
}
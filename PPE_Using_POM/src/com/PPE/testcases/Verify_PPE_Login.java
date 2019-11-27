/**
 * 
 */
package com.PPE.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.PPE.Pages.LoginPage;

public class Verify_PPE_Login 
    {
    @Test
	public void verifyvalidlogin() throws InterruptedException
	{
    WebDriver driver = new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("http://test.cogitate.us/PPE.Test/");
	LoginPage login = new LoginPage(driver);
	login.Loggin("ih.jbuttler", "10#Hammer");
	Thread.sleep(2000);
	login.Loggin("ih.jbutler", "10#Htammer");
	Thread.sleep(2000);
	login.Loggin("ih.jbutler", "10#Hammer");
	Thread.sleep(2000);
	Verify_Search_Address_Fuctionality test = new Verify_Search_Address_Fuctionality(driver);
	test.verifyaddress();
	}
}
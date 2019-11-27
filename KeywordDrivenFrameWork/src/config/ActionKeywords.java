package config;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ActionKeywords {

	// Initialize the property
	static Properties prop = new Properties();

	// Initialize the Driver
	public static WebDriver driver;

	// Created method for reading OR file
	public static void readORfile() throws IOException {

		// Setting the OR properties file path
		File file = new File("D:\\SeleniumWorkspace\\KeywordDrivenFrameWork\\ObjectRepository.properties");

		FileInputStream fileInput = null;

		fileInput = new FileInputStream(file);

		prop.load(fileInput);

		// Printing the OR element name (XPATH/ID/Name)
		System.out.println("Value of 'USERNAME Field': " + prop.getProperty("txtbxUSERNAME"));
	}

	public static void openBrowser() {
		System.setProperty("webdriver.firefox.marionette", "C:\\geckodriver-v0.20.1-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
	}

	public static void navigateURL() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://test.cogitate.us/PPE.Test/?Message=MSG1004");
	}

	public static void input_Username() throws IOException {
		driver.findElement(By.xpath(prop.getProperty("txtbxUSERNAME"))).sendKeys("ih.chelms");

	}

	public static void input_Password() {
		System.out.println("Value of 'PASSWORD FIELD': " + prop.getProperty("txtbxPASSWORD"));
		driver.findElement(By.xpath(prop.getProperty("txtbxPASSWORD"))).sendKeys("10#Hammer");
	}

	public static void click_Login() {
		System.out.println("Value of 'LOGIN BUTTON': " + prop.getProperty("btnLogin_ID"));
		driver.findElement(By.id(prop.getProperty("btnLogin_ID"))).click();
	}

	public static void waitFor() throws Exception {
		Thread.sleep(3000);
	}

	public static void click_Guidlines() throws InterruptedException, AWTException {

		System.out.println("Value of 'Guidlines link': " + prop.getProperty("lnkGuidLines"));
		driver.findElement(By.xpath(prop.getProperty("lnkGuidLines"))).click();
		Thread.sleep(3000);

		
		
	
		
		
		Robot robot = new Robot();

		// A short pause, just to be sure that OK is selected
		Thread.sleep(3000);

		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);

	}

	public static void click_Logout() {
		System.out.println("Value of 'Logout link': " + prop.getProperty("lnkLogin_ID"));
		driver.findElement(By.id(prop.getProperty("lnkLogin_ID"))).click();
	}

	public static void closeBrowser() {
		driver.quit();
	}

	public static void retrieveHistoryMenu() {
		System.out.println("Value of 'RetrieveHistoryMenu link': " + prop.getProperty("lnkRetrieveHistory"));
		driver.findElement(By.xpath(prop.getProperty("lnkRetrieveHistory"))).click();
		driver.findElement(By.xpath(prop.getProperty("btnYes"))).click();
		
	}
	
	

}

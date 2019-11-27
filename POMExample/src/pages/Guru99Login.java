package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Guru99Login {
	WebDriver driver;
	By userName = By.xpath("//*[@id='txtUserName']");
	By password = By.xpath("//*[@id='txtPassword']");
	By login = By.xpath("//*[@id='btnSubmit']");

	public Guru99Login(WebDriver driver) {
		this.driver = driver;
	}

	// Set user name in textbox
	public void setUserName(String strUserName) {
		driver.findElement(userName).sendKeys(strUserName);
		
	}

	// Set password in password textbox
	public void setPassword(String strPassword) {
		driver.findElement(password).sendKeys(strPassword);
	}

	// Click on login button
	public void clickLogin() {
		driver.findElement(login).click();
	}

	// Get the title of Login Page
	public String getLoginTitle() {
		return driver.getTitle();
	}

	public void loginToGuru99(String strUName, String strPasword) {
		// Fill user name
		this.setUserName(strUName);
		// Fill password
		this.setPassword(strPasword);
		// Click Login button
		this.clickLogin();
	}
}
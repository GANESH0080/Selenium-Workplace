package POMTestingPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginPage {

	WebDriver driver;
	By username = By.id("txtUserName");
	By passwrd = By.id("txtPassword");
	By login = By.xpath("//*[@id='btnSubmit']");
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	public void setUserName(String strUserName) throws InterruptedException 
	{
		
		driver.findElement(username).click();
		Thread.sleep(2000);
		driver.findElement(username).sendKeys(strUserName);
	}

	public void setPassword(String strPassword) throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(passwrd).sendKeys(strPassword);
	}

	public void clickLogin() {
		driver.findElement(login).click();
	}

	public void login(String strUserName, String strPassword) throws InterruptedException {
		this.setUserName(strUserName);
		this.setPassword(strPassword);
		this.clickLogin();
	}
	public void browserclose() {
		driver.close();
	}
}
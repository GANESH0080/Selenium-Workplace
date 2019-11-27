package POMTestingPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class VerifyHomePage {
	WebDriver driver;
	By Homepageusername = By.xpath("//*[@id='_AgentUI']/div[2]/div[1]");

	public VerifyHomePage(WebDriver driver) {
		this.driver = driver;
	}

	public String Homepage() {
		return driver.findElement(Homepageusername).getText();

	}

}

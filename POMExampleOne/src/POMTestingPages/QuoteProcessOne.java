package POMTestingPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class QuoteProcessOne {
	WebDriver driver;
	By txtSearchAddressOnGenerateQuote = By.xpath("//*[@id='txtAddressAutoComplete']");
	By btnSearchOnGenerateQuote = By.xpath("//*[@id='btnSearchAddress']");
	By HomeAgePopUp = By.xpath("html/body/div[4]/div/div/div[2]/button");
	By txtHomeAge = By.xpath("//*[@id='txtYearHomeBuild']");

	public QuoteProcessOne(WebDriver driver) {
		this.driver = driver;
	}

	public void setAddress(String strAddress) {
		driver.findElement(txtSearchAddressOnGenerateQuote).sendKeys(strAddress);
	}

	public void FindAddress(String strAddress) throws InterruptedException {
		driver.findElement(txtSearchAddressOnGenerateQuote).click();
		driver.findElement(txtSearchAddressOnGenerateQuote).clear();
		driver.findElement(txtSearchAddressOnGenerateQuote).click();
		this.setAddress(strAddress);
		driver.findElement(btnSearchOnGenerateQuote).click();

		boolean isDisplayed = driver.findElement(HomeAgePopUp).isDisplayed();

		if (isDisplayed == true) {
			WebElement searchIcon = driver.findElement(HomeAgePopUp);
			searchIcon.click();
			Thread.sleep(2000);
		} else {
			driver.findElement(txtHomeAge).click();
			Thread.sleep(2000);
		}

	}

}

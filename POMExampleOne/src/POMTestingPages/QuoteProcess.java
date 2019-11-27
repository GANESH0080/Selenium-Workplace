package POMTestingPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class QuoteProcess {
	WebDriver driver;
	By txtSearchAddress = By.xpath("//*[@id='txtAddressAutoComplete']");
	By btnSearch = By.xpath("//*[@id='btnSearchAddress']");
	By btnHomeAgePopUp = By.xpath("//*[@id='btnClose']");
	By txtHomeAge = By.xpath("//*[@id='txtYearHomeBuild']");
	

	public QuoteProcess(WebDriver driver) {
		this.driver = driver;
	}

	public void SearchAddress() throws InterruptedException {
		driver.findElement(txtSearchAddress).sendKeys("623 3rd Ave NW Hickory, NC 28601 USA");
		driver.findElement(btnSearch).click();
		Thread.sleep(4000);

		boolean isDisplayed = driver.findElement(btnHomeAgePopUp).isDisplayed();
		System.out.println(isDisplayed);
		if (isDisplayed == true) {
			WebElement searchIcon = driver.findElement(btnHomeAgePopUp);
			searchIcon.click();

		} else {
			driver.findElement(txtHomeAge).click();
			Thread.sleep(2000);
		}

	}
}
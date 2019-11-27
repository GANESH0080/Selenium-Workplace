package StepDefination;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

@SuppressWarnings("deprecation")
public class MalaysiaPageDefinations {

	// STEP 1 :Initialized Webdriver
	WebDriver driver;

	// STEP 2 : Used Given Keyword
	@Given("^User is already on Malaysia page$")
	// STEP 3: Write method for Given Step to navigate to URL
	public void User_is_already_on_Malaysia_page() {
		System.setProperty("webdriver.chrome.driver", "D:\\Jar downloads\\chromedriver_win32_2.43\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.theswiftcodes.com/malaysia/");
	}

	// STEP 4 : Used When Keyword
	@When("^Verify Title of Page$")
	// STEP 5: Write method for When Step to verify the page title
	public void Verify_Title_of_Page() {
		String ActTitle = driver.getTitle();
		System.out.println("Actual Tiltle is: " + ActTitle);
		Assert.assertEquals("SWIFT Code for all Banks in Malaysia", ActTitle);
	}

	// STEP 6 : Used Then Keyword
	@Then("^Scroll the page$")
	// STEP 7: Write method for Then Step to scroll down the page
	public void Scroll_the_page() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		// STEP 8: This will scroll down the page by 1000 pixel vertical
		js.executeScript("window.scrollBy(0,1500)");
	}

	// STEP 9 : Used And Keyword
	@And("^User will get the Malasiya Bank Names$")
	// STEP 10: Write method for And Step to get the Bank names & Swift codes
	public void User_will_get_the_Malasiya_Bank_Names() {
		// STEP 11 : Created webelement and store data in variable
		List<WebElement> tr_collection = driver
				.findElements(By.xpath("html/body/div[3]/div[1]/div/div[6]/table/tbody/tr"));
		// List<WebElement> tr_collection1 =
		// driver.findElements(By.className("swift"));
		// STEP 12: Printing the total row size
		System.out.println(tr_collection.size());
		int row_num = 1, col_num = 1;
		// STEP 13: For loop for getting the table data
		for (WebElement trElement : tr_collection) {
			List<WebElement> td_collection = trElement.findElements(By.tagName("td"));

			int n = td_collection.size();
			for (int i = 0; i < td_collection.size(); i++)
				if (i == 1 || i == 4) {
					System.out.println(td_collection.get(i).getText());
				}

		}

	}

}

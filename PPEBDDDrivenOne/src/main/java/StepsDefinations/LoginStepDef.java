package StepsDefinations;


import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class LoginStepDef {


	WebDriver driver;

	@Given("^Agent Is Already On Login Page$")
	public void Agent_Is_Already_On_Login_Page() {
		System.setProperty("webdriver.chrome.driver", "D:\\Jar downloads\\chromedriver_win32_2.43\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://test.cogitate.us/PPE.Test/");

	}

	@When("^Tittle Of The Login Page Is Login$")
	public void Tittle_Of_The_Login_Page_Is_Login() {
		String ActTittle = driver.getTitle();
		System.out.println("Tittle of the Page is" + " " + ActTittle);
		Assert.assertEquals("Login", ActTittle);
	}

	@Then("^Agent Entering Username and Password$")
	public void Agent_Entering_Username_and_Password() {
		driver.findElement(By.name("userName")).click();
		driver.findElement(By.name("userName")).sendKeys("ih.jbutler");
		driver.findElement(By.name("password")).sendKeys("10#Hammer");
	}

	@Then("^Click on Login Button$")
	public void click_on_Login_Button() {
		driver.findElement(By.id("btnSubmit")).click();
	}

	@When("^URL Of The LoggedIn Page$")
	public void URL_Of_The_LoggedIn_Page() {

		String CurrentURL = driver.getCurrentUrl();
		System.out.println("LoggedIn URL" + " " + CurrentURL);
		Assert.assertEquals(CurrentURL, "http://test.cogitate.us/PPE.Test/Home");

	}

	@Then("^Click On GuidLines Link$")
	public void Click_On_GuidLines_Link() throws InterruptedException {
		driver.findElement(By.id("btnViewGuidline")).click();
	}
}

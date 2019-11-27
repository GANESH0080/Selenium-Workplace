package Quote_Generation_Methods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import Utility_Package.Constant;
import Utility_Package.ExcelUtils;

public class URL_Verification_Method {
	public static WebDriver driver;

	// Method 1 : URL Verification
	public static void URL_Checking() throws Exception {
		ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData, "NYDJ_Quote");
		String browser = ExcelUtils.getCellData(1, 1);
		if (browser.toUpperCase().equals("CHROME")) {
			System.setProperty("webdriver.chrome.driver", "D:\\Jar downloads\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get(ExcelUtils.getCellData(1, 2));
		} else {
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get(ExcelUtils.getCellData(1, 2));

		}

	}

	public static void Login_Methods() throws Exception {
		ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData, "NYDJ_Quote");
		String State = ExcelUtils.getCellData(1, 3);
		if (State.toUpperCase().equals("GA")) {
			TimeUnit.SECONDS.sleep(2);
			driver.findElement(By.xpath("//*[@id='txtUserName']")).sendKeys("ih.chelms");
			driver.findElement(By.xpath("//*[@id='txtPassword']")).sendKeys("10#Hammer");
			driver.findElement(By.xpath("//*[@id='btnSubmit']")).click();
		} else {
			driver.findElement(By.xpath("//*[@id='txtUserName']")).sendKeys("ih.jbutler");
			driver.findElement(By.xpath("//*[@id='txtPassword']")).sendKeys("10#Hammer");
			driver.findElement(By.xpath("//*[@id='btnSubmit']")).click();
		}
	}

	public static void Invalid_Address_Validations() throws Exception {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='btnSearchAddress']")).click();
		Thread.sleep(2000);

		int Invalid_Address = ExcelUtils.getCellDataNumber(1, 4);
		driver.findElement(By.xpath("//*[@id='txtAddressAutoComplete']")).sendKeys(String.valueOf(Invalid_Address));
		driver.findElement(By.xpath("//*[@id='btnSearchAddress']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='btnSaveAddress']")).click();
		Thread.sleep(2000);

		int ZipCode = ExcelUtils.getCellDataNumber(1, 5);
		driver.findElement(By.xpath("//*[@id='txtZip']")).sendKeys(String.valueOf(ZipCode));

		driver.findElement(By.xpath("//*[@id='txtStreet']")).click();
		int UnitNum = ExcelUtils.getCellDataNumber(1, 6);
		driver.findElement(By.xpath("//*[@id='txtUnitNo']")).sendKeys(String.valueOf(UnitNum));
		driver.findElement(By.xpath(".//*[@id='txtStreet']")).sendKeys(ExcelUtils.getCellData(1, 7));
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='btnCancel']")).click();
	}

	public static void Valid_Address_Validations() throws Exception {

		driver.findElement(By.xpath("//*[@id='txtAddressAutoComplete']")).sendKeys(ExcelUtils.getCellData(2, 4));
		Thread.sleep(2000);
		driver.findElement(By.id("btnSearchAddress")).click();

	}

	public static void Quote_Page_Validation_Process() throws Exception

	{

		Select Property_Type = new Select(driver.findElement(By.xpath("//*[@id='ddlPropertyType']")));
		Property_Type.selectByIndex(2);
		Thread.sleep(2000);
		Property_Type.selectByIndex(1);

		WebElement yearElement = driver.findElement(By.xpath("//*[@id='txtYearHomeBuild']"));
		yearElement.clear();
		Thread.sleep(2000);

		Actions builder = new Actions(driver);
		builder.moveToElement(null, 100, 250).click().build().perform();

		int Home_Year = ExcelUtils.getCellDataNumber(1, 8);
		System.out.println("Home YEar is: " + Home_Year);
		yearElement.sendKeys(String.valueOf(Home_Year));

		builder.moveToElement(null, 100, 250).click().build().perform();

		driver.findElement(By.xpath("//*[@id='txtPropertyValuetion']")).clear();
		builder.moveToElement(null, 500, 233).click().build().perform();
		int Valuation = ExcelUtils.getCellDataNumber(1, 9);
		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@id='txtPropertyValuetion']")).sendKeys(String.valueOf(Valuation));
		// Thread.sleep(2000);
		// builder.moveToElement(yearElement, 300,
		// 350).click().build().perform();

		WebElement str = driver.findElement(By.xpath("//*[@id='btnGetQuote']"));
		str.getText();
		System.out.println(str);
		Thread.sleep(2000);

		str.click();
		driver.findElement(By.xpath("//*[@id='txtPropertyValuetion']")).clear();
		builder.moveToElement(null, 500, 233).click().build().perform();
		int Valuation_Correct = ExcelUtils.getCellDataNumber(1, 10);
		driver.findElement(By.xpath("//*[@id='txtPropertyValuetion']")).sendKeys(String.valueOf(Valuation_Correct));
		str.click();
	}
}

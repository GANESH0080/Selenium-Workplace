package Sprint_Testing;

import java.awt.AWTException;
import java.sql.SQLException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Insured_Signature_OTP_Verification
    {
	public static void main(String[] args) throws InterruptedException, AWTException, ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException
	{    
	//STEP 1: Declaration and instantiation of objects/variables
    WebDriver driver = new FirefoxDriver();
    //STEP 2: Maximize the firefox browser
    driver.manage().window().maximize();
    //STEP 3: Declaring the actual base URL
    String baseUrl = "http://cogitate.us:8066/";
    //STEP 4: Launch Firefox and direct it to the Base URL
    driver.get(baseUrl);
    //Waiting time
    Thread.sleep(2000);
    //STEP 5: Declaring the Expected URL
    String ExpUrl = "http://cogitate.us:8066/";
    //STEP 6: Verifyiing URL
    if(baseUrl.equals(ExpUrl))
    {
    System.out.println("Pass");
    }
    else
    {
    System.out.println("Fail");
    }
    //STEP 7: Clicking on USERNAME field
    driver.findElement(By.xpath("html/body/form/div/div[2]/div[1]/input")).click();
    //Waiting time
    Thread.sleep(2000);
    //STEP 8: Entering USERNAME in username field
    driver.findElement(By.xpath("html/body/form/div/div[2]/div[1]/input")).sendKeys("ih.jbutler");
    //Waiting time
    Thread.sleep(2000);
    //STEP 9: Initializing Webelemrnt
    WebElement webElement = driver.findElement(By.xpath("html/body/form/div/div[2]/div[2]/input"));
    //STEP 10: Pressing TAB key
    webElement.sendKeys(Keys.TAB);
    //STEP 11: Entering PASSWORD in username field
    driver.findElement(By.xpath("html/body/form/div/div[2]/div[2]/input")).sendKeys("10#Hammer");
    //Waiting time
    Thread.sleep(1000);
    //STEP 12: Clicking on LOGIN button
    driver.findElement(By.xpath("html/body/form/div/div[2]/input[2]")).click();
    //STEP 13: Clicking on Search address field
    driver.findElement(By.xpath("html/body/div[2]/div/section/div/form/div/div/input")).click();
    //STEP 14: Entering address in Search address field
    driver.findElement(By.xpath("html/body/div[2]/div/section/div/form/div/div/input")).sendKeys("515 Rolling Hills Ln, Clinton, NC 28328, USA");
    //STEP 15: Clicking on Search button
    driver.findElement(By.xpath("html/body/div[2]/div/section/div/form/div/div/span/button")).click();
    //Waiting time
    Thread.sleep(1000);
    //STEP 16: Clicking on Property_Type field
    driver.findElement(By.xpath("html/body/div[2]/div[1]/form[2]/section[1]/div[2]/div[1]/div/div[1]/div[1]/div/select")).click();
    //STEP 17: Select the first value using "select by value" 
    Select dropdown = new Select(driver.findElement(By.xpath("html/body/div[2]/div[1]/form[2]/section[1]/div[2]/div[1]/div/div[1]/div[1]/div/select")));
    dropdown.selectByValue("1");
    //STEP 18: Clicking on Property_Valuation field
    driver.findElement(By.xpath("html/body/div[2]/div[1]/form[2]/section[1]/div[2]/div[1]/div/div[2]/div[1]/div/span/input")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("html/body/div[2]/div[1]/form[2]/section[1]/div[2]/div[1]/div/div[2]/div[1]/div/span/input")).clear();
    //STEP 20: Entering Year_Home_build in YEAR_HOME_BUILD field
    driver.findElement(By.xpath("html/body/div[2]/div[1]/form[2]/section[1]/div[2]/div[1]/div/div[1]/div[2]/div/input")).sendKeys("2010"); 
    //STEP 19: Entering amount in Property_Valuation field
    driver.findElement(By.xpath("html/body/div[2]/div[1]/form[2]/section[1]/div[2]/div[1]/div/div[2]/div[1]/div/span/input")).sendKeys("75000");
    //Waiting time
    Thread.sleep(2000);
    //STEP 23: Clicking on CONSTRUCTION_TYPE field
    driver.findElement(By.xpath("html/body/div[2]/div[1]/form[2]/section[1]/div[2]/div[1]/div/div[3]/div[1]/div/select")).click();
    //STEP 24: Select the first value using "select by value" 
    Select dropdown_construction_type = new Select(driver.findElement(By.xpath("html/body/div[2]/div[1]/form[2]/section[1]/div[2]/div[1]/div/div[3]/div[1]/div/select")));
    dropdown_construction_type.selectByValue("1");
    //STEP 21: Clicking on PROTECTION_CLASS field 
    driver.findElement(By.xpath("html/body/div[2]/div[1]/form[2]/section[1]/div[2]/div[1]/div/div[2]/div[2]/div/select")).click();
    //STEP 22: Select the third value using "select by value" 
    Select dropdown_protection_class = new Select(driver.findElement(By.xpath("html/body/div[2]/div[1]/form[2]/section[1]/div[2]/div[1]/div/div[2]/div[2]/div/select")));
    dropdown_protection_class.selectByValue("5");
    //STEP 25: Clicking on GET_QUOTE button
    driver.findElement(By.xpath("html/body/div[2]/div[1]/form[2]/section[1]/div[2]/div[5]/div/button")).click();
    Thread.sleep(2000);
    JavascriptExecutor jse = (JavascriptExecutor)driver;
    jse.executeScript("window.scrollBy(0,350)", "");
    Thread.sleep(1000);
    driver.findElement(By.xpath("html/body/div[2]/div[1]/form[2]/section[2]/div[2]/div[4]/div/div/div[2]/div[3]/input")).click();
    Thread.sleep(3000);
    driver.findElement(By.xpath("html/body/div[2]/div[2]/div/div/form/div[3]/button[2]")).click();
    Thread.sleep(3000);
    driver.findElement(By.xpath("html/body/div[2]/div[1]/div/section/div/form/div[3]/div/div/div[1]/div[1]/input")).click(); 
    driver.findElement(By.xpath("html/body/div[2]/div[1]/div/section/div/form/div[3]/div/div/div[1]/div[1]/input")).sendKeys("Ganesh");
    Thread.sleep(2000);
    driver.findElement(By.xpath("html/body/div[2]/div[1]/div/section/div/form/div[3]/div/div/div[1]/div[2]/input")).click();
    driver.findElement(By.xpath("html/body/div[2]/div[1]/div/section/div/form/div[3]/div/div/div[1]/div[2]/input")).sendKeys("Salunkhe");
    Thread.sleep(2000);
    driver.findElement(By.xpath("//*[@id='txtPrimaryDateofBirth']")).click();
    driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/table/tbody/tr[1]/td[6]/a")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("html/body/div[2]/div[1]/div/section/div/form/div[3]/div/div/div[2]/div/input")).click();
    driver.findElement(By.xpath("html/body/div[2]/div[1]/div/section/div/form/div[3]/div/div/div[3]/div/input")).sendKeys("ganusalunkhe@gmail.com");
    Thread.sleep(2000);
    driver.findElement(By.xpath("//*[@id='txtPrimaryMobileNo']")).click();
    driver.findElement(By.xpath("//*[@id='txtPrimaryMobileNo']")).clear();
    
    driver.findElement(By.xpath("//*[@id='txtPrimaryMobileNo']")).sendKeys("9768180080");
    Thread.sleep(2000);
    driver.findElement(By.xpath("//*[@id='btnSaveAsContinue']")).click();
    WebDriverWait wait1 = new WebDriverWait(driver, 60);// 1 minute 
    wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ddlRoofType']")));
    driver.findElement(By.xpath("//*[@id='ddlRoofType']")).click();
    Select dropdown_Roof_type = new Select(driver.findElement(By.xpath("//*[@id='ddlRoofType']")));
    dropdown_Roof_type.selectByValue("6");
    driver.findElement(By.xpath("//*[@id='ddlFoundationType']")).click();
    Select dropdown_Foundation_type = new Select(driver.findElement(By.xpath("//*[@id='ddlFoundationType']")));
    dropdown_Foundation_type.selectByValue("2");
    driver.findElement(By.xpath("//*[@id='btnSaveContinue']")).click();
    Thread.sleep(3000);
    driver.findElement(By.xpath("//*[@id='btnSaveContinue']")).click();
    Thread.sleep(3000);
    
    driver.findElement(By.xpath("//*[@id='chkDisclaimer']")).click();
    
    driver.findElement(By.xpath("//*[@id='btnSaveContinue']")).click();
    Thread.sleep(1000);
    JavascriptExecutor jse_1 = (JavascriptExecutor)driver;
    jse_1.executeScript("window.scrollBy(0,250)", "");
    WebDriverWait wait = new WebDriverWait(driver, 60);// 1 minute 
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='btnSignApplication']")));
    driver.findElement(By.xpath("//*[@id='btnSignApplication']")).click();
    Thread.sleep(1000);
	/* WebElement element1 = driver.findElement(By.xpath("//*[@id='divRenderBody']/div[1]/section/div[1]/div[1]/div[3]/div[1]/div[5]/div[1]/div[3]/p"));
    String text = element1.getText();
    System.out.println(text);*/
 
    
    JavascriptExecutor jse_2 = (JavascriptExecutor)driver;
    jse_2.executeScript("window.scrollBy(0,250)", "");
    driver.findElement(By.xpath("//*[@id='btnInsuredSign']")).click();
    
   // driver.findElement(By.xpath("//*[@id='txtInsuredSignature']")).sendKeys(text);
    
	}
    }
package Sprint_Testing;

import java.awt.AWTException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Reject_Fuctionality_With_new_Address
    {
	public static void main(String[] args) throws InterruptedException, AWTException, ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException
	{    
	//STEP 1: Declaration and instantiation of objects/variables
    WebDriver driver = new FirefoxDriver();
    //STEP 2: Maximize the firefox browser
    driver.manage().window().maximize();
    //STEP 3: Declaring the actual base URL
    String baseUrl = "http://40.76.199.146:8066/?Message=MSG1004";
    //STEP 4: Launch Firefox and direct it to the Base URL
    driver.get(baseUrl);
    //Waiting time
    Thread.sleep(2000);
    //STEP 5: Declaring the Expected URL
    String ExpUrl = "http://40.76.199.146:8066/?Message=MSG1004";
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
    driver.findElement(By.xpath("//*[@id='FormLogin']/div/div[2]/input[1]")).click();
    //Waiting time
    Thread.sleep(2000);
    //STEP 8: Entering USERNAME in username field
    driver.findElement(By.xpath("//*[@id='FormLogin']/div/div[2]/input[1]")).sendKeys("ableauto");
    //Waiting time
    Thread.sleep(2000);
    //STEP 9: Initializing Webelemrnt
    WebElement webElement = driver.findElement(By.xpath("//*[@id='FormLogin']/div/div[2]/input[2]"));
    //STEP 10: Pressing TAB key
    webElement.sendKeys(Keys.TAB);
    //STEP 11: Entering PASSWORD in username field
    driver.findElement(By.xpath("//*[@id='FormLogin']/div/div[2]/input[2]")).sendKeys("password");
    //Waiting time
    Thread.sleep(1000);
    //STEP 12: Clicking on LOGIN button
    driver.findElement(By.xpath("//*[@id='FormLogin']/div/div[2]/button")).click();
    //STEP 13: Clicking on Search address field
    driver.findElement(By.xpath("//*[@id='txtAddressAutoComplete']")).click();
    //STEP 14: Entering address in Search address field
    driver.findElement(By.xpath("//*[@id='txtAddressAutoComplete']")).sendKeys("569 Rolling Hills Ln, Clinton, NC 28328, USA");
    //STEP 15: Clicking on Search button
    driver.findElement(By.xpath("//*[@id='btnSearchAddress']")).click();
    //Waiting time
    Thread.sleep(1000);
    //STEP 16: Clicking on Property_Type field
    driver.findElement(By.xpath("//*[@id='ddlPropertyType']")).click();
    //STEP 17: Select the first value using "select by value" 
    Select dropdown = new Select(driver.findElement(By.xpath("//*[@id='ddlPropertyType']")));
    dropdown.selectByValue("1");
    //STEP 18: Clicking on Property_Valuation field
    driver.findElement(By.xpath("//*[@id='txtPropertyValuetion']")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("//*[@id='txtPropertyValuetion']")).clear();
    //STEP 20: Entering Year_Home_build in YEAR_HOME_BUILD field
    driver.findElement(By.xpath("//*[@id='txtYearHomeBuild']")).sendKeys("2010"); 
    //STEP 19: Entering amount in Property_Valuation field
    driver.findElement(By.xpath("//*[@id='txtPropertyValuetion']")).sendKeys("75000");
    //Waiting time
    Thread.sleep(2000);
    //STEP 23: Clicking on CONSTRUCTION_TYPE field
    driver.findElement(By.xpath("//*[@id='ddlConstructionType']")).click();
    //STEP 24: Select the first value using "select by value" 
    Select dropdown_construction_type = new Select(driver.findElement(By.xpath("//*[@id='ddlConstructionType']")));
    dropdown_construction_type.selectByValue("1");
    //STEP 21: Clicking on PROTECTION_CLASS field 
    driver.findElement(By.xpath("html/body/div[2]/div/form[2]/section[1]/div[2]/div[1]/div/div[2]/div[2]/div/select")).click();
    //STEP 22: Select the third value using "select by value" 
    Select dropdown_protection_class = new Select(driver.findElement(By.xpath("html/body/div[2]/div/form[2]/section[1]/div[2]/div[1]/div/div[2]/div[2]/div/select")));
    dropdown_protection_class.selectByValue("3");
    //STEP 25: Clicking on GET_QUOTE button
    driver.findElement(By.xpath(".//*[@id='btnGetQuote']")).click();
    Thread.sleep(2000);
    JavascriptExecutor jse = (JavascriptExecutor)driver;
    jse.executeScript("window.scrollBy(0,250)", "");
    driver.findElement(By.xpath("//*[@id='btnToApplication']")).click();
    Thread.sleep(3000);
    driver.findElement(By.xpath("//*[@id='btnSaveUnderwriting']")).click();
    Thread.sleep(3000);
    driver.findElement(By.xpath("//*[@id='txtPrimaryFirstName']")).click(); 
    driver.findElement(By.xpath("//*[@id='txtPrimaryFirstName']")).sendKeys("Ganesh");
    Thread.sleep(2000);
    driver.findElement(By.xpath("//*[@id='txtPrimaryLastName']")).click();
    driver.findElement(By.xpath("//*[@id='txtPrimaryLastName']")).sendKeys("Salunkhe");
    Thread.sleep(2000);
    driver.findElement(By.xpath("//*[@id='txtPrimaryDateofBirth']")).click();
    driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/table/tbody/tr[1]/td[6]/a")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("//*[@id='txtPrimaryEmailAddress']")).click();
    driver.findElement(By.xpath("//*[@id='txtPrimaryEmailAddress']")).sendKeys("ganusalunkhe@gmail.com");
    driver.findElement(By.xpath("//*[@id='txtPrimaryMobileNo']")).click();
    driver.findElement(By.xpath("//*[@id='txtPrimaryMobileNo']")).clear();
    Thread.sleep(2000);
    driver.findElement(By.xpath("//*[@id='txtPrimaryMobileNo']")).sendKeys("9768180080");
    Thread.sleep(2000);
    driver.findElement(By.xpath("//*[@id='btnSaveAsContinue']")).click();
    WebDriverWait wait = new WebDriverWait(driver, 60);// 1 minute 
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ddlRoofType']")));
    driver.findElement(By.xpath("//*[@id='ddlRoofType']")).click();
    Select dropdown_Roof_type = new Select(driver.findElement(By.xpath("//*[@id='ddlRoofType']")));
    dropdown_Roof_type.selectByValue("2");
    driver.findElement(By.xpath("//*[@id='ddlFoundationType']")).click();
    Select dropdown_Foundation_type = new Select(driver.findElement(By.xpath("//*[@id='ddlFoundationType']")));
    dropdown_Foundation_type.selectByValue("3");
    driver.findElement(By.xpath("//*[@id='btnSaveContinue']")).click();
    Thread.sleep(3000);
    driver.findElement(By.xpath("//*[@id='btnSaveContinue']")).click();
    Thread.sleep(3000);
    driver.findElement(By.xpath("//*[@id='btnSaveContinue']")).click();
    WebDriverWait wait1 = new WebDriverWait(driver, 60);// 1 minute 
    wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='btnReject']")));
    driver.findElement(By.xpath("//*[@id='btnReject']")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("//*[@id='txtRemark']")).sendKeys("Rejected By Ganesh on 16th Jan");
    Thread.sleep(2000);
    driver.findElement(By.xpath("//*[@id='btnSave']")).click();
    WebDriverWait wait2 = new WebDriverWait(driver, 60);// 1 minute 
    wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='btnReject']"))); 
    Connection conn = null;
    String dbName = "POS";
    String url = String.format("jdbc:sqlserver://cts01db01.database.windows.net:1433;database=%s;user=ctsindia@cts01db01;password=cts@india20!6", dbName);
    Statement stmt = null;
    ResultSet result = null;
    String driver1 = "com.microsoft.sqlserver.jdbc.SQLServerDriver"; 
    try 
    {
    Class.forName(driver1).newInstance();
    conn = DriverManager.getConnection(url);
    stmt = conn.createStatement();
    result = null;
    String psi, pii,ai,s,sut,ab,r,ps,cb,mb,md;
    result = stmt.executeQuery("select * from PPE_PolicyStatus_trn where Remark='Rejected By Ganesh on 16th Jan'");
    while (result.next())
    {
    psi=result.getString("PolicyStatusId");
    pii = result.getString("PolicyInfoId");
    ai=result.getString("AgentId");
    s = result.getString("Status");
    sut=result.getString("StatusUpdatedType");
    ab = result.getString("AuthorisedBy");
    r=result.getString("Remark");
    ps= result.getString("PolicyStatus");
    cb=result.getString("CreatedBy");
    mb = result.getString("ModifiedBy");
    md = result.getString("ModifiedDate");
    System.out.println(psi+"\t"+pii+"\t"+ai+"\t"+s+"\t"+sut+"\t"+r+"\t"+ps+"\t"+cb+"\t"+mb+"\t"+md+"\t"+ab);
    }
    conn.close();
    } 
    catch (Exception e) 
    {
    e.printStackTrace();
    }
	}
}
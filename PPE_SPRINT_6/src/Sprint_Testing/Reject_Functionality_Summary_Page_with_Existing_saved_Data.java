package Sprint_Testing;

import java.awt.AWTException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Reject_Functionality_Summary_Page_with_Existing_saved_Data	
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
    driver.findElement(By.xpath("//*[@id='txtAddressAutoComplete']")).sendKeys("555 Rolling Hills Ln, Clinton, NC 28328, USA");
    //STEP 15: Clicking on Search button
    driver.findElement(By.xpath("//*[@id='btnSearchAddress']")).click();
    //Waiting time
    Thread.sleep(1000);
    driver.findElement(By.xpath("//*[@id='btnSaveAsContinue']")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("//*[@id='btnSaveContinue']")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("//*[@id='btnSaveContinue']")).click();   
    Thread.sleep(2000);
    driver.findElement(By.xpath("//*[@id='btnSaveContinue']")).click();
    WebDriverWait wait = new WebDriverWait(driver, 60);// 1 minute 
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='btnReject']")));
    driver.findElement(By.xpath("//*[@id='btnReject']")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("//*[@id='btnSave']")).click();
    Thread.sleep(1000);
    driver.findElement(By.xpath("//*[@id='btnClose']")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("//*[@id='btnReject']")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("//*[@id='txtRemark']")).click();
    driver.findElement(By.xpath("//*[@id='txtRemark']")).sendKeys("Testing 6th Jan");
    Thread.sleep(2000);
    driver.findElement(By.xpath("//*[@id='btnSave']")).click();
    WebDriverWait wait1 = new WebDriverWait(driver, 60);// 1 minute 
    wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='btnReject']"))); 
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
    String pa,us;
    result = stmt.executeQuery("select * from PPE_PolicyStatus_trn");
    while (result.next()) {
    us=result.getString("Remark");
    pa = result.getString("CreatedBy");              
    System.out.println(us+"  "+pa);
    }
    conn.close();
    } 
    catch (Exception e) 
    {
    e.printStackTrace();
    }
    }   
} 
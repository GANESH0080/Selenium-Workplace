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

public class Reject_fuctionality_Summary_Page_with_Existing_saved_Data_Get_Data_From_Databasewith_Specific_column	
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
    driver.findElement(By.xpath("//*[@id='txtUserName']")).click();
    //Waiting time
    Thread.sleep(2000);
    //STEP 8: Entering USERNAME in username field
    driver.findElement(By.xpath("//*[@id='txtUserName']")).sendKeys("ih.jbutler");
    //Waiting time
    Thread.sleep(2000);
    //STEP 9: Initializing Webelemrnt
    WebElement webElement = driver.findElement(By.xpath("//*[@id='txtPassword']"));
    //STEP 10: Pressing TAB key
    webElement.sendKeys(Keys.TAB);
    //STEP 11: Entering PASSWORD in username field
    driver.findElement(By.xpath("//*[@id='txtPassword']")).sendKeys("10#Hammer");
    //Waiting time
    Thread.sleep(1000);
    //STEP 12: Clicking on LOGIN button
    driver.findElement(By.xpath("//*[@id='btnSubmit']")).click();
    //STEP 13: Clicking on Search address field
    driver.findElement(By.xpath("//*[@id='txtAddressAutoComplete']")).click();
    //STEP 14: Entering address in Search address field
    driver.findElement(By.xpath("//*[@id='txtAddressAutoComplete']")).sendKeys("187 Tylers Cove Way, Winnabow, NC 28479, USA");
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
    driver.findElement(By.xpath("//*[@id='chkDisclaimer']")).click();   
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
    String dbName = "DID_DEV";
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
    result = stmt.executeQuery("select PolicyStatusId,PolicyInfoId,AgentId,PolicyStatus,ModifiedDate from PPE_PolicyStatus_trn");
    // while loop to get ResultSet all rows data
    while(result.next()){
    //Store columns PolicyStatusId,PolicyInfoId,AgentId,PolicyStatus,ModifiedDate as separate strings 
    //(pls chk spellings of column name and also datatypes of the column if it is int change it to (rs.getInt) before running)
    String PolicyStatusId =result.getString("PolicyStatusId");
    String PolicyInfoId =result.getString("PolicyInfoId");
    String AgentId= result.getString("AgentId");
    String PolicyStatus=result.getString("PolicyStatus");
    String ModifiedDate=result.getString("ModifiedDate");
    // Print Column values 
    System.out.println(PolicyStatusId);
    System.out.println(PolicyInfoId);
    System.out.println(AgentId);
    System.out.println(PolicyStatus);
    System.out.println(ModifiedDate);
    //System.out.println(PolicyStatusId+"\t"+PolicyInfoId+"\t"+AgentId+"\t"+PolicyStatus+"\t"+ModifiedDate);
    }
    //Close db connection
    conn.close();
    }
    catch (Exception e) 
    {
    e.printStackTrace();
    }
	}
  }
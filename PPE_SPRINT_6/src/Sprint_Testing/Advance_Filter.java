package Sprint_Testing;
import java.awt.AWTException;
import java.sql.SQLException;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Advance_Filter 
    {
	public static void main(String[] args) throws InterruptedException, AWTException, ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException
	{    
	//STEP 1: Declaration and instantiation of objects/variables
    WebDriver driver = new FirefoxDriver();
    //STEP 2: Maximize the firefox browser
    driver.manage().window().maximize();
    //STEP 3: Declaring the actual base URL
    String baseUrl = "http://test.cogitate.us/PPE.Test";
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
    driver.findElement(By.xpath("//*[@id='txtUserName']")).click();
    //Waiting time
    Thread.sleep(2000);
    //STEP 8: Entering USERNAME in username field
    driver.findElement(By.xpath("//*[@id='txtUserName']")).sendKeys("ih.william");
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
    String Explogger = "Welcome : ih.william";
    String Actlogger = driver.findElement(By.xpath("//*[@id='_AgentUI']/div[2]/div")).getText();
    System.out.println(Actlogger);
    if(Explogger.contains(Actlogger))
    {
    System.out.println("PASS: Logged_In user is same as Expected");
    }
    else 
    { 
    System.out.println("FAIL : Logged_In user is not same as Expected");
    }
    driver.findElement(By.xpath("//*[@id='btnAdvanceFilter']/label")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("//*[@id='btnFilterApply']")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("//*[@id='btnAdvanceFilter']/label")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("//*[@id='btnFilterReset']")).click();
    driver.findElement(By.xpath("//*[@id='txtAgentCode']")).sendKeys("1010101");
    Thread.sleep(2000);
    driver.findElement(By.xpath("//*[@id='btnCloseFilter']")).click();    
    Thread.sleep(2000);
    driver.findElement(By.xpath("//*[@id='btnAdvanceFilter']/label")).click();
    Thread.sleep(2000);
    Select dropdown = new Select(driver.findElement(By.xpath("//*[@id='ddlApplicationStatus']")));
    dropdown.selectByValue("4");
    driver.findElement(By.xpath("//*[@id='btnFilterApply']")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("//*[@id='btnAdvanceFilter']/label")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("//*[@id='btnFilterReset']")).click();
    driver.findElement(By.xpath("//*[@id='txtAgentCode']")).sendKeys("328898");
    Thread.sleep(2000);
    driver.findElement(By.xpath("//*[@id='btnFilterApply']")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("//*[@id='iconFilterRemove_AgentCode']")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("//*[@id='btnAdvanceFilter']/label")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("//*[@id='txtAgentName']")).sendKeys("able");
    Thread.sleep(2000);
    driver.findElement(By.xpath("//*[@id='btnFilterApply']")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("//*[@id='iconFilterRemove_AgentName']")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("//*[@id='btnAdvanceFilter']/label")).click();
    Thread.sleep(2000);
    new Select(driver.findElement(By.xpath("//*[@id='ddlState']"))).selectByValue("NC");
    Thread.sleep(2000);
    driver.findElement(By.xpath("//*[@id='btnFilterApply']")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("//*[@id='iconFilterRemove_State']")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("//*[@id='btnAdvanceFilter']/label")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("//*[@id='txtToSubmittedDate']")).click(); 
    WebElement dateWidget = driver.findElement(By.className("ui-datepicker-calendar"));
	List<WebElement> columns=dateWidget.findElements(By.tagName("td"));
	for (WebElement cell: columns){
	//Select 20th Date 
	if (cell.getText().equals("20"))
	{
	 cell.findElement(By.linkText("20")).click();
	driver.findElement(By.xpath("//*[@id='btnFilterApply']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id='iconFilterRemove_ToSubmittedDate']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id='_AgentUI']/div[2]/a")).click();
	Thread.sleep(2000);
	driver.quit();
	break;   
	}
   }
  }
}




package Sprint_Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class signatures
    {
	public static void main(String[] args) throws InterruptedException 
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
	    driver.findElement(By.xpath("//*[@id='txtAddressAutoComplete']")).sendKeys("559 Rolling Hills Ln, Clinton, NC 28328, USA");
	    //STEP 15: Clicking on Search button
	    driver.findElement(By.xpath("//*[@id='btnSearchAddress']")).click();
	    //Waiting time
	    Thread.sleep(1000);
	    JavascriptExecutor jse = (JavascriptExecutor)driver;
	    jse.executeScript("window.scrollBy(0,250)", "");
	    driver.findElement(By.xpath("//*[@id='btnSaveAsContinue']")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//*[@id='btnSaveContinue']")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//*[@id='btnSaveContinue']")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//*[@id='btnSaveContinue']")).click();

	    jse.executeScript("window.scrollBy(0,250)", "");
	    WebDriverWait wait = new WebDriverWait(driver, 60);// 1 minute 
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='btnSignApplication']")));
	    
	    driver.findElement(By.xpath("//*[@id='btnSignApplication']")).click();
	    driver.findElement(By.xpath("//*[@id='btnAgentSign']")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//*[@id='btnSaveAgentSign']")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//*[@id='txtAgentSignature']")).click();
	    driver.findElement(By.xpath("//*[@id='txtAgentSignature']")).sendKeys("Test");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//*[@id='btnSaveAgentSign']")).click();
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("//*[@id='btnSaveAgentSign']")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//*[@id='txtAgentSignature']")).clear();
	    driver.findElement(By.xpath("//*[@id='txtAgentSignature']")).sendKeys("able auto");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//*[@id='btnSaveAgentSign']")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//*[@id='txtAgentSignature']")).clear();
	    driver.findElement(By.xpath("//*[@id='txtAgentSignature']")).sendKeys("ableauto");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//*[@id='btnSaveAgentSign']")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//*[@id='btnInsuredSign']")).click();
	    
	    
	    
	    
	    
	    
	    
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//*[@id='btnSaveInsuredSign']")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//*[@id='txtInsuredSignature']")).click();
	    driver.findElement(By.xpath("//*[@id='txtInsuredSignature']")).sendKeys("Test");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//*[@id='btnSaveInsuredSign']")).click();
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("//*[@id='btnSaveInsuredSign']")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//*[@id='txtInsuredSignature']")).clear();
	    driver.findElement(By.xpath("//*[@id='txtInsuredSignature']")).sendKeys("Ganesh");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//*[@id='btnSaveInsuredSign']")).click();
	    driver.findElement(By.xpath("//*[@id='txtInsuredSignature']")).clear();
	    
	    driver.findElement(By.xpath("html/body/div[2]/div[5]/div/div/div/div[1]/button")).click();
	    jse.executeScript("window.scrollBy(0,-250)", "");
	    Thread.sleep(2000);
	    String strs = driver.findElement(By.xpath("//*[@id='divRenderBody']/div[1]/section/div[1]/div[1]/div[3]/div[1]/div[5]/div[1]/div[3]/p")).getText();
	    System.out.println(strs);
	  
	    jse.executeScript("window.scrollBy(0,250)", "");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//*[@id='btnInsuredSign']")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//*[@id='txtInsuredSignature']")).sendKeys(strs);
	    driver.findElement(By.xpath("//*[@id='btnSaveInsuredSign']")).click();
	   
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//*[@id='btnSubmitForApproval']")).click();
	    Thread.sleep(2000);
	   driver.findElement(By.xpath("html/body/div[3]/div/div/div[2]/button[1]")).click();
	   Thread.sleep(2000);
	   driver.close();
	}

}

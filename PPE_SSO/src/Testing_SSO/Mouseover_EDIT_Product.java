package Testing_SSO;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Mouseover_EDIT_Product {

	public static void main(String[] args) throws InterruptedException, IOException {
		//STEP 1: Declaration and instantiation of objects/variables
	    WebDriver driver = new FirefoxDriver();
	    //STEP 2: Maximize the firefox browser
	    driver.manage().window().maximize();
	    //STEP 3: Declaring the actual base URL
	    String baseUrl = "http://cogitate.us:8065/";
	    //STEP 4: Launch Firefox and direct it to the Base URL
	    driver.get(baseUrl);
	    //Waiting time
	    Thread.sleep(2000);
	    //STEP 5: Declaring the Expected URL
	    String ExpUrl = "http://cogitate.us:8065/";
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
	    driver.findElement(By.xpath("//*[@id='txtUserID']")).click();
	    //Waiting time
	    Thread.sleep(2000);
	    //STEP 8: Entering USERNAME in username field
	    driver.findElement(By.xpath("//*[@id='txtUserID']")).sendKeys("superadmin");
	    //Waiting time
	    Thread.sleep(2000);
	    //STEP 9: Initializing Webelemrnt
	    WebElement webElement = driver.findElement(By.xpath("//*[@id='txtPassword']"));
	    //STEP 10: Pressing TAB key
	    webElement.sendKeys(Keys.TAB);
	    //STEP 11: Entering PASSWORD in username field
	    driver.findElement(By.xpath("//*[@id='txtPassword']")).sendKeys("password");
	    //Waiting time
	    Thread.sleep(1000);
	    //STEP 12: Clicking on LOGIN button
	    driver.findElement(By.xpath("//*[@id='btnSubmit']")).click(); 
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//*[@id='navbar']/li[1]/a")).click();
	    // STEP 13: Clicking on EDIT product
        WebElement element = driver.findElement(By.xpath("//*[@id='itemImageButton']/img"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", element);
        Thread.sleep(2000);
        // STEP 14: Clicking on Product name field
        driver.findElement(By.xpath("//*[@id='txtproductName']")).click();
        // STEP 15 : Clearing Product name
        driver.findElement(By.xpath("//*[@id='txtproductName']")).clear();
        // STEP 16 : Entering new value in Product name field
        driver.findElement(By.xpath("//*[@id='txtproductName']")).sendKeys("PPE");
        // STEP 17 : Clearing Product URL field
        driver.findElement(By.xpath("//*[@id='txtProductURL']")).clear();
        // STEP 18 : Entering new value in Product URL field
        driver.findElement(By.xpath("//*[@id='txtProductURL']")).sendKeys("http://cogitate.us:8066");
        // STEP 19 : Get Product code Text / Value
        String getcode=driver.findElement(By.xpath("//*[@id='txtProdCode']")).getAttribute("Value");
        // STEP 20 : Printing Product code values
        System.out.println(getcode);;
        /* WebElement TxtBoxContent = driver.findElement(By.xpath("//*[@id='txtProdCode']"));
         System.out.println("Printing " + TxtBoxContent.getAttribute("value")); */
        Thread.sleep(2000);
	    driver.findElement(By.xpath("//*[@id='fimguplaod']")).click();
	    Thread.sleep(2000);
	    // Calling AutoIT script
	    Runtime.getRuntime().exec("D:\\Auto_it.exe");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//*[@id='btnPreview']")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//*[@id='btnSave']")).click();
	    Thread.sleep(2000);
	    driver.quit();
	}

}

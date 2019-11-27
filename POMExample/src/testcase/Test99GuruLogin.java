package testcase;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import pages.Guru99HomePage;
import pages.Guru99Login;

     public class Test99GuruLogin
     {
     WebDriver driver;
     Guru99Login objLogin;
     Guru99HomePage objHomePage;
     @BeforeTest
     public void setup(){
     driver = new FirefoxDriver();
     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
     driver.get("http://test.cogitate.us/PPE.Test/");
     }
    @Test(priority=0)
    public void test_Home_Page_Appear_Correct()
    {
    //Create Login Page object
    objLogin = new Guru99Login(driver);
    //Verify login page title
    String loginPageTitle = objLogin.getLoginTitle();
    AssertJUnit.assertTrue(loginPageTitle.contains("Login"));
    //login to application
    objLogin.loginToGuru99("ih.chelms", "10#Hammer");
    // go the next page
    objHomePage = new Guru99HomePage(driver);
    //Verify home page
    AssertJUnit.assertTrue(objHomePage.getHomePageDashboardUserName().contains("Clement Helms   |   "));
    }
    }
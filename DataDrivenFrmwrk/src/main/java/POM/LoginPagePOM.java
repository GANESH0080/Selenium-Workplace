package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import ExcelReader.Constant;
import ExcelReader.ReadExcel;

public class LoginPagePOM {
	
	By txtUsername = By.name("userName");
	By txtPassword = By.name("password");
	By btnLogin = By.id("btnSubmit");
	static String excelPath = Constant.Path_TestData + Constant.File_TestData;

	static String loginSheet = "PPELoginDetails";
	// Set user name in textbox
	public void typeUserName(WebDriver driver) {
		System.out.println(driver instanceof WebDriver);
		driver.findElement(txtUsername).click();
		
		ReadExcel.setWorkbookExcel(excelPath);
		
		
		ReadExcel.sheet = ReadExcel.getSheet(loginSheet);

		int totalRowCount = ReadExcel.getRowNumber();

		System.out.println("Total Rows is" + " " + totalRowCount);
		String strGetUName = ReadExcel.getCellValue(loginSheet, "Username", 2);
		System.out.println(strGetUName);
		//driver.findElement(txtUsername).sendKeys("ih.chelms");
	}
	
	// Set password in password textbox
	public void typePassword(WebDriver driver) {
		driver.findElement(txtPassword).click();
		driver.findElement(txtPassword).sendKeys("10#Hammer");
	}
	
	// Click on login button
	public void clickLoginButton(WebDriver driver) {
		driver.findElement(btnLogin).click();
	}

	// Get the title of Login Page
	public String getLoginTitle(WebDriver driver) {
		return driver.getTitle();
	}
}

package executionEngine;

import config.ActionKeywords;
import utility.ExcelUtils;

public class Driverscript {

	public static void main(String[] args) throws Exception {

		// STEP 2: Maximize the firefox browser
		String sPath = "D:\\SeleniumWorkspace\\KeywordDrivenFrameWork\\src\\dataEngine\\DataEngine.xlsx";

		// Here we are passing the Excel path and SheetName as arguments to
		// connect with Excel file
		ExcelUtils.setExcelFile(sPath, "Test");

		// Hard coded values are used for Excel row & columns for now
		// In later chapters we will replace these hard coded values with
		// varibales
		// This is the loop for reading the values of the column 3 (Action
		// Keyword) row by row

		ActionKeywords.readORfile();

		for (int iRow = 1; iRow <= 10; iRow++) {
			// Storing the value of excel cell in sActionKeyword string variable
			String sActionKeyword = ExcelUtils.getCellData(iRow, 3);

			// Comparing the value of Excel cell with all the project keywords
			if (sActionKeyword.equals("openBrowser")) {
				// This will execute if the excel cell value is 'openBrowser'
				// Action Keyword is called here to perform action
				ActionKeywords.openBrowser();
			} else if (sActionKeyword.equals("navigateURL")) {
				ActionKeywords.navigateURL();

			} else if (sActionKeyword.equals("input_Username")) {
				ActionKeywords.input_Username();

			} else if (sActionKeyword.equals("input_Password")) {
				ActionKeywords.input_Password();
			} else if (sActionKeyword.equals("click_Login")) {
				ActionKeywords.click_Login();
			} else if (sActionKeyword.equals("waitFor")) {
				ActionKeywords.waitFor();
			
				/*} else if (sActionKeyword.equals("click_Guidlines")) {
				ActionKeywords.click_Guidlines();*/

			} else if (sActionKeyword.equals("retrieveHistoryMenu")) {

				ActionKeywords.retrieveHistoryMenu();

			} else if (sActionKeyword.equals("click_Logout")) {
				ActionKeywords.click_Logout();
			}

			else if (sActionKeyword.equals("closeBrowser")) {
				ActionKeywords.closeBrowser();
			}

		}
	}
}
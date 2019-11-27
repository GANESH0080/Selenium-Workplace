package RaterPackage;

import Utility.Constant;
import Utility.ExcelUtility;

public class RaterTester {

	static String excelPath = Constant.Path_TestData + Constant.File_TestData;

	static String loginSheet = "Login";
	static String raterSheet = "Rater";
	static int loginRowIndex = 2;

	public static void main(String[] args) throws Exception {
		RaterTester.ProcessExcelData();
	}

	public static void ProcessExcelData() throws Exception {

		ExcelUtility.setWorkbookExcel(excelPath);

		RaterRequest RaterRequest = new RaterRequest();

		GetRaterSignInData(RaterRequest.SignIn);
		
		ExcelUtility.sheet = ExcelUtility.getSheet(raterSheet);
		
		int totalRowCount = ExcelUtility.getRowNumber();

		System.out.println("Total Rows is" + " " + totalRowCount);

		for (int rowCount = 2; rowCount <=10; rowCount++) {

			try {

			

				GetRaterParameters(RaterRequest, rowCount);

				String requestXml = XmlParser.CreateRaterRequestXml(RaterRequest);

				RaterResponse RaterResponse = new RaterResponse();

				RaterResponse = RaterPost.GetRaterResponse(requestXml);

				UpdateRaterResponseInExcel(rowCount, RaterResponse);

			} catch (Exception e) {

				System.out.println(e.getMessage());
			}

		}
	}
	
	public static RaterSignIn GetRaterSignInData(RaterSignIn RaterSignIn ) throws Exception {

		RaterSignIn.LoginName = ExcelUtility.getCellValue(loginSheet, "LoginName", loginRowIndex);
		RaterSignIn.Password = ExcelUtility.getCellValue(loginSheet, "Password", loginRowIndex);
		RaterSignIn.ReferenceQuoteId = ExcelUtility.getCellValue(loginSheet, "ReferenceQuoteId", loginRowIndex);
		RaterSignIn.ShowPremium = ExcelUtility.getCellValue(loginSheet, "ShowPremium", loginRowIndex);
		RaterSignIn.ShowDeductibles = ExcelUtility.getCellValue(loginSheet, "ShowDeductibles", loginRowIndex);
		RaterSignIn.ShowVar = ExcelUtility.getCellValue(loginSheet, "ShowVar", loginRowIndex);
		RaterSignIn.ShowDesc = ExcelUtility.getCellValue(loginSheet, "ShowDesc", loginRowIndex);
		RaterSignIn.ShowResult = ExcelUtility.getCellValue(loginSheet, "ShowResult", loginRowIndex);
		RaterSignIn.ShowSteps = ExcelUtility.getCellValue(loginSheet, "ShowSteps", loginRowIndex);
		RaterSignIn.ShowRateBasis = ExcelUtility.getCellValue(loginSheet, "ShowRateBasis", loginRowIndex);
		RaterSignIn.ShowPremiumSteps = ExcelUtility.getCellValue(loginSheet, "ShowPremiumSteps", loginRowIndex);
		RaterSignIn.RaterUrl = ExcelUtility.getCellValue(loginSheet, "RaterUrl", loginRowIndex);
		RaterSignIn.ProductCode = ExcelUtility.getCellValue(loginSheet, "ProductCode", loginRowIndex);
		RaterSignIn.CoverHolder = ExcelUtility.getCellValue(loginSheet, "CoverHolder", loginRowIndex);

		
		/* RaterSignIn.RequestVersion = ExcelUtility.getCellValue(loginSheet,"RequestVersion", loginRowIndex); 
		RaterSignIn.RaterVersion =ExcelUtility.getCellValue(loginSheet, "RaterVersion", loginRowIndex);
		RaterSignIn.RulesVersion = ExcelUtility.getCellValue(loginSheet,"RulesVersion", loginRowIndex);*/
	

		return RaterSignIn;

	}
	
	public static RaterRequest GetRaterParameters(RaterRequest RaterRequest, int rowCount) throws Exception {

		RaterRequest.SignIn.RequestVersion = ExcelUtility.getCellValue(raterSheet, "RequestVersion", rowCount);
		RaterRequest.SignIn.RaterVersion = ExcelUtility.getCellValue(raterSheet, "RaterVersion", rowCount);
		RaterRequest.SignIn.RulesVersion = ExcelUtility.getCellValue(raterSheet, "RulesVersion", rowCount);
		
		RaterRequest.RaterParameter.State = ExcelUtility.getCellValue(raterSheet, "State", rowCount);
		RaterRequest.SignIn.RulesState = RaterRequest.RaterParameter.State ;
		
		RaterRequest.RaterParameter.County = ExcelUtility.getCellValue(raterSheet, "County", rowCount);
		RaterRequest.RaterParameter.InsuranceAmount = ExcelUtility.getCellValue(raterSheet, "InsuranceAmount", rowCount);
		RaterRequest.RaterParameter.ProtectionClass = ExcelUtility.getCellValue(raterSheet, "ProtectionClass", rowCount);
		RaterRequest.RaterParameter.NoofClaims = ExcelUtility.getCellValue(raterSheet, "NoofClaims", rowCount);
		RaterRequest.RaterParameter.LossType = ExcelUtility.getCellValue(raterSheet, "LossType", rowCount);
		RaterRequest.RaterParameter.LossAmount = ExcelUtility.getCellValue(raterSheet, "LossAmount", rowCount);
		RaterRequest.RaterParameter.InsuredAge = ExcelUtility.getCellValue(raterSheet, "InsuredAge", rowCount);
		RaterRequest.RaterParameter.DeductibleType = ExcelUtility.getCellValue(raterSheet, "DeductibleType", rowCount);
		RaterRequest.RaterParameter.DeductibleAmount = ExcelUtility.getCellValue(raterSheet, "DeductibleAmount", rowCount);
		RaterRequest.RaterParameter.ExtReplacementCost = ExcelUtility.getCellValue(raterSheet, "ExtReplacementCost", rowCount);
		RaterRequest.RaterParameter.BurglaryAlarm = ExcelUtility.getCellValue(raterSheet, "BurglaryAlarm", rowCount);
		RaterRequest.RaterParameter.BurglaryAlarmType = ExcelUtility.getCellValue(raterSheet, "BurglaryAlarmType", rowCount);
		RaterRequest.RaterParameter.SmokeDetector = ExcelUtility.getCellValue(raterSheet, "SmokeDetector", rowCount);
		RaterRequest.RaterParameter.Deadbolt = ExcelUtility.getCellValue(raterSheet, "Deadbolt", rowCount);
		RaterRequest.RaterParameter.HomeAge = ExcelUtility.getCellValue(raterSheet, "HomeAge", rowCount);
		RaterRequest.RaterParameter.ContructionType = ExcelUtility.getCellValue(raterSheet, "ContructionType", rowCount);
		RaterRequest.RaterParameter.PersonalLiability = ExcelUtility.getCellValue(raterSheet, "PersonalLiability", rowCount);
		RaterRequest.RaterParameter.HeatingDevice = ExcelUtility.getCellValue(raterSheet, "HeatingDevice", rowCount);
		RaterRequest.RaterParameter.HeatingDeviceType = ExcelUtility.getCellValue(raterSheet, "HeatingDeviceType", rowCount);
		RaterRequest.RaterParameter.OtherStructure = ExcelUtility.getCellValue(raterSheet, "OtherStructure", rowCount);
		RaterRequest.RaterParameter.PersonalProperty = ExcelUtility.getCellValue(raterSheet, "PersonalProperty", rowCount);
		RaterRequest.RaterParameter.WindCoverage = ExcelUtility.getCellValue(raterSheet, "WindCoverage", rowCount);
		RaterRequest.RaterParameter.WindLimit = ExcelUtility.getCellValue(raterSheet, "WindLimit", rowCount);
		RaterRequest.RaterParameter.Name = ExcelUtility.getCellValue(raterSheet, "Name", rowCount);
		RaterRequest.RaterParameter.Address = ExcelUtility.getCellValue(raterSheet, "Address", rowCount);
		RaterRequest.RaterParameter.WaterBackup = ExcelUtility.getCellValue(raterSheet, "WaterBackup", rowCount);
		
		return RaterRequest;
	}

	public static void UpdateRaterResponseInExcel(int rowIndex, RaterResponse RaterResponse) throws Exception {

		ExcelUtility.sheet = ExcelUtility.getSheet(raterSheet);

		ExcelUtility.setCell(raterSheet, "TotalPremium", rowIndex, RaterResponse.TotalPremium);
		ExcelUtility.setCell(raterSheet, "BasicPremium", rowIndex, RaterResponse.BasicPremium);
		ExcelUtility.setCell(raterSheet, "Surcharge", rowIndex, RaterResponse.Surcharge);
		ExcelUtility.setCell(raterSheet, "Discount", rowIndex, RaterResponse.Discount);

		ExcelUtility.saveExcel();
	}

}

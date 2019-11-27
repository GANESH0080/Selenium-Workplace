package RaterTesting;

import org.apache.commons.lang3.math.NumberUtils;

import Utility.Constant;
import Utility.ExcelUtility;

public class ReadExcelData {

	static String excelPath = Constant.Path_TestData + Constant.File_TestData;

	static String loginSheet = "Login";
	static String raterSheet = "Rater";
	static int loginRowIndex = 2;

	public static void main(String[] args) throws Exception {
		ReadExcelData.ProcessExcelData();
	}

	public static void ProcessExcelData() throws Exception {

		ExcelUtility.setWorkbookExcel(excelPath);

		RaterRequest RaterRequest = new RaterRequest();

		GetRaterSignInData(RaterRequest.SignIn);

		ExcelUtility.sheet = ExcelUtility.getSheet(raterSheet);

		int totalRowCount = ExcelUtility.getRowNumber();

		System.out.println("Total Rows is" + " " + totalRowCount);

		for (int rowCount = 2; rowCount <=totalRowCount; rowCount++) {

			try {

				ExcelUtility.setWorkbookExcel(excelPath);

				ExcelUtility.sheet = ExcelUtility.getSheet(raterSheet);
				
				System.out.println(
						"--------------------------------------------------------------------------------------- ");

				System.out.println("Record No " + " " + rowCount);

				GetRaterParameters(RaterRequest, rowCount);

			
				
				String requestXml = XmlParser.CreateRaterRequestXml(RaterRequest);

				RaterResponse RaterResponse = new RaterResponse();

				RaterResponse = RaterPost.GetRaterResponse(requestXml);

				System.out.println("TotalPremium " + RaterResponse.TotalPremium);

				UpdateRaterResponseInExcel(rowCount, RaterResponse);
				
				GetManualRater(RaterRequest);

			} catch (Exception e) {

				System.out.println(e.getMessage());
			}

		}

	}

	public static RaterSignIn GetRaterSignInData(RaterSignIn RaterSignIn) throws Exception {

		// System.out.println("Reading " + " " +
		// ExcelUtility.getCellValue(loginSheet, "State", loginRowIndex));

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

		//RaterSignIn.ShowDiscounts = ExcelUtility.getCellValue(loginSheet, "ShowDiscounts", loginRowIndex);

		/*
		 RaterSignIn.RequestVersion = ExcelUtility.getCellValue(loginSheet,"RequestVersion",
		 * loginRowIndex); RaterSignIn.RaterVersion
		 * =ExcelUtility.getCellValue(loginSheet, "RaterVersion",
		 * loginRowIndex); RaterSignIn.RulesVersion =
		 * ExcelUtility.getCellValue(loginSheet,"RulesVersion", loginRowIndex);
		 */

		return RaterSignIn;

	}

	public static RaterRequest GetRaterParameters(RaterRequest RaterRequest, int rowCount) throws Exception {

		// System.out.println("Reading " + " " +
		// ExcelUtility.getCellValue(raterSheet, "ZipCode", rowCount));

		RaterRequest.SignIn.RequestVersion = ExcelUtility.getCellValue(raterSheet, "RequestVersion", rowCount);
		RaterRequest.SignIn.RaterVersion = ExcelUtility.getCellValue(raterSheet, "RaterVersion", rowCount);
		RaterRequest.SignIn.RulesVersion = ExcelUtility.getCellValue(raterSheet, "RulesVersion", rowCount);

		RaterRequest.RaterParameter.State = ExcelUtility.getCellValue(raterSheet, "State", rowCount);
		RaterRequest.SignIn.RulesState = RaterRequest.RaterParameter.State;

		RaterRequest.RaterParameter.County = ExcelUtility.getCellValue(raterSheet, "County", rowCount);
		RaterRequest.RaterParameter.Zipcode = ExcelUtility.getCellValue(raterSheet, "ZipCode", rowCount);
		RaterRequest.RaterParameter.UnitType = ExcelUtility.getCellValue(raterSheet, "UnitType", rowCount);
		RaterRequest.RaterParameter.InsureAge = ExcelUtility.getCellValue(raterSheet, "InsureAge", rowCount);
		RaterRequest.RaterParameter.unitId = ExcelUtility.getCellValue(raterSheet, "unitId", rowCount);
		RaterRequest.RaterParameter.HomeAge = ExcelUtility.getCellValue(raterSheet, "HomeAge", rowCount);
		RaterRequest.RaterParameter.MHValue = ExcelUtility.getCellValue(raterSheet, "MHValue", rowCount);
		RaterRequest.RaterParameter.InPark = ExcelUtility.getCellValue(raterSheet, "InPark", rowCount);
		RaterRequest.RaterParameter.Territory = ExcelUtility.getCellValue(raterSheet, "Territory", rowCount);
		RaterRequest.RaterParameter.Deductible = ExcelUtility.getCellValue(raterSheet, "Deductible", rowCount);
		RaterRequest.RaterParameter.SupplemetalHeating = ExcelUtility.getCellValue(raterSheet, "SupplemetalHeating",
				rowCount);
		RaterRequest.RaterParameter.FloodEndorsement = ExcelUtility.getCellValue(raterSheet, "FloodEndorsement",
				rowCount);
		RaterRequest.RaterParameter.VendorSingle = ExcelUtility.getCellValue(raterSheet, "VendorSingle", rowCount);
		RaterRequest.RaterParameter.CPL = ExcelUtility.getCellValue(raterSheet, "CPL", rowCount);
		RaterRequest.RaterParameter.RenDiscount = ExcelUtility.getCellValue(raterSheet, "RenDiscount", rowCount);
		RaterRequest.RaterParameter.ATDiscount = ExcelUtility.getCellValue(raterSheet, "ATDiscount", rowCount);
		RaterRequest.RaterParameter.AODiscount = ExcelUtility.getCellValue(raterSheet, "AODiscount", rowCount);
		RaterRequest.RaterParameter.PDDiscount = ExcelUtility.getCellValue(raterSheet, "PDDiscount", rowCount);
		RaterRequest.RaterParameter.NewMHDiscount = ExcelUtility.getCellValue(raterSheet, "NewMHDiscount", rowCount);
		RaterRequest.RaterParameter.EPDiscount = ExcelUtility.getCellValue(raterSheet, "EPDiscount", rowCount);
		RaterRequest.RaterParameter.APE = ExcelUtility.getCellValue(raterSheet, "APE", rowCount);
		RaterRequest.RaterParameter.AAS = ExcelUtility.getCellValue(raterSheet, "AAS", rowCount);
		RaterRequest.RaterParameter.PE = ExcelUtility.getCellValue(raterSheet, "PE", rowCount);
		RaterRequest.RaterParameter.AS = ExcelUtility.getCellValue(raterSheet, "AS", rowCount);

		return RaterRequest;
	}

	public static void UpdateRaterResponseInExcel(int rowIndex, RaterResponse RaterResponse) throws Exception {

		ExcelUtility.sheet = ExcelUtility.getSheet(raterSheet);

		ExcelUtility.setCell(raterSheet, "ApPremium", rowIndex, RaterResponse.TotalPremium);

		/*
		 * ExcelUtility.setCell(raterSheet, "BasicPremium", rowIndex,
		 * RaterResponse.BasicPremium); ExcelUtility.setCell(raterSheet,
		 * "Surcharge", rowIndex, RaterResponse.Surcharge);
		 * ExcelUtility.setCell(raterSheet, "Discount", rowIndex,
		 * RaterResponse.Discount);
		 */
		ExcelUtility.saveExcel();
	}
	
	public static String GetManualRater(RaterRequest RaterRequest) throws Exception
	{

		ExcelUtility.setWorkbookExcel(Constant.ManualRaterPath);
		ExcelUtility.sheet = ExcelUtility.getSheet(raterSheet);

		ExcelUtility.setCell(ExcelUtility.sheet, 6, 1, RaterRequest.RaterParameter.Zipcode);
		
		String strValue = "ExcelUtility.setCell(ExcelUtility.sheet, 6, 1, RaterRequest.RaterParameter.Zipcode);";
		@SuppressWarnings("unused")
		Integer intValue = NumberUtils.toInt(strValue);
		
		
		//ExcelUtility.setCell(ExcelUtility.sheet, 6, 1, Double.parseDouble(RaterRequest.RaterParameter.Zipcode.trim()));
		ExcelUtility.setCell(ExcelUtility.sheet, 7, 1, RaterRequest.RaterParameter.UnitType);
		ExcelUtility.saveExcel();
		return "";
		
	}

}

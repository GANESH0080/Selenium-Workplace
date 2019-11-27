package TestBase;


import org.testng.annotations.Test;

import ExcelReader.Constant;
import ExcelReader.ReadExcel;





	public class ReadExcelData {
		static String excelPath = Constant.Path_TestData + Constant.File_TestData;

		static String loginSheet = "PPELoginDetails";
		
		@Test(priority=3)
		public static void ProcessExcelData() throws Exception {

			ReadExcel.setWorkbookExcel(excelPath);
					
			
			ReadExcel.sheet = ReadExcel.getSheet(loginSheet);

			int totalRowCount = ReadExcel.getRowNumber();

			System.out.println("Total Rows is" + " " + totalRowCount);
			
			String strGetUName = ReadExcel.getCellValue(loginSheet, "Username", 2);
			System.out.println(strGetUName);
			
		}
		
}

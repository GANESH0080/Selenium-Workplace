package utility;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {
	public static Workbook workbook;
	public static Sheet sheet;
	public static Row row;
	private static XSSFSheet ExcelWSheet;
	private static XSSFWorkbook ExcelWBook;
	private static XSSFCell Cell;

	// This method is to set the File path and to open the Excel file
	// Pass Excel Path and SheetName as Arguments to this method
	public static void setExcelFile(String Path, String SheetName) throws Exception {
		
		FileInputStream ExcelFile = new FileInputStream("D:\\SeleniumWorkspace\\KeywordDrivenFrameWork\\src\\DataEngine\\dataEngine.xlsx");
		ExcelWBook = new XSSFWorkbook(ExcelFile);
		ExcelWSheet = ExcelWBook.getSheet(SheetName);
	}

	// This method is to read the test data from the Excel cell
	// In this we are passing parameters/arguments as Row Num and Col Num
	public static String getCellData(int RowNum, int ColNum) throws Exception {
		Cell = ExcelWSheet.getRow(RowNum).getCell(ColNum);
		String CellData = Cell.getStringCellValue();
		return CellData;
	}

	public static int getRowNumber() {
		int rowNum = sheet.getLastRowNum();
		rowNum += 1; // Beware of header. Count from "0"
		return rowNum;
	}

	public static int getRowNumber(String sheetname) {
		sheet = getSheet(sheetname);
		int rowNum = sheet.getLastRowNum();
		rowNum += 1; // Beware of header. Count from "0"
		return rowNum;
	}
	// Create method getSheet To-Do
		public static Sheet getSheet(String sheetname) {
			Sheet sheet = workbook.getSheet(sheetname);
			if (!isSheetExist(sheetname)) {
				sheet = workbook.createSheet(sheetname);
			}
			return sheet;
		}
		// Check Sheet Exist
		public static boolean isSheetExist(String sheetname) {
			return (workbook.getSheetIndex(sheetname) >= 0);
		}
		

}
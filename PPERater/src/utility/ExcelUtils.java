package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row.MissingCellPolicy;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

@SuppressWarnings("unused")
public class ExcelUtils {
	static {
		Date date = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
		System.setProperty("my.txt", "C:\\" + "PPERater\\" + "RATER\\" + dateFormat.format(date) + "\\"
				+"log.txt");
	}
	static Logger logger = Logger.getLogger(ExcelUtils.class);
	private static XSSFSheet ExcelWSheet;
	private static XSSFWorkbook ExcelWBook;
	private static XSSFCell Cell;
	private static XSSFRow Row;

	// This method is to set the File path and to open the Excel file, Pass
	// Excel Path and Sheetname as Arguments to this method
	public static void setExcelFile(String Path, String SheetName) {

		try {
			// Open the Excel file
			FileInputStream ExcelFile = new FileInputStream(Path);
			// Access the required test data sheet
			ExcelWBook = new XSSFWorkbook(ExcelFile);
			ExcelWSheet = ExcelWBook.getSheet(SheetName);
		} catch (Exception e) {
			// logger.info("Unable to read the excel file...Please check!!!!!!!");
		}
	}

	// This method is to read the test data from the Excel cell, in this we are
	// passing parameters as Row num and Col num
	public static String getCellData(int RowNum, int ColNum) {

		try {
			Cell = ExcelWSheet.getRow(RowNum).getCell(ColNum);
			//System.out.println("Cell Type: " + Cell.getCellType() + "Blank: " + Cell.CELL_TYPE_BLANK + ", STRING: " + Cell.CELL_TYPE_STRING);
			String CellData = Cell.getStringCellValue();
			return CellData;
		} catch (Exception e) {
			return "";
		}
	}

	public static int getCellDataNumber(int RowNum, int ColNum) {

		try {
			Cell = ExcelWSheet.getRow(RowNum).getCell(ColNum);
			int CellData = (int) Cell.getNumericCellValue();
			return CellData;
		} catch (Exception e) {
			return 0;
		}

	}
	
	public static double getCellDataDouble(int RowNum, int ColNum) {

		try {
			Cell = ExcelWSheet.getRow(RowNum).getCell(ColNum);
			double CellData = (Double) Cell.getNumericCellValue();
			return CellData;
		} catch (Exception e) {
			return 0;
		}

	}

	// This method is to write in the Excel cell, Row num and Col num are the
	// parameters
	@SuppressWarnings({})
	public static void setCellData(String Result, int RowNum, int ColNum) {

		try {
			Row = ExcelWSheet.getRow(RowNum);
			Cell = Row.getCell(ColNum, MissingCellPolicy.RETURN_BLANK_AS_NULL);
			if (Cell == null) {
				Cell = Row.createCell(ColNum);
				Cell.setCellValue(Result);
			} else {
				Cell.setCellValue(Result);
			}

			// Constant variables Test Data path and Test Data file name
			FileOutputStream fileOut = new FileOutputStream(new File(Constant.Path_TestData + Constant.File_TestData));
			ExcelWBook.write(fileOut);
			fileOut.flush();
			fileOut.close();
			TimeUnit.SECONDS.sleep(5);
			if (Cell.getStringCellValue().equals("PASS")) {
				XSSFFont font = ExcelWBook.createFont();
				font.setBold(true);
				font.setColor(IndexedColors.GREEN.getIndex());
				CellStyle cellStyle = ExcelWBook.createCellStyle();
				cellStyle.setFont(font);
				Cell.setCellStyle(cellStyle);
				
			} else if (Cell.getStringCellValue().equals("FAIL")) {
				CellStyle cellStyle = ExcelWBook.createCellStyle();
				XSSFFont font = ExcelWBook.createFont();
				font.setColor(IndexedColors.RED.getIndex());
				font.setBold(true);
				cellStyle.setFont(font);
				Cell.setCellStyle(cellStyle);

			}
			FileOutputStream fileOut1 = new FileOutputStream(new File(Constant.Path_TestData + Constant.File_TestData));
			ExcelWBook.write(fileOut1);
			fileOut1.flush();
			fileOut1.close();

		} catch (Exception e) {
			// throw (e);
		}
	}

	// Removing rows from excel
	@SuppressWarnings("resource")
	public static void deleteRow() throws IOException {
		FileInputStream file = new FileInputStream(
				new File("C:\\Users\\jayakrishnans\\workspace\\PPE\\src\\dataDriven\\TestData.xlsx"));
		XSSFWorkbook wb = new XSSFWorkbook(file);
		XSSFSheet sheet = wb.getSheet("PPE");
		remove_Row(sheet, 2);

		File outWB = new File("C:\\Users\\jayakrishnans\\workspace\\PPE\\src\\dataDriven\\TestData.xlsx");
		OutputStream out = new FileOutputStream(outWB);
		wb.write(out);
		out.flush();
		out.close();
		System.exit(0);
	}

	private static void remove_Row(XSSFSheet sheet, int rowIndex) {
		int lastRowNum = sheet.getLastRowNum();
		System.out.println("Total Number Of Rows : " + (lastRowNum + 1));
		if (rowIndex >= 0 && rowIndex < lastRowNum) {
			sheet.shiftRows(rowIndex + 1, lastRowNum, -1);
			System.out.println("Data Shifted!!!!!");
			System.out.println("Total Number Of Rows After deletion : " + lastRowNum);
		}
		if (rowIndex == lastRowNum) {
			XSSFRow removingRow = sheet.getRow(rowIndex);
			if (removingRow != null) {
				sheet.removeRow(removingRow);
				System.out.println("Data Removed!!!!!");

			}
		}
	}

}

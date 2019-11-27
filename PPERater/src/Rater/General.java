package Rater;

import java.awt.Color;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.labels.PieSectionLabelGenerator;
import org.jfree.chart.labels.StandardPieSectionLabelGenerator;
import org.jfree.chart.plot.PiePlot;
import org.jfree.data.general.DefaultPieDataset;
import org.openqa.selenium.WebDriver;
import utility.Constant;
import utility.ExcelUtils;

public class General {
	WebDriver driver;
	static Date date = new Date();
	static SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");

	static {
		System.setProperty("my.txt", "C:\\" + "PPERater\\" + "RATER\\" + dateFormat.format(date) + "\\"
				+"log.txt");
	}
	static Logger logger = Logger.getLogger(General.class);
	static String chartImg = "C:\\" + "PPERater\\" + "RATER\\" + dateFormat.format(date);
	public static String timeConverter(long startTime ) {
		long difference = System.nanoTime() - startTime;
		String h =	String.format("%02d hours : %02d mins : %02d seconds", 
			    TimeUnit.NANOSECONDS.toHours(difference),
			    TimeUnit.NANOSECONDS.toMinutes(difference) - 
			    TimeUnit.HOURS.toMinutes(TimeUnit.NANOSECONDS.toHours(difference)),
			    TimeUnit.NANOSECONDS.toSeconds(difference) - 
			    TimeUnit.MINUTES.toSeconds(TimeUnit.NANOSECONDS.toMinutes(difference)));
		
		return h;
	}
	
	public static void pieChartReport() throws Exception {
		ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData, "Common");
		String filePath = ExcelUtils.getCellData(23, 2);
		FileInputStream file = new FileInputStream(new File(filePath));
		@SuppressWarnings("resource")
		XSSFWorkbook wb = new XSSFWorkbook(file);
		XSSFSheet ExcelWSheet = wb.getSheet("Rater");
		int lastRowNum = (ExcelWSheet.getLastRowNum() - 3);
		logger.info("Total Test Cases Executed : " + lastRowNum);
		int passedTC = passCount();
		int failedTC = (lastRowNum - passCount());
		logger.info("Total Test Cases Passed : " + passedTC);
		logger.info("Total Test Cases Failed : " + failedTC);
		// Creating a simple pie chart with
		DefaultPieDataset pieDataset = new DefaultPieDataset();
		pieDataset.setValue("PASS", new Integer(passedTC));
		pieDataset.setValue("FAIL", new Integer(failedTC));

		JFreeChart piechart = ChartFactory.createPieChart("Rater : Test Case Execution Chart", pieDataset, true, true,
				false);
		PiePlot plot = (PiePlot) piechart.getPlot();
		plot.setSectionPaint("PASS", Color.green);
		plot.setSectionPaint("FAIL", Color.red);
		plot.setBackgroundPaint(Color.cyan);
		plot.setExplodePercent("PASS", 0.10);
		plot.setSimpleLabels(true);

		PieSectionLabelGenerator gen = new StandardPieSectionLabelGenerator("{0}: {1} ({2})", new DecimalFormat("0"),
				new DecimalFormat("0%"));
		plot.setLabelGenerator(gen);

		try {
			String timeElapsed = ExcelUtils.getCellData(21, 2);
			ChartUtilities.saveChartAsJPEG(new File(chartImg+ "\\" + "raterChart.jpg"), piechart, 400, 400);
			SendMail.sendMailer(lastRowNum, passedTC, failedTC, timeElapsed);
		} catch (IOException e) {

			e.printStackTrace();
		}
	}

	public static int passCount() throws IOException {
		ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData, "Common");
		String filePath = ExcelUtils.getCellData(23, 2);
		FileInputStream file = new FileInputStream(new File(filePath));
		@SuppressWarnings("resource")
		XSSFWorkbook wb = new XSSFWorkbook(file);
		XSSFSheet ExcelWSheet = wb.getSheet("Rater");
		int lastRowNum = (ExcelWSheet.getLastRowNum() + 1);
		int count = 0;

		for (int i = 2; i < lastRowNum; i++) {
			XSSFRow Row = ExcelWSheet.getRow(i);
			Cell cell = Row.getCell(30);
			if (cell != null) {
				if (cell.getStringCellValue().contains("PASS")) {
					count++;
				}
			}
		}
		return count;
	}
}

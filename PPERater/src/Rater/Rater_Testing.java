package Rater;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import org.apache.log4j.Logger;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;

import junit.framework.AssertionFailedError;
import utility.Constant;
import utility.ExcelUtils;

@SuppressWarnings({ "deprecation", "unused" })
public class Rater_Testing {
	static Date date = new Date();
	static SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");

	static {
		System.setProperty("my.txt", "C:\\" + "PPERater\\" + "RATER\\"
				+ dateFormat.format(date) + "\\" + "log.txt");
	}
	static Logger logger = Logger.getLogger(Rater_Testing.class);

	
	public static void main(String[] args) throws Exception {

		// Setting input Stream
		FileInputStream file = new FileInputStream(new File(
				"C:/PPERater/TestData.xlsx"));
		@SuppressWarnings("resource")
		XSSFWorkbook wb = new XSSFWorkbook(file);

		// Setting sheet name
		XSSFSheet ExcelWSheet = wb.getSheet("Rater");
		int lastRowNum = (ExcelWSheet.getLastRowNum() - 1);
		logger.info("Total Number Of Rows : " + (lastRowNum-2));

		// Execution Start time
		long startTime = System.nanoTime();

		// Looping through the xlsx row data
		for (int i = 4; i <= lastRowNum+1; i++) {
			// Initilaizing the Htttp Client and post data
			@SuppressWarnings("resource")
			HttpClient client = new DefaultHttpClient();

			// Setting the Rater link
			HttpPost post = new HttpPost(
					"http://10.10.10.33/rater-ppe/api/rater");

			// Creating request xml based on the TestData.xlsx
			ModifyRequestXml.requestXml(i);

			// reading the request xml
			String xmlPath = "C:\\" + "PPERater\\" + "RATER\\"
					+ dateFormat.format(date) + "\\" + "REQUEST\\" + "Requset_"
					+ (i+1) + ".xml";
			String xml = new String(Files.readAllBytes(Paths.get(xmlPath)));

		
			// get Response
			HttpEntity entity = new ByteArrayEntity(xml.getBytes("UTF-8"));
			post.setEntity(entity);
			HttpResponse response = client.execute(post);
			String result = EntityUtils.toString(response.getEntity());
			result = result.toLowerCase().contains("utf-16") ? result.replace(
					"utf-16", "utf-8") : result;

			// saving response xml
				File filePath = new File("C:\\" + "PPERater\\"
						+ "RATER\\" + dateFormat.format(date) + "\\"
						+ "RESPONSE");
				filePath.mkdir();
				Path pathXMLresponseFile = Paths.get(filePath + "\\"
						+ "Response_" +( i+1) + ".xml");
				Files.write(pathXMLresponseFile, result.getBytes(),
						StandardOpenOption.WRITE, StandardOpenOption.APPEND,
						StandardOpenOption.CREATE);
				// Checking Rater Response values
				ResponseXml.responseXmlChecks(i);
				logger.info("Response_" + (i+1) + ".xml SAVED!!!");
				continue;
			
		}
		// Saving total execution time
		ExcelUtils.setExcelFile(
				Constant.Path_TestData + Constant.File_TestData, "Common");
		String timeElapsed = General.timeConverter(startTime);
		logger.info("Total execution time: " + timeElapsed);
		ExcelUtils.setCellData(timeElapsed, 21, 2);

		// Creating a pie chart and sending the report via mail
		General.pieChartReport();
	}

}

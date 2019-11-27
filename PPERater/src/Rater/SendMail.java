package Rater;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Properties;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

import utility.Constant;
import utility.ExcelUtils;

@SuppressWarnings("unused")
public class SendMail {
	static Date date = new Date();
	static SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
	static {
		
		System.setProperty("my.txt", "C:\\" + "PPERater\\" + "RATER\\" + dateFormat.format(date) + "\\"
				+"log.txt");
	}
	static Logger logger = Logger.getLogger(SendMail.class);
	
	static String fileName = "C:\\" + "PPERater\\" + "RATER\\" + dateFormat.format(date) + "\\";
	static String xlFile = "C:/PPERater/";
	static String chartImg = "C:\\" + "PPERater\\" + "RATER\\" + dateFormat.format(date);
	
	public static void sendMailer(int totalTC, int passedTC, int failedTC, String timeElapsed) throws Exception {
		try {
			ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData, "Common");
			String host = "outlook.office365.com";// "imap.gmail.com";//
			final String username = ExcelUtils.getCellData(26, 2);// "jayakrishnans@cogitate.us";//"sjayakrishanan@gmail.com";//
			final String password = ExcelUtils.getCellData(27, 2);
			final String recipint = ExcelUtils.getCellData(28, 2);
			final String fromUser = ExcelUtils.getCellData(26, 2);
			String projectName = "Personal Property Express : Rater Automation";

			Properties props = new Properties();
			props.put("mail.smtp.auth", "true");
			props.put("mail.smtp.starttls.enable", "true");
			props.put("mail.smtp.host", host);
			props.put("mail.smtp.port", "587");
			Session session = Session.getInstance(props, new javax.mail.Authenticator() {
				protected PasswordAuthentication getPasswordAuthentication() {
					return new PasswordAuthentication(username, password);
				}
			});

			try {
				SimpleDateFormat date = new SimpleDateFormat();
				Calendar c = Calendar.getInstance();
				String pattern = "EEEEE, dd MMMMM yyyy - hh:mm:ss a";
				date.applyPattern(pattern);
				String currentdate = date.format(c.getTime());
				Message message = new MimeMessage(session);
				message.setFrom(new InternetAddress(fromUser));
				message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(recipint));
				message.setSubject(projectName +" - Tested on: " + currentdate);
				MimeMultipart multipart = new MimeMultipart("related");

				// first part (the html)
				BodyPart messageBodyPart = new MimeBodyPart();
				String htmlText = "<p>Hi all,</p>"
						+ "<p>Lorem Ipsum is simply dummy text of the printing and typesetting industry. "
						+ "Lorem Ipsum is simply dummy text of the printing and typesetting industry. "
						+ "Lorem Ipsum is simply dummy text of the printing and typesetting industry. "
						+ "Lorem Ipsum is simply dummy text of the printing and typesetting industry. "
						+ "Lorem Ipsum is simply dummy text of the printing and typesetting industry. </p>" 
						+"<p><div><span style=\"float:left;width: 50%;\">"
						+ "<br><br><br><br><br><br><b><font size=\"3\">Total Test Cases Executed &ensp;: "+totalTC+"<br>"
						+"<font color=\"green\">Total Test Cases Passed&ensp;&ensp;&ensp; : "+passedTC+"</font><br>"
						+"<font color=\"red\">Total Test Cases Failed &ensp; &ensp; &ensp;: "+failedTC+"</font><br>"
						+"Execution Time Taken&ensp;&ensp;&ensp;&ensp;&ensp; : "+timeElapsed+"</b></font></span></div>"
						+ "<div><span style=\"float:right;width: 50%;\">"
						+ "<img src=\"cid:image\"width=\"300\" height\"300\" ></span></div></p>";
				
				messageBodyPart.setContent(htmlText, "text/html");

				// add it
				multipart.addBodyPart(messageBodyPart);

				// second part (the image)
				messageBodyPart = new MimeBodyPart();
				DataSource fds = new FileDataSource(chartImg+ "\\" + "raterChart.jpg");
				messageBodyPart.setDataHandler(new DataHandler(fds));
				messageBodyPart.setHeader("Content-ID", "<image>");

				// add attachments
				multipart.addBodyPart(messageBodyPart);
				addAttachments(multipart, fileName, "log.txt");
				addAttachments(multipart, xlFile, "TestData.xlsx");

				// putting everything together
				message.setContent(multipart);
				
				// set the Multiple part object to the message object
				message.setContent(multipart);
				Transport.send(message);
				logger.info("Mail Send!!!!!!!");

			} catch (MessagingException e) {
				throw new RuntimeException(e);
			}

		} catch (Exception e) {
			logger.info("Unable to send Mail.....");
			logger.info(e.getMessage());
		}
	}

	/**
	 * create new MimeBodyPart object and set DataHandler object to object Use this
	 * to attach multiple attachments
	 * 
	 */

	private static void addAttachments(Multipart multipart, String fileName, String attachmentName) throws MessagingException {
		MimeBodyPart messageBodyPart = new MimeBodyPart();
		DataSource source = new FileDataSource(fileName + attachmentName);
		messageBodyPart.setDataHandler(new DataHandler(source));
		messageBodyPart.setFileName(new File(fileName + attachmentName).getName());
		multipart.addBodyPart(messageBodyPart);

	}
}

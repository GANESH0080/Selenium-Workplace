package Rater;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
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

import org.apache.log4j.Logger;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import utility.Constant;
import utility.ExcelUtils;

@SuppressWarnings("unused")
public class ModifyRequestXml {
	static Date date = new Date();
	static SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");

	static {
		System.setProperty("my.txt",
				"C:\\" + "PPERater\\" + "RATER\\" + dateFormat.format(date) + "\\" + "log.txt");
	}
	static Logger logger = Logger.getLogger(ModifyRequestXml.class);


	public static void requestXml(int row_num) throws SAXException, IOException, ParserConfigurationException {
		

		try {
			ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData, "Rater");
			String LoginName =  ExcelUtils.getCellData(1, 0);
			String Password =  ExcelUtils.getCellData(1, 1);
			String RequestVersion =  ExcelUtils.getCellData(1, 2);
			String RaterVersion =  ExcelUtils.getCellData(1, 3);
			String RulesVersion =  ExcelUtils.getCellData(1, 4);
			String ReferenceQuoteId =  ExcelUtils.getCellData(1, 5);
			String ShowPremium =  ExcelUtils.getCellData(1, 6);
			String ShowDeductibles =  ExcelUtils.getCellData(1, 7);
			String ShowDesc =  ExcelUtils.getCellData(1, 8);
			String ShowResult =  ExcelUtils.getCellData(1, 9);
			String ShowSteps =  ExcelUtils.getCellData(1, 10);
			String ShowVar =  ExcelUtils.getCellData(1, 11);
			String ShowRateBasis =  ExcelUtils.getCellData(1, 12);
			String ShowPremiumSteps =  ExcelUtils.getCellData(1, 13);
			String RaterUrl =  ExcelUtils.getCellData(1, 14);
			String ProductCode =  ExcelUtils.getCellData(1, 15);
			String CoverHolder =  ExcelUtils.getCellData(1, 16);
			
			File inputFile = new File("C:/PPERater/request.xml");
			DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
			Document doc = docBuilder.parse(inputFile);
			Node SignIn = doc.getElementsByTagName("SignIn").item(0);

			// loop the Sign In child node
			NodeList list = SignIn.getChildNodes();
			for (int temp = 0; temp < list.getLength(); temp++) {
				Node node = list.item(temp);
				if (node.getNodeType() == Node.ELEMENT_NODE) {
					Element eElement = (Element) node;
					String RulesState = ExcelUtils.getCellData(row_num, 0);

					if ("LoginName".equals(eElement.getNodeName())) {
						eElement.setTextContent(LoginName);
					}
					if ("Password".equals(eElement.getNodeName())) {
						eElement.setTextContent(Password);
					}
					if ("RequestVersion".equals(eElement.getNodeName())) {
						eElement.setTextContent(RequestVersion);
					}
					if ("RaterVersion".equals(eElement.getNodeName())) {
						eElement.setTextContent(RaterVersion);
					}
					if ("RulesVersion".equals(eElement.getNodeName())) {
						eElement.setTextContent(RulesVersion);
					}
					if ("ReferenceQuoteId".equals(eElement.getNodeName())) {
						eElement.setTextContent(ReferenceQuoteId);
					}
					if ("ShowPremium".equals(eElement.getNodeName())) {
						eElement.setTextContent(ShowPremium);
					}
					if ("ShowDeductibles".equals(eElement.getNodeName())) {
						eElement.setTextContent(ShowDeductibles);
					}
					if ("ShowDesc".equals(eElement.getNodeName())) {
						eElement.setTextContent(ShowDesc);
					}
					if ("ShowResult".equals(eElement.getNodeName())) {
						eElement.setTextContent(ShowResult);
					}
					if ("ShowSteps".equals(eElement.getNodeName())) {
						eElement.setTextContent(ShowSteps);
					}
					if ("ShowVar".equals(eElement.getNodeName())) {
						eElement.setTextContent(ShowVar);
					}
					if ("ShowRateBasis".equals(eElement.getNodeName())) {
						eElement.setTextContent(ShowRateBasis);
					}
					if ("ShowPremiumSteps".equals(eElement.getNodeName())) {
						eElement.setTextContent(ShowPremiumSteps);
					}
					if ("RulesState".equals(eElement.getNodeName())) {
						eElement.setTextContent(RulesState);
					}
					if ("RaterUrl".equals(eElement.getNodeName())) {
						eElement.setTextContent(RaterUrl);
					}
					if ("ProductCode".equals(eElement.getNodeName())) {
						eElement.setTextContent(ProductCode);
					}
					if ("CoverHolder".equals(eElement.getNodeName())) {
						eElement.setTextContent(CoverHolder);
					}
				}
			}

			// loop the RateParameter child node
			Node RateParameter = doc.getElementsByTagName("RateParameter").item(0);
			NodeList RateParameterList = RateParameter.getChildNodes();
			for (int temp = 0; temp < RateParameterList.getLength(); temp++) {
				String RulesState = ExcelUtils.getCellData(row_num, 0);
				String County = ExcelUtils.getCellData(row_num, 1);
				String InsuranceAmount = ExcelUtils.getCellData(row_num, 2);
				String ProtectionClass = ExcelUtils.getCellData(row_num, 3);
				String NoofClaims = ExcelUtils.getCellData(row_num, 4);
				String LossType = ExcelUtils.getCellData(row_num, 5);
				String LossAmount = ExcelUtils.getCellData(row_num, 6);
				String InsuredAge = ExcelUtils.getCellData(row_num, 7);
				String Type = ExcelUtils.getCellData(row_num, 8);
				String Amount = ExcelUtils.getCellData(row_num, 9);
				String ExtReplacementCost = ExcelUtils.getCellData(row_num, 10);
				String Opted1 = ExcelUtils.getCellData(row_num, 11);
				String Type1 = ExcelUtils.getCellData(row_num, 12);
				String Opted2 = ExcelUtils.getCellData(row_num, 13);
				String Opted3 = ExcelUtils.getCellData(row_num, 14);
				String HomeAge = ExcelUtils.getCellData(row_num, 15);
				String ContructionType = ExcelUtils.getCellData(row_num, 16);
				String PersonalLiability = ExcelUtils.getCellData(row_num, 17);
				String Opted4 = ExcelUtils.getCellData(row_num, 18);
				String Type4 = ExcelUtils.getCellData(row_num, 19);
				String OtherStructure = ExcelUtils.getCellData(row_num, 20);
				String PersonalProperty = ExcelUtils.getCellData(row_num, 21);
				String Opted5 = ExcelUtils.getCellData(row_num, 22);
				String Limit = ExcelUtils.getCellData(row_num, 23);
				String Name = ExcelUtils.getCellData(row_num, 24);
				String Address = ExcelUtils.getCellData(row_num, 25);
				String WaterBackup = ExcelUtils.getCellData(row_num, 26);

				Node node = RateParameterList.item(temp);
				if (node.getNodeType() == Node.ELEMENT_NODE) {
					Element eElement = (Element) node;
					/**
					 * <Parameter code="State">NC</Parameter>
					 * <Parameter code="County">Craven</Parameter>
					 * <Parameter code="InsuranceAmount">350100</Parameter>
					 * <Parameter code="ProtectionClass">1-3</Parameter> <Parameter code="Claims">
					 * 
					 * 
					 */
					if ("Parameter".equals(eElement.getNodeName())) {
						if (eElement.getAttribute("code").equals("State")) {
							eElement.setTextContent(RulesState);
						}
						if (eElement.getAttribute("code").equals("County")) {
							eElement.setTextContent(County);
						}
						if (eElement.getAttribute("code").equals("InsuranceAmount")) {
							eElement.setTextContent(InsuranceAmount);
						}
						if (eElement.getAttribute("code").equals("ProtectionClass")) {
							eElement.setTextContent(ProtectionClass);

						}

					}
					/**
					 * <NoofClaims>0</NoofClaims> <LossType /> <LossAmount /> </Parameter>
					 * 
					 */

					if (eElement.getAttribute("code").equals("Claims")) {
						try {
							for (int i = 0; i < eElement.getChildNodes().getLength(); i++) {
								Node paramChild = eElement.getChildNodes().item(i);
								if (paramChild.getNodeType() == Node.ELEMENT_NODE) {
									Element eElement2 = (Element) paramChild;

									if ("NoofClaims".equals(eElement2.getNodeName())) {
										eElement2.setTextContent(NoofClaims);
									}

									if ("LossType".equals(eElement2.getNodeName())) {
										eElement2.setTextContent(LossType);
									}
									if ("LossAmount".equals(eElement2.getNodeName())) {
										eElement2.setTextContent(LossAmount);
									}
								}
							}
						} catch (Exception e) {

						}
					}

					/**
					 * <Parameter code="InsuredAge">0</Parameter>
					 * 
					 */
					if ("Parameter".equals(eElement.getNodeName())) {
						if (eElement.getAttribute("code").equals("InsuredAge")) {
							eElement.setTextContent(InsuredAge);
						}

					}
					/**
					 * <Parameter code="Deductible"> <Type>RCV</Type> <Amount>2000</Amount>
					 * </Parameter>
					 * 
					 */
					if (eElement.getAttribute("code").equals("Deductible")) {
						for (int i = 0; i < eElement.getChildNodes().getLength(); i++) {
							Node paramChild = eElement.getChildNodes().item(i);
							if (paramChild.getNodeType() == Node.ELEMENT_NODE) {
								Element eElement2 = (Element) paramChild;

								if ("Type".equals(eElement2.getNodeName())) {
									eElement2.setTextContent(Type);
								}

								if ("Amount".equals(eElement2.getNodeName())) {
									eElement2.setTextContent(Amount);
								}

							}
						}
					}
					/**
					 * <Parameter code="ExtReplacementCost">25</Parameter>
					 */
					if ("Parameter".equals(eElement.getNodeName())) {
						if (eElement.getAttribute("code").equals("ExtReplacementCost")) {
							eElement.setTextContent(ExtReplacementCost);
						}

					}
					/**
					 * <Parameter code="BurglaryAlarm"> <Opted>N</Opted> <Type>none</Type>
					 * </Parameter>
					 * 
					 */
					if (eElement.getAttribute("code").equals("BurglaryAlarm")) {
						for (int i = 0; i < eElement.getChildNodes().getLength(); i++) {
							Node paramChild = eElement.getChildNodes().item(i);
							if (paramChild.getNodeType() == Node.ELEMENT_NODE) {
								Element eElement2 = (Element) paramChild;

								if ("Opted".equals(eElement2.getNodeName())) {
									eElement2.setTextContent(Opted1);
								}

								if ("Type".equals(eElement2.getNodeName())) {
									eElement2.setTextContent(Type1);
								}

							}
						}
					}
					/**
					 * <Parameter code="SmokeDetectors"> <Opted>Y</Opted> </Parameter>
					 * 
					 */
					if (eElement.getAttribute("code").equals("SmokeDetectors")) {
						for (int i = 0; i < eElement.getChildNodes().getLength(); i++) {
							Node paramChild = eElement.getChildNodes().item(i);
							if (paramChild.getNodeType() == Node.ELEMENT_NODE) {
								Element eElement2 = (Element) paramChild;

								if ("Opted".equals(eElement2.getNodeName())) {
									eElement2.setTextContent(Opted2);
								}

							}
						}
					}
					/**
					 * <Parameter code="Deadbolt"> <Opted>Y</Opted> </Parameter>
					 */
					if (eElement.getAttribute("code").equals("Deadbolt")) {
						for (int i = 0; i < eElement.getChildNodes().getLength(); i++) {
							Node paramChild = eElement.getChildNodes().item(i);
							if (paramChild.getNodeType() == Node.ELEMENT_NODE) {
								Element eElement2 = (Element) paramChild;

								if ("Opted".equals(eElement2.getNodeName())) {
									eElement2.setTextContent(Opted3);
								}

							}
						}
					}
					/**
					 * <Parameter code="HomeAge">1990</Parameter>
					 * <Parameter code="ContructionType">Masonry</Parameter>
					 * <Parameter code="PersonalLiability">100000</Parameter>
					 * 
					 */
					if ("Parameter".equals(eElement.getNodeName())) {
						if (eElement.getAttribute("code").equals("HomeAge")) {
							eElement.setTextContent(HomeAge);
						}
						if (eElement.getAttribute("code").equals("ContructionType")) {
							eElement.setTextContent(ContructionType);
						}
						if (eElement.getAttribute("code").equals("PersonalLiability")) {
							eElement.setTextContent(PersonalLiability);
						}

					}
					/**
					 * Parameter code="HeatingDevice"> <Opted>N</Opted> <Type> </Type> </Parameter>
					 */
					if (eElement.getAttribute("code").equals("HeatingDevice")) {
						for (int i = 0; i < eElement.getChildNodes().getLength(); i++) {
							Node paramChild = eElement.getChildNodes().item(i);
							if (paramChild.getNodeType() == Node.ELEMENT_NODE) {
								Element eElement2 = (Element) paramChild;

								if ("Opted".equals(eElement2.getNodeName())) {
									eElement2.setTextContent(Opted4);
								}
								if ("Type".equals(eElement2.getNodeName())) {
									eElement2.setTextContent(Type4);
								}

							}
						}
					}
					/**
					 * <Parameter code="OtherStructure">10</Parameter>
					 * <Parameter code="PersonalProperty">50</Parameter>
					 */
					if ("Parameter".equals(eElement.getNodeName())) {
						if (eElement.getAttribute("code").equals("OtherStructure")) {
							eElement.setTextContent(OtherStructure);
						}
						if (eElement.getAttribute("code").equals("PersonalProperty")) {
							eElement.setTextContent(PersonalProperty);
						}

					}
					/**
					 * <Parameter code="WindCoverage"> <Opted>Y</Opted> <Limit>1</Limit>
					 * </Parameter>
					 */
					if (eElement.getAttribute("code").equals("WindCoverage")) {
						for (int i = 0; i < eElement.getChildNodes().getLength(); i++) {
							Node paramChild = eElement.getChildNodes().item(i);
							if (paramChild.getNodeType() == Node.ELEMENT_NODE) {
								Element eElement2 = (Element) paramChild;

								if ("Opted".equals(eElement2.getNodeName())) {
									eElement2.setTextContent(Opted5);
								}
								if ("Limit".equals(eElement2.getNodeName())) {
									eElement2.setTextContent(Limit);
								}

							}
						}
					}
					/**
					 * <Parameter code="UserInfo"> <Name> </Name> <Address>821 Bloomfield St, New
					 * Bern, NC 28560, USA</Address> </Parameter>
					 */
					if (eElement.getAttribute("code").equals("UserInfo")) {
						for (int i = 0; i < eElement.getChildNodes().getLength(); i++) {
							Node paramChild = eElement.getChildNodes().item(i);
							if (paramChild.getNodeType() == Node.ELEMENT_NODE) {
								Element eElement2 = (Element) paramChild;

								if ("Name".equals(eElement2.getNodeName())) {
									eElement2.setTextContent(Name);
								}
								if ("Address".equals(eElement2.getNodeName())) {
									eElement2.setTextContent(Address);
								}

							}
						}
					}
					/**
					 * <Parameter code="WaterBackup">10000</Parameter>
					 */
					if ("Parameter".equals(eElement.getNodeName())) {
						if (eElement.getAttribute("code").equals("WaterBackup")) {
							eElement.setTextContent(WaterBackup);
						}

					}
				}
			}

			// Save file to drive
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource source = new DOMSource(doc);
			File filePath = new File(
					"C:\\" + "PPERater\\" + "RATER\\" + dateFormat.format(date) + "\\" + "REQUEST");
			filePath.mkdir();
			StreamResult saveFile = new StreamResult(new File(filePath + "\\" + ("Requset_" + (row_num+1) + ".xml")));
			transformer.transform(source, saveFile);
			logger.info("Request_" +( row_num+1) + ".xml  CREATED & SAVED, based on the data from Row Number " + (row_num+1)
					+ " of TestData.xlsx");

			logger.info("--------------------------------------------------------------------------");
			logger.info("State : " + ExcelUtils.getCellData(row_num, 0) + "\n" + "County : "
					+ ExcelUtils.getCellData(row_num, 1) + "\n" + "Insurance Amount	: "
					+ ExcelUtils.getCellData(row_num, 2) + "\n" + "Protection Class	: "
					+ ExcelUtils.getCellData(row_num, 3) + "\n" + "No of Claims : " + ExcelUtils.getCellData(row_num, 4)
					+ "\n" + "Claims Loss Type	: " + ExcelUtils.getCellData(row_num, 5) + "\n"
					+ "Claims Loss Amount : " + ExcelUtils.getCellData(row_num, 6) + "\n" + "Insured Age : "
					+ ExcelUtils.getCellData(row_num, 7) + "\n" + "Deductible Type	: "
					+ ExcelUtils.getCellData(row_num, 8) + "\n" + "Deductible Amount : "
					+ ExcelUtils.getCellData(row_num, 9) + "\n" + "Ext Replacement Cost :	"
					+ ExcelUtils.getCellData(row_num, 10) + "\n" + "Burglary Alarm Opted : "
					+ ExcelUtils.getCellData(row_num, 11) + "\n" + "Burglary Alarm Type	: "
					+ ExcelUtils.getCellData(row_num, 12) + "\n" + "Smoke Detectors Opted : "
					+ ExcelUtils.getCellData(row_num, 13) + "\n" + "Deadbolt Opted : "
					+ ExcelUtils.getCellData(row_num, 14) + "\n" + "Home Age : " + ExcelUtils.getCellData(row_num, 15)
					+ "\n" + "Contruction Type : " + ExcelUtils.getCellData(row_num, 16) + "\n"
					+ "Personal Liability : " + ExcelUtils.getCellData(row_num, 17) + "\n" + "Heating Device Opted : "
					+ ExcelUtils.getCellData(row_num, 18) + "\n" + "Heating Device Type	: "
					+ ExcelUtils.getCellData(row_num, 19) + "\n" + "OtherStructure : "
					+ ExcelUtils.getCellData(row_num, 20) + "\n" + "Personal Property : "
					+ ExcelUtils.getCellData(row_num, 21) + "\n" + "Wind Coverage Opted : "
					+ ExcelUtils.getCellData(row_num, 22) + "\n" + "Wind Coverage Limit : "
					+ ExcelUtils.getCellData(row_num, 23) + "\n" + "Insured Name	: "
					+ ExcelUtils.getCellData(row_num, 24) + "\n" + "Property Address : "
					+ ExcelUtils.getCellData(row_num, 25) + "\n" + "Water Backup : "
					+ ExcelUtils.getCellData(row_num, 26) + "\n");

		} catch (Exception e) {
			e.printStackTrace();
			logger.info(e.getStackTrace());
		}
	}
}

package Rater;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import org.testng.asserts.SoftAssert;

import utility.Constant;
import utility.ExcelUtils;

@SuppressWarnings("unused")
public class ResponseXml {
	static Date date = new Date();
	static SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");

	static {
		System.setProperty("my.txt",
				"C:\\" + "PPERater\\" + "RATER\\" + dateFormat.format(date) + "\\" + "log.txt");
	}
	static Logger logger = Logger.getLogger(ResponseXml.class);

	public static void responseXmlChecks(int row_num) throws SAXException, IOException, ParserConfigurationException {
		try {
			DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
			Document doc = docBuilder.parse("C:\\PPERater\\RATER\\" + dateFormat.format(date) + "\\"
					+ "RESPONSE\\Response_" + (row_num+1) + ".xml");
			Node Policy = doc.getElementsByTagName("Policy").item(0);
			NodeList responseXmlNodelist = Policy.getChildNodes();
			SoftAssert softAssert = new SoftAssert();

			logger.info("--------------------------Response_" + (row_num+1) + ".xml------------------------------------");

			for (int temp = 0; temp < responseXmlNodelist.getLength(); temp++) {

				try {
					Node node = responseXmlNodelist.item(temp);
					if (node.getNodeType() == Node.ELEMENT_NODE) {
						Element eElement = (Element) node;
						if ("C".equals(eElement.getNodeName())) {

							// BR = Base Rate
							if (eElement.getAttribute("name").equals("BR")) {
								String br = eElement.getTextContent();
								String baseRate = RaterCalculations.calculateBR(row_num);
								logger.info("Base Rate value form Rater : " + br);
								logger.info("Calculated Base Rate value : " + baseRate);
								Assert.assertEquals(br, baseRate);

							}

							// BP = Base Premium
							if (eElement.getAttribute("name").equals("BP")) {
								String bp = eElement.getTextContent();
								String basePremium = RaterCalculations.calculateBasePremium(row_num);
								logger.info("Base Premium form Rater : " + bp);
								logger.info("Calculated Base Premium : " + basePremium);
								Assert.assertEquals(bp, basePremium);
							}

							// ADA = Dwelling Amount
							if (eElement.getAttribute("name").equals("ADA")) {
								String ada = eElement.getTextContent();
								ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData, "Rater");
								String dwellingAmount = ExcelUtils.getCellData(row_num, 2);
								logger.info("Dwelling Amount form Rater : " + ada);
								logger.info("Entered Dwelling Amount : " + dwellingAmount);
								Assert.assertEquals(ada, dwellingAmount);
							}

							// BOS = Other Structure
							if (eElement.getAttribute("name").equals("BOS")) {
								String bos = eElement.getTextContent();
								String basePremium = RaterCalculations.calculateBasePremium(row_num);
								logger.info("BOS value form Rater: " + bos);
								logger.info("Calculated BOS : " + basePremium);
								Assert.assertEquals(bos, basePremium);
							}

							// RCP = Replacement Cost Premium
							if (eElement.getAttribute("name").equals("RCP")) {
								String rcp = eElement.getTextContent();
								String rcpValue = RaterCalculations.calculateRCPNodeValue(row_num);
								logger.info("Premium after applying Replacement Cost from Rater: " + rcp);
								logger.info("Calculated Premium after applying Replacement Cost : " + rcpValue);

								Assert.assertEquals(rcp, rcpValue);

							}

							// ERC = Extended Replacement Cost
							if (eElement.getAttribute("name").equals("ERC")) {
								String erc = eElement.getTextContent();
								String extReplacementCost = RaterCalculations.extendedReplacementCost(row_num);
								logger.info("Premium after applying Replacement Cost Extended Replacement Cost form Rater : " + erc);
								logger.info("Calculated Premium after applying Replacement Cost : " + extReplacementCost);
								Assert.assertEquals(erc, extReplacementCost);
							}

							// WBC = Water Backup Coverage
							if (eElement.getAttribute("name").equals("WBC")) {
								String wbc = eElement.getTextContent();
								String waterBackUpPremium = RaterCalculations.waterBackUpPremium(row_num);
								logger.info("Premium after applying Water Backup Coverage form Rater : " + wbc);
								logger.info("Calculated Premium after applying Water Backup Coverage : " + waterBackUpPremium);
								Assert.assertEquals(wbc, waterBackUpPremium);

							}

							// RCV = Higher AOP Deductible Discount
							if (eElement.getAttribute("name").equals("RCV")) {
								String rcv = eElement.getTextContent();
								String aopDeductble = RaterCalculations.highDeductibleDiscount(row_num);
								logger.info("Premium after applying Higher AOP deductible discount form Rater : " + rcv);
								logger.info("Calculated Premium after applying Higher AOP deductible discount : " + aopDeductble);
								Assert.assertEquals(rcv, aopDeductble);
							}

							// WHD = Higher Wind Deductible Discount
							if (eElement.getAttribute("name").equals("WHD")) {
								String whd = eElement.getTextContent();
								String HWDD = RaterCalculations.windDeductibleDiscount(row_num);
								logger.info("Premium after applying Higher Wind Deductible Discount form Rater : " + whd);
								logger.info("Calculated Premium after applying Wind Deductible Discount : " + HWDD);
								Assert.assertEquals(whd, HWDD);
							}

							// ANI = Insured Age Discount
							if (eElement.getAttribute("name").equals("ANI")) {
								String ani = eElement.getTextContent();
								String isuredAgeDiscount = RaterCalculations.insuredAgeDiscount(row_num);
								logger.info("Premium after applying Insured Age Discount form Rater : " + ani);
								logger.info("Calculated Premium after applying Insured Age Discount : " + isuredAgeDiscount);
								Assert.assertEquals(ani, isuredAgeDiscount);
							}

							// BA = Burglary Alarm Rate Discount
							if (eElement.getAttribute("name").equals("BA")) {
								String ba = eElement.getTextContent();
								String discount = RaterCalculations.burglaryAlarmDiscount(row_num);
								logger.info("Premium after applying Burglary Alarm Discount form Rater : " + ba);
								logger.info("Calculated Premium after applying Burglary Alarm Discount : " + discount);
								Assert.assertEquals(ba, discount);
							}

							// SDD = Smoke, Deadbolt Discount
							if (eElement.getAttribute("name").equals("SDD")) {
								String sdd = eElement.getTextContent();
								String smokeDeadbolt = RaterCalculations.smokeDeadboltDiscount(row_num);
								logger.info("Premium after applying Smoke, Deadbolt Discount form Rater : " + sdd);
								logger.info("Calculated Premium after applying Smoke, Deadbolt Discount : " + smokeDeadbolt);
								Assert.assertEquals(sdd, smokeDeadbolt);
							}

							// HA = Home Age
							if (eElement.getAttribute("name").equals("HA")) {
								String ha = eElement.getTextContent();
								String homeAgeDiscount = RaterCalculations.homeAgeDiscount(row_num);
								logger.info("Premium after applying Home Age Discount form Rater : " + ha);
								logger.info("Calculated Premium after applying Home Age Discount : " + homeAgeDiscount);
								Assert.assertEquals(ha, homeAgeDiscount);
							}

							// PCS = Zero Claim Discount
							if (eElement.getAttribute("name").equals("PCS")) {
								String pcs = eElement.getTextContent();
								String claimDiscount = RaterCalculations.zeroClaimDiscount(row_num);
								logger.info("Premium after applying Claim Discount/Surcharge form Rater : " + pcs);
								logger.info("Calculated Premium after applying Claim Discount/Surcharge : " + claimDiscount);
								Assert.assertEquals(pcs, claimDiscount);
							}

							// SHD = Heating Device Surcharge
							if (eElement.getAttribute("name").equals("SHD")) {
								String shd = eElement.getTextContent();
								String heatingDevice = RaterCalculations.heatingDeviceCharge(row_num);
								logger.info("Premium after applying Heating Device Surcharge form Rater : " + shd);
								logger.info("Calculated Premium after applying Heating Device Surcharge : " + heatingDevice);
								Assert.assertEquals(shd, heatingDevice);
							}

							// CPP = Personal Property
							if (eElement.getAttribute("name").equals("CPP")) {
								String cpp = eElement.getTextContent();
								String personalPCharge = RaterCalculations.personalPropertyCharge(row_num);
								logger.info("Premium after applying Personal Property form Rater : " + cpp);
								logger.info("Calculated Premium after applying Personal Property : " + personalPCharge);
								Assert.assertEquals(cpp, personalPCharge);
							}

							// EPL = Personal Liability
							if (eElement.getAttribute("name").equals("EPL")) {
								String epl = eElement.getTextContent();
								String personalLiab = RaterCalculations.personalLiabilityCharge(row_num);
								logger.info("Premium after applying Personal Liability form Rater : " + epl);
								logger.info("Calculated Premium after applying Personal Liability : " + personalLiab);
								Assert.assertEquals(epl, personalLiab);
								
							}

							// WC = WIND HAIL TERRITORY
							if (eElement.getAttribute("name").equals("WC")) {
								String wc = eElement.getTextContent();
							}
						}

						// Getting Basic Premium, Surcharge, Discount and the final
						// premium.
						if ("Premium".equals(eElement.getNodeName())) {
							if (eElement.getAttribute("name").equals("TP")) {
								String basicPremium = eElement.getAttribute("BasicPremium");
								String surCharges = eElement.getAttribute("Surcharge");
								String discount = eElement.getAttribute("Discount");
								String totalPremium = eElement.getTextContent();
								String rcpValue = RaterCalculations.calculateRCPNodeValue(row_num);
								logger.info("Basic Premium : "+basicPremium)	;	
								logger.info("Surcharges : "+surCharges)	;	
								logger.info("Discount : "+discount)	;	
								logger.info("Total Premium : "+totalPremium);	
								String premium = eElement.getTextContent();
								int premiumCalculation = ((Integer.valueOf(basicPremium) + Integer.valueOf(surCharges))
										- Integer.valueOf(discount));
								Assert.assertEquals(premium, String.valueOf(premiumCalculation));
								
								logger.info("COMPLETED!!!!!");
								
							}
						}

					}
					// Writing PASS to the excel document
					ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData, "Rater");
					String pass = "PASS";
					ExcelUtils.setCellData(pass, row_num, 30);

				} catch (AssertionError e) {
					ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData, "Rater");
					String fail = "FAIL";
					ExcelUtils.setCellData(fail, row_num, 30);
					logger.info("FAILED REASON : " + e.getLocalizedMessage());

					break;
				}

			}

		} catch (Exception e) {
			e.printStackTrace();
			ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData, "Rater");
			String fail = "FAIL";
			ExcelUtils.setCellData(fail, row_num, 30);
			logger.info("FAILED REASON : " + e.getLocalizedMessage());

		}
	}

}
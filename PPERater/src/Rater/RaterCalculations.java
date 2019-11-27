package Rater;

import java.io.IOException;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import javax.xml.parsers.ParserConfigurationException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.xml.sax.SAXException;

import utility.Constant;
import utility.ExcelUtils;

@SuppressWarnings("unused")
public class RaterCalculations {
	WebDriver driver;
	static Date date = new Date();
	static SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");

	static {
		System.setProperty("my.txt", "C:\\" + "PPERater\\" + "RATER\\"
				+ dateFormat.format(date) + "\\" + "log.txt");
	}

	public static String[] teirOneCountiesNC = { "BRUNSWICK", "CARTERET",
			"CURRITUCK", "DARE", "HYDE", "NEW HANOVER", "ONSLOW", "PAMLICO",
			"PENDER", "TYRRELL" };
	public static String[] teirTwoCountiesNC = { "BEAUFORT", "BLADEN",
			"PERQUIMANS", "CAMDEN", "CHOWAN", "PITT", "COLUMBUS", "CRAVEN",
			"SAMPSON", "DUPLIN", "GATES", "WASHINGTON", "JONES", "LENOIR",
			"MARTIN", "PASQUOTANK" };

	public static List<String> teirOneCountiesListNC = Arrays
			.asList(teirOneCountiesNC);
	public static List<String> teirTwoCountiesListNC = Arrays
			.asList(teirTwoCountiesNC);

	public static String[] teirOneCountiesGA = { "BRYAN", "CAMDEN", "CHATHAM",
			"GLYNN", "LIBERTY", "MCINTOSH" };
	public static String[] teirTwoCountiesGA = { "BULLOCH", "BRANTLEY",
			"BROOKS", "EVANS", "EFFINGHAM", "CHARLTON", "DECATUR", "GRADY",
			"LONG", "WAYNE", "LOWNDES", "THOMAS", "SEMINOLE" };

	public static List<String> teirOneCountiesListGA = Arrays
			.asList(teirOneCountiesGA);
	public static List<String> teirTwoCountiesListGA = Arrays
			.asList(teirTwoCountiesGA);

	
	public void Test() throws ParserConfigurationException, SAXException,
			IOException {

		/*System.out.println(calculateBasePremium(2));
		System.out.println(calculateBasePremium(3));
		System.out.println(calculateBasePremium(4));
		System.out.println(calculateBasePremium(5));
		System.out.println(calculateBasePremium(6));
		System.out.println(calculateBasePremium(7));
		System.out.println(calculateBasePremium(8));
		System.out.println(calculateBasePremium(9));
		System.out.println(calculateBasePremium(10));
		System.out.println(calculateBasePremium(11));

		System.out.println(calculateBasePremium(12));
		System.out.println(calculateBasePremium(13));
		System.out.println(calculateBasePremium(14));
		System.out.println(calculateBasePremium(15));
		System.out.println(calculateBasePremium(16));
		System.out.println(calculateBasePremium(17));
		System.out.println(calculateBasePremium(18));
		System.out.println(calculateBasePremium(19));
		System.out.println(calculateBasePremium(20));
		System.out.println(calculateBasePremium(21));*/

		
		
		// System.out.println(calculateBasePremium(11));
		// System.out.println(calculateBasePremium(14));
		// System.out.println(calculateBasePremium(17));
		// System.out.println(homeAgeDiscount(6));

	}

	// Personal Liability
	public static String personalLiabilityCharge(int row_num)
			throws NumberFormatException, ParserConfigurationException,
			SAXException, IOException {
		String personalPropertyCharge = personalPropertyCharge(row_num);

		ExcelUtils.setExcelFile(
				Constant.Path_TestData + Constant.File_TestData, "Rater");
		String personalLiab = ExcelUtils.getCellData(row_num, 17);
		double personalLiability = 0;

		if (Integer.valueOf(personalLiab) >= 150000) {
			personalLiability = (Double.valueOf(personalPropertyCharge) + 10.00);
		} else {
			personalLiability = Double.valueOf(personalPropertyCharge);
		}

		return String.format("%.0f", personalLiability);

	}

	// Personal Property
	public static String personalPropertyCharge(int row_num)
			throws NumberFormatException, ParserConfigurationException,
			SAXException, IOException {
		String heatingDeviceCharge = heatingDeviceCharge(row_num);
		String personalPropertyFactor = personalPropertyFactor(row_num);

		DecimalFormat df = new DecimalFormat("0");
		double personalPropertyCharge = 0;

		if (Double.valueOf(personalPropertyFactor) < 1) {
			double factor = (1.00 - Double.valueOf(personalPropertyFactor));
			String h = String.format("%.2f", factor);

			double calc = (Double.valueOf(heatingDeviceCharge) * Double
					.valueOf(h));

			String b = String.format("%.0f", calc);
			personalPropertyCharge = (Integer.valueOf(heatingDeviceCharge) - Double
					.valueOf(calc));

		} else {
			personalPropertyCharge = (Integer.valueOf(heatingDeviceCharge) * Double
					.valueOf(personalPropertyFactor));
		}
		return df.format(personalPropertyCharge);

	}

	// Heating Device
	public static String heatingDeviceCharge(int row_num)
			throws NumberFormatException, ParserConfigurationException,
			SAXException, IOException {
		String zeroClaimDiscount = zeroClaimDiscount(row_num);
		ExcelUtils.setExcelFile(
				Constant.Path_TestData + Constant.File_TestData, "Rater");
		String heatingDeviceOpted = ExcelUtils.getCellData(row_num, 18);

		DecimalFormat df = new DecimalFormat("0");
		int heatingDeviceCharge = 0;
		if (heatingDeviceOpted.equals("Y")) {
			heatingDeviceCharge = (Integer.valueOf(zeroClaimDiscount) + 30);

		} else {
			heatingDeviceCharge = Integer.valueOf(zeroClaimDiscount);
		}
		return df.format(heatingDeviceCharge);

	}

	// Zero Claim Discount
	public static String zeroClaimDiscount(int row_num)
			throws NumberFormatException, ParserConfigurationException,
			SAXException, IOException {
		String homeAgeDiscount = homeAgeDiscount(row_num);
		String claimsFactor = returnClaimFactors(row_num);
		
		System.out.println();

		DecimalFormat df = new DecimalFormat("0");
		double zeroClaimDiscount = 0;
		if (Double.valueOf(claimsFactor) < 1) {
			DecimalFormat df1 = new DecimalFormat("0");
			double h = (1 - Double.valueOf(claimsFactor));
			String k = String.format("%.2f", h);

			double calc = (Double.valueOf(homeAgeDiscount) * Double.valueOf(k));
			//String j = String.format("%.0f", calc);
			zeroClaimDiscount = ((Double.valueOf(homeAgeDiscount) - Double
					.valueOf(calc)));

		} else {

			zeroClaimDiscount = (Double.valueOf(homeAgeDiscount) * Double
					.valueOf(claimsFactor));
		}
		return String.format("%.0f", zeroClaimDiscount);

	}

	// Home Age Discount
	public static String homeAgeDiscount(int row_num)
			throws NumberFormatException, ParserConfigurationException,
			SAXException, IOException {
		String smokeDeadboltDiscount = smokeDeadboltDiscount(row_num);
		String homeAgeDiscountFactor = returnHomeAgeDiscount(row_num);

		DecimalFormat df = new DecimalFormat("0");

		double homeAgeDiscount = (Integer.valueOf(smokeDeadboltDiscount) * Double
				.valueOf(homeAgeDiscountFactor));

		return df.format(homeAgeDiscount);

	}

	// SDD = Smoke, Deadbolt Discount
	public static String smokeDeadboltDiscount(int row_num)
			throws NumberFormatException, ParserConfigurationException,
			SAXException, IOException {
		String burglaryAlarmDiscount = burglaryAlarmDiscount(row_num);
		ExcelUtils.setExcelFile(
				Constant.Path_TestData + Constant.File_TestData, "Rater");
		String smokeOpted = ExcelUtils.getCellData(row_num, 13);
		String deadBoltOpted = ExcelUtils.getCellData(row_num, 14);
		String acvORrcv = ExcelUtils.getCellData(row_num, 8);

		DecimalFormat df = new DecimalFormat("0");

		double smokeDeadboltDiscount = 0.0;
		if (acvORrcv.equals("ACV")) {
			if (smokeOpted.equals("Y") || deadBoltOpted.equals("Y")) {
				double h = (Double.valueOf(burglaryAlarmDiscount) * 0.03);
				String k = String.format("%.0f", h);
				smokeDeadboltDiscount = (Integer.valueOf(burglaryAlarmDiscount) - Double
						.valueOf(k));
			} else {
				smokeDeadboltDiscount = Integer.valueOf(burglaryAlarmDiscount);
			}
		} else if (acvORrcv.equals("RCV")) {
			smokeDeadboltDiscount = Integer.valueOf(burglaryAlarmDiscount);
		}

		return df.format(smokeDeadboltDiscount);
	}

	// Burglary Alarm Rate Discount
	public static String burglaryAlarmDiscount(int row_num)
			throws NumberFormatException, ParserConfigurationException,
			SAXException, IOException {
		String insuredAgeDiscount = insuredAgeDiscount(row_num);
		ExcelUtils.setExcelFile(
				Constant.Path_TestData + Constant.File_TestData, "Rater");
		String alarmOpted = ExcelUtils.getCellData(row_num, 11);
		String alarmItem = ExcelUtils.getCellData(row_num, 12);

		DecimalFormat df = new DecimalFormat("0.##");
		double burglaryAlarmDiscount = 0.0;

		if (alarmOpted.equals("Y") && alarmItem.equals("central")) {

			double st = (Integer.valueOf(insuredAgeDiscount) * 0.05);
			String h = (String.format("%.0f", st));
			burglaryAlarmDiscount = (Integer.valueOf(insuredAgeDiscount) - (Double
					.valueOf(h)));

		} else if (alarmOpted.equals("Y") && alarmItem.equals("local")) {

			double st = (Integer.valueOf(insuredAgeDiscount) * 0.02);
			String h = (String.format("%.0f", st));

			burglaryAlarmDiscount = (Integer.valueOf(insuredAgeDiscount) - (Double
					.valueOf(h)));

		} else {
			burglaryAlarmDiscount = Integer.valueOf(insuredAgeDiscount);
		}

		return df.format(burglaryAlarmDiscount);

	}

	// Insured Age Discount
	public static String insuredAgeDiscount(int row_num)
			throws NumberFormatException, ParserConfigurationException,
			SAXException, IOException {

		String windDedDiscount = windDeductibleDiscount(row_num);
		ExcelUtils.setExcelFile(
				Constant.Path_TestData + Constant.File_TestData, "Rater");
		String insuredAge = ExcelUtils.getCellData(row_num, 7);

		DecimalFormat df = new DecimalFormat("0");
		double insuredAgeDiscount = 0;
		if (Integer.valueOf(insuredAge) >= 50) {

			double factor = (Double.valueOf(windDedDiscount) * 0.05);
			String h = String.format("%.0f", factor);
			insuredAgeDiscount = (Double.valueOf(windDedDiscount) - (Double
					.valueOf(h)));

		} else {
			insuredAgeDiscount = (Integer.valueOf(windDedDiscount) * 1);
		}

		return String.format("%.0f", insuredAgeDiscount);

	}

	// Getting Wind Deductible Discount
	public static String windDeductibleDiscount(int row_num)
			throws NumberFormatException, ParserConfigurationException,
			SAXException, IOException {
		String windDeductibleFactor = returnWindDeductibleDiscountFactors(row_num);
		String highDeductibleDiscount = highDeductibleDiscount(row_num);

		DecimalFormat df = new DecimalFormat("0");

		double windDeductibleDiscount = 0.0;

		if (Double.valueOf(windDeductibleFactor) < 1) {

			double factor = (1.00 - Double.valueOf(windDeductibleFactor));
			String h = String.format("%.2f", factor);

			double calc = (Double.valueOf(highDeductibleDiscount) * Double
					.valueOf(h));

			String b = String.format("%.0f", calc);

			windDeductibleDiscount = (Integer.valueOf(highDeductibleDiscount) - Double
					.valueOf(b));

		} else {
			windDeductibleDiscount = (Double.valueOf(windDeductibleFactor) * Integer
					.valueOf(highDeductibleDiscount));
		}

		return df.format(windDeductibleDiscount);

	}

	// Higher AOP Deductible Discount
	public static String highDeductibleDiscount(int row_num)
			throws NumberFormatException, ParserConfigurationException,
			SAXException, IOException {
		String deductibleDiscountFactor = returnHighDeductibleDiscount(row_num);
		String waterBackUpPremium = waterBackUpPremium(row_num);

		DecimalFormat df = new DecimalFormat("0");

		double highDeductibleDiscount = (Double
				.valueOf(deductibleDiscountFactor) * Integer
				.valueOf(waterBackUpPremium));

		return df.format(highDeductibleDiscount);

	}

	// calculate water backup premium
	public static String waterBackUpPremium(int row_num)
			throws NumberFormatException, ParserConfigurationException,
			SAXException, IOException {
		String extReplacmentCost = extendedReplacementCost(row_num);
		String backUpFactor = returnWaterBackUpFactor(row_num);
		DecimalFormat df = new DecimalFormat("0");

		int waterBackUpPremium = (Integer.valueOf(extReplacmentCost) + Integer
				.valueOf(backUpFactor));

		return df.format(waterBackUpPremium);

	}

	// Calculating Extended Replacement Cost
	public static String extendedReplacementCost(int row_num)
			throws NumberFormatException, ParserConfigurationException,
			SAXException, IOException {
		String extRCF = returnExtRCF(row_num);
		String rcpNodeValue = calculateRCPNodeValue(row_num);

		ExcelUtils.setExcelFile(
				Constant.Path_TestData + Constant.File_TestData, "Rater");
		String extRCvalue = ExcelUtils.getCellData(row_num, 10);
		String deductibleType = ExcelUtils.getCellData(row_num, 8);
		String dwellingAmount = ExcelUtils.getCellData(row_num, 2);

		DecimalFormat df = new DecimalFormat("0");
		double replacementCost = 0.0;

		if (deductibleType.equals("RCV") && extRCvalue.equals("25")) {
			double h = Integer.valueOf(dwellingAmount) * 0.25;
			String j = String.format("%.1f", h);
			double k = Double.valueOf(j)
					* (Double.valueOf(extRCF) / 100);
			String l = String.format("%.0f", k);
			replacementCost = ((Double.valueOf(l)) + Integer
					.valueOf(rcpNodeValue));
		} else if (deductibleType.equals("RCV") && extRCvalue.equals("None")) {
			replacementCost = Integer.valueOf(rcpNodeValue);
		}

		else if (!deductibleType.equals("RCV")) {
			replacementCost = Integer.valueOf(rcpNodeValue);
		}

		return df.format(replacementCost);

	}

	// Getting RCP Node value
	public static String calculateRCPNodeValue(int row_num)
			throws ParserConfigurationException, SAXException, IOException {

		String baseRate = calculateBR(row_num);
		String dwellingFactor = returnDwellingAmtFactor(row_num);
		String acvFactor = returnACVFactor(row_num);
		String rcvFactor = returnRCFactor(row_num);
		ExcelUtils.setExcelFile(
				Constant.Path_TestData + Constant.File_TestData, "Rater");
		String dwellingAmount = ExcelUtils.getCellData(row_num, 2);
		String rcvORacv = ExcelUtils.getCellData(row_num, 8);

		DecimalFormat df = new DecimalFormat("0");
		double basePremium = 0.0;

		if (rcvORacv.equals("RCV")) {
			double dwelMultiplyBR = (Double.valueOf(dwellingAmount) / 100)
					* Double.valueOf(baseRate);
			String h = String.format("%.1f", dwelMultiplyBR);
			double dwelMulBRMuldwfactor = Double.valueOf(h)
					* Double.valueOf(dwellingFactor);
			String b = String.format("%.0f", dwelMulBRMuldwfactor);
			double bmultircvFactor = Double.valueOf(b)
					* Double.valueOf(rcvFactor);
			String c = String.format("%.1f", dwelMulBRMuldwfactor);

			basePremium = Double.valueOf(c);

		} else if (rcvORacv.equals("ACV")) {
			double dwelMultiplyBR = (Double.valueOf(dwellingAmount) / 100)
					* Double.valueOf(baseRate);
			String h = String.format("%.1f", dwelMultiplyBR);

			double dwelMulBRMuldwfactor = Double.valueOf(h)
					* Double.valueOf(dwellingFactor);
			String b = String.format("%.0f", dwelMulBRMuldwfactor);

			double bmultircvFactor = Double.valueOf(b)
					* Double.valueOf(acvFactor);
			String c = String.format("%.1f", bmultircvFactor);

			basePremium = Double.valueOf(c);
		}
		return String.format("%.0f",basePremium);

	}

	// Getting Base Premium
	public static String calculateBasePremium(int row_num)
			throws ParserConfigurationException, SAXException, IOException {

		String baseRate = calculateBR(row_num);
		String dwellingFactor = returnDwellingAmtFactor(row_num);
		ExcelUtils.setExcelFile(
				Constant.Path_TestData + Constant.File_TestData, "Rater");
		String dwellingAmount = ExcelUtils.getCellData(row_num, 2);
		String rcvORacv = ExcelUtils.getCellData(row_num, 8);
		double h = (Integer.valueOf(dwellingAmount) / 100);
		String j = String.format("%.0f", h);

		double k = Double.valueOf(j) * Double.valueOf(baseRate);
		String m = String.format("%.2f", k);
		
		double basePremium = Double.valueOf(m)
				* Integer.valueOf(dwellingFactor);

		return String.format("%.0f",basePremium);

	}

	// Calculating Base Rate
	public static String calculateBR(int row_num)
			throws ParserConfigurationException, SAXException, IOException {
		String baseFactor = returnBRFactor(row_num);
		String windCoverageFactor = returnWindDeductibleFactor(row_num);
		String protectionClassFactor = returnProtectionClassFactor(row_num);

		DecimalFormat df = new DecimalFormat("#.####");
		double baseRate = 0.0;
		if (!windCoverageFactor.equals("0")) {
			double h = (Double.valueOf(baseFactor) * Double
					.valueOf(windCoverageFactor));
			String g = formatRate(String.valueOf(h));

			baseRate = (Double.valueOf(g) * Double
					.valueOf(protectionClassFactor));
		} else {

			baseRate = (Double.valueOf(baseFactor) * Double
					.valueOf(protectionClassFactor));
		}

		return df.format(baseRate);

	}

	// format Rate
	public static String formatRate(String rate)
			throws ParserConfigurationException, SAXException, IOException {

		DecimalFormat df = new DecimalFormat("0.###");
		char lastIndex = rate.charAt(rate.length() - 1);

		String bRate = null;
		if (lastIndex == '9' || lastIndex == '8') {
			bRate = df.format(Double.valueOf(rate));
		} else {
			bRate = rate;
		}
		return bRate;

	}

	// Getting Base Rate Factor
	public static String returnBRFactor(int row_num)
			throws ParserConfigurationException, SAXException, IOException {
		String baseRateFactor = null;

		ExcelUtils.setExcelFile(
				Constant.Path_TestData + Constant.File_TestData, "Rater");
		String State = ExcelUtils.getCellData(row_num, 0);
		String County = ExcelUtils.getCellData(row_num, 1);
		if (State.toUpperCase().equals("NC")) {

			if (teirOneCountiesListNC.contains(County.toUpperCase())) {
				ExcelUtils.setExcelFile(Constant.Path_TestData
						+ Constant.File_TestData, "NC");
				baseRateFactor = ExcelUtils.getCellData(1, 3);

			} else if (teirTwoCountiesListNC.contains(County.toUpperCase())) {
				ExcelUtils.setExcelFile(Constant.Path_TestData
						+ Constant.File_TestData, "NC");
				baseRateFactor = ExcelUtils.getCellData(2, 3);

			} else if (!teirOneCountiesListNC.contains(County.toUpperCase())
					&& !teirTwoCountiesListNC.contains(County.toUpperCase())) {
				ExcelUtils.setExcelFile(Constant.Path_TestData
						+ Constant.File_TestData, "NC");
				baseRateFactor = ExcelUtils.getCellData(3, 3);

			}

		} else if (State.toUpperCase().equals("GA")) {

			if (teirOneCountiesListGA.contains(County.toUpperCase())) {
				ExcelUtils.setExcelFile(Constant.Path_TestData
						+ Constant.File_TestData, "GA");
				baseRateFactor = ExcelUtils.getCellData(1, 3);

			} else if (teirTwoCountiesListGA.contains(County.toUpperCase())) {
				ExcelUtils.setExcelFile(Constant.Path_TestData
						+ Constant.File_TestData, "GA");
				baseRateFactor = ExcelUtils.getCellData(2, 3);

			} else if (!teirOneCountiesListGA.contains(County.toUpperCase())
					&& !teirTwoCountiesListGA.contains(County.toUpperCase())) {
				ExcelUtils.setExcelFile(Constant.Path_TestData
						+ Constant.File_TestData, "GA");
				baseRateFactor = ExcelUtils.getCellData(3, 3);

			}
		}
		return baseRateFactor;
	}

	// Return Wind Deductible Factor
	public static String returnWindDeductibleFactor(int row_num) {
		ExcelUtils.setExcelFile(
				Constant.Path_TestData + Constant.File_TestData, "Rater");
		String State = ExcelUtils.getCellData(row_num, 0);
		String County = ExcelUtils.getCellData(row_num, 1);
		String windCoverageOpted = ExcelUtils.getCellData(row_num, 22);
		String windCoverageFactor = "0";
		if (State.toUpperCase().equals("NC")) {

			if (teirOneCountiesListNC.contains(County.toUpperCase())
					&& windCoverageOpted.equals("Y")) {
				ExcelUtils.setExcelFile(Constant.Path_TestData
						+ Constant.File_TestData, "NC");
				windCoverageFactor = ExcelUtils.getCellData(1, 4);

			} else if (teirTwoCountiesListNC.contains(County.toUpperCase())
					&& windCoverageOpted.equals("Y")) {
				ExcelUtils.setExcelFile(Constant.Path_TestData
						+ Constant.File_TestData, "NC");
				windCoverageFactor = ExcelUtils.getCellData(2, 4);

			} else if (!teirOneCountiesListNC.contains(County.toUpperCase())
					&& !teirTwoCountiesListNC.contains(County.toUpperCase())
					&& windCoverageOpted.equals("Y")) {
				ExcelUtils.setExcelFile(Constant.Path_TestData
						+ Constant.File_TestData, "NC");
				windCoverageFactor = ExcelUtils.getCellData(3, 4);
			}

		} else if (State.toUpperCase().equals("GA")) {
			ExcelUtils.setExcelFile(Constant.Path_TestData
					+ Constant.File_TestData, "GA");
			if (teirOneCountiesListGA.contains(County.toUpperCase())
					&& windCoverageOpted.equals("Y")) {
				ExcelUtils.setExcelFile(Constant.Path_TestData
						+ Constant.File_TestData, "GA");
				windCoverageFactor = ExcelUtils.getCellData(1, 4);

			} else if (teirTwoCountiesListGA.contains(County.toUpperCase())
					&& windCoverageOpted.equals("Y")) {
				ExcelUtils.setExcelFile(Constant.Path_TestData
						+ Constant.File_TestData, "GA");
				windCoverageFactor = ExcelUtils.getCellData(2, 4);

			} else if (!teirOneCountiesListGA.contains(County.toUpperCase())
					&& !teirTwoCountiesListGA.contains(County.toUpperCase())
					&& windCoverageOpted.equals("Y")) {
				ExcelUtils.setExcelFile(Constant.Path_TestData
						+ Constant.File_TestData, "GA");
				windCoverageFactor = ExcelUtils.getCellData(3, 4);
			}
		}
		return windCoverageFactor;

	}

	// Getting Protection Class Factor
	public static String returnProtectionClassFactor(int row_num) {
		int col_num = Integer.valueOf(returnPCColumnNumber(row_num));
		ExcelUtils.setExcelFile(
				Constant.Path_TestData + Constant.File_TestData, "Rater");
		String protectionClass = ExcelUtils.getCellData(row_num, 3);
		String State = ExcelUtils.getCellData(row_num, 0);
		String County = ExcelUtils.getCellData(row_num, 1);

		String pcFactor = null;

		if (State.equals("NC")) {
			if (teirOneCountiesListNC.contains(County.toUpperCase())
					|| teirTwoCountiesListNC.contains(County.toUpperCase())) {
				if (protectionClass.equals("1-3")) {
					ExcelUtils.setExcelFile(Constant.Path_TestData
							+ Constant.File_TestData, "NC");
					pcFactor = ExcelUtils.getCellData(59, col_num);

				} else if (protectionClass.equals("4")) {
					ExcelUtils.setExcelFile(Constant.Path_TestData
							+ Constant.File_TestData, "NC");
					pcFactor = ExcelUtils.getCellData(60, col_num);

				} else if (protectionClass.equals("5")) {
					ExcelUtils.setExcelFile(Constant.Path_TestData
							+ Constant.File_TestData, "NC");
					pcFactor = ExcelUtils.getCellData(61, col_num);

				} else if (protectionClass.equals("6")) {
					ExcelUtils.setExcelFile(Constant.Path_TestData
							+ Constant.File_TestData, "NC");
					pcFactor = ExcelUtils.getCellData(62, col_num);

				} else if (protectionClass.equals("7")) {
					ExcelUtils.setExcelFile(Constant.Path_TestData
							+ Constant.File_TestData, "NC");
					pcFactor = ExcelUtils.getCellData(63, col_num);

				} else if (protectionClass.equals("8")) {
					ExcelUtils.setExcelFile(Constant.Path_TestData
							+ Constant.File_TestData, "NC");
					pcFactor = ExcelUtils.getCellData(64, col_num);

				} else if (protectionClass.equals("9")) {
					ExcelUtils.setExcelFile(Constant.Path_TestData
							+ Constant.File_TestData, "NC");
					pcFactor = ExcelUtils.getCellData(65, col_num);

				} else if (protectionClass.equals("10")) {
					ExcelUtils.setExcelFile(Constant.Path_TestData
							+ Constant.File_TestData, "NC");
					pcFactor = ExcelUtils.getCellData(66, col_num);

				}
			}
			if (!teirOneCountiesListNC.contains(County.toUpperCase())
					&& !teirTwoCountiesListNC.contains(County.toUpperCase())) {
				if (protectionClass.equals("1-3")) {
					ExcelUtils.setExcelFile(Constant.Path_TestData
							+ Constant.File_TestData, "NC");
					pcFactor = ExcelUtils.getCellData(199, col_num);

				} else if (protectionClass.equals("4")) {
					ExcelUtils.setExcelFile(Constant.Path_TestData
							+ Constant.File_TestData, "NC");
					pcFactor = ExcelUtils.getCellData(200, col_num);

				} else if (protectionClass.equals("5")) {
					ExcelUtils.setExcelFile(Constant.Path_TestData
							+ Constant.File_TestData, "NC");
					pcFactor = ExcelUtils.getCellData(201, col_num);

				} else if (protectionClass.equals("6")) {
					ExcelUtils.setExcelFile(Constant.Path_TestData
							+ Constant.File_TestData, "NC");
					pcFactor = ExcelUtils.getCellData(202, col_num);

				} else if (protectionClass.equals("7")) {
					ExcelUtils.setExcelFile(Constant.Path_TestData
							+ Constant.File_TestData, "NC");
					pcFactor = ExcelUtils.getCellData(203, col_num);

				} else if (protectionClass.equals("8")) {
					ExcelUtils.setExcelFile(Constant.Path_TestData
							+ Constant.File_TestData, "NC");
					pcFactor = ExcelUtils.getCellData(204, col_num);

				} else if (protectionClass.equals("9")) {
					ExcelUtils.setExcelFile(Constant.Path_TestData
							+ Constant.File_TestData, "NC");
					pcFactor = ExcelUtils.getCellData(205, col_num);

				} else if (protectionClass.equals("10")) {
					ExcelUtils.setExcelFile(Constant.Path_TestData
							+ Constant.File_TestData, "NC");
					pcFactor = ExcelUtils.getCellData(206, col_num);

				}
			}
		}
		if (State.equals("GA")) {

			if (teirOneCountiesListGA.contains(County.toUpperCase())
					|| teirTwoCountiesListGA.contains(County.toUpperCase())) {

				if (protectionClass.equals("1-3")) {

					ExcelUtils.setExcelFile(Constant.Path_TestData
							+ Constant.File_TestData, "GA");
					pcFactor = ExcelUtils.getCellData(59, col_num);

				} else if (protectionClass.equals("4")) {
					ExcelUtils.setExcelFile(Constant.Path_TestData
							+ Constant.File_TestData, "GA");
					pcFactor = ExcelUtils.getCellData(60, col_num);

				} else if (protectionClass.equals("5")) {
					ExcelUtils.setExcelFile(Constant.Path_TestData
							+ Constant.File_TestData, "GA");
					pcFactor = ExcelUtils.getCellData(61, col_num);

				} else if (protectionClass.equals("6")) {
					ExcelUtils.setExcelFile(Constant.Path_TestData
							+ Constant.File_TestData, "GA");
					pcFactor = ExcelUtils.getCellData(62, col_num);

				} else if (protectionClass.equals("7")) {
					ExcelUtils.setExcelFile(Constant.Path_TestData
							+ Constant.File_TestData, "GA");
					pcFactor = ExcelUtils.getCellData(63, col_num);

				} else if (protectionClass.equals("8")) {
					ExcelUtils.setExcelFile(Constant.Path_TestData
							+ Constant.File_TestData, "GA");
					pcFactor = ExcelUtils.getCellData(64, col_num);

				} else if (protectionClass.equals("9")) {
					ExcelUtils.setExcelFile(Constant.Path_TestData
							+ Constant.File_TestData, "GA");
					pcFactor = ExcelUtils.getCellData(65, col_num);

				} else if (protectionClass.equals("10")) {
					ExcelUtils.setExcelFile(Constant.Path_TestData
							+ Constant.File_TestData, "GA");
					pcFactor = ExcelUtils.getCellData(66, col_num);

				}
			} else if (!teirOneCountiesListGA.contains(County.toUpperCase())
					&& !teirTwoCountiesListGA.contains(County.toUpperCase())) {

				if (protectionClass.equals("1-3")) {
					ExcelUtils.setExcelFile(Constant.Path_TestData
							+ Constant.File_TestData, "GA");
					pcFactor = ExcelUtils.getCellData(199, col_num);

				} else if (protectionClass.equals("4")) {
					ExcelUtils.setExcelFile(Constant.Path_TestData
							+ Constant.File_TestData, "GA");
					pcFactor = ExcelUtils.getCellData(200, col_num);

				} else if (protectionClass.equals("5")) {
					ExcelUtils.setExcelFile(Constant.Path_TestData
							+ Constant.File_TestData, "GA");
					pcFactor = ExcelUtils.getCellData(201, col_num);

				} else if (protectionClass.equals("6")) {
					ExcelUtils.setExcelFile(Constant.Path_TestData
							+ Constant.File_TestData, "GA");
					pcFactor = ExcelUtils.getCellData(202, col_num);

				} else if (protectionClass.equals("7")) {
					ExcelUtils.setExcelFile(Constant.Path_TestData
							+ Constant.File_TestData, "GA");
					pcFactor = ExcelUtils.getCellData(203, col_num);

				} else if (protectionClass.equals("8")) {
					ExcelUtils.setExcelFile(Constant.Path_TestData
							+ Constant.File_TestData, "GA");
					pcFactor = ExcelUtils.getCellData(204, col_num);

				} else if (protectionClass.equals("9")) {
					ExcelUtils.setExcelFile(Constant.Path_TestData
							+ Constant.File_TestData, "GA");
					pcFactor = ExcelUtils.getCellData(205, col_num);

				} else if (protectionClass.equals("10")) {
					ExcelUtils.setExcelFile(Constant.Path_TestData
							+ Constant.File_TestData, "GA");
					pcFactor = ExcelUtils.getCellData(206, col_num);

				}
			}

		}

		return pcFactor;

	}

	// Getting PC columnNumber
	private static String returnPCColumnNumber(int row_num) {
		ExcelUtils.setExcelFile(
				Constant.Path_TestData + Constant.File_TestData, "Rater");
		String constructionType = ExcelUtils.getCellData(row_num, 16);

		String col_number = null;

		if (constructionType.equals("Frame/Stucco")) {
			col_number = "2";
		} else if (constructionType.equals("Masonry Veneer")) {
			col_number = "5";
		} else if (constructionType.equals("Masonry")) {
			col_number = "8";
		}
		return col_number;

	}

	// Getting Dwelling Amount Factor
	private static String returnDwellingAmtFactor(int row_num) {
		ExcelUtils.setExcelFile(
				Constant.Path_TestData + Constant.File_TestData, "Rater");
		String dwellingAmt = ExcelUtils.getCellData(row_num, 2);
		String State = ExcelUtils.getCellData(row_num, 0);
		String dwellingFactor = null;

		if (State.equals("NC")) {
			if (Integer.valueOf(dwellingAmt) >= 75000
					&& (Integer.valueOf(dwellingAmt) <= 150000)) {
				ExcelUtils.setExcelFile(Constant.Path_TestData
						+ Constant.File_TestData, "NC");
				dwellingFactor = ExcelUtils.getCellData(16, 4);

			} else if (Integer.valueOf(dwellingAmt) >= 150001
					&& (Integer.valueOf(dwellingAmt) <= 250000)) {
				ExcelUtils.setExcelFile(Constant.Path_TestData
						+ Constant.File_TestData, "NC");
				dwellingFactor = ExcelUtils.getCellData(17, 4);

			} else if (Integer.valueOf(dwellingAmt) >= 250001
					&& (Integer.valueOf(dwellingAmt) <= 300000)) {
				ExcelUtils.setExcelFile(Constant.Path_TestData
						+ Constant.File_TestData, "NC");
				dwellingFactor = ExcelUtils.getCellData(18, 4);

			} else if (Integer.valueOf(dwellingAmt) >= 300001
					&& (Integer.valueOf(dwellingAmt) <= 500000)) {
				ExcelUtils.setExcelFile(Constant.Path_TestData
						+ Constant.File_TestData, "NC");
				dwellingFactor = ExcelUtils.getCellData(19, 4);

			}
		} else if (State.equals("GA")) {
			if (Integer.valueOf(dwellingAmt) >= 75000
					&& (Integer.valueOf(dwellingAmt) <= 150000)) {
				ExcelUtils.setExcelFile(Constant.Path_TestData
						+ Constant.File_TestData, "GA");
				dwellingFactor = ExcelUtils.getCellData(16, 4);

			} else if (Integer.valueOf(dwellingAmt) >= 150001
					&& (Integer.valueOf(dwellingAmt) <= 250000)) {
				ExcelUtils.setExcelFile(Constant.Path_TestData
						+ Constant.File_TestData, "GA");
				dwellingFactor = ExcelUtils.getCellData(17, 4);

			} else if (Integer.valueOf(dwellingAmt) >= 250001
					&& (Integer.valueOf(dwellingAmt) <= 300000)) {
				ExcelUtils.setExcelFile(Constant.Path_TestData
						+ Constant.File_TestData, "GA");
				dwellingFactor = ExcelUtils.getCellData(18, 4);

			} else if (Integer.valueOf(dwellingAmt) >= 300001
					&& (Integer.valueOf(dwellingAmt) <= 500000)) {
				ExcelUtils.setExcelFile(Constant.Path_TestData
						+ Constant.File_TestData, "GA");
				dwellingFactor = ExcelUtils.getCellData(19, 4);

			}
		}
		return dwellingFactor;

	}

	// Return ACV Factor
	public static String returnACVFactor(int row_num) {

		ExcelUtils.setExcelFile(
				Constant.Path_TestData + Constant.File_TestData, "Rater");
		String State = ExcelUtils.getCellData(row_num, 0);
		String County = ExcelUtils.getCellData(row_num, 1);
		String acvFactor = null;
		if (State.equals("NC")) {
			if (teirOneCountiesListNC.contains(County.toUpperCase())) {
				ExcelUtils.setExcelFile(Constant.Path_TestData
						+ Constant.File_TestData, "NC");
				acvFactor = ExcelUtils.getCellData(1, 6);
			}
			if (teirTwoCountiesListNC.contains(County.toUpperCase())) {
				ExcelUtils.setExcelFile(Constant.Path_TestData
						+ Constant.File_TestData, "NC");
				acvFactor = ExcelUtils.getCellData(2, 6);
			}
			if (!teirOneCountiesListNC.contains(County.toUpperCase())
					&& !teirTwoCountiesListNC.contains(County.toUpperCase())) {
				ExcelUtils.setExcelFile(Constant.Path_TestData
						+ Constant.File_TestData, "NC");
				acvFactor = ExcelUtils.getCellData(3, 6);
			}
		}
		if (State.equals("GA")) {
			if (teirOneCountiesListGA.contains(County.toUpperCase())) {
				ExcelUtils.setExcelFile(Constant.Path_TestData
						+ Constant.File_TestData, "GA");
				acvFactor = ExcelUtils.getCellData(1, 6);
			}
			if (teirTwoCountiesListGA.contains(County.toUpperCase())) {
				ExcelUtils.setExcelFile(Constant.Path_TestData
						+ Constant.File_TestData, "GA");
				acvFactor = ExcelUtils.getCellData(2, 6);
			}
			if (!teirOneCountiesListGA.contains(County.toUpperCase())
					&& !teirTwoCountiesListGA.contains(County.toUpperCase())) {
				ExcelUtils.setExcelFile(Constant.Path_TestData
						+ Constant.File_TestData, "GA");
				acvFactor = ExcelUtils.getCellData(3, 6);
			}
		}

		return acvFactor;

	}

	// getting replacement cost factor
	public static String returnRCFactor(int row_num) {

		ExcelUtils.setExcelFile(
				Constant.Path_TestData + Constant.File_TestData, "Rater");
		String State = ExcelUtils.getCellData(row_num, 0);
		String County = ExcelUtils.getCellData(row_num, 1);
		String rcvFactor = null;
		if (State.equals("NC")) {
			if (teirOneCountiesListNC.contains(County.toUpperCase())) {
				ExcelUtils.setExcelFile(Constant.Path_TestData
						+ Constant.File_TestData, "NC");
				rcvFactor = ExcelUtils.getCellData(1, 5);
			}
			if (teirTwoCountiesListNC.contains(County.toUpperCase())) {
				ExcelUtils.setExcelFile(Constant.Path_TestData
						+ Constant.File_TestData, "NC");
				rcvFactor = ExcelUtils.getCellData(2, 5);
			}
			if (!teirOneCountiesListNC.contains(County.toUpperCase())
					&& !teirTwoCountiesListNC.contains(County.toUpperCase())) {
				ExcelUtils.setExcelFile(Constant.Path_TestData
						+ Constant.File_TestData, "NC");
				rcvFactor = ExcelUtils.getCellData(3, 5);
			}
		}
		if (State.equals("GA")) {
			if (teirOneCountiesListGA.contains(County.toUpperCase())) {
				ExcelUtils.setExcelFile(Constant.Path_TestData
						+ Constant.File_TestData, "GA");
				rcvFactor = ExcelUtils.getCellData(1, 5);
			}
			if (teirTwoCountiesListGA.contains(County.toUpperCase())) {
				ExcelUtils.setExcelFile(Constant.Path_TestData
						+ Constant.File_TestData, "GA");
				rcvFactor = ExcelUtils.getCellData(2, 5);
			}
			if (!teirOneCountiesListGA.contains(County.toUpperCase())
					&& !teirTwoCountiesListGA.contains(County.toUpperCase())) {
				ExcelUtils.setExcelFile(Constant.Path_TestData
						+ Constant.File_TestData, "GA");
				rcvFactor = ExcelUtils.getCellData(3, 5);
			}
		}

		return rcvFactor;

	}

	// Gettting extended replacement cost Factors
	private static String returnExtRCF(int row_num) {
		ExcelUtils.setExcelFile(
				Constant.Path_TestData + Constant.File_TestData, "Rater");
		String State = ExcelUtils.getCellData(row_num, 0);
		String dwellingAmount = ExcelUtils.getCellData(row_num, 2);

		String extRCF = null;
		if (State.equals("NC")) {
			if (Integer.valueOf(dwellingAmount) >= 75000
					&& Integer.valueOf(dwellingAmount) <= 149999) {
				ExcelUtils.setExcelFile(Constant.Path_TestData
						+ Constant.File_TestData, "NC");
				extRCF = ExcelUtils.getCellData(168, 5);
			}
			if (Integer.valueOf(dwellingAmount) >= 150000
					&& Integer.valueOf(dwellingAmount) <= 199999) {
				ExcelUtils.setExcelFile(Constant.Path_TestData
						+ Constant.File_TestData, "NC");
				extRCF = ExcelUtils.getCellData(169, 5);
			}
			if (Integer.valueOf(dwellingAmount) >= 200000
					&& Integer.valueOf(dwellingAmount) <= 249999) {
				ExcelUtils.setExcelFile(Constant.Path_TestData
						+ Constant.File_TestData, "NC");
				extRCF = ExcelUtils.getCellData(170, 5);
			}
			if (Integer.valueOf(dwellingAmount) >= 250000
					&& Integer.valueOf(dwellingAmount) <= 299999) {
				ExcelUtils.setExcelFile(Constant.Path_TestData
						+ Constant.File_TestData, "NC");
				extRCF = ExcelUtils.getCellData(171, 5);
			}
			if (Integer.valueOf(dwellingAmount) >= 300000
					&& Integer.valueOf(dwellingAmount) <= 349999) {
				ExcelUtils.setExcelFile(Constant.Path_TestData
						+ Constant.File_TestData, "NC");
				extRCF = ExcelUtils.getCellData(172, 5);
			}
			if (Integer.valueOf(dwellingAmount) >= 350000
					&& Integer.valueOf(dwellingAmount) <= 500000) {
				ExcelUtils.setExcelFile(Constant.Path_TestData
						+ Constant.File_TestData, "NC");
				extRCF = ExcelUtils.getCellData(173, 5);
			}
		} else if (State.equals("GA")) {
			if (Integer.valueOf(dwellingAmount) >= 75000
					&& Integer.valueOf(dwellingAmount) <= 149999) {
				ExcelUtils.setExcelFile(Constant.Path_TestData
						+ Constant.File_TestData, "GA");
				extRCF = ExcelUtils.getCellData(168, 5);
			}
			if (Integer.valueOf(dwellingAmount) >= 150000
					&& Integer.valueOf(dwellingAmount) <= 199999) {
				ExcelUtils.setExcelFile(Constant.Path_TestData
						+ Constant.File_TestData, "GA");
				extRCF = ExcelUtils.getCellData(169, 5);
			}
			if (Integer.valueOf(dwellingAmount) >= 200000
					&& Integer.valueOf(dwellingAmount) <= 249999) {
				ExcelUtils.setExcelFile(Constant.Path_TestData
						+ Constant.File_TestData, "GA");
				extRCF = ExcelUtils.getCellData(170, 5);
			}
			if (Integer.valueOf(dwellingAmount) >= 250000
					&& Integer.valueOf(dwellingAmount) <= 299999) {
				ExcelUtils.setExcelFile(Constant.Path_TestData
						+ Constant.File_TestData, "GA");
				extRCF = ExcelUtils.getCellData(171, 5);
			}
			if (Integer.valueOf(dwellingAmount) >= 300000
					&& Integer.valueOf(dwellingAmount) <= 349999) {
				ExcelUtils.setExcelFile(Constant.Path_TestData
						+ Constant.File_TestData, "GA");
				extRCF = ExcelUtils.getCellData(172, 5);
			}
			if (Integer.valueOf(dwellingAmount) >= 350000
					&& Integer.valueOf(dwellingAmount) <= 500000) {
				ExcelUtils.setExcelFile(Constant.Path_TestData
						+ Constant.File_TestData, "GA");
				extRCF = ExcelUtils.getCellData(173, 5);
			}
		}
		return extRCF;

	}

	// Getting Water Backup Factor
	private static String returnWaterBackUpFactor(int row_num) {
		ExcelUtils.setExcelFile(
				Constant.Path_TestData + Constant.File_TestData, "Rater");
		String State = ExcelUtils.getCellData(row_num, 0);
		String backupAmount = ExcelUtils.getCellData(row_num, 26);

		String WaterBackUpFactor = null;
		if (State.equals("NC")) {
			if (backupAmount.equals("5000")) {
				WaterBackUpFactor = "0";
			}
			if (backupAmount.equals("10000")) {
				WaterBackUpFactor = "125";
			}
			if (backupAmount.equals("25000")) {
				WaterBackUpFactor = "225";
			}
		}
		if (State.equals("GA")) {
			if (backupAmount.equals("5000")) {
				WaterBackUpFactor = "0";
			}
			if (backupAmount.equals("10000")) {
				WaterBackUpFactor = "125";
			}
			if (backupAmount.equals("25000")) {
				WaterBackUpFactor = "225";
			}
		}

		return WaterBackUpFactor;

	}

	// Getting Higher AOP Deductible Discount
	public static String returnHighDeductibleDiscount(int row_num) {
		ExcelUtils.setExcelFile(
				Constant.Path_TestData + Constant.File_TestData, "Rater");
		String State = ExcelUtils.getCellData(row_num, 0);
		String rcvORacv = ExcelUtils.getCellData(row_num, 8);
		String deductibleAmount = ExcelUtils.getCellData(row_num, 9);
		String County = ExcelUtils.getCellData(row_num, 1);

		String deductibleDiscountFactor = null;

		if (State.equals("NC")) {
			if (teirOneCountiesListNC.contains(County.toUpperCase())
					|| teirTwoCountiesListNC.contains(County.toUpperCase())) {
				if (rcvORacv.equals("ACV") && deductibleAmount.equals("1000")) {
					ExcelUtils.setExcelFile(Constant.Path_TestData
							+ Constant.File_TestData, "NC");
					deductibleDiscountFactor = ExcelUtils.getCellData(179, 1);
				}
				if (rcvORacv.equals("ACV") && deductibleAmount.equals("1500")) {
					ExcelUtils.setExcelFile(Constant.Path_TestData
							+ Constant.File_TestData, "NC");
					deductibleDiscountFactor = ExcelUtils.getCellData(180, 1);
				}
				if (rcvORacv.equals("ACV") && deductibleAmount.equals("2000")) {
					ExcelUtils.setExcelFile(Constant.Path_TestData
							+ Constant.File_TestData, "NC");
					deductibleDiscountFactor = ExcelUtils.getCellData(181, 1);

				}
				if (rcvORacv.equals("ACV") && deductibleAmount.equals("2500")) {
					ExcelUtils.setExcelFile(Constant.Path_TestData
							+ Constant.File_TestData, "NC");
					deductibleDiscountFactor = ExcelUtils.getCellData(182, 1);
				}
				if (rcvORacv.equals("ACV") && deductibleAmount.equals("3000")) {
					ExcelUtils.setExcelFile(Constant.Path_TestData
							+ Constant.File_TestData, "NC");
					deductibleDiscountFactor = ExcelUtils.getCellData(183, 1);
				}
				if (rcvORacv.equals("RCV") && deductibleAmount.equals("1000")) {
					ExcelUtils.setExcelFile(Constant.Path_TestData
							+ Constant.File_TestData, "NC");
					deductibleDiscountFactor = "0";
				}
				if (rcvORacv.equals("RCV") && deductibleAmount.equals("1500")) {
					ExcelUtils.setExcelFile(Constant.Path_TestData
							+ Constant.File_TestData, "NC");
					deductibleDiscountFactor = ExcelUtils.getCellData(179, 5);
				}
				if (rcvORacv.equals("RCV") && deductibleAmount.equals("2000")) {

					ExcelUtils.setExcelFile(Constant.Path_TestData
							+ Constant.File_TestData, "NC");
					deductibleDiscountFactor = ExcelUtils.getCellData(180, 5);

				}
				if (rcvORacv.equals("RCV") && deductibleAmount.equals("2500")) {
					ExcelUtils.setExcelFile(Constant.Path_TestData
							+ Constant.File_TestData, "NC");
					deductibleDiscountFactor = ExcelUtils.getCellData(181, 5);
				}
				if (rcvORacv.equals("RCV") && deductibleAmount.equals("3000")) {
					ExcelUtils.setExcelFile(Constant.Path_TestData
							+ Constant.File_TestData, "NC");
					deductibleDiscountFactor = ExcelUtils.getCellData(182, 5);
				}
			}
			if (!teirOneCountiesListNC.contains(County.toUpperCase())
					&& !teirTwoCountiesListNC.contains(County.toUpperCase())) {
				if (rcvORacv.equals("ACV") && deductibleAmount.equals("1000")) {
					ExcelUtils.setExcelFile(Constant.Path_TestData
							+ Constant.File_TestData, "NC");
					deductibleDiscountFactor = ExcelUtils.getCellData(179, 1);
				}
				if (rcvORacv.equals("ACV") && deductibleAmount.equals("1500")) {
					ExcelUtils.setExcelFile(Constant.Path_TestData
							+ Constant.File_TestData, "NC");
					deductibleDiscountFactor = ExcelUtils.getCellData(180, 1);
				}
				if (rcvORacv.equals("ACV") && deductibleAmount.equals("2000")) {
					ExcelUtils.setExcelFile(Constant.Path_TestData
							+ Constant.File_TestData, "NC");
					deductibleDiscountFactor = ExcelUtils.getCellData(181, 1);

				}
				if (rcvORacv.equals("ACV") && deductibleAmount.equals("2500")) {
					ExcelUtils.setExcelFile(Constant.Path_TestData
							+ Constant.File_TestData, "NC");
					deductibleDiscountFactor = ExcelUtils.getCellData(182, 1);
				}
				if (rcvORacv.equals("ACV") && deductibleAmount.equals("3000")) {
					ExcelUtils.setExcelFile(Constant.Path_TestData
							+ Constant.File_TestData, "NC");
					deductibleDiscountFactor = ExcelUtils.getCellData(183, 1);
				}
				if (rcvORacv.equals("RCV") && deductibleAmount.equals("1000")) {
					ExcelUtils.setExcelFile(Constant.Path_TestData
							+ Constant.File_TestData, "NC");
					deductibleDiscountFactor = ExcelUtils.getCellData(191, 1);
				}
				if (rcvORacv.equals("RCV") && deductibleAmount.equals("1500")) {
					ExcelUtils.setExcelFile(Constant.Path_TestData
							+ Constant.File_TestData, "NC");
					deductibleDiscountFactor = ExcelUtils.getCellData(192, 1);
				}
				if (rcvORacv.equals("RCV") && deductibleAmount.equals("2000")) {

					ExcelUtils.setExcelFile(Constant.Path_TestData
							+ Constant.File_TestData, "NC");
					deductibleDiscountFactor = ExcelUtils.getCellData(193, 1);

				}
				if (rcvORacv.equals("RCV") && deductibleAmount.equals("2500")) {
					ExcelUtils.setExcelFile(Constant.Path_TestData
							+ Constant.File_TestData, "NC");
					deductibleDiscountFactor = ExcelUtils.getCellData(194, 1);
				}
				if (rcvORacv.equals("RCV") && deductibleAmount.equals("3000")) {
					ExcelUtils.setExcelFile(Constant.Path_TestData
							+ Constant.File_TestData, "NC");
					deductibleDiscountFactor = ExcelUtils.getCellData(195, 1);
				}

			}
		} else if (State.equals("GA")) {

			if (teirOneCountiesListGA.contains(County.toUpperCase())
					|| teirTwoCountiesListGA.contains(County.toUpperCase())) {

				if (rcvORacv.equals("ACV") && deductibleAmount.equals("1000")) {
					ExcelUtils.setExcelFile(Constant.Path_TestData
							+ Constant.File_TestData, "GA");
					deductibleDiscountFactor = ExcelUtils.getCellData(180, 1);
				}
				if (rcvORacv.equals("ACV") && deductibleAmount.equals("1500")) {
					ExcelUtils.setExcelFile(Constant.Path_TestData
							+ Constant.File_TestData, "GA");
					deductibleDiscountFactor = ExcelUtils.getCellData(181, 1);

				}
				if (rcvORacv.equals("ACV") && deductibleAmount.equals("2000")) {
					ExcelUtils.setExcelFile(Constant.Path_TestData
							+ Constant.File_TestData, "GA");
					deductibleDiscountFactor = ExcelUtils.getCellData(182, 1);

				}
				if (rcvORacv.equals("ACV") && deductibleAmount.equals("2500")) {
					ExcelUtils.setExcelFile(Constant.Path_TestData
							+ Constant.File_TestData, "GA");
					deductibleDiscountFactor = ExcelUtils.getCellData(183, 1);
				}
				if (rcvORacv.equals("ACV") && deductibleAmount.equals("3000")) {
					ExcelUtils.setExcelFile(Constant.Path_TestData
							+ Constant.File_TestData, "GA");
					deductibleDiscountFactor = ExcelUtils.getCellData(184, 1);
				}
				if (rcvORacv.equals("RCV") && deductibleAmount.equals("1000")) {
					ExcelUtils.setExcelFile(Constant.Path_TestData
							+ Constant.File_TestData, "GA");
					deductibleDiscountFactor = "0";
				}
				if (rcvORacv.equals("RCV") && deductibleAmount.equals("1500")) {
					ExcelUtils.setExcelFile(Constant.Path_TestData
							+ Constant.File_TestData, "GA");
					deductibleDiscountFactor = ExcelUtils.getCellData(180, 5);
				}
				if (rcvORacv.equals("RCV") && deductibleAmount.equals("2000")) {
					ExcelUtils.setExcelFile(Constant.Path_TestData
							+ Constant.File_TestData, "GA");
					deductibleDiscountFactor = ExcelUtils.getCellData(181, 5);

				}
				if (rcvORacv.equals("RCV") && deductibleAmount.equals("2500")) {
					ExcelUtils.setExcelFile(Constant.Path_TestData
							+ Constant.File_TestData, "GA");
					deductibleDiscountFactor = ExcelUtils.getCellData(182, 5);
				}
				if (rcvORacv.equals("RCV") && deductibleAmount.equals("3000")) {
					ExcelUtils.setExcelFile(Constant.Path_TestData
							+ Constant.File_TestData, "GA");
					deductibleDiscountFactor = ExcelUtils.getCellData(183, 5);
				}
			}
			if (!teirOneCountiesListGA.contains(County.toUpperCase())
					&& !teirTwoCountiesListGA.contains(County.toUpperCase())) {

				if (rcvORacv.equals("ACV") && deductibleAmount.equals("1000")) {
					ExcelUtils.setExcelFile(Constant.Path_TestData
							+ Constant.File_TestData, "GA");
					deductibleDiscountFactor = ExcelUtils.getCellData(180, 1);
				}
				if (rcvORacv.equals("ACV") && deductibleAmount.equals("1500")) {
					ExcelUtils.setExcelFile(Constant.Path_TestData
							+ Constant.File_TestData, "GA");
					deductibleDiscountFactor = ExcelUtils.getCellData(181, 1);
				}
				if (rcvORacv.equals("ACV") && deductibleAmount.equals("2000")) {
					ExcelUtils.setExcelFile(Constant.Path_TestData
							+ Constant.File_TestData, "GA");
					deductibleDiscountFactor = ExcelUtils.getCellData(182, 1);

				}
				if (rcvORacv.equals("ACV") && deductibleAmount.equals("2500")) {
					ExcelUtils.setExcelFile(Constant.Path_TestData
							+ Constant.File_TestData, "GA");
					deductibleDiscountFactor = ExcelUtils.getCellData(183, 1);
				}
				if (rcvORacv.equals("ACV") && deductibleAmount.equals("3000")) {
					ExcelUtils.setExcelFile(Constant.Path_TestData
							+ Constant.File_TestData, "GA");
					deductibleDiscountFactor = ExcelUtils.getCellData(184, 1);
				}
				if (rcvORacv.equals("RCV") && deductibleAmount.equals("1000")) {
					ExcelUtils.setExcelFile(Constant.Path_TestData
							+ Constant.File_TestData, "GA");
					deductibleDiscountFactor = ExcelUtils.getCellData(189, 1);
				}
				if (rcvORacv.equals("RCV") && deductibleAmount.equals("1500")) {
					ExcelUtils.setExcelFile(Constant.Path_TestData
							+ Constant.File_TestData, "GA");
					deductibleDiscountFactor = ExcelUtils.getCellData(190, 1);
				}
				if (rcvORacv.equals("RCV") && deductibleAmount.equals("2000")) {
					ExcelUtils.setExcelFile(Constant.Path_TestData
							+ Constant.File_TestData, "GA");
					deductibleDiscountFactor = ExcelUtils.getCellData(191, 1);

				}
				if (rcvORacv.equals("RCV") && deductibleAmount.equals("2500")) {
					ExcelUtils.setExcelFile(Constant.Path_TestData
							+ Constant.File_TestData, "GA");
					deductibleDiscountFactor = ExcelUtils.getCellData(192, 1);
				}
				if (rcvORacv.equals("RCV") && deductibleAmount.equals("3000")) {
					ExcelUtils.setExcelFile(Constant.Path_TestData
							+ Constant.File_TestData, "GA");
					deductibleDiscountFactor = ExcelUtils.getCellData(193, 1);
				}
			}
		}

		return deductibleDiscountFactor;

	}

	// Getting Wind Deductible discount factors
	private static String returnWindDeductibleDiscountFactors(int row_num)
			throws NumberFormatException, ParserConfigurationException,
			SAXException, IOException {
		ExcelUtils.setExcelFile(
				Constant.Path_TestData + Constant.File_TestData, "Rater");
		String State = ExcelUtils.getCellData(row_num, 0);
		String WindOpted = ExcelUtils.getCellData(row_num, 22);
		String WindLimit = ExcelUtils.getCellData(row_num, 23);
		String DwellingAmount = ExcelUtils.getCellData(row_num, 2);
		String County = ExcelUtils.getCellData(row_num, 1);
		String returnFactors = null;

		if (State.equals("NC")) {
			if (teirOneCountiesListNC.contains(County.toUpperCase())
					|| teirTwoCountiesListNC.contains(County.toUpperCase())) {
				if (WindOpted.equals("Y")) {
					if (WindLimit.equals("1")
							&& (Integer.valueOf(DwellingAmount) * 1 / 100) >= 1501) {
						ExcelUtils.setExcelFile(Constant.Path_TestData
								+ Constant.File_TestData, "NC");
						returnFactors = ExcelUtils.getCellData(90, 11);
					}
					if (WindLimit.equals("2")
							&& (Integer.valueOf(DwellingAmount) * 2 / 100) >= 1501) {
						ExcelUtils.setExcelFile(Constant.Path_TestData
								+ Constant.File_TestData, "NC");
						returnFactors = ExcelUtils.getCellData(91, 11);
					}
					if (WindLimit.equals("3")
							&& (Integer.valueOf(DwellingAmount) * 3 / 100) >= 1501) {
						ExcelUtils.setExcelFile(Constant.Path_TestData
								+ Constant.File_TestData, "NC");
						returnFactors = ExcelUtils.getCellData(92, 11);
					}
					if (WindLimit.equals("5")
							&& (Integer.valueOf(DwellingAmount) * 5 / 100) >= 1501) {
						ExcelUtils.setExcelFile(Constant.Path_TestData
								+ Constant.File_TestData, "NC");
						returnFactors = ExcelUtils.getCellData(93, 11);
					}

				} else {
					returnFactors = "1";
				}
			} else if (!teirOneCountiesListNC.contains(County.toUpperCase())
					&& !teirTwoCountiesListNC.contains(County.toUpperCase())) {
				returnFactors = "1";
			}

		} else if (State.equals("GA")) {
			if (teirOneCountiesListGA.contains(County.toUpperCase())
					|| teirTwoCountiesListGA.contains(County.toUpperCase())) {
				if (WindOpted.equals("Y")) {
					if (WindLimit.equals("1")
							&& (Integer.valueOf(DwellingAmount) * 1 / 100) >= 1501) {
						ExcelUtils.setExcelFile(Constant.Path_TestData
								+ Constant.File_TestData, "GA");
						returnFactors = ExcelUtils.getCellData(84, 2);
					}
					if (WindLimit.equals("2")
							&& (Integer.valueOf(DwellingAmount) * 2 / 100) >= 1501) {
						ExcelUtils.setExcelFile(Constant.Path_TestData
								+ Constant.File_TestData, "GA");
						returnFactors = ExcelUtils.getCellData(85, 2);
					}
					if (WindLimit.equals("3")
							&& (Integer.valueOf(DwellingAmount) * 3 / 100) >= 1501) {
						ExcelUtils.setExcelFile(Constant.Path_TestData
								+ Constant.File_TestData, "GA");
						returnFactors = ExcelUtils.getCellData(86, 2);
					}
					if (WindLimit.equals("5")
							&& (Integer.valueOf(DwellingAmount) * 5 / 100) >= 1501) {
						ExcelUtils.setExcelFile(Constant.Path_TestData
								+ Constant.File_TestData, "GA");
						returnFactors = ExcelUtils.getCellData(87, 2);
					}
				} else {
					returnFactors = "1";
				}
			} else if (!teirOneCountiesListGA.contains(County.toUpperCase())
					&& !teirTwoCountiesListGA.contains(County.toUpperCase())) {

				returnFactors = "1";
			}

		}

		return returnFactors;

	}

	// getting factor of new home Age
	public static String returnHomeAgeDiscount(int row_num)
			throws NumberFormatException, ParserConfigurationException,
			SAXException, IOException {

		ExcelUtils.setExcelFile(
				Constant.Path_TestData + Constant.File_TestData, "Rater");
		String State = ExcelUtils.getCellData(row_num, 0);
		String constructionType = ExcelUtils.getCellData(row_num, 16);
		String homeAge = ExcelUtils.getCellData(row_num, 15);

		String returnHomeAgeDiscount = null;

		if (State.equals("NC")) {
			if (constructionType.equals("Frame/Stucco")) {
				if (Integer.valueOf(homeAge) >= 2014) {
					ExcelUtils.setExcelFile(Constant.Path_TestData
							+ Constant.File_TestData, "NC");
					returnHomeAgeDiscount = ExcelUtils.getCellData(33, 2);
				}
				if (Integer.valueOf(homeAge) >= 2011
						&& Integer.valueOf(homeAge) <= 2013) {
					ExcelUtils.setExcelFile(Constant.Path_TestData
							+ Constant.File_TestData, "NC");
					returnHomeAgeDiscount = ExcelUtils.getCellData(34, 2);
				}
				if (Integer.valueOf(homeAge) >= 2005
						&& Integer.valueOf(homeAge) <= 2010) {
					ExcelUtils.setExcelFile(Constant.Path_TestData
							+ Constant.File_TestData, "NC");
					returnHomeAgeDiscount = ExcelUtils.getCellData(35, 2);
				}
				if (Integer.valueOf(homeAge) >= 1997
						&& Integer.valueOf(homeAge) <= 2004) {
					ExcelUtils.setExcelFile(Constant.Path_TestData
							+ Constant.File_TestData, "NC");
					returnHomeAgeDiscount = ExcelUtils.getCellData(36, 2);
				}
				if (Integer.valueOf(homeAge) >= 1985
						&& Integer.valueOf(homeAge) <= 1996) {
					ExcelUtils.setExcelFile(Constant.Path_TestData
							+ Constant.File_TestData, "NC");
					returnHomeAgeDiscount = ExcelUtils.getCellData(37, 2);
				}
				if (Integer.valueOf(homeAge) >= 1967
						&& Integer.valueOf(homeAge) <= 1984) {
					ExcelUtils.setExcelFile(Constant.Path_TestData
							+ Constant.File_TestData, "NC");
					returnHomeAgeDiscount = ExcelUtils.getCellData(38, 2);
				}
			} else if (constructionType.equals("Masonry Veneer")) {
				if (Integer.valueOf(homeAge) >= 2014) {
					ExcelUtils.setExcelFile(Constant.Path_TestData
							+ Constant.File_TestData, "NC");
					returnHomeAgeDiscount = ExcelUtils.getCellData(33, 6);
				}
				if (Integer.valueOf(homeAge) >= 2011
						&& Integer.valueOf(homeAge) <= 2013) {
					ExcelUtils.setExcelFile(Constant.Path_TestData
							+ Constant.File_TestData, "NC");
					returnHomeAgeDiscount = ExcelUtils.getCellData(34, 6);
				}
				if (Integer.valueOf(homeAge) >= 2005
						&& Integer.valueOf(homeAge) <= 2010) {
					ExcelUtils.setExcelFile(Constant.Path_TestData
							+ Constant.File_TestData, "NC");
					returnHomeAgeDiscount = ExcelUtils.getCellData(35, 6);
				}
				if (Integer.valueOf(homeAge) >= 1997
						&& Integer.valueOf(homeAge) <= 2004) {
					ExcelUtils.setExcelFile(Constant.Path_TestData
							+ Constant.File_TestData, "NC");
					returnHomeAgeDiscount = ExcelUtils.getCellData(36, 6);
				}
				if (Integer.valueOf(homeAge) >= 1985
						&& Integer.valueOf(homeAge) <= 1996) {
					ExcelUtils.setExcelFile(Constant.Path_TestData
							+ Constant.File_TestData, "NC");
					returnHomeAgeDiscount = ExcelUtils.getCellData(37, 6);
				}
				if (Integer.valueOf(homeAge) >= 1967
						&& Integer.valueOf(homeAge) <= 1984) {
					ExcelUtils.setExcelFile(Constant.Path_TestData
							+ Constant.File_TestData, "NC");
					returnHomeAgeDiscount = ExcelUtils.getCellData(38, 6);
				}
			} else if (constructionType.equals("Masonry")) {
				if (Integer.valueOf(homeAge) >= 2014) {
					ExcelUtils.setExcelFile(Constant.Path_TestData
							+ Constant.File_TestData, "NC");
					returnHomeAgeDiscount = ExcelUtils.getCellData(33, 10);
				}
				if (Integer.valueOf(homeAge) >= 2011
						&& Integer.valueOf(homeAge) <= 2013) {
					ExcelUtils.setExcelFile(Constant.Path_TestData
							+ Constant.File_TestData, "NC");
					returnHomeAgeDiscount = ExcelUtils.getCellData(34, 10);
				}
				if (Integer.valueOf(homeAge) >= 2005
						&& Integer.valueOf(homeAge) <= 2010) {
					ExcelUtils.setExcelFile(Constant.Path_TestData
							+ Constant.File_TestData, "NC");
					returnHomeAgeDiscount = ExcelUtils.getCellData(35, 10);
				}
				if (Integer.valueOf(homeAge) >= 1997
						&& Integer.valueOf(homeAge) <= 2004) {
					ExcelUtils.setExcelFile(Constant.Path_TestData
							+ Constant.File_TestData, "NC");
					returnHomeAgeDiscount = ExcelUtils.getCellData(36, 10);
				}
				if (Integer.valueOf(homeAge) >= 1985
						&& Integer.valueOf(homeAge) <= 1996) {
					ExcelUtils.setExcelFile(Constant.Path_TestData
							+ Constant.File_TestData, "NC");
					returnHomeAgeDiscount = ExcelUtils.getCellData(37, 10);
				}
				if (Integer.valueOf(homeAge) >= 1967
						&& Integer.valueOf(homeAge) <= 1984) {
					ExcelUtils.setExcelFile(Constant.Path_TestData
							+ Constant.File_TestData, "NC");
					returnHomeAgeDiscount = ExcelUtils.getCellData(38, 10);
				}
			}
		} else if (State.equals("GA")) {
			if (constructionType.equals("Frame/Stucco")) {
				if (Integer.valueOf(homeAge) >= 2014) {
					ExcelUtils.setExcelFile(Constant.Path_TestData
							+ Constant.File_TestData, "GA");
					returnHomeAgeDiscount = ExcelUtils.getCellData(33, 2);
				}
				if (Integer.valueOf(homeAge) >= 2011
						&& Integer.valueOf(homeAge) <= 2013) {
					ExcelUtils.setExcelFile(Constant.Path_TestData
							+ Constant.File_TestData, "GA");
					returnHomeAgeDiscount = ExcelUtils.getCellData(34, 2);
				}
				if (Integer.valueOf(homeAge) >= 2005
						&& Integer.valueOf(homeAge) <= 2010) {
					ExcelUtils.setExcelFile(Constant.Path_TestData
							+ Constant.File_TestData, "GA");
					returnHomeAgeDiscount = ExcelUtils.getCellData(35, 2);
				}
				if (Integer.valueOf(homeAge) >= 1997
						&& Integer.valueOf(homeAge) <= 2004) {
					ExcelUtils.setExcelFile(Constant.Path_TestData
							+ Constant.File_TestData, "GA");
					returnHomeAgeDiscount = ExcelUtils.getCellData(36, 2);
				}
				if (Integer.valueOf(homeAge) >= 1985
						&& Integer.valueOf(homeAge) <= 1996) {
					ExcelUtils.setExcelFile(Constant.Path_TestData
							+ Constant.File_TestData, "GA");
					returnHomeAgeDiscount = ExcelUtils.getCellData(37, 2);
				}
				if (Integer.valueOf(homeAge) >= 1967
						&& Integer.valueOf(homeAge) <= 1984) {
					ExcelUtils.setExcelFile(Constant.Path_TestData
							+ Constant.File_TestData, "GA");
					returnHomeAgeDiscount = ExcelUtils.getCellData(38, 2);
				}
			} else if (constructionType.equals("Masonry Veneer")) {
				if (Integer.valueOf(homeAge) >= 2014) {
					ExcelUtils.setExcelFile(Constant.Path_TestData
							+ Constant.File_TestData, "GA");
					returnHomeAgeDiscount = ExcelUtils.getCellData(33, 6);
				}
				if (Integer.valueOf(homeAge) >= 2011
						&& Integer.valueOf(homeAge) <= 2013) {
					ExcelUtils.setExcelFile(Constant.Path_TestData
							+ Constant.File_TestData, "GA");
					returnHomeAgeDiscount = ExcelUtils.getCellData(34, 6);
				}
				if (Integer.valueOf(homeAge) >= 2005
						&& Integer.valueOf(homeAge) <= 2010) {
					ExcelUtils.setExcelFile(Constant.Path_TestData
							+ Constant.File_TestData, "GA");
					returnHomeAgeDiscount = ExcelUtils.getCellData(35, 6);
				}
				if (Integer.valueOf(homeAge) >= 1997
						&& Integer.valueOf(homeAge) <= 2004) {
					ExcelUtils.setExcelFile(Constant.Path_TestData
							+ Constant.File_TestData, "GA");
					returnHomeAgeDiscount = ExcelUtils.getCellData(36, 6);
				}
				if (Integer.valueOf(homeAge) >= 1985
						&& Integer.valueOf(homeAge) <= 1996) {
					ExcelUtils.setExcelFile(Constant.Path_TestData
							+ Constant.File_TestData, "GA");
					returnHomeAgeDiscount = ExcelUtils.getCellData(37, 6);
				}
				if (Integer.valueOf(homeAge) >= 1967
						&& Integer.valueOf(homeAge) <= 1984) {
					ExcelUtils.setExcelFile(Constant.Path_TestData
							+ Constant.File_TestData, "GA");
					returnHomeAgeDiscount = ExcelUtils.getCellData(38, 6);
				}
			} else if (constructionType.equals("Masonry")) {
				if (Integer.valueOf(homeAge) >= 2014) {
					ExcelUtils.setExcelFile(Constant.Path_TestData
							+ Constant.File_TestData, "GA");
					returnHomeAgeDiscount = ExcelUtils.getCellData(33, 10);
				}
				if (Integer.valueOf(homeAge) >= 2011
						&& Integer.valueOf(homeAge) <= 2013) {
					ExcelUtils.setExcelFile(Constant.Path_TestData
							+ Constant.File_TestData, "GA");
					returnHomeAgeDiscount = ExcelUtils.getCellData(34, 10);
				}
				if (Integer.valueOf(homeAge) >= 2005
						&& Integer.valueOf(homeAge) <= 2010) {
					ExcelUtils.setExcelFile(Constant.Path_TestData
							+ Constant.File_TestData, "GA");
					returnHomeAgeDiscount = ExcelUtils.getCellData(35, 10);
				}
				if (Integer.valueOf(homeAge) >= 1997
						&& Integer.valueOf(homeAge) <= 2004) {
					ExcelUtils.setExcelFile(Constant.Path_TestData
							+ Constant.File_TestData, "GA");
					returnHomeAgeDiscount = ExcelUtils.getCellData(36, 10);
				}
				if (Integer.valueOf(homeAge) >= 1985
						&& Integer.valueOf(homeAge) <= 1996) {
					ExcelUtils.setExcelFile(Constant.Path_TestData
							+ Constant.File_TestData, "GA");
					returnHomeAgeDiscount = ExcelUtils.getCellData(37, 10);
				}
				if (Integer.valueOf(homeAge) >= 1967
						&& Integer.valueOf(homeAge) <= 1984) {
					ExcelUtils.setExcelFile(Constant.Path_TestData
							+ Constant.File_TestData, "GA");
					returnHomeAgeDiscount = ExcelUtils.getCellData(38, 10);
				}
			}
		}
		return returnHomeAgeDiscount;

	}

	// Getting Claim factors
	private static String returnClaimFactors(int row_num) {

		ExcelUtils.setExcelFile(
				Constant.Path_TestData + Constant.File_TestData, "Rater");
		String State = ExcelUtils.getCellData(row_num, 0);
		String noOfClaims = ExcelUtils.getCellData(row_num, 4);

		String claimsFactor = null;
		if (State.equals("NC")) {
			if (noOfClaims.equals("0")) {
				ExcelUtils.setExcelFile(Constant.Path_TestData
						+ Constant.File_TestData, "NC");
				claimsFactor = ExcelUtils.getCellData(44, 1);
			}
			if (noOfClaims.equals("1")) {
				ExcelUtils.setExcelFile(Constant.Path_TestData
						+ Constant.File_TestData, "NC");
				claimsFactor = ExcelUtils.getCellData(45, 1);
			}
			if (noOfClaims.equals("2")) {
				ExcelUtils.setExcelFile(Constant.Path_TestData
						+ Constant.File_TestData, "NC");
				claimsFactor = ExcelUtils.getCellData(46, 1);
			}
			if (noOfClaims.equals("3")) {
				ExcelUtils.setExcelFile(Constant.Path_TestData
						+ Constant.File_TestData, "NC");
				claimsFactor = ExcelUtils.getCellData(47, 1);
			}
		} else if (State.equals("GA")) {
			if (noOfClaims.equals("0")) {
				ExcelUtils.setExcelFile(Constant.Path_TestData
						+ Constant.File_TestData, "GA");
				claimsFactor = ExcelUtils.getCellData(44, 1);
			}
			if (noOfClaims.equals("1")) {
				ExcelUtils.setExcelFile(Constant.Path_TestData
						+ Constant.File_TestData, "GA");
				claimsFactor = ExcelUtils.getCellData(45, 1);
			}
			if (noOfClaims.equals("2")) {
				ExcelUtils.setExcelFile(Constant.Path_TestData
						+ Constant.File_TestData, "GA");
				claimsFactor = ExcelUtils.getCellData(46, 1);
			}
			if (noOfClaims.equals("3")) {
				ExcelUtils.setExcelFile(Constant.Path_TestData
						+ Constant.File_TestData, "GA");
				claimsFactor = ExcelUtils.getCellData(47, 1);
			}
		}
		return claimsFactor;

	}

	// getting Personnal property factor
	private static String personalPropertyFactor(int row_num) {

		ExcelUtils.setExcelFile(
				Constant.Path_TestData + Constant.File_TestData, "Rater");
		String State = ExcelUtils.getCellData(row_num, 0);
		String personalPropery = ExcelUtils.getCellData(row_num, 21);

		String personalPropertyFactor = null;

		if (State.equals("NC")) {
			if (personalPropery.equals("35")) {
				personalPropertyFactor = "0.85";
			}
			if (personalPropery.equals("40")) {
				personalPropertyFactor = "0.90";
			}
			if (personalPropery.equals("45")) {
				personalPropertyFactor = "0.95";
			}
			if (personalPropery.equals("50")) {
				personalPropertyFactor = "1.00";
			}
		} else if (State.equals("GA")) {
			if (personalPropery.equals("35")) {
				personalPropertyFactor = "0.85";
			}
			if (personalPropery.equals("40")) {
				personalPropertyFactor = "0.90";
			}
			if (personalPropery.equals("45")) {
				personalPropertyFactor = "0.95";
			}
			if (personalPropery.equals("50")) {
				personalPropertyFactor = "1.00";
			}
		}

		return personalPropertyFactor;

	}
}

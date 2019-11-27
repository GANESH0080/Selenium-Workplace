package RaterPackage;

import java.io.File;
import java.io.IOException;
import java.io.StringReader;

import org.apache.commons.io.FileUtils;

import org.w3c.dom.*;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import javax.xml.parsers.*;
import javax.xml.transform.TransformerException;

public class XmlParser {

	public static String CreateRaterRequestXml(RaterRequest raterRequest) throws Exception {
		File inputFile = new File("D:\\SeleniumWorkspace\\PPERaterGanesh\\src\\TestingXML.xml");

		@SuppressWarnings("deprecation")
		String requestXml = FileUtils.readFileToString(inputFile);

		// System.out.println(requestXml);
		requestXml = requestXml.replace("#LoginName#", raterRequest.SignIn.LoginName);
		requestXml = requestXml.replace("#Password#", raterRequest.SignIn.Password);
		requestXml = requestXml.replace("#RequestVersion#", raterRequest.SignIn.RequestVersion);
		requestXml = requestXml.replace("#RaterVersion#", raterRequest.SignIn.RaterVersion);
		requestXml = requestXml.replace("#RulesVersion#", raterRequest.SignIn.RulesVersion);
		requestXml = requestXml.replace("#ReferenceQuoteId#", raterRequest.SignIn.ReferenceQuoteId);
		requestXml = requestXml.replace("#ShowPremium#", raterRequest.SignIn.ShowPremium);
		requestXml = requestXml.replace("#ShowDeductibles#", raterRequest.SignIn.ShowDeductibles);
		requestXml = requestXml.replace("#ShowDesc#", raterRequest.SignIn.ShowDesc);
		requestXml = requestXml.replace("#ShowResult#", raterRequest.SignIn.ShowResult);
		requestXml = requestXml.replace("#ShowSteps#", raterRequest.SignIn.ShowSteps);
		requestXml = requestXml.replace("#ShowVar#", raterRequest.SignIn.ShowVar);
		requestXml = requestXml.replace("#ShowRateBasis#", raterRequest.SignIn.ShowRateBasis);
		requestXml = requestXml.replace("#ShowPremiumSteps#", raterRequest.SignIn.ShowPremiumSteps);
		requestXml = requestXml.replace("#RulesState#", raterRequest.SignIn.RulesState);
		requestXml = requestXml.replace("#RaterUrl#", raterRequest.SignIn.RaterUrl);
		requestXml = requestXml.replace("#ProductCode#", raterRequest.SignIn.ProductCode);
		requestXml = requestXml.replace("#CoverHolder#", raterRequest.SignIn.CoverHolder);
		
		// rater parameters
		requestXml = requestXml.replace("#State#", raterRequest.RaterParameter.State);
		requestXml = requestXml.replace("#County#", raterRequest.RaterParameter.County);
		requestXml = requestXml.replace("#InsuranceAmount#", raterRequest.RaterParameter.InsuranceAmount);
		requestXml = requestXml.replace("#ProtectionClass#", raterRequest.RaterParameter.ProtectionClass);
		requestXml = requestXml.replace("#NoofClaims#", raterRequest.RaterParameter.NoofClaims);
		requestXml = requestXml.replace("#LossType#", raterRequest.RaterParameter.LossType);
		requestXml = requestXml.replace("#LossAmount#", raterRequest.RaterParameter.LossAmount);
		requestXml = requestXml.replace("#InsuredAge#", raterRequest.RaterParameter.InsuredAge);
		requestXml = requestXml.replace("#DeductibleType#", raterRequest.RaterParameter.DeductibleType);
		requestXml = requestXml.replace("#DeductibleAmount#", raterRequest.RaterParameter.DeductibleAmount);
		requestXml = requestXml.replace("#ExtReplacementCost#", raterRequest.RaterParameter.ExtReplacementCost);
		requestXml = requestXml.replace("#BurglaryAlarm#", raterRequest.RaterParameter.BurglaryAlarm);
		requestXml = requestXml.replace("#BurglaryAlarmType#", raterRequest.RaterParameter.BurglaryAlarmType);
		requestXml = requestXml.replace("#SmokeDetectors#", raterRequest.RaterParameter.SmokeDetector);
		requestXml = requestXml.replace("#Deadbolt#", raterRequest.RaterParameter.Deadbolt);
		requestXml = requestXml.replace("#HomeAge#", raterRequest.RaterParameter.HomeAge);
		requestXml = requestXml.replace("#ContructionType#", raterRequest.RaterParameter.ContructionType);
		requestXml = requestXml.replace("#PersonalLiability#", raterRequest.RaterParameter.PersonalLiability);
		requestXml = requestXml.replace("#HeatingDevice#", raterRequest.RaterParameter.HeatingDevice);
		requestXml = requestXml.replace("#HeatingDeviceType#", raterRequest.RaterParameter.HeatingDeviceType);
		requestXml = requestXml.replace("#OtherStructure#", raterRequest.RaterParameter.OtherStructure);
		requestXml = requestXml.replace("#PersonalProperty#", raterRequest.RaterParameter.PersonalProperty);
		requestXml = requestXml.replace("#WindCoverage#", raterRequest.RaterParameter.WindCoverage);
		requestXml = requestXml.replace("#WindCoverageLimit#", raterRequest.RaterParameter.WindLimit);
		requestXml = requestXml.replace("#Address#", raterRequest.RaterParameter.Address);
		requestXml = requestXml.replace("#WaterBackup#", raterRequest.RaterParameter.WaterBackup);

		System.out.println(requestXml);

		return requestXml;

	}
	
	public static RaterResponse parseXMlResponse(String xmlResponse)
			throws ParserConfigurationException, TransformerException {

		RaterResponse RaterResponse = new RaterResponse();
		try {

			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = factory.newDocumentBuilder();

			Document document = builder.parse(new InputSource(new StringReader(xmlResponse)));

			// Normalize the XML Structure; It's just too important !!
			document.getDocumentElement().normalize();

			// Here comes the root node
			Element root = document.getDocumentElement();
			System.out.println(root.getNodeName());

			// Get all employees
			NodeList nList = document.getElementsByTagName("Premium");

			System.out.println("============================");

			RaterResponse.TotalPremium = nList.item(0).getTextContent();
			System.out.println("Total Premium " + RaterResponse.TotalPremium);

			for (int temp = 0; temp < nList.getLength(); temp++) {
				Node node = nList.item(temp);
				System.out.println(""); // Just a separator
				if (node.getNodeType() == Node.ELEMENT_NODE) {
					// Print each employee's detail
					Element eElement = (Element) node;

					RaterResponse.BasicPremium = eElement.getAttribute("BasicPremium");
					RaterResponse.Surcharge = eElement.getAttribute("Surcharge");
					RaterResponse.Discount = eElement.getAttribute("Discount");

					System.out.println("BasicPremium " + RaterResponse.BasicPremium);
					System.out.println("Surcharge " + RaterResponse.Surcharge);
					System.out.println("Discount " + RaterResponse.Discount);

				}
			}

		} catch (SAXException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return RaterResponse;
	}

}

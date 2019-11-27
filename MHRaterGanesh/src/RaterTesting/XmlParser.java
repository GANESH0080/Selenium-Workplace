package RaterTesting;

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
		File inputFile = new File("D:\\SeleniumWorkspace\\MHRaterGanesh\\MHTestingXML.xml");

		String requestXml = FileUtils.readFileToString(inputFile);

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
		//requestXml = requestXml.replace("#ShowDiscounts#", raterRequest.SignIn.ShowDiscounts);
		requestXml = requestXml.replace("#ProductCode#", raterRequest.SignIn.ProductCode);
		requestXml = requestXml.replace("#RulesState#", raterRequest.SignIn.RulesState);
		
		
		requestXml = requestXml.replace("#State#", raterRequest.RaterParameter.State);

		requestXml = requestXml.replace("#UnitType#", raterRequest.RaterParameter.UnitType);
		requestXml = requestXml.replace("#InsureAge#", raterRequest.RaterParameter.InsureAge);
		requestXml = requestXml.replace("#Zipcode#", raterRequest.RaterParameter.Zipcode);
		requestXml = requestXml.replace("#County#", raterRequest.RaterParameter.County);
		requestXml = requestXml.replace("#HomeAge#", raterRequest.RaterParameter.HomeAge);
		requestXml = requestXml.replace("#MHValue#", raterRequest.RaterParameter.MHValue);
		requestXml = requestXml.replace("#InPark#", raterRequest.RaterParameter.InPark);
		requestXml = requestXml.replace("#Territory#", raterRequest.RaterParameter.Territory);
		requestXml = requestXml.replace("#Deductible#", raterRequest.RaterParameter.Deductible);
		requestXml = requestXml.replace("#SupplemetalHeating#", raterRequest.RaterParameter.SupplemetalHeating);
		requestXml = requestXml.replace("#FloodEndorsement#", raterRequest.RaterParameter.FloodEndorsement);
		requestXml = requestXml.replace("#VendorSingle#", raterRequest.RaterParameter.VendorSingle);
		requestXml = requestXml.replace("#CPL#", raterRequest.RaterParameter.CPL);
		requestXml = requestXml.replace("#RenDiscount#", raterRequest.RaterParameter.RenDiscount);
		requestXml = requestXml.replace("#ATDiscount#", raterRequest.RaterParameter.ATDiscount);
		requestXml = requestXml.replace("#AODiscount#", raterRequest.RaterParameter.AODiscount);
		requestXml = requestXml.replace("#PDDiscount#", raterRequest.RaterParameter.PDDiscount);
		requestXml = requestXml.replace("#NewMHDiscount#", raterRequest.RaterParameter.NewMHDiscount);
		requestXml = requestXml.replace("#EPDiscount#", raterRequest.RaterParameter.EPDiscount);
		requestXml = requestXml.replace("#APE#", raterRequest.RaterParameter.APE);
		requestXml = requestXml.replace("#AAS#", raterRequest.RaterParameter.AAS);
		requestXml = requestXml.replace("#PE#", raterRequest.RaterParameter.PE);
		requestXml = requestXml.replace("#AS#", raterRequest.RaterParameter.AS);

		System.out.println(requestXml);
		return requestXml;

	}

	public static RaterResponse parseMobileHomeResponse(String xmlResponse)
			throws ParserConfigurationException, TransformerException {

		RaterResponse RaterResponse = new RaterResponse();
		try {

			System.out.println(xmlResponse);
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
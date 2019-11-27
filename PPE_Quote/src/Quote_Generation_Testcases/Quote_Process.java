package Quote_Generation_Testcases;

import org.apache.log4j.Logger;


import Quote_Generation_Methods.URL_Verification_Method;

public class Quote_Process {

	private static Logger log = Logger.getLogger(Quote_Process.class);

	public static void main(String[] args) throws Exception

	{
		System.setProperty("org.apache.commons.logging.Log", "org.apache.commons.logging.impl.Jdk14Logger");
		log.error("Calling the Main");
		log.debug("Log4j appender configuration is successful !!");

		URL_Verification_Method.URL_Checking();
		URL_Verification_Method.Login_Methods();
		URL_Verification_Method.Invalid_Address_Validations();
		URL_Verification_Method.Valid_Address_Validations();
		URL_Verification_Method.Quote_Page_Validation_Process();
	}
}
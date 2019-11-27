package RaterPackage;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;

@SuppressWarnings("deprecation")
public class RaterPost {


	public static RaterResponse GetRaterResponse(String xml) throws Exception {

		@SuppressWarnings("resource")
		DefaultHttpClient httpClient = new DefaultHttpClient();
		HttpPost postRequest = new HttpPost("http://10.10.10.33/rater-ppe/api/rater");
		StringEntity input = new StringEntity(xml);
		input.setContentType("application/xml");
		postRequest.setEntity(input);
		HttpResponse response = httpClient.execute(postRequest);
		BufferedReader br = new BufferedReader(new InputStreamReader((response.getEntity().getContent())));
		String output;
		String strResponse = "";
		System.out.println("Output from Server .... \n");
		while ((output = br.readLine()) != null) {
			System.out.println(output);
			strResponse = strResponse + output;
		}

		httpClient.getConnectionManager().shutdown();

		
		RaterResponse RaterResponse = new RaterResponse();

		RaterResponse = XmlParser.parseXMlResponse(strResponse);
		
		return RaterResponse;

	}
}

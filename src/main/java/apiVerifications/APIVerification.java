package apiVerifications;

import org.json.JSONArray;
import org.json.JSONObject;
import org.testng.Assert;
import io.restassured.response.Response;

public class APIVerification {
	
	public static void validateStatusCode (Response response, int statusCode) {
		try {
			Assert.assertEquals(statusCode, response.getStatusCode());
			System.out.println("PASS!!!! Status Code is " + response.getStatusCode());
		} catch (AssertionError e) {
			e.fillInStackTrace();
		} catch (Exception e) {
			e.fillInStackTrace();
		}
	}
	
	public static void validateResponseKey (Response response, String key) {
		try {
			JSONObject jsonObject = new JSONObject(response.getBody().asString());		
			JSONArray array = new JSONArray(jsonObject.get("data").toString());
			
			for(int i=0; i<array.length();i++)
			{
				jsonObject = array.getJSONObject(i);
				System.out.println(jsonObject.get(key));	
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public static void validateResponseTime (Response response)
	{
		try {
			long time = response.time();
			System.out.println("Response Time is : " + time);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
}

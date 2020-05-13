package apiVerifications;

import org.testng.Assert;

import io.restassured.response.Response;

public class APIVerificationTest {

	public static void statusCodeValidation (Response response, int statusCode)
	{
		Assert.assertEquals(response.getStatusCode(), statusCode);
		try {
			System.out.println("Status Code is " + response.getStatusCode());
		} catch (AssertionError e) {
			// TODO: handle exception
		}
	}
}

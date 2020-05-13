package studentApiTest;

import org.testng.annotations.Test;

import apiBuilders.PostAPIBuildersTest;
import apiConfigs.APIPathTest;
import apiConfigs.HeaderConfigsTest;
import apiVerifications.APIVerification;
import baseTest.BaseTests;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class PostEmployeesTest extends BaseTests {

	@Test
	public void PostEmpsTest ()
	{
		HeaderConfigsTest headerConfigs = new HeaderConfigsTest();
		PostAPIBuildersTest apiBuilders = new PostAPIBuildersTest();
		
		Response response = RestAssured.given().headers(headerConfigs.headConfig()).body(apiBuilders.postRequest()).post(APIPathTest.APIPath.POST_EMPLOYEES);
		System.out.println(response.getBody().asString());
		APIVerification.validateStatusCode(response, 200);
		APIVerification.validateResponseTime(response);
		APIVerification.validateResponseKey(response, "name");
	}
}

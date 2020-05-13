package studentApiTest;

import org.testng.annotations.Test;

import apiBuilders.PostAPIBuilders;
import apiConfigs.APIPath;
import apiConfigs.HeaderConfigs;
import apiVerifications.APIVerification;
import baseTest.BaseTests;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class PostEmployees extends BaseTests {
	
	@Test
	public void validPostAPITest ()
	{
		HeaderConfigs header = new HeaderConfigs();
		PostAPIBuilders builder = new PostAPIBuilders();
		
		Response response = RestAssured.given().when().headers(header.headersDefault()).body(builder.postRequestBody()).when().post(APIPath.apiPath.CREATE_EMPLOYEE);
		
		APIVerification.validateStatusCode(response, 200);
		System.out.println(response.getBody().asString());
	}
}

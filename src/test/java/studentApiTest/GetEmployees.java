package studentApiTest;

import org.testng.annotations.Test;

import apiConfigs.APIPath;
import apiConfigs.HeaderConfigs;
import apiVerifications.APIVerification;
import baseTest.BaseTests;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetEmployees extends BaseTests{
	
	@Test
	public void GetEmployeesTest ()
	{
		HeaderConfigs headerConfigs = new HeaderConfigs();
		Response response = RestAssured.given().headers(headerConfigs.headersDefault()).get(APIPath.apiPath.GET_EMPLOYEES);
		
		APIVerification.validateStatusCode(response, 200);
		APIVerification.validateResponseKey(response, "employee_name");
		APIVerification.validateResponseTime(response);
	}
}

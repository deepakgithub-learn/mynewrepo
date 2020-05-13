package studentApiTest;

import org.testng.annotations.Test;

import apiConfigs.APIPathTest;
import apiConfigs.HeaderConfigsTest;
import apiVerifications.APIVerification;
import apiVerifications.APIVerificationTest;
import baseTest.BaseTestsTest;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetEmployeesTest extends BaseTestsTest{

	@Test
	public void GetEmpsTest()
	{
		HeaderConfigsTest headerConfigs = new HeaderConfigsTest();
		Response response = RestAssured.given().headers(headerConfigs.headConfig()).get(APIPathTest.APIPath.GET_EMPLOYEES);	
		
		APIVerificationTest.statusCodeValidation(response, 200);
		APIVerification.validateResponseTime(response);
		APIVerification.validateResponseKey(response, "employee_name");
	}
	
}

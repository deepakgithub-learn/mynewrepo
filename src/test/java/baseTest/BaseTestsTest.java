package baseTest;

import org.testng.annotations.BeforeClass;

import io.restassured.RestAssured;
import utils.FileAndEnvTest;

public class BaseTestsTest {

	@BeforeClass
	public void BaseTestTests()
	{
		RestAssured.baseURI = FileAndEnvTest.envAndFile().get("ServerUrl");
	}
}

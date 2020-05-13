package baseTest;

import org.testng.annotations.BeforeClass;

import io.restassured.RestAssured;
import utils.FileAndEnv;

public class BaseTests {

	@BeforeClass
	public void utilsTest ()
	{
		RestAssured.baseURI = FileAndEnv.envAndFile().get("ServerUrl");
	}
}

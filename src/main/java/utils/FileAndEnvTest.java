package utils;

import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class FileAndEnvTest {

	public static Map<String, String> fileAndEnv = new HashMap<String, String>();
	public static Properties properties = new Properties();
	
	public static Map<String, String> envAndFile()
	{
		String environment = System.getProperty("env");
		try {
			
			if (environment.equalsIgnoreCase("dev"))
			{
				FileInputStream inputStream = new FileInputStream(System.getProperty("user.dir") + "/inputs/dev.properties"); 
				properties.load(inputStream);
				fileAndEnv.put("ServerUrl", properties.getProperty("ServerUrl"));
				fileAndEnv.put("PortNo", properties.getProperty("PortNo"));
				fileAndEnv.put("UserName", properties.getProperty("UserName"));
				fileAndEnv.put("Password", properties.getProperty("Password"));
			}
			
			else if (environment.equalsIgnoreCase("qa"))
			{
				FileInputStream inputStream = new FileInputStream(System.getProperty("user.dir") + "/inputs/qa.properties");
				properties.load(inputStream);
				fileAndEnv.put("ServerUrl", properties.getProperty("ServerUrl"));
				fileAndEnv.put("PortNo", properties.getProperty("PortNo"));
				fileAndEnv.put("UserName", properties.getProperty("UserName"));
				fileAndEnv.put("Password", properties.getProperty("Password"));
			}
			
			else if (environment.equalsIgnoreCase("staging"))
			{
				FileInputStream inputStream = new FileInputStream(System.getProperty("user.dir") + "/inputs/staging.properties");
				properties.load(inputStream);
				fileAndEnv.put("ServerUrl", properties.getProperty("ServerUrl"));
				fileAndEnv.put("PortNo", properties.getProperty("PortNo"));
				fileAndEnv.put("UserName", properties.getProperty("UserName"));
				fileAndEnv.put("Password", properties.getProperty("Password"));
				
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return fileAndEnv;
	}
}

package utils;

import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class FileAndEnv {

	public static Map<String, String> fileAndEnv = new HashMap<String, String>();
	public static Properties propMain = new Properties();
	//public static Properties propPreSet = new Properties();
	
	public static Map<String, String> envAndFile()
	{
		String environment = System.getProperty("env");
		
		try
		{
			if (environment.equalsIgnoreCase("dev"))
			{
				FileInputStream fisDev = new FileInputStream(System.getProperty("user.dir") + "/inputs/dev.properties");
				propMain.load(fisDev);
				fileAndEnv.put("ServerUrl", propMain.getProperty("ServerUrl"));
				fileAndEnv.put("PortNo", propMain.getProperty("PortNo"));
				fileAndEnv.put("UserName", propMain.getProperty("UserName"));
				fileAndEnv.put("Password", propMain.getProperty("Password"));
			}
			
			else if (environment.equalsIgnoreCase("qa"))
			{
				FileInputStream fisQA = new FileInputStream(System.getProperty("user.dir") + "/inputs/qa.properties");
				propMain.load(fisQA);
				fileAndEnv.put("ServerUrl", propMain.getProperty("ServerUrl"));
				fileAndEnv.put("PortNo", propMain.getProperty("PortNo"));
				fileAndEnv.put("UserName", propMain.getProperty("UserName"));
				fileAndEnv.put("Password", propMain.getProperty("Password"));
			}
			
			else if (environment.equalsIgnoreCase("staging"))
			{
				FileInputStream fisStaging = new FileInputStream(System.getProperty("user.dir") + "/inputs/staging.properties");
				propMain.load(fisStaging);
				fileAndEnv.put("ServerUrl", propMain.getProperty("ServerUrl"));
				fileAndEnv.put("PortNo", propMain.getProperty("PortNo"));
				fileAndEnv.put("UserName", propMain.getProperty("UserName"));
				fileAndEnv.put("Password", propMain.getProperty("Password"));
			}
		}
		
		catch (Exception e)
		{
			// TODO: handle exception
		}		
		
		return fileAndEnv;		
	}
}

package apiConfigs;

import java.util.HashMap;
import java.util.Map;

public class HeaderConfigsTest {

	public Map<String, String> headConfig()
	{
		Map<String, String> headerConfigs = new HashMap<String, String>();
		headerConfigs.put("Content-Type", "application/json");
		
		return headerConfigs;	
	}	
}

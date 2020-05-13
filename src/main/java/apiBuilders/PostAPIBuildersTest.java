package apiBuilders;

import java.util.HashMap;
import java.util.Map;

public class PostAPIBuildersTest {

	public Map<String, String> postRequest()
	{
		Map<String, String> postRequestMap = new HashMap<String, String>();
		postRequestMap.put("name", "Dee");
		postRequestMap.put("salary", "15000");
		postRequestMap.put("age", "20");
		
		return postRequestMap;
	}
}

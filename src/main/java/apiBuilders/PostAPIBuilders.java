package apiBuilders;

import java.util.HashMap;
import java.util.Map;

public class PostAPIBuilders {

	public Map<String, String> postRequestBody()
	{
		Map<String, String> body = new HashMap<String, String>();
		body.put("name", "Deepakm");
		body.put("salary", "2000");
		body.put("age", "20");
		
		return body;
		
	}
}

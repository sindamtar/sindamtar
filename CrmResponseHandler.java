package com.ngtrend.lcmprov;

import org.json.JSONException;
import org.json.JSONObject;



public class CrmResponseHandler {
	public String getSessionId(String rsp) throws JSONException {
		JSONObject json = new JSONObject(rsp);
		return json.get("id").toString();	
		
	} 
}
	
	



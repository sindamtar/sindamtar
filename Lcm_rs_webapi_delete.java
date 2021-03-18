package com.ngtrend.lcmprov;


import java.util.Map;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.json.JSONException;
import org.json.JSONObject;

public class Lcm_rs_webapi_delete implements Processor {
	@Override 
	public void process(Exchange exchange) throws Exception,JSONException {
		        JSONObject json = new JSONObject(exchange.getIn().getBody(String.class));
		        Map<String,Object> ctx= exchange.getProperties();
				ctx.put("status_code_webapi_delete", json.get("status_code"));
				ctx.put("status_description_webapi_delete", json.get("status_description")); 
				exchange.getOut().setHeaders(exchange.getIn().getHeaders());
          }
}



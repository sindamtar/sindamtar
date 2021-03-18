package com.ngtrend.lcmprov;
import java.util.Map;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.json.JSONException;
import org.json.JSONObject;


public class Context_rs_acc implements Processor {


	@Override 
	public void process(Exchange exchange) throws Exception,JSONException {
		        JSONObject json = new JSONObject(exchange.getIn().getBody(String.class));
				Map<String,Object> ctx= exchange.getProperties();
				ctx.put("wb_status_description", json.get("wb_status_description"));
				ctx.put("wb_status_code", json.get("wb_status_code"));
				ctx.put("op", json.get("op"));
				ctx.put("account_id", json.get("account_id"));
				ctx.put("account_name", json.get("account_name"));
				ctx.put("admin_login", json.get("admin_login"));
				ctx.put("admin_pwd", json.get("admin_pwd")); 
				ctx.put("admin_email", json.get("admin_email"));
				ctx.put("status_code", json.get("status_code"));
				ctx.put("status_description", json.get("status_description"));
				exchange.getOut().setHeaders(exchange.getIn().getHeaders());
				
		 
	}
	
	

	
}

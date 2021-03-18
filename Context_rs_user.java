package com.ngtrend.lcmprov;

import java.util.Map;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.json.JSONException;
import org.json.JSONObject;

public class Context_rs_user implements Processor {


	@Override 
	public void process(Exchange exchange) throws Exception,JSONException {
		        JSONObject json = new JSONObject(exchange.getIn().getBody(String.class));
				Map<String,Object> ctx= exchange.getProperties();
				ctx.put("wb_status_description_user", json.get("wb_status_description"));
				ctx.put("wb_status_code_user", json.get("wb_status_code"));
				ctx.put("op_user", json.get("op"));
				ctx.put("account_id_user", json.get("account_id"));
				ctx.put("account_name_user", json.get("account_name"));
				ctx.put("status_code_user", json.get("status_code"));
				ctx.put("status_description_user", json.get("status_description"));
				ctx.put("user_email_user", json.get("user_email"));
				ctx.put("user_id_user", json.get("user_id"));
				ctx.put("user_login_user", json.get("user_login"));
				ctx.put("user_password_user", json.get("user_pwd"));
			    exchange.getOut().setHeaders(exchange.getIn().getHeaders());
		 
	}
}
package com.ngtrend.lcmprov;

import java.util.Map;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.json.JSONException;
import org.json.JSONObject;


public class Rs_acc_active implements Processor {


	@Override 
	public void process(Exchange exchange) throws Exception,JSONException {
	    JSONObject json = new JSONObject(exchange.getIn().getBody(String.class));
					Map<String,Object> ctx= exchange.getProperties();
					ctx.put("wb_status_description_active", json.get("wb_status_description"));
					ctx.put("wb_status_code_active", json.get("wb_status_code"));
					ctx.put("op_active", json.get("op"));
					ctx.put("status_code_active", json.get("status_code"));
					ctx.put("status_description_active", json.get("status_description"));
					ctx.put("account_billable_active", json.get("account_billable"));
					ctx.put("account_id_active", json.get("account_id"));
					ctx.put("account_name_active", json.get("account_name"));
					ctx.put("account_status_active", json.get("account_status"));
					ctx.put("account_date_activation_active", json.get("account_date_activation"));
					exchange.getOut().setHeaders(exchange.getIn().getHeaders());
		 
	}
	
	

	
}
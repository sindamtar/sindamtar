package com.ngtrend.lcmprov;

import java.util.Map;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.json.JSONException;
import org.json.JSONObject;

public class Rs_acc_reactive implements Processor {


	@Override 
	public void process(Exchange exchange) throws Exception,JSONException {
		    
			       JSONObject json = new JSONObject(exchange.getIn().getBody(String.class));
		           Map<String,Object> ctx= exchange.getProperties();
				   ctx.put("wb_status_description_reactive", json.get("wb_status_description"));
				   ctx.put("wb_status_code_reactive", json.get("wb_status_code"));
				   ctx.put("op_reactive", json.get("op"));
				   ctx.put("status_code_reactive", json.get("status_code"));
				   ctx.put("status_description_reactive", json.get("status_description"));
				   ctx.put("account_billable_reactive", json.get("account_billable"));
				   ctx.put("account_id_reactive", json.get("account_id"));
				   ctx.put("account_name_reactive", json.get("account_name"));
				   ctx.put("account_status_reactive", json.get("account_status"));
				   ctx.put("account_date_activation_reactive", json.get("account_date_activation"));
				   exchange.getOut().setHeaders(exchange.getIn().getHeaders());
							
		 
	}

}

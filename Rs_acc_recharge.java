package com.ngtrend.lcmprov;

import java.util.Map;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.json.JSONException;
import org.json.JSONObject;


public class Rs_acc_recharge implements Processor {


	@Override 
	public void process(Exchange exchange) throws Exception,JSONException {
	    JSONObject json = new JSONObject(exchange.getIn().getBody(String.class));
					Map<String,Object> ctx= exchange.getProperties();
					ctx.put("wb_status_description_recharge", json.get("wb_status_description"));
					ctx.put("status_description_recharge", json.get("status_description"));
					ctx.put("wb_status_code_recharge", json.get("wb_status_code"));
					ctx.put("status_code_recharge", json.get("status_code"));
					ctx.put("account_status_recharge", json.get("account_status"));
					ctx.put("account_date_activation_recharge", json.get("account_date_activation"));
					ctx.put("account_billable_recharge", json.get("account_billable"));
					ctx.put("account_id_recharge", json.get("account_id"));
					ctx.put("account_name_recharge", json.get("account_name"));
					ctx.put("credit_volume_recharge", json.get("credit_volume"));
                    ctx.put("credit_type_recharge", json.get("credit_type"));
					ctx.put("credit_billable_recharge", json.get("credit_billable").toString());
					exchange.getOut().setHeaders(exchange.getIn().getHeaders());
		 
	}
	
	

	
}
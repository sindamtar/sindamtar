package com.ngtrend.lcmprov;

import java.util.Map;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.json.JSONException;
import org.json.JSONObject;

public class Lcm_archive_rs_webapi implements Processor {


	@Override 
	public void process(Exchange exchange) throws Exception,JSONException {
		        JSONObject json = new JSONObject(exchange.getIn().getBody(String.class));
		        Map<String,Object> ctx= exchange.getProperties();
				ctx.put("status_code_w", json.get("status_code"));
				ctx.put("status_description_w", json.get("status_description"));
				ctx.put("error_description_w", json.get("error_description"));
				ctx.put("wb_acc_usr_crm_id_w", json.get("wb_acc_usr_crm_id"));
				exchange.getOut().setHeaders(exchange.getIn().getHeaders());
          }

}

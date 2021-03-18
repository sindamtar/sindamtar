package com.ngtrend.lcmprov;

import java.util.Map;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import org.json.JSONException;
import org.json.JSONObject;



public class Lcm_Context_accs implements Processor {

	@Override
	public void process(Exchange exchange) throws Exception,JSONException {
		// TODO Auto-generated method stub
		JSONObject name_val_list = (new JSONObject(exchange.getIn().getBody(String.class))).getJSONArray("entry_list").getJSONObject(0).getJSONObject("name_value_list");
		Map<String,Object> ctx= exchange.getProperties();
	    ctx.put("wb_acc_id_pp_id",String.valueOf("")); 
        ctx.put("wb_acc_id_pp_id", name_val_list.getJSONObject("wb_acc_id").get("value").toString());
	    ctx.put("name", name_val_list.getJSONObject("name").get("value").toString());
		exchange.getOut().setHeaders(exchange.getIn().getHeaders());
	}
	
	

	
}

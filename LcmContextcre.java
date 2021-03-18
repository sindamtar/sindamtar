package com.ngtrend.lcmprov;

import java.util.Map;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.json.JSONException;
import org.json.JSONObject;


public class LcmContextcre implements Processor {

	@Override
	public void process(Exchange exchange) throws Exception, JSONException {
		// TODO Auto-generated method stub
		JSONObject list_credit = (new JSONObject(exchange.getIn().getBody(String.class))).getJSONArray("entry_list")
				.getJSONObject(0).getJSONObject("name_value_list");
		
		Map<String, Object> ctx = exchange.getProperties();
		ctx.put("wb_credit_type", list_credit.getJSONObject("wb_credit_type").get("value").toString());
		ctx.put("wb_credit_value", list_credit.getJSONObject("wb_credit_value").get("value").toString());
		
		exchange.getOut().setHeaders(exchange.getIn().getHeaders());
	}

}

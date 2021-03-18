package com.ngtrend.lcmprov;

import java.util.Map;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.json.JSONException;
import org.json.JSONObject;

public class LcmContextcredit implements Processor {

	@Override
	public void process(Exchange exchange) throws Exception, JSONException {
		// TODO Auto-generated method stub
		JSONObject list_credit = (new JSONObject(exchange.getIn().getBody(String.class))).getJSONArray("entry_list")
				.getJSONObject(0).getJSONObject("name_value_list");
		Map<String, Object> ctx = exchange.getProperties();
		ctx.put("wb_offre_credit", list_credit.getJSONObject("id").get("value").toString());
		
		exchange.getOut().setHeaders(exchange.getIn().getHeaders());
	}

}


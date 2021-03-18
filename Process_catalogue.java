package com.ngtrend.lcmprov;

import java.util.Map;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import org.json.JSONException;
import org.json.JSONObject;

public class Process_catalogue implements Processor {
	@Override

	public void process(Exchange exchange) throws Exception, JSONException {
		Map<String, Object> prop = exchange.getProperties();
		String var = prop.get("var_calculate").toString();
		JSONObject json = new JSONObject(exchange.getIn().getBody(String.class)).getJSONObject("catalogue");
		Map<String, Object> ctx = exchange.getProperties();
		try {

			ctx.put("product-p", json.getJSONObject(var).get("Pn").toString());
			ctx.put("product-id", json.getJSONObject(var).get("Pid").toString());

		}

		catch (Exception e) {
			ctx.put("res", "true");

		}
		exchange.getOut().setHeaders(exchange.getIn().getHeaders());
	}
}

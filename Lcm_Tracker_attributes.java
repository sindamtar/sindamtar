package com.ngtrend.lcmprov;

import java.util.Map;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.json.JSONException;
import org.json.JSONObject;

public class Lcm_Tracker_attributes implements Processor {

	@Override
	public void process(Exchange exchange) throws Exception,JSONException {
		// TODO Auto-generated method stub
		JSONObject idenf = new JSONObject(exchange.getIn().getBody(String.class)).getJSONArray("entry_list").getJSONObject(0);
		JSONObject process = (new JSONObject(exchange.getIn().getBody(String.class))).getJSONArray("entry_list").getJSONObject(0).getJSONObject("name_value_list");
		JSONObject mail = (new JSONObject(exchange.getIn().getBody(String.class))).getJSONArray("entry_list").getJSONObject(0).getJSONObject("name_value_list").getJSONObject("email_st");
		Map<String,Object> ctx= exchange.getProperties();
		ctx.put("processed", process.getJSONObject("processed").get("value").toString());
		ctx.put("id_tacker", idenf.get("id").toString());
		ctx.put("email_st", mail.get("value").toString());
		exchange.getOut().setHeaders(exchange.getIn().getHeaders());
	}
}

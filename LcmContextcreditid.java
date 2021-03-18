package com.ngtrend.lcmprov;

import java.util.Map;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;


public class LcmContextcreditid implements Processor {

	@Override
	public void process(Exchange exchange) throws Exception, JSONException {
		// TODO Auto-generated method stub
		JSONArray list_credit_r = (new JSONObject(exchange.getIn().getBody(String.class))).getJSONArray("relationship_list").getJSONObject(0).getJSONArray("link_list");
		JSONObject list_credit = (new JSONObject(exchange.getIn().getBody(String.class))).getJSONArray("entry_list")
				.getJSONObject(0).getJSONObject("name_value_list");
		
		Map<String, Object> ctx = exchange.getProperties();
		if (list_credit_r.length()==0)
		{
			ctx.put("rel_quotes_credit","true");
		}
		else 
		{
			ctx.put("wb_credit_type", list_credit.getJSONObject("wb_credit_type").get("value").toString());
			ctx.put("wb_credit_value", list_credit.getJSONObject("wb_credit_value").get("value").toString());
			
	    
		JSONObject list_credit_rel = (new JSONObject(exchange.getIn().getBody(String.class))).getJSONArray("relationship_list").getJSONObject(0).getJSONArray("link_list").getJSONObject(0).getJSONArray("records").getJSONObject(0).getJSONObject("link_value");
		ctx.put("wb_offre_credit_id", list_credit_rel.getJSONObject("id").get("value").toString());
		
		}
		exchange.getOut().setHeaders(exchange.getIn().getHeaders());
	}

}

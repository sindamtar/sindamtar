
	

package com.ngtrend.lcmprov;

import java.util.Map;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.json.JSONException;
import org.json.JSONObject;

public class LcmContextProducts implements Processor {

	@Override
	public void process(Exchange exchange) throws Exception,JSONException {
		// TODO Auto-generated method stub*
		JSONObject list = (new JSONObject(exchange.getIn().getBody(String.class))).getJSONArray("entry_list").getJSONObject(0).getJSONObject("name_value_list");
		Map<String,Object> ctx= exchange.getProperties();
		ctx.put("wb_pro_price", list.getJSONObject("product_total_price").get("value").toString());
		ctx.put("wb_offer_name", list.getJSONObject("name").get("value").toString());
		ctx.put("wb_offer_description", list.getJSONObject("description").get("value").toString());
		ctx.put("wb_pro_remise", list.getJSONObject("product_discount").get("value").toString());
		ctx.put("wb_pro_tax", list.getJSONObject("vat").get("value").toString());
		exchange.getOut().setHeaders(exchange.getIn().getHeaders());
	}
}

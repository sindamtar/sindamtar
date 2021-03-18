package com.ngtrend.lcmprov;
import java.util.Map;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.json.JSONException;
import org.json.JSONObject;


public class LcmContextofferdoc implements Processor {

	@Override
	public void process(Exchange exchange) throws Exception,JSONException {
		// TODO Auto-generated method stub
		JSONObject list_offer = (new JSONObject(exchange.getIn().getBody(String.class))).getJSONArray("entry_list").getJSONObject(0).getJSONObject("name_value_list");
		JSONObject link_rel_offer = (new JSONObject(exchange.getIn().getBody(String.class))).getJSONArray("relationship_list").getJSONObject(0).getJSONArray("link_list").getJSONObject(0).getJSONArray("records").getJSONObject(0).getJSONObject("link_value");
		JSONObject link_rel_date = (new JSONObject(exchange.getIn().getBody(String.class))).getJSONArray("relationship_list").getJSONObject(0).getJSONArray("link_list").getJSONObject(0).getJSONArray("records").getJSONObject(0).getJSONObject("link_value");
	    
		Map<String,Object> ctx= exchange.getProperties();
		
		ctx.put("wb_offer_name", list_offer.getJSONObject("name").get("value").toString());
		ctx.put("wb_offer_stage", list_offer.getJSONObject("stage").get("value").toString());
		ctx.put("wb_doc_id", link_rel_offer.getJSONObject("id").get("value").toString());
		ctx.put("wb_active_date", link_rel_date.getJSONObject("active_date").get("value").toString());
		exchange.getOut().setHeaders(exchange.getIn().getHeaders());
	}

}

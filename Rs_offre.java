package com.ngtrend.lcmprov;

import java.util.Map;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.json.JSONException;
import org.json.JSONObject;


public class Rs_offre implements Processor {


	@Override 
	public void process(Exchange exchange) throws Exception,JSONException {
	    JSONObject json = new JSONObject(exchange.getIn().getBody(String.class));
					Map<String,Object> ctx= exchange.getProperties();
					ctx.put("wb_status_description_offer", json.get("wb_status_description"));
					ctx.put("status_description_offer", json.get("status_description"));
					ctx.put("wb_status_code_offer", json.get("wb_status_code"));
					ctx.put("status_code_offer", json.get("status_code"));
					ctx.put("account_id_offer", json.get("account_id"));
					ctx.put("account_name_offer", json.get("account_name"));
					ctx.put("wb_product_name_offer", json.get("product_name"));
					ctx.put("next_billing_offer", json.get("next_billing"));
					ctx.put("offer_name_offer", json.get("offer_name"));
					ctx.put("offer_id_offer", json.get("offer_id"));
			exchange.getOut().setHeaders(exchange.getIn().getHeaders());
		 
						
	}
	
	

	
}
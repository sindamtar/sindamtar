package com.ngtrend.lcmprov;
import java.util.Map;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.json.JSONException;
import org.json.JSONObject;


public class LcmContextContact implements Processor {

	@Override
	public void process(Exchange exchange) throws Exception,JSONException {
		// TODO Auto-generated method stub
	   JSONObject name_val_liste = (new JSONObject(exchange.getIn().getBody(String.class))).getJSONArray("entry_list").getJSONObject(0).getJSONObject("name_value_list");
	   Map<String,Object> ctx= exchange.getProperties();
	   ctx.put("wb_acc_usr_email", name_val_liste.getJSONObject("email1").get("value").toString());
	   ctx.put("wb_acc_usr_fname", name_val_liste.getJSONObject("first_name").get("value").toString());
	   ctx.put("wb_acc_usr_sname", name_val_liste.getJSONObject("last_name").get("value").toString());
	   exchange.getOut().setHeaders(exchange.getIn().getHeaders());
	}

	
	
	
	
	
	
}

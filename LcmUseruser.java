package com.ngtrend.lcmprov;

import java.util.Map;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.json.JSONException;
import org.json.JSONObject;

public class LcmUseruser implements Processor {

	@Override
	public void process(Exchange exchange) throws Exception, JSONException {
		// TODO Auto-generated method stub
		JSONObject list = (new JSONObject(exchange.getIn().getBody(String.class))).getJSONArray("relationship_list")
				.getJSONObject(0).getJSONArray("link_list").getJSONObject(0);
		Map<String, Object> ctx = exchange.getProperties();
		for (int i = 0; i <= list.length(); i++) {
			String v = list.getJSONArray("records").getJSONObject(i).getJSONObject("link_value")
					.getJSONObject("wb_login").get("value").toString();
			String c = list.getJSONArray("records").getJSONObject(i).getJSONObject("link_value")
					.getJSONObject("wb_password").get("value").toString();
			String n = list.getJSONArray("records").getJSONObject(i).getJSONObject("link_value")
					.getJSONObject("wb_user_type").get("value").toString();

			if (n.equals("user")) {
				ctx.put("login_User", v);
				ctx.put("Password_user", c);
				ctx.put("wb_user_type", n);
				break;
			}
		}
		exchange.getOut().setHeaders(exchange.getIn().getHeaders());

	}
}

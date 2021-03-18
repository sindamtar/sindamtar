package com.ngtrend.lcmprov;

import java.util.Map;



import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import org.json.JSONException;



public class Process_recharge implements Processor {
    
	@Override 
	public void process(Exchange exchange) throws Exception,JSONException {
		Map<String,Object> prop= exchange.getProperties();
		String ws_recharge=prop.get("ws_recharge").toString();
		
	
		
  String query="";
 
	
 switch (ws_recharge)
 {
	   case "1":/*recharge d'un compte wb*/
		  query="op="+1
			+"&sub_op="+5
		    +"&wb_acc_id="+prop.get("wb_acc_id_crm").toString()
		    +"&wb_credit_type="+prop.get("wb_credit_type_val").toString()
		    +"&wb_credit_value="+prop.get("wb_credit_value").toString() 
			+"&wb_acc_testing="+prop.get("wb_acc_testing").toString()
			+"&res_type="+"JSON";
			break;
			  
		   
		
	}
	    exchange.getOut().setHeaders(exchange.getIn().getHeaders());
		exchange.getOut().setBody(query);
		
	}
		
	}



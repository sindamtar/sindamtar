package com.ngtrend.lcmprov;
import java.net.URLEncoder;
import java.util.Map;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import org.json.JSONException;



public class Process_encoded_webapi implements Processor {
    
	@Override 
	public void process(Exchange exchange) throws Exception,JSONException {
		Map<String,Object> prop= exchange.getProperties();
		Map<String,Object> hdr= exchange.getIn().getHeaders();
		String accid=hdr.get("accid").toString();
		String webapi=prop.get("webapi").toString();
		
  String query="";
  
		 
	
 switch (webapi)
 {
	    case "1":/*WEBAPI */
	  		  query="op="+1
	  		  +"&login="+prop.get("login_web_api").toString()
	  		  +"&passwd="+URLEncoder.encode(prop.get("Password_web_api").toString(),"UTF-8");
	  		  break;
	    case "2":/*Archive*/
			  query="op="+1
			    +"&wb_acc_crm_id="+accid
			    +"&wb_acc_usr_type="+prop.get("wb_acc_usr_type").toString()
			    +"&wb_acc_usr_name="+prop.get("wb_acc_usr_name").toString() 
				+"&wb_acc_admin_id="+prop.get("contact-Id").toString()
				+"&wb_acc_usr_login="+prop.get("login").toString()
				+"&wb_acc_usr_pwd="+URLEncoder.encode(prop.get("Password").toString(),"UTF-8")
			    ;
				  
		     break;
				  
			  
			
	}
	    exchange.getOut().setHeaders(exchange.getIn().getHeaders());
		exchange.getOut().setBody(query);
		
	}
		
	}



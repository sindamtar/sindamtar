package com.ngtrend.lcmprov;

import java.net.URLEncoder;
import java.util.Map;



import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import org.json.JSONException;



public class Process_encoded_ldap implements Processor {
    
	@Override 
	public void process(Exchange exchange) throws Exception,JSONException {
		Map<String,Object> prop= exchange.getProperties();
		Map<String,Object> hdr= exchange.getIn().getHeaders();
		String accid=hdr.get("accid").toString();
		String ldap=prop.get("ldap").toString();
		
  String query="";
  
		 
	
 switch (ldap)
 {
	    case "1":
	    	query="op="+1
	    	  +"&cn="+prop.get("wb_acc_name").toString()
			  +"&uid="+prop.get("login-user-chat").toString()
			  +"&pwd="+URLEncoder.encode(prop.get("Password-user-chat").toString(),"UTF-8");
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



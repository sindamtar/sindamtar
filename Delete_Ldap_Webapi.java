package com.ngtrend.lcmprov;
import java.util.Map;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.json.JSONException;



public class Delete_Ldap_Webapi implements Processor {
    
	@Override 
	public void process(Exchange exchange) throws Exception,JSONException {
		Map<String,Object> prop= exchange.getProperties();
		String delete=prop.get("delete").toString();
		
		
  String query="";
  
		   
		 
	
 switch (delete)
 {
       case "2":/*delete compte ldap*/
			 query="op="+2+"&cn="+prop.get("wb_acc_name").toString();
		break;
				
	}
	    exchange.getOut().setHeaders(exchange.getIn().getHeaders());
		exchange.getOut().setBody(query);
		
	}
		
	}



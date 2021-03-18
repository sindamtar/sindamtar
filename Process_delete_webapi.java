package com.ngtrend.lcmprov;
import java.util.Map;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.json.JSONException;



public class Process_delete_webapi implements Processor {
    
	@Override 
	public void process(Exchange exchange) throws Exception,JSONException {
		Map<String,Object> prop= exchange.getProperties();
		String delete_webapi=prop.get("delete_webapi").toString();
		
		
  String query="";
  
		   
		 
	
 switch (delete_webapi)
 {
         case "1": /*delete compte webapi  */
	       query=query+"op="+2+"&login="+prop.get("login_web_api").toString();
			  
		 break;                       
		     
				
	}
	    exchange.getOut().setHeaders(exchange.getIn().getHeaders());
		exchange.getOut().setBody(query);
		
	}
		
}



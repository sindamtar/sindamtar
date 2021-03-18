package com.ngtrend.lcmprov;
import java.net.URLEncoder;
import java.util.Map;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.json.JSONException;



public class ADR_process implements Processor {
    
	@Override 
	public void process(Exchange exchange) throws Exception,JSONException {
		Map<String,Object> prop= exchange.getProperties();
		String ADR_type=prop.get("ADR_type").toString();
		
		
  String query="";
  
		   
		 
	
 switch (ADR_type)
 {
         case "1": /*Activate account */
	       query="op="+1+"&sub_op="+2
	        +"&wb_acc_id="+prop.get("wb_acc_id_crm").toString()
            +"&wb_acc_chat_login="+prop.get("login-user-chat").toString()
 		    +"&wb_acc_chat_pwd="+URLEncoder.encode(prop.get("Password-user-chat").toString(),"UTF-8")
 		    +"&res_type="+"JSON";
			  
		 break;                       
		     
		
		case "2":/*Desactivate account*/
			 query="op="+1+"&sub_op="+3
		        +"&wb_acc_id="+prop.get("wb_acc_id_crm").toString()
	            +"&res_type="+"JSON";
				  
			  break;
			  
		  
		  case "3": /*Reactivate account*/
			  query="op="+1+"&sub_op="+4
		        +"&wb_acc_id="+prop.get("wb_acc_id_crm").toString()
	            +"&wb_acc_chat_login="+prop.get("login-user-chat").toString()
	 		    +"&wb_acc_chat_pwd="+URLEncoder.encode(prop.get("Password-user-chat").toString(),"UTF-8")
	 		    +"&res_type="+"JSON";
			break;	  
		 
		
	}
	    exchange.getOut().setHeaders(exchange.getIn().getHeaders());
		exchange.getOut().setBody(query);
		
	}
		
	}



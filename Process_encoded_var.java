package com.ngtrend.lcmprov;

import java.net.URLEncoder;
import java.util.Map;



import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import org.json.JSONException;



public class Process_encoded_var implements Processor {
    
	@Override 
	public void process(Exchange exchange) throws Exception,JSONException {
		Map<String,Object> prop= exchange.getProperties();
		Map<String,Object> hdr= exchange.getIn().getHeaders();
		String ws_type=prop.get("ws_type").toString();
		String wb_acc_name=prop.get("wb_acc_name").toString();
	    String wb_acc_labels=prop.get("wb_acc_labels").toString();
		String login_admin=prop.get("login_admin").toString();
		String Password_admin=prop.get("Password_admin").toString();
		String wb_acc_usr_email=prop.get("wb_acc_usr_email").toString();
		String accid=hdr.get("accid").toString();
		String crm_acc_name=prop.get("crm_acc_name").toString();
		String wb_acc_type_val=prop.get("wb_acc_type_val").toString();
		String wb_acc_push_int=prop.get("wb_acc_push_int").toString();
		String wb_acc_push_plage_horaire=prop.get("wb_acc_push_plage_horaire").toString();
		String wb_acc_push_optout=prop.get("wb_acc_push_optout").toString();
		String wb_acc_status_val=prop.get("wb_acc_status_val").toString();
		String login_user_chat=prop.get("login-user-chat").toString();
		String wb_acc_testing=prop.get("wb_acc_testing").toString();
		String Password_user_chat=prop.get("Password-user-chat").toString();
		/***************operation 2 (LCM-WBM-ADMIN)*****************************/
		String wb_acc_usr_fname=prop.get("wb_acc_usr_fname").toString();
		String wb_acc_usr_sname=prop.get("wb_acc_usr_sname").toString();
		String wb_acc_auto_purge=prop.get("wb_acc_auto_purge").toString();
	
		
  String query="";
  String query1="op="+1+"&sub_op="+1
		   +"&wb_acc_name="+URLEncoder.encode(wb_acc_name,"UTF-8")
		   +"&wb_acc_labels="+URLEncoder.encode(wb_acc_labels,"UTF-8")
		   +"&wb_acc_adm_login="+login_admin
		   +"&wb_acc_adm_pwd="+URLEncoder.encode(Password_admin,"UTF-8")
		   +"&wb_acc_adm_email="+wb_acc_usr_email
		   +"&wb_acc_crm_id="+accid
		   +"&crm_acc_name="+crm_acc_name
		   +"&wb_acc_status="+wb_acc_status_val
		   +"&wb_acc_type="+wb_acc_type_val
		   +"&wb_acc_push_int="+wb_acc_push_int
		   +"&wb_acc_push_plage_horaire="+wb_acc_push_plage_horaire
		   +"&wb_acc_push_optout="+wb_acc_push_optout
		   +"&wb_acc_testing="+wb_acc_testing
		   +"&wb_acc_chat_login="+login_user_chat
		   +"&wb_acc_chat_pwd="+URLEncoder.encode(Password_user_chat,"UTF-8")
		   +"&res_type="+"JSON";
		   
		 
	
 switch (ws_type)
 {
	    case "1": /*WB-ADMIN op 1*/
	     if (prop.get("wb_acc_type_val").toString().equals("1"))
	     
	     {   
	        query+=query1;
	     }
	     else 
	     {
	    	 
	    	 query=query1+"&wb_acc_ppal_id="+prop.get("wb_acc_id_pp_id").toString();
	      }
		 
		  break;
		  /*WB-ADMIN op 2*/ 
		  case "2":query=query+"op="+2+"&sub_op="+1
	        +"&wb_acc_id="+prop.get("account_id").toString()
            +"&wb_acc_usr_login="+prop.get("login_User").toString()
			+"&wb_acc_usr_pwd="+URLEncoder.encode(prop.get("Password_user").toString(),"UTF-8")
			+"&wb_acc_usr_email="+wb_acc_usr_email
			+"&wb_acc_usr_fname="+wb_acc_usr_fname
			+"&wb_acc_usr_sname="+wb_acc_usr_sname
			+"&wb_acc_auto_purge="+wb_acc_auto_purge
			+"&res_type="+"JSON";
			  
		 break;                       
		     
		
		case "3":/*Archive*/
		  query="op="+1
		    +"&wb_acc_crm_id="+accid
		    +"&wb_acc_usr_type="+prop.get("wb_acc_usr_type").toString()
		    +"&wb_acc_usr_name="+prop.get("wb_acc_usr_name").toString() 
			+"&wb_acc_admin_id="+prop.get("contact-Id").toString()
			+"&wb_acc_usr_login="+prop.get("login").toString()
			+"&wb_acc_usr_pwd="+URLEncoder.encode(prop.get("Password").toString(),"UTF-8")
		    ;
			  
			  break;
			  
		   case "5":/*WEBAPI */
			  query="op"+1
			  +"&login="+prop.get("login_web_api").toString()
			  +"&passwd="+URLEncoder.encode(prop.get("Password_web_api").toString(),"UTF-8");
			  break;
		
	}
	    exchange.getOut().setHeaders(hdr);
	    exchange.getOut().setHeaders(exchange.getIn().getHeaders());
		exchange.getOut().setBody(query);
		
	}
		
	}



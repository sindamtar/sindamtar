package com.ngtrend.lcmprov;

import java.util.Map;
import java.util.UUID;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import org.json.JSONException;
import org.json.JSONObject;



public class LcmContextAcc implements Processor {

	@Override
	public void process(Exchange exchange) throws Exception,JSONException {
		// TODO Auto-generated method stub
		JSONObject name_val_list = (new JSONObject(exchange.getIn().getBody(String.class))).getJSONArray("entry_list").getJSONObject(0).getJSONObject("name_value_list");
		JSONObject link_list = (new JSONObject(exchange.getIn().getBody(String.class))).getJSONArray("relationship_list").getJSONObject(0).getJSONArray("link_list").getJSONObject(0).getJSONArray("records").getJSONObject(0).getJSONObject("link_value");
		Map<String,Object> ctx= exchange.getProperties();
		/************les variables vides************************************************/
		ctx.put("lcm_step",String.valueOf("")); 
        ctx.put("lcm_exception_description",String.valueOf("")); 
        ctx.put("lcm_exception_msg",String.valueOf("")); 
        ctx.put("Type_compte",String.valueOf(""));
        ctx.put("lcm_step_desc" ,String.valueOf(""));
        ctx.put("lcm_desc_id_existe",String.valueOf("")); 
        ctx.put("lcm_user_password_user",String.valueOf(""));
        ctx.put("lcm_desc_id_existe_non",String.valueOf("")); 
        ctx.put("lcm_Exec_desc",String.valueOf("")); 
        ctx.put("lcm_wb_status_code",String.valueOf("")); 
        ctx.put("lcm_status_code",String.valueOf("")); 
        ctx.put("lcm_account_id",String.valueOf("")); 
        ctx.put("lcm_wb_status_description",String.valueOf("")); 
        ctx.put("lcm_account_name",String.valueOf("")); 
        ctx.put("lcm_admin_email",String.valueOf("")); 
        ctx.put("lcm_admin_login",String.valueOf("")); 
        ctx.put("lcm_admin_pwd",String.valueOf(""));  
        ctx.put("lcm_status_description",String.valueOf("")); 
        ctx.put("lcm_user_login_user",String.valueOf("")); 
        ctx.put("lcm_wb_status_description_user",String.valueOf("")); 
        ctx.put("lcm_account_name_user",String.valueOf("")); 
        ctx.put("lcm_wb_status_code_user",String.valueOf(""));
        ctx.put("lcm_account_id_user",String.valueOf("")); 
        ctx.put("lcm_status_code_user",String.valueOf("")); 
        ctx.put("lcm_status_description_user",String.valueOf("")); 
        ctx.put("lcm_user_email_user",String.valueOf("")); 
        ctx.put("lcm_user_id_user",String.valueOf("")); 
        ctx.put("lcm_status_description_a",String.valueOf("")); 
        ctx.put("lcm_status_code_a",String.valueOf("")); 
        ctx.put("lcm_error_description_a",String.valueOf("")); 
        ctx.put("lcm_wb_acc_usr_crm_id_a",String.valueOf("")); 
        ctx.put("lcm_status_description_u",String.valueOf("")); 
        ctx.put("lcm_status_code_u",String.valueOf("")); 
        ctx.put("lcm_error_description_u",String.valueOf("")); 
        ctx.put("lcm_wb_acc_usr_crm_id_u",String.valueOf(""));
        ctx.put("lcm_status_description_c",String.valueOf("")); 
        ctx.put("lcm_status_code_c",String.valueOf("")); 
        ctx.put("lcm_error_description_c",String.valueOf("")); 
        ctx.put("lcm_wb_acc_usr_crm_id_c",String.valueOf("")); 
        ctx.put("lcm_status_description_w",String.valueOf("")); 
        ctx.put("lcm_wb_acc_usr_crm_id_w",String.valueOf("")); 
        ctx.put("lcm_status_code_w",String.valueOf(""));
        ctx.put("lcm_error_description_w",String.valueOf("")); 
        ctx.put("lcm_status_description_ldap",String.valueOf("")); 
        ctx.put("lcm_status_code_ldap",String.valueOf("")); 
        ctx.put("lcm_status_description_webapi",String.valueOf("")); 
        ctx.put("lcm_status_code_webapi",String.valueOf("")); 
        ctx.put("wb_acc_webapi_client",String.valueOf(""));
        ctx.put("wb_acc_id_pp_id",String.valueOf("")); 
        ctx.put("step_d_A_webapi",String.valueOf(""));
        ctx.put("step_d_A_ldap",String.valueOf("")); 
        /************************************************************************************/
        
        ctx.put("wb_acc_name", name_val_list.getJSONObject("name").get("value").toString());
		ctx.put("pfx_login_usr", name_val_list.getJSONObject("wb_acc_pfx_login_usr").get("value").toString());
		ctx.put("wb_acc_type", name_val_list.getJSONObject("wb_acc_type").get("value").toString());
		ctx.put("wb_acc_crm_id",name_val_list.getJSONObject("id").get("value").toString());
		ctx.put("crm_acc_name", link_list.getJSONObject("account_name").get("value").toString());
		ctx.put("wb_acc_status", name_val_list.getJSONObject("wb_account_status").get("value").toString());
		ctx.put("wb_acc_webapi_client", name_val_list.getJSONObject("webapi_client_type").get("value").toString());
		ctx.put("wb_acc_webapi_client", name_val_list.getJSONObject("webapi_client_type").get("value").toString());
		ctx.put("wb_acc_labels", name_val_list.getJSONObject("sending_labels").get("value").toString());
		ctx.put("wb_acc_auto_purge",name_val_list.getJSONObject("purge_auto").get("value").toString());
		ctx.put("wb_acc_push_int", name_val_list.getJSONObject("wb_acc_push_int").get("value").toString());
		ctx.put("wb_acc_push_plage_horaire",name_val_list.getJSONObject("wb_acc_push_plage_horaire").get("value").toString());
		ctx.put("wb_acc_push_optout", name_val_list.getJSONObject("wb_acc_push_optout").get("value").toString());
        ctx.put("wb_acc_contact_id", name_val_list.getJSONObject("contact_id_c").get("value").toString());
        ctx.put("wb_acc_id_crm", name_val_list.getJSONObject("wb_acc_id").get("value").toString());
        ctx.put("wb_acc_ppal_id", name_val_list.getJSONObject("wb__wboard_account_id_c").get("value").toString());
        ctx.put("wb_acc_testing", name_val_list.getJSONObject("testing_account").get("value").toString());
		ctx.put("wb_acc_webapi", name_val_list.getJSONObject("webapi").get("value").toString()); 
		ctx.put("wb_account_bonus", name_val_list.getJSONObject("wb_account_bonus").get("value").toString()); 
		
		exchange.getOut().setHeaders(exchange.getIn().getHeaders());
	}
	
	public String getUUID()
	{
		UUID uuid = UUID.randomUUID();
	    String randomUUIDString = uuid.toString();
		return randomUUIDString;
	}
	

	
}

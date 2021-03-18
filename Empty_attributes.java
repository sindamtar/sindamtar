package com.ngtrend.lcmprov;

import java.util.Map;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import org.json.JSONException;

public class Empty_attributes implements Processor {

	@Override
	public void process(Exchange exchange) throws Exception, JSONException {
		// TODO Auto-generated method stub
		Map<String, Object> ctx = exchange.getProperties();
		/************
		 * les variables vides
		 ************************************************/
		ctx.put("lcm_step", String.valueOf(""));
		ctx.put("lcm_exception_description", String.valueOf(""));
		ctx.put("wb_acc_usr_email", String.valueOf(""));
		ctx.put("lcm_exception_step", String.valueOf(""));
		ctx.put("lcm_stepADR", String.valueOf(""));
		ctx.put("lcm_activate_date", String.valueOf(""));
		ctx.put("lcm_exception_msg", String.valueOf(""));
		ctx.put("Type_compte", String.valueOf(""));
		ctx.put("lcm_acc_billable", String.valueOf(""));
		ctx.put("lcm_step_desc", String.valueOf(""));
		ctx.put("lcm_desc_id_existe", String.valueOf(""));
		ctx.put("lcm_wb_acc_status", String.valueOf(""));
		ctx.put("lcm_user_password_user", String.valueOf(""));
		ctx.put("lcm_desc_id_existe_non", String.valueOf(""));
		ctx.put("lcm_Exec_desc", String.valueOf(""));
		ctx.put("lcm_wb_status_code", String.valueOf(""));
		ctx.put("wb_status_description_active", String.valueOf(""));
		ctx.put("wb_status_code_active", String.valueOf(""));
		ctx.put("status_code_active", String.valueOf(""));
		ctx.put("status_description_active", String.valueOf(""));
		ctx.put("account_billable_active", String.valueOf(""));
		ctx.put("account_id_active", String.valueOf(""));
		ctx.put("account_name_active", String.valueOf(""));
		ctx.put("account_status_active", String.valueOf(""));
		ctx.put("account_date_activation_active", String.valueOf(""));
		ctx.put("lcm_status_code", String.valueOf(""));
		ctx.put("lcm_account_id", String.valueOf(""));
		ctx.put("lcm_wb_status_description", String.valueOf(""));
		ctx.put("lcm_account_name", String.valueOf(""));
		ctx.put("lcm_admin_email", String.valueOf(""));
		ctx.put("lcm_admin_login", String.valueOf(""));
		ctx.put("lcm_admin_pwd", String.valueOf(""));
		ctx.put("lcm_status_description", String.valueOf(""));
		ctx.put("lcm_user_login_user", String.valueOf(""));
		ctx.put("lcm_wb_status_description_user", String.valueOf(""));
		ctx.put("lcm_account_name_user", String.valueOf(""));
		ctx.put("lcm_wb_status_code_user", String.valueOf(""));
		ctx.put("lcm_account_id_user", String.valueOf(""));
		ctx.put("lcm_status_code_user", String.valueOf(""));
		ctx.put("lcm_status_description_user", String.valueOf(""));
		ctx.put("lcm_user_email_user", String.valueOf(""));
		ctx.put("lcm_user_id_user", String.valueOf(""));
		ctx.put("lcm_status_description_a", String.valueOf(""));
		ctx.put("lcm_status_code_a", String.valueOf(""));
		ctx.put("wb_acc_usr_fname", String.valueOf(""));
		ctx.put("wb_acc_usr_sname", String.valueOf(""));
		ctx.put("lcm_error_description_a", String.valueOf(""));
		ctx.put("lcm_wb_acc_usr_crm_id_a", String.valueOf(""));
		ctx.put("lcm_status_description_u", String.valueOf(""));
		ctx.put("lcm_status_code_u", String.valueOf(""));
		ctx.put("lcm_error_description_u", String.valueOf(""));
		ctx.put("lcm_wb_acc_usr_crm_id_u", String.valueOf(""));
		ctx.put("lcm_status_description_c", String.valueOf(""));
		ctx.put("lcm_status_code_c", String.valueOf(""));
		ctx.put("lcm_error_description_c", String.valueOf(""));
		ctx.put("lcm_wb_acc_usr_crm_id_c", String.valueOf(""));
		ctx.put("lcm_status_description_w", String.valueOf(""));
		ctx.put("lcm_wb_acc_usr_crm_id_w", String.valueOf(""));
		ctx.put("lcm_status_code_w", String.valueOf(""));
		ctx.put("lcm_error_description_w", String.valueOf(""));
		ctx.put("lcm_status_description_ldap", String.valueOf(""));
		ctx.put("lcm_status_code_ldap", String.valueOf(""));
		ctx.put("lcm_status_description_webapi", String.valueOf(""));
		ctx.put("lcm_status_code_webapi", String.valueOf(""));
		ctx.put("wb_acc_webapi_client", String.valueOf(""));
		ctx.put("wb_acc_id_pp_id", String.valueOf(""));
		ctx.put("step_d_A_webapi", String.valueOf(""));
		ctx.put("step_d_A_ldap", String.valueOf(""));
		ctx.put("wb_offer_existe", String.valueOf(""));
		ctx.put("lcm_credit_billable", String.valueOf(""));
		ctx.put("lcm_credit_type", String.valueOf(""));
		ctx.put("lcm_credit_volume", String.valueOf(""));
		ctx.put("lcm_stepRecharge", String.valueOf(""));
		ctx.put("lcm_wb_doc_existe", String.valueOf(""));
		ctx.put("wb_offer_stage_status", String.valueOf(""));
		ctx.put("wb_offer_existe", String.valueOf(""));
		ctx.put("lcm_stepoffre", String.valueOf(""));
		ctx.put("lcm_wb_status_code_offer", String.valueOf(""));
		ctx.put("lcm_wb_status_description_offer", String.valueOf(""));
		ctx.put("lcm_status_code_offer", String.valueOf(""));
		ctx.put("lcm_status_description_offer", String.valueOf(""));
		ctx.put("lcm_account_id_offer", String.valueOf(""));
		ctx.put("lcm_account_name_offer", String.valueOf(""));
		ctx.put("lcm_wb_product_name_offer", String.valueOf(""));
		ctx.put("lcm_next_billing_offer", String.valueOf(""));
		ctx.put("lcm_offer_name_offer", String.valueOf(""));
		ctx.put("lcm_offer_id_offer", String.valueOf(""));
		ctx.put("wb_status_code_upDF1", String.valueOf(""));
		ctx.put("wb_status_description_upDF1", String.valueOf(""));
		ctx.put("status_code_upDF1", String.valueOf(""));
		ctx.put("status_description_upDF1", String.valueOf(""));
		ctx.put("account_id_upDF1", String.valueOf(""));
		ctx.put("product_name_upDF1", String.valueOf(""));
		ctx.put("next_billing_upDF1", String.valueOf(""));
		ctx.put("offer_name_upDF1", String.valueOf(""));
		ctx.put("offer_id_upDF1", String.valueOf(""));
		ctx.put("last_billing_upDF1", String.valueOf(""));
		ctx.put("account_name_upDF1", String.valueOf(""));
		ctx.put("last_payment_upDF1", String.valueOf(""));
		ctx.put("offer_ref_upDF1", String.valueOf(""));
		ctx.put("offer_name1", String.valueOf(""));
		ctx.put("reference1", String.valueOf(""));
		ctx.put("last_billing1", String.valueOf(""));
		ctx.put("account_name1", String.valueOf(""));
		ctx.put("offer_name2", String.valueOf(""));
		ctx.put("reference2", String.valueOf(""));
		ctx.put("last_billing2", String.valueOf(""));
		ctx.put("account_name2", String.valueOf(""));

		ctx.put("offer_name0", String.valueOf(""));
		ctx.put("reference0", String.valueOf(""));
		ctx.put("last_billing0", String.valueOf(""));
		ctx.put("account_name0", String.valueOf(""));
    
		
		ctx.put("offer_name0", String.valueOf(""));
		ctx.put("next_billing0", String.valueOf(""));
		ctx.put("last_billing0", String.valueOf(""));
		ctx.put("last_payment0", String.valueOf(""));
		ctx.put("offer_name1", String.valueOf(""));
		ctx.put("next_billing1", String.valueOf(""));
		ctx.put("last_billing1", String.valueOf(""));
		ctx.put("last_payment1", String.valueOf(""));	
		 
		ctx.put("attrib1_RC", String.valueOf(""));	
		ctx.put("attrib1_RC0", String.valueOf(""));	
		ctx.put("attrib2_RC", String.valueOf(""));	
		ctx.put("attrib2_RC0", String.valueOf(""));	
		ctx.put("attrib3_RC", String.valueOf(""));	
		ctx.put("attrib3_RC0", String.valueOf(""));	
		ctx.put("attrib4_RC", String.valueOf(""));	
		ctx.put("attrib4_RC0", String.valueOf(""));	
		ctx.put("attrib5_RC", String.valueOf(""));	
		ctx.put("attrib5_RC0", String.valueOf(""));	
		ctx.put("attrib9_RC", String.valueOf(""));	
		ctx.put("attrib9_RC0", String.valueOf(""));	
		
		
		
		
		ctx.put("attrib1_RC1", String.valueOf(""));	
		ctx.put("attrib2_RC1", String.valueOf(""));	
		ctx.put("attrib3_RC1", String.valueOf(""));	
		ctx.put("attrib4_RC1", String.valueOf(""));	
		ctx.put("attrib5_RC1", String.valueOf(""));	
		ctx.put("attrib9_RC1", String.valueOf(""));
		
		ctx.put("attrib1_RC2", String.valueOf(""));	
		ctx.put("attrib2_RC2", String.valueOf(""));	
		ctx.put("attrib3_RC2", String.valueOf(""));	
		ctx.put("attrib4_RC2", String.valueOf(""));	
		ctx.put("attrib5_RC2", String.valueOf(""));	
		ctx.put("attrib9_RC2", String.valueOf(""));
		
		ctx.put("attrib1_RP", String.valueOf(""));	
		ctx.put("attrib1_RP0", String.valueOf(""));	
		ctx.put("attrib3_RP", String.valueOf(""));	
		ctx.put("attrib3_RP0", String.valueOf(""));	
		ctx.put("attrib4_RP", String.valueOf(""));	
		ctx.put("attrib4_RP0", String.valueOf(""));	
		ctx.put("attrib5_RP", String.valueOf(""));	
		ctx.put("attrib5_RP0", String.valueOf(""));	
		ctx.put("attrib6_RP", String.valueOf(""));	
		ctx.put("attrib6_RP0", String.valueOf(""));	
		ctx.put("attrib8_RP", String.valueOf(""));	
		ctx.put("attrib8_RP0", String.valueOf(""));	
		
		ctx.put("attrib1_RP1", String.valueOf(""));	
		ctx.put("attrib3_RP1", String.valueOf(""));	
		ctx.put("attrib4_RP1", String.valueOf(""));	
		ctx.put("attrib5_RP1", String.valueOf(""));	
		ctx.put("attrib6_RP1", String.valueOf(""));	
		ctx.put("attrib8_RP1", String.valueOf(""));	
		ctx.put("attrib1_RP2", String.valueOf(""));	
		ctx.put("attrib3_RP2", String.valueOf(""));	
		ctx.put("attrib4_RP2", String.valueOf(""));	
		ctx.put("attrib5_RP2", String.valueOf(""));	
		ctx.put("attrib6_RP2", String.valueOf(""));	
		ctx.put("attrib8_RP2", String.valueOf(""));	
		ctx.put("none_c1", String.valueOf(""));
		ctx.put("none_c0", String.valueOf(""));
		ctx.put("none_p1", String.valueOf(""));
		ctx.put("none_p0", String.valueOf(""));
		ctx.put("noneC0", String.valueOf("none"));
		ctx.put("noneC1", String.valueOf("none"));
		ctx.put("noneC2", String.valueOf("none"));
		ctx.put("noneP0", String.valueOf("none"));
		ctx.put("noneP1", String.valueOf("none"));
		ctx.put("noneP2", String.valueOf("none"));
		ctx.put("lcm_table0",String.valueOf("none"));
		ctx.put("lcm_table1",String.valueOf("none"));
		ctx.put("lcm_table2",String.valueOf("none"));
		ctx.put("inter_none",String.valueOf("none"));
		ctx.put("offre_none_recharge_credit",String.valueOf(""));
		ctx.put("none_recharge_credit",String.valueOf(""));
		ctx.put("erreur",String.valueOf(""));
		ctx.put("err1",String.valueOf("none"));
		ctx.put("err2",String.valueOf("none"));
		ctx.put("err3",String.valueOf("none"));
		ctx.put("wb_status_description_upDF0", String.valueOf(""));
		ctx.put("wb_status_code_upDF0", String.valueOf(""));
		ctx.put("status_code_upDF0", String.valueOf(""));
		ctx.put("status_description_upDF0", String.valueOf(""));
		ctx.put("account_id_upDF0", String.valueOf(""));
		ctx.put("product_name_upDF0", String.valueOf(""));
		ctx.put("next_billing_upDF0", String.valueOf(""));
		ctx.put("offer_name_upDF0", String.valueOf(""));
		ctx.put("offer_id_upDF0", String.valueOf(""));
		ctx.put("last_billing_upDF0", String.valueOf(""));
		ctx.put("account_name_upDF0", String.valueOf(""));
		ctx.put("last_payment_upDF0", String.valueOf(""));
		ctx.put("offer_ref_upDF0", String.valueOf(""));
		ctx.put("wb_status_code_upDF2", String.valueOf(""));
		ctx.put("wb_status_description_upDF2", String.valueOf(""));
		ctx.put("wb_status_description_upDF3", String.valueOf(""));
		ctx.put("status_code_upDF2", String.valueOf(""));
		ctx.put("status_description_upDF2", String.valueOf(""));
		ctx.put("account_id_upDF2", String.valueOf(""));
		ctx.put("product_name_upDF2", String.valueOf(""));
		ctx.put("next_billing_upDF2", String.valueOf(""));
		ctx.put("offer_name_upDF2", String.valueOf(""));
		ctx.put("offer_id_upDF2", String.valueOf(""));
		ctx.put("last_billing_upDF2", String.valueOf(""));
		ctx.put("account_name_upDF2", String.valueOf(""));
		ctx.put("last_payment_upDF2", String.valueOf(""));
		ctx.put("offer_ref_upDF2", String.valueOf(""));
		ctx.put("wb_status_code_upDR1", String.valueOf(""));
		ctx.put("wb_status_description_upDR1", String.valueOf(""));
		ctx.put("status_code_upDR1", String.valueOf(""));
		ctx.put("status_description_upDR1", String.valueOf(""));
		ctx.put("account_id_upDR1", String.valueOf(""));
		ctx.put("product_name_upDR1", String.valueOf(""));
		ctx.put("next_billing_upDR1", String.valueOf(""));
		ctx.put("offer_name_upDR1", String.valueOf(""));
		ctx.put("offer_id_upDR1", String.valueOf(""));
		ctx.put("last_billing_upDR1", String.valueOf(""));
		ctx.put("reference_upDR1", String.valueOf(""));
		ctx.put("account_name_upDR1", String.valueOf(""));
		ctx.put("last_payment_upDR1", String.valueOf(""));
		ctx.put("lcm_desc_wb_q_i_diff", String.valueOf(""));
		ctx.put("lcm_desc_quotes_number", String.valueOf(""));
		ctx.put("lcm_none", String.valueOf("none"));
		ctx.put("none", String.valueOf("none"));
		ctx.put("offre_none", String.valueOf("none"));
		ctx.put("chat_none", String.valueOf("none"));
		ctx.put("webapi_none", String.valueOf("none"));
		ctx.put("lcm_rela_exp", String.valueOf(""));
		ctx.put("lcm_relation_quotes", String.valueOf(""));
		ctx.put("lcm_products_quotes", String.valueOf(""));
		ctx.put("lcm_rel_quotes_credit", String.valueOf(""));
		ctx.put("attrib1_F1", String.valueOf(""));
		ctx.put("attrib2_F1", String.valueOf(""));
		ctx.put("attrib3_F1", String.valueOf(""));
		ctx.put("attrib4_F1", String.valueOf(""));
		ctx.put("attrib5_F1", String.valueOf(""));
		ctx.put("attrib6_F1", String.valueOf(""));
		ctx.put("attrib7_F1", String.valueOf(""));
		ctx.put("attrib8_F1", String.valueOf(""));
		ctx.put("attrib9_F1", String.valueOf(""));
		ctx.put("attrib10_F1", String.valueOf(""));
		ctx.put("attrib1_F0", String.valueOf(""));
		ctx.put("attrib2_F0", String.valueOf(""));
		ctx.put("attrib3_F0", String.valueOf(""));
		ctx.put("attrib4_F0", String.valueOf(""));
		ctx.put("attrib5_F0", String.valueOf(""));
		ctx.put("attrib6_F0", String.valueOf(""));
		ctx.put("attrib7_F0", String.valueOf(""));
		ctx.put("attrib8_F0", String.valueOf(""));
		ctx.put("attrib9_F0", String.valueOf(""));
		ctx.put("attrib10_F0", String.valueOf(""));

		ctx.put("attrib1_F3", String.valueOf(""));
		ctx.put("attrib2_F3", String.valueOf(""));
		ctx.put("attrib3_F3", String.valueOf(""));
		ctx.put("attrib4_F3", String.valueOf(""));
		ctx.put("attrib5_F3", String.valueOf(""));
		ctx.put("attrib6_F3", String.valueOf(""));
		ctx.put("attrib7_F3", String.valueOf(""));
		ctx.put("attrib8_F3", String.valueOf(""));
		ctx.put("attrib9_F3", String.valueOf(""));
		ctx.put("attrib10_F3", String.valueOf(""));
		ctx.put("attrib1_F2", String.valueOf(""));
		ctx.put("attrib2_F2", String.valueOf(""));
		ctx.put("attrib3_F2", String.valueOf(""));
		ctx.put("attrib4_F2", String.valueOf(""));
		ctx.put("attrib5_F2", String.valueOf(""));
		ctx.put("attrib6_F2", String.valueOf(""));
		ctx.put("attrib7_F2", String.valueOf(""));
		ctx.put("attrib8_F2", String.valueOf(""));
		ctx.put("attrib9_F2", String.valueOf(""));
		ctx.put("attrib10_F2", String.valueOf(""));
		ctx.put("attrib1_R0", String.valueOf(""));
		ctx.put("attrib2_R0", String.valueOf(""));
		ctx.put("attrib3_R0", String.valueOf(""));
		ctx.put("attrib4_R0", String.valueOf(""));
		ctx.put("attrib5_R0", String.valueOf(""));
		ctx.put("attrib6_R0", String.valueOf(""));
		ctx.put("attrib7_R0", String.valueOf(""));
		ctx.put("attrib8_R0", String.valueOf(""));
		ctx.put("attrib9_R0", String.valueOf(""));
		ctx.put("attrib10_R0", String.valueOf(""));
		
		ctx.put("attrib1_R1", String.valueOf(""));
		ctx.put("attrib2_R1", String.valueOf(""));
		ctx.put("attrib3_R1", String.valueOf(""));
		ctx.put("attrib4_R1", String.valueOf(""));
		ctx.put("attrib5_R1", String.valueOf(""));
		ctx.put("attrib6_R1", String.valueOf(""));
		ctx.put("attrib7_R1", String.valueOf(""));
		ctx.put("attrib8_R1", String.valueOf(""));
		ctx.put("attrib9_R1", String.valueOf(""));
		ctx.put("attrib10_R1", String.valueOf(""));
		ctx.put("attrib1_R0", String.valueOf(""));
		ctx.put("attrib2_R0", String.valueOf(""));
		ctx.put("attrib3_R0", String.valueOf(""));
		ctx.put("attrib4_R0", String.valueOf(""));
		ctx.put("attrib5_R0", String.valueOf(""));
		ctx.put("attrib6_R0", String.valueOf(""));
		ctx.put("attrib7_R0", String.valueOf(""));
		ctx.put("attrib8_R0", String.valueOf(""));
		ctx.put("attrib9_R0", String.valueOf(""));
		ctx.put("attrib10_R0", String.valueOf(""));
		ctx.put("attrib1_R2", String.valueOf(""));
		ctx.put("attrib2_R2", String.valueOf(""));
		ctx.put("attrib3_R2", String.valueOf(""));
		ctx.put("attrib4_R2", String.valueOf(""));
		ctx.put("attrib5_R2", String.valueOf(""));
		ctx.put("attrib6_R2", String.valueOf(""));
		ctx.put("attrib7_R2", String.valueOf(""));
		ctx.put("attrib8_R2", String.valueOf(""));
		ctx.put("attrib9_R2", String.valueOf(""));
		ctx.put("attrib10_R2", String.valueOf(""));
		
		ctx.put("product_name_upDR0", String.valueOf(""));
		ctx.put("product_name_upDR1", String.valueOf(""));
		ctx.put("product_name_upDR2", String.valueOf(""));
		ctx.put("next_billing_upDR0", String.valueOf(""));
		ctx.put("next_billing_upDR1", String.valueOf(""));
		ctx.put("next_billing_upDR2", String.valueOf(""));
		
		ctx.put("offer_name_upDR0", String.valueOf(""));
		ctx.put("offer_name_upDR1", String.valueOf(""));
		ctx.put("offer_name_upDR2", String.valueOf(""));
		
		ctx.put("offer_id_upDR0", String.valueOf(""));
		ctx.put("offer_id_upDR1", String.valueOf(""));
		ctx.put("offer_id_upDR2", String.valueOf(""));
		
		ctx.put("offer_ref_upDR0", String.valueOf(""));
		ctx.put("offer_ref_upDR1", String.valueOf(""));
		ctx.put("offer_ref_upDR2", String.valueOf(""));
		ctx.put("last_payment_upDR0", String.valueOf(""));
		ctx.put("last_payment_upDR1", String.valueOf(""));
		ctx.put("last_payment_upDR2", String.valueOf(""));
		
		ctx.put("last_billing_upDR0", String.valueOf(""));
		ctx.put("last_billing_upDR1", String.valueOf(""));
		ctx.put("last_billing_upDR2", String.valueOf(""));
		
		ctx.put("account_name_upDR", String.valueOf(""));
		ctx.put("account_name", String.valueOf(""));
		ctx.put("wb_status_description_upDR", String.valueOf(""));
		ctx.put("wb_status_code_upDR", String.valueOf(""));
		ctx.put("account_id_upDR", String.valueOf(""));
		
		ctx.put("lcm_offres_nones", String.valueOf("none"));
		
		
		ctx.put("lcm_attribs_nones", String.valueOf("none"));
		ctx.put("none_p", String.valueOf(""));
		
		ctx.put("none_c", String.valueOf(""));
		
		
		
		ctx.put("attrib_F1", String.valueOf(""));
		ctx.put("attrib_F2", String.valueOf(""));

		ctx.put("Attrib11", String.valueOf(""));
		ctx.put("Attrib21", String.valueOf(""));
		ctx.put("Attrib31", String.valueOf(""));
		ctx.put("Attrib41", String.valueOf(""));
		ctx.put("Attrib51", String.valueOf(""));
		ctx.put("Attrib61", String.valueOf(""));
		ctx.put("Attrib71", String.valueOf(""));
		ctx.put("Attrib81", String.valueOf(""));
		ctx.put("Attrib91", String.valueOf(""));
		ctx.put("Attrib101", String.valueOf(""));
      
		ctx.put("Attrib1", String.valueOf(""));
		ctx.put("Attrib2", String.valueOf(""));
		ctx.put("Attrib3", String.valueOf(""));
		ctx.put("Attrib4", String.valueOf(""));
		ctx.put("Attrib5", String.valueOf(""));
		ctx.put("Attrib6", String.valueOf(""));
		ctx.put("Attrib7", String.valueOf(""));
		ctx.put("Attrib8", String.valueOf(""));
		ctx.put("Attrib9", String.valueOf(""));
		ctx.put("Attrib10", String.valueOf(""));

		
		
		
		ctx.put("Attrib10", String.valueOf(""));
		ctx.put("Attrib20", String.valueOf(""));
		ctx.put("Attrib30", String.valueOf(""));
		ctx.put("Attrib40", String.valueOf(""));
		ctx.put("Attrib50", String.valueOf(""));
		ctx.put("Attrib60", String.valueOf(""));
		ctx.put("Attrib70", String.valueOf(""));
		ctx.put("Attrib80", String.valueOf(""));
		ctx.put("Attrib90", String.valueOf(""));
		ctx.put("Attrib110", String.valueOf(""));
		ctx.put("lcm_attrib_nones_offre0", String.valueOf("none"));
		ctx.put("lcm_attrib_nones_erreur0", String.valueOf("none"));
		ctx.put("lcm_attrib_nones_offre1", String.valueOf("none"));
		ctx.put("lcm_attrib_nones_erreur1", String.valueOf("none"));
		ctx.put("lcm_attrib_nones_erreur", String.valueOf("none"));

		ctx.put("lcm_attrib_nones_offre2", String.valueOf("none"));
		ctx.put("lcm_attrib_nones_erreur2", String.valueOf("none"));

		ctx.put("Attrib12", String.valueOf(""));
		ctx.put("Attrib22", String.valueOf(""));
		ctx.put("Attrib32", String.valueOf(""));
		ctx.put("Attrib42", String.valueOf(""));
		ctx.put("Attrib52", String.valueOf(""));
		ctx.put("Attrib62", String.valueOf(""));
		ctx.put("Attrib72", String.valueOf(""));
		ctx.put("Attrib82", String.valueOf(""));
		ctx.put("Attrib92", String.valueOf(""));
		ctx.put("Attrib102", String.valueOf(""));
		
		ctx.put("lcm_attrib_none", String.valueOf("none"));
		ctx.put("lcm_attrib_nones0", String.valueOf("none"));
		ctx.put("lcm_attrib_nones1", String.valueOf("none"));
		ctx.put("lcm_attrib_nones2", String.valueOf("none"));
		ctx.put("lcm_none_pfx", String.valueOf("none"));
		ctx.put("lcm_none_pfxx", String.valueOf("none"));
		ctx.put("lcm_success0", String.valueOf("none"));
		ctx.put("lcm_erreur_miss0", String.valueOf("none"));
		ctx.put("lcm_erreur_no_offres0", String.valueOf("none"));
		ctx.put("desc_10", String.valueOf("none"));
		ctx.put("desc_20", String.valueOf("none"));
		ctx.put("desc_30", String.valueOf("none"));
		ctx.put("lcm_success1", String.valueOf("none"));
		ctx.put("lcm_erreur_miss1", String.valueOf("none"));
		ctx.put("lcm_erreur_no_offres1", String.valueOf("none"));
		ctx.put("desc_11", String.valueOf("none"));
		ctx.put("desc_21", String.valueOf("none"));
		ctx.put("desc_31", String.valueOf("none"));
		ctx.put("lcm_success2", String.valueOf("none"));
		ctx.put("lcm_erreur_miss2", String.valueOf("none"));
		ctx.put("lcm_erreur_no_offres2", String.valueOf("none"));
		ctx.put("desc_12", String.valueOf("none"));
		ctx.put("desc_22", String.valueOf("none"));
		ctx.put("desc_32", String.valueOf("none"));
		ctx.put("lcm_c0", String.valueOf("none"));
		ctx.put("lcm_p0", String.valueOf("none"));
		ctx.put("lcm_c1", String.valueOf("none"));
		ctx.put("lcm_p1", String.valueOf("none"));
		ctx.put("lcm_c2", String.valueOf("none"));
		ctx.put("lcm_p2", String.valueOf("none"));
		ctx.put("lcm_erreur_out", String.valueOf(""));
		ctx.put("worn0", String.valueOf(""));
		ctx.put("worn1", String.valueOf(""));
		ctx.put("worn2", String.valueOf(""));
		
		ctx.put("lcm_style_price_c0", String.valueOf("success"));
		ctx.put("lcm_style_price_c1", String.valueOf("success"));
		ctx.put("lcm_style_price_c2", String.valueOf("success"));
		
		ctx.put("lcm_style_remise_c0", String.valueOf("success"));
		ctx.put("lcm_style_remise_c1", String.valueOf("success"));
		ctx.put("lcm_style_remise_c2", String.valueOf("success"));
		
		
		ctx.put("lcm_style_tva_c1", String.valueOf("success"));
		ctx.put("lcm_style_tva_c2", String.valueOf("success"));
		ctx.put("lcm_style_tva_c0", String.valueOf("success"));
		
		ctx.put("lcm_style_price_p0", String.valueOf("success"));
		ctx.put("lcm_style_price_p1", String.valueOf("success"));
		ctx.put("lcm_style_price_p2", String.valueOf("success"));
		
		ctx.put("lcm_style_remise_p0", String.valueOf("success"));
		ctx.put("lcm_style_remise_p1", String.valueOf("success"));
		ctx.put("lcm_style_remise_p2", String.valueOf("success"));
		
		
		ctx.put("lcm_style_tva_p1", String.valueOf("success"));
		ctx.put("lcm_style_tva_p0", String.valueOf("success"));
		ctx.put("lcm_style_tva_p2", String.valueOf("success"));
		
		
		
		
		ctx.put("lcm_style_bonus_c0", String.valueOf("success"));
		ctx.put("lcm_style_bonus_c1", String.valueOf("success"));
		ctx.put("lcm_style_bonus_c2", String.valueOf("success"));
		
		ctx.put("lcm_style_P_number0", String.valueOf("success"));
		ctx.put("lcm_style_P_number1", String.valueOf("success"));
		ctx.put("lcm_style_P_number2", String.valueOf("success"));
		
		
		ctx.put("lcm_none_p0", String.valueOf("none"));
		ctx.put("lcm_none_p1", String.valueOf("none"));
		ctx.put("lcm_none_p2", String.valueOf("none"));
		ctx.put("lcm_none_c0", String.valueOf("none"));
		ctx.put("lcm_none_c1", String.valueOf("none"));
		ctx.put("lcm_none_c2", String.valueOf("none"));
		ctx.put("lcm_number20", String.valueOf(""));
		ctx.put("lcm_number21", String.valueOf(""));
		ctx.put("lcm_number22", String.valueOf(""));
		
		ctx.put("lcm_wb_price0", String.valueOf(""));
		ctx.put("lcm_wb_remise0", String.valueOf(""));
		ctx.put("lcm_wb_tva0", String.valueOf(""));
		ctx.put("lcm_wb_bonus0", String.valueOf(""));
		ctx.put("lcm_wb_price1", String.valueOf(""));
		ctx.put("lcm_wb_remise1", String.valueOf(""));
		ctx.put("lcm_wb_tva1", String.valueOf(""));
		ctx.put("lcm_wb_bonus1", String.valueOf(""));
		ctx.put("lcm_wb_price2", String.valueOf(""));
		ctx.put("lcm_wb_remise2", String.valueOf(""));
		ctx.put("lcm_wb_tva2", String.valueOf(""));
		ctx.put("lcm_wb_bonus2", String.valueOf(""));
		ctx.put("lcm_none_reg", String.valueOf("none"));
		ctx.put("lcm_none_fac", String.valueOf("none"));
		ctx.put("lcm_number10", String.valueOf(""));
		ctx.put("lcm_number11", String.valueOf(""));
		ctx.put("lcm_number12", String.valueOf(""));
		ctx.put("part_number21", String.valueOf(""));
		ctx.put("part_number20", String.valueOf(""));
		ctx.put("part_number22", String.valueOf(""));
		ctx.put("lcm_wb_acc_id_Q", String.valueOf(""));
		ctx.put("wb_acc_id_Q", String.valueOf(""));
		ctx.put("not_found_part_number", String.valueOf(""));
		ctx.put("crm_ip", String.valueOf(""));
		ctx.put("crm_path", String.valueOf(""));
		ctx.put("wb_ip", String.valueOf(""));
		ctx.put("wb_path", String.valueOf(""));
		ctx.put("lcm_operation_date_fac", String.valueOf(""));
		ctx.put("lcm_wb_invoice_name", String.valueOf(""));
		ctx.put("lcm_Account_crm_rel", String.valueOf(""));
		ctx.put("lcm_relation_wb_credit", String.valueOf(""));
		ctx.put("lcm_wb_invoice_id", String.valueOf(""));
		ctx.put("produit_name0", String.valueOf(""));
		ctx.put("produit_name1", String.valueOf(""));
		ctx.put("produit_name2", String.valueOf(""));
		ctx.put("lcm_Produit0", String.valueOf("none"));
		ctx.put("lcm_Produit1", String.valueOf("none"));
		ctx.put("lcm_Produit2", String.valueOf("none"));
		ctx.put("iter_num", String.valueOf(""));
		ctx.put("lcm_relation_not_exist", String.valueOf(""));
		ctx.put("lcm_relation_not_exist_offre", String.valueOf(""));
		ctx.put("lcm_relation_not_exist_credit", String.valueOf(""));

		
		exchange.getOut().setHeaders(exchange.getIn().getHeaders());

	}
}

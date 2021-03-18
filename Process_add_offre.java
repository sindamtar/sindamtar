package com.ngtrend.lcmprov;

import java.net.URLEncoder;
import java.text.DecimalFormat;
import java.util.Map;



import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import org.json.JSONException;



public class Process_add_offre implements Processor {
    
	@Override 
	public void process(Exchange exchange) throws Exception,JSONException {
		Map<String,Object> prop= exchange.getProperties();
		String produit=prop.get("produit").toString();
		
		DecimalFormat f =new DecimalFormat("#.##");
		DecimalFormat c=new DecimalFormat("#.###");
  String query="";
  Double remise = Double.parseDouble(prop.get("wb_pro_remise").toString());
  Double tax = Double.parseDouble(prop.get("wb_pro_tax").toString());
  Double price = Double.parseDouble(prop.get("wb_pro_price").toString());
 switch (produit)
 {
	   case "1":/*création d'une offre pour produit wb account*/
		  query="op="+3
			+"&sub_op="+1
		    +"&wb_acc_id="+prop.get("wb_acc_id_crm").toString()
		    +"&wb_product_id="+prop.get("product-id").toString()
		    +"&wb_offer_name="+URLEncoder.encode(prop.get("wb_offer_name").toString(),"UTF-8") 
			+"&Wb_offer_desc="+URLEncoder.encode(prop.get("wb_offer_description").toString(),"UTF-8")
			+"&wb_date_today="+prop.get("wb_date_today").toString()
		    +"&wb_offer_attrib1="+prop.get("wb_active_date").toString() 
			+"&wb_offer_attrib2="+c.format(price)
			+"&wb_offer_attrib3="+f.format(remise)
			+"&wb_offer_attrib4="+f.format(tax)
			+"&wb_offer_attrib5="+prop.get("wb_account_bonus").toString() 
			+"&wb_offer_attrib6="+1
			+"&wb_offer_attrib7="+100
			+"&wb_offer_attrib8="+60
			+"&wb_offer_attrib9="+prop.get("wb_acc_type_V").toString() 
			+"&wb_offer_attrib24="+prop.get("wb_offer_wb_id").toString()
			+"&wb_offer_attrib25="+prop.get("wb_offer_number").toString()
			+"&res_type="+"JSON";
			break;
		   case "2": /*création d'une offre pour produit PackSMS*/
		   query="op="+3
			+"&sub_op="+1
		    +"&wb_acc_id="+prop.get("account_id").toString()
		    +"&wb_product_id="+prop.get("wb_produit_ids").toString()
		    +"&wb_offer_name="+URLEncoder.encode(prop.get("wb_offer_name").toString(),"UTF-8") 
			+"&Wb_offer_desc="+URLEncoder.encode(prop.get("wb_offer_description").toString(),"UTF-8")
			+"&wb_date_today="+prop.get("wb_date_today").toString()
		    +"&wb_offer_attrib1="+prop.get("wb_credit_value").toString()  
			+"&wb_offer_attrib3="+prop.get("wb_active_date").toString() 
			+"&wb_offer_attrib4="+c.format(price)
			+"&wb_offer_attrib5="+f.format(remise)
			+"&wb_offer_attrib6="+f.format(tax)
			+"&wb_offer_attrib8="+prop.get("wb_credit_type_val").toString()
		 	+"&wb_offer_attrib24="+prop.get("wb_offre_credit_id").toString()
			+"&wb_offer_attrib25="+prop.get("wb_offer_number").toString()
			+"&res_type="+"JSON";
			break; 
			
	}
	    exchange.getOut().setHeaders(exchange.getIn().getHeaders());
		exchange.getOut().setBody(query);
		
	}
		
	}



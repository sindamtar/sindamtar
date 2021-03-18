package com.ngtrend.lcmprov;
import java.io.File;

import javax.activation.DataHandler;

import javax.activation.FileDataSource;

import org.apache.camel.Exchange;
import org.apache.camel.Message;
import org.apache.camel.Processor;




public class SetMailAttachments implements Processor {


	@Override
	public void process(Exchange exchange) throws Exception {
// TODO Auto-generated method stub
  
		Message in = exchange.getIn();	
		Message out = exchange.getOut();
		exchange.getOut().setHeaders(in.getHeaders());
		exchange.getOut().setAttachments(in.getAttachments());
		File attFile = new File(in.getHeader("AttachmentPath").toString());
	    String name = in.getHeader("AttachmentName",String.class);
        out.addAttachment(name, new  DataHandler(new FileDataSource(attFile)));
     }                

	
}

	
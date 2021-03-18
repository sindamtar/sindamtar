package com.ngtrend.lcmprov;

import java.util.Map;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.component.shiro.security.ShiroSecurityConstants;
import org.apache.shiro.codec.Base64;

public class LcmAuthenticator implements Processor {

	@Override
	public void process(Exchange exchange) throws Exception {
		// TODO Auto-generated method stub
		Map<String,Object> headers= exchange.getIn().getHeaders();
		Boolean credentialsSet = Boolean.FALSE; 
		
		// get the username and password from the HTTP header
        // http://en.wikipedia.org/wiki/Basic_access_authentication
		
		if(headers.containsKey("Authorization"))
		{
			String userpass = exchange.getIn().getHeader("Authorization",String.class);
			userpass = userpass.substring(userpass.indexOf(" ")+1);
			userpass =Base64.decodeToString(userpass);
			String[] tokens = userpass.split(":");
        
			if(tokens.length == 2)
			{
				headers.put(ShiroSecurityConstants.SHIRO_SECURITY_USERNAME, tokens[0]);
				headers.put(ShiroSecurityConstants.SHIRO_SECURITY_PASSWORD, tokens[1]);
				
				credentialsSet = Boolean.TRUE;
			}
		}
		if(!credentialsSet)
		{
			headers.put(Exchange.HTTP_RESPONSE_CODE, 401);
			headers.put("WWW-Authenticate", "Basic realm='Protected access'");
		}

        exchange.getOut().setHeaders(headers);
	}

}

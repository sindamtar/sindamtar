package com.ngtrend.lcmprov;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;


public class GetParams {
	@GET
    @Path("lcmprov")
	@Produces("text/html")
	public String getAssets(
		@QueryParam("op") String op,
		@QueryParam("accid") String accid,
		@QueryParam("opid") String opid)
    
    {            
        return null;
    }
	
	


}

package com.grofers.interview;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/storeservice")
public interface StoreService {
	
	@Path("/get")
	@GET
	String get(long key);
	
	@Path("/set")
	@POST
	Response set(long key,String value);
	
	@Path("/changeKey")
	@PUT
	Response updateKey(long key,String value);
	

}

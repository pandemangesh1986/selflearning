package com.learning.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

@Path("/message")
public class MessageRestService {

	/**
	 * http://localhost:8080/RestService/rest/message/Hello%20World
	 * @param msg
	 * @return
	 */
	@GET
	@Path("/{params}")
	public Response printMessage(@PathParam("params") String msg) {

		String result = "Restful example : " + msg;

		return Response.status(200).entity(result).build();

	}
	
	/**
	 * http://localhost:8080/RestService/rest/message/2017/02/12
	 * @param year
	 * @param month
	 * @param day
	 * @return
	 */
	@GET
	@Path("{year}/{month}/{day}")
	public Response getUserHistory(@PathParam("year") String year,
			@PathParam("month") String month,
			@PathParam("day") String day)
	{
		String resut = "Date provided  as (Year Month Day)" + year + " " + month + " " + day;
		
		return Response.status(200).entity(resut).build();
	}

}
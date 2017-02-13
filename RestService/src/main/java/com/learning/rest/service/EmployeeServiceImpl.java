package com.learning.rest.service;

import java.util.HashMap;
import java.util.Map;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.learning.rest.model.Employee;
import com.learning.rest.model.GenericResponse;

@Path("employee")
@Produces(MediaType.APPLICATION_XML)
public class EmployeeServiceImpl implements EmployeeService {

	private static Map<Integer, Employee> emps = new HashMap<Integer, Employee>();
	
	@POST
	@Path("/add")
	public Response addEmployee(Employee e) {
		// TODO Auto-generated method stub
		GenericResponse response = new GenericResponse();
		if(emps.get(e.getId())!=null)
		{
			response.setStatus(false);
			response.setMessage("Employee already Exist");
			response.setErrorCode("EC-01");
			return Response.status(422).entity(response).build();
		}
		emps.put(e.getId(), e);
		response.setStatus(true);
		response.setMessage("Employee Added successully");
		
		return Response.ok().entity(response).build();
	}

	public Response deleteEmployee(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public Employee getEmployee(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public Employee[] getAllEmployees() {
		// TODO Auto-generated method stub
		return null;
	}

}

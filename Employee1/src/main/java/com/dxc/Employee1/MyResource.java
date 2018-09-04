package com.dxc.Employee1;

import java.util.ArrayList;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Root resource (exposed at "myresource" path)
 */
@Path("myresource")
public class MyResource {

    /**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "text/plain" media type.
     *
     * @return String that will be returned as a text/plain response.
     */
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getIt() {
    	 EmployeeService.init();
        return "Got it!";
    }
    
   
    
    @POST
    @Path("add")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public String add(Employee input)
    {
    	EmployeeService.addEmp(input);
    	return "{\"status\":\"0\",\"message\":\"Successfuly added\"}";
    	
    }
    
    
    @GET
    @Path("getAllEmp")
    @Produces(MediaType.APPLICATION_JSON)
    public ArrayList<Employee> getAllEmp()
    {
    	
    	return EmployeeService.getAllEmployee();
    	
    }
    
    
    
    @GET
    @Path("getById/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Employee getEmpById(@PathParam("id") int id)
    {
    	
    	Employee e=EmployeeService.getEmpById(id);
    	return e;
  }
    
    
    @GET
    @Path("getByDept/{dept}")
    @Produces(MediaType.APPLICATION_JSON)
    public ArrayList<Employee>  getEmpByDept(@PathParam("dept") String dept)
    {
    	
    	ArrayList<Employee> dep=new ArrayList<Employee>();
    	dep.addAll(EmployeeService.getEmpByDept(dept));
    	return dep;
  }
    
    @GET
    @Path("getByMaxSal")
    @Produces(MediaType.APPLICATION_JSON)
    public Employee getEmpByMaxSal()
    {
    
    	Employee e=EmployeeService.getEmpByMaxSal();
    	return e;
    }
  
}

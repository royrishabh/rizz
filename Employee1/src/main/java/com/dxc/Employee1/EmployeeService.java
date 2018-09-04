package com.dxc.Employee1;

import java.util.ArrayList;

public class EmployeeService {

private static ArrayList<Employee> emp=new ArrayList<Employee>();
	
	public static void init() {
		// TODO Auto-generated constructor stub
		emp.add(new Employee(1,"Amitabh",50000.0,"sales"));
		emp.add(new Employee(2,"Krishna",35000.0,"IT"));
		emp.add(new Employee(3,"Amit",70000.0,"management"));
		emp.add(new Employee(4,"Ankit",45000.0,"sales"));
		emp.add(new Employee(5,"Shubham",49000.0,"management"));
	//System.out.println(emp);
	}
	
	public static void addEmp(Employee e)
	{
		emp.add(e);
	}
	
	public static ArrayList<Employee> getAllEmployee()
	{
		return emp;
	}
	
	public static Employee getEmpById(int id)
	{
		Employee found=null;
		int size=emp.size();
		for(int i=0;i<size;i++)
		{
			if(emp.get(i).getId()==id)
			{
				found=emp.get(i);
				break;
				
			}
			
		}
		return found;
	}
	
	public static ArrayList<Employee> getEmpByDept(String dept)
	{
		ArrayList<Employee> dep=new ArrayList<Employee>();
		Employee found=null;
		int size=emp.size();
		for(int i=0;i<size;i++)
		{
			if(emp.get(i).getDept().equals(dept))
			{
				dep.add(emp.get(i));
				
				
				
			}
			
		}
		return dep;
	}
	
	public static Employee getEmpByMaxSal()
	{
		Employee found=null;
		int size=emp.size();
		double max=emp.get(0).getSalary();
		for(int i=0;i<size;i++)
		{
			
			if(emp.get(i).getSalary()>max)
			{
				max=emp.get(i).getSalary();
				//found=emp.get(i);
				break;
				
			}
			
		}
		for(int i=0;i<size;i++)
		{
			
			if(emp.get(i).getSalary()==max)
			{
				
				found=emp.get(i);
				break;
				
			}
			
		}
		return found;
	}
	
	

}

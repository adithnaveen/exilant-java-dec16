package com.exilant.dao;

import java.util.ArrayList;
import java.util.List;

import com.exilant.beans.Employee;

public class EmployeeDAO {
	// all your CRUD operations go here 
	
	public boolean insertEmployee(Employee employee){
		// simulating the insert of emp
		
		System.out.println("Id " + employee.getEmpId());
		System.out.println("Name " + employee.getEmpName());
		System.out.println("Email " + employee.getEmpEmail());
		
		return true;
	}
	
	
	static List<Employee> list = new ArrayList<Employee>();
	static{
		list.add(new Employee(101, "kumar", "kumar@gmail.com"));
		list.add(new Employee(33, "Pooja", "pooja@gmail.com"));
		list.add(new Employee(55, "tharani", "tharani@gmail.com"));
		list.add(new Employee(345, "Devaraja", "devaraja@gmail.com"));
	}
	
	public List<Employee> getAllEmployees(){
		// assuming that you connection to DB and fetch the info 
		
		return list;
	}
}






















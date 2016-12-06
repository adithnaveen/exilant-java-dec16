package com.exilant.interfaces;

import java.util.List;

import com.exilant.beans.Employee;

// decl are defined here
public interface IEmployeeDAO {
	// CRUD 
	
	// insert 
	public boolean insertEmployee(Employee emp);
	
	// delete 
	public boolean deleteEmployee(int empId);
	
	// update 
	public boolean updateEmployee(int empId, double newSal);
	
	// select 
	public Employee getEmployee(int empId);
	
	// select all 
	public List<Employee> getAllEmps();
	
	
}



















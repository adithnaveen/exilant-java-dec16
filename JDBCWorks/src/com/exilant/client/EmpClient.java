package com.exilant.client;

import java.util.List;

import com.exilant.beans.Employee;
import com.exilant.dao.EmployeeDAO;
import com.exilant.interfaces.IEmployeeDAO;

public class EmpClient {
	public static void main(String[] args) {
		IEmployeeDAO empDao = new EmployeeDAO();
		
//		Employee emp = new Employee(103, "Karan", 3322, "karan@gmail.com");
//		
//		System.out.println(empDao.insertEmployee(emp)?"Inserted":"Not Inserted");
//		
		// System.out.println(empDao.getEmployee(101));
		
		
		List<Employee> list = empDao.getAllEmps();
		
		for(Employee temp : list){
			System.out.println(temp);
		}
	}
}

























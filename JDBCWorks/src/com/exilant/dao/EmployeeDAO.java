package com.exilant.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;

import com.exilant.beans.Employee;
import com.exilant.connection.GetConnection;
import com.exilant.interfaces.IEmployeeDAO;

public class EmployeeDAO implements IEmployeeDAO {

	@Override
	public boolean insertEmployee(Employee emp) {
		String sql="insert into employee values(?,?,?,?)";
		GetConnection gc = new GetConnection();
		try {
			gc.ps = GetConnection.getOracleConn().prepareStatement(sql);
			gc.ps.setInt(1, emp.getEmpId());
			gc.ps.setString(2, emp.getEmpName());
			gc.ps.setDouble(3, emp.getEmpSal());
			gc.ps.setString(4, emp.getEmpEmail());
			
			return gc.ps.executeUpdate() >0;
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			try {
				gc.ps.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return false;
		
	}

	@Override
	public boolean deleteEmployee(int empId) {

		GetConnection gc = new GetConnection();
		String sql ="delete from employee where empid =?";
		try {
			gc.ps = GetConnection.getOracleConn().prepareStatement(sql);
			gc.ps.setInt(1, empId);
			
			return gc.ps.executeUpdate()>0;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
		
	}

	@Override
	public boolean updateEmployee(int empId, double newSal) {

		String sql ="update employee set empsal = empsal +  ? where empid =?";
		GetConnection gc = new GetConnection();
		try {
			gc.ps = GetConnection.getOracleConn().prepareStatement(sql);
			gc.ps.setDouble(1, newSal);
			gc.ps.setInt(2, empId);
			
			return gc.ps.executeUpdate()>0;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public Employee getEmployee(int empId) {

		GetConnection gc = new GetConnection();
		String sql ="select empid, empname, empsal, empemail from employee where empid =?";
		try {
			gc.ps = GetConnection.getOracleConn().prepareStatement(sql);
			gc.ps.setInt(1, empId);
			
			gc.rs = gc.ps.executeQuery();
			
			// this starts from -1 
			if(gc.rs.next()){
				Employee emp = new Employee();
				emp.setEmpId(gc.rs.getInt(1));
				emp.setEmpName(gc.rs.getString("empname"));
				emp.setEmpSal(gc.rs.getDouble(3));
				emp.setEmpEmail(gc.rs.getString(4));
				return emp;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<Employee> getAllEmps() {
		String sql="select empid, empname, empsal, empemail from employee";
		GetConnection gc = new GetConnection();
		List<Employee> list = new ArrayList<Employee>();
		try {
			gc.ps = GetConnection.getOracleConn().prepareStatement(sql);
			
			gc.rs = gc.ps.executeQuery();
			
			while(gc.rs.next()){
				// here we create an object of emp, set the values 
				// then put it in list 
				Employee temp = new Employee(
					gc.rs.getInt(1), gc.rs.getString(2), 
					gc.rs.getDouble(3), gc.rs.getString(4));

				list.add(temp);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return list;
		
	}

}






























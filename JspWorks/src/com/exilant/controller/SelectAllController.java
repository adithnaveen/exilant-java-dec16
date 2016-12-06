package com.exilant.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.exilant.beans.Employee;
import com.exilant.dao.EmployeeDAO;

/**
 * Servlet implementation class SelectAllController
 */
@WebServlet("/selectall.do")
public class SelectAllController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Employee> emps = new EmployeeDAO().getAllEmployees();
		
		String path ="/WEB-INF/views/ShowEmps.jsp";
		request.setAttribute("EMPS", emps);
		request.getRequestDispatcher(path).forward(request, response);
	}
}


















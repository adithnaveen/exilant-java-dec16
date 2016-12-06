package com.exilant;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.exilant.beans.LoginInfo;

/**
 * Servlet implementation class HomeServlet
 */
@WebServlet("/Home1.do")
public class HomeServlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		
		LoginInfo loginInfo = (LoginInfo) request.getAttribute("LOGININFO");
		
		response.getWriter().println("<br />Welcome to Home page " + request.getParameter("uname"));
		response.getWriter().println("<hr/>All business stuffs goes here<hr />"); 
		response.getWriter().println("<hr/> Company Name " + loginInfo.getCompanyName()); 
		response.getWriter().println("<hr/>City " + loginInfo.getCity()); 
		response.getWriter().println("<hr/>Email " + loginInfo.getEmail()); 
		
	}
}

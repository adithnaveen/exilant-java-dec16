package com.exilant;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HomeServlet
 */
@WebServlet("/Home.do")
public class HomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		response.getWriter().println("Welcome to Home page " + request.getParameter("uname"));
		response.getWriter().println("<hr/>All business stuffs goes here<hr />"); 
		response.getWriter().println("<a href='Draft.do'>Draft</a>");
	}

}

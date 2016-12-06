package com.exilant;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/UserAccept.do")
public class UserAcceptServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uName = request.getParameter("uname");
		String sex = request.getParameter("sex");
		String [] hobbies = request.getParameterValues("hobbies");
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		out.println("Your Name " + uName);
		out.println("<br > You Are " + sex );
		out.println("Your Hobbies are : <br />");
		for(String temp : hobbies){
			out.print("<br> " + temp);
		}
		
	}

}
















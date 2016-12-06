package com.exilant;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/SessionExample")
public class SessionExample extends HttpServlet {
	int count; 
	public void init(){
		count  = Integer.parseInt(getServletContext().getInitParameter("count"));
		getServletContext().setAttribute("count", count);
	}
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		out.println("You have accessed web site " + count +" number of times ");
		count ++;
		
		getServletContext().setAttribute("count", new Integer(count).toString());
		
		
		
		out.println("<hr />Session id generated is " + session.getId());
		out.println("<hr /> Created on "+ new Date(  session.getCreationTime()));
		
		if(session.isNew()){
			out.println("Welcome First time User");
		}else{
			out.println("Welcome Again");
			out.println("<hr /> Again @ "+ new Date(session.getLastAccessedTime()));
			out.print("<hr />Your session expires in "+ session.getMaxInactiveInterval());
			session.setAttribute("val", "somthing goes here");
		}
		
//		
//		session.setMaxInactiveInterval(5);
		session.invalidate();
		
		
	}

}
















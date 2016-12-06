package com.exilant;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ShowMultiplication
 */
@WebServlet("/ShowMultiplication")
public class ShowMultiplication extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

			response.setContentType("text/html");
			PrintWriter out = response.getWriter();

			int val = Integer.parseInt(request.getParameter("val"));
			out.println("<html><body><table border='2'>");
			for(int i=1; i<=10; i++){
				// 10 x 1 = 20 
				// 10 x 2 = 20 
				out.println("<tr><td>" + val +" x " + i +" =  " +(val * i) +"</td></tr>");
			}

			out.print("</table></body></html>");
	}

}
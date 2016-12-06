package com.exilant;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloWorld
 */
public class HelloWorld extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		System.out.println("init called>>>>>>>>>>>>");
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		
		
		System.out.println("Destroy called>>>>>>>>>>>>> ");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// there are various format available 
		// like text/xml, application/json etc 
		response.setContentType("text/html");
		
		Date date = new Date();
		PrintWriter out = response.getWriter();
		
		out.println("<html>");
		out.print("<body>");
		out.print("<h1>Welcome to Servlets, From Naveen</h1>");
		out.print("<h2>Today is " + date +" </h2>");
		out.print("<script type='text/javascript'>");
		out.print("alert('hi');");
		out.print("</script>");
		out.print("</body>");
		out.print("</html>");
		
		out.close();
		
		
		
		
	}

}

























package com.exilant;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.exilant.beans.Login;
import com.exilant.beans.LoginInfo;
import com.exilant.dao.LoginDAO;
import com.exilant.objectcreators.ObjectCreators;

@WebServlet("/LoginValidateDB")
public class LoginValidateDB extends HttpServlet {
	private static final long serialVersionUID = 1L;

	LoginInfo loginInfo;
	public void init(){
		loginInfo = new LoginInfo();
		loginInfo.setCompanyName("EXILANT");
		loginInfo.setCity("BENGALURU");
		loginInfo.setEmail("info@exilant.com");
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// i want to insert login details to db 
		
		LoginDAO lDao = new LoginDAO();
		boolean flag = lDao.insertLogin(ObjectCreators.getLoginBean(request));
		
		if(flag){
			request.setAttribute("LOGININFO", loginInfo);
			request.getRequestDispatcher("Home1.do").forward(request, response);
		}else{
			request.getRequestDispatcher("LoginError.do?companyname=EXILANT").forward(request, response);
		}
		
	}

	
	
}

















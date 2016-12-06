package com.exilant.objectcreators;

import javax.servlet.http.HttpServletRequest;

import com.exilant.beans.Login;

public class ObjectCreators {

	public static Login getLoginBean(HttpServletRequest request){
		Login login = new Login();
		login.setuName(request.getParameter("uname"));
		login.setPwd(request.getParameter("pwd"));
		return login;
	}
	
}

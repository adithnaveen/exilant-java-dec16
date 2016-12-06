<%@page import="com.exilant.dao.EmployeeDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<jsp:useBean id="emp" class="com.exilant.beans.Employee" scope="request" />
<jsp:setProperty property="*" name="emp"/>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		if(new EmployeeDAO().insertEmployee(emp)){
			// forward it to Success.jsp
	%>
			<jsp:forward page="../views/Success.jsp">
				<jsp:param value="EXILANT" name="company"/>
			</jsp:forward>
	<%		
		}else{
			// include Failure.jsp with EmployeeForm.html
	%>
			<jsp:include page="../views/Failure.jsp"/>	
			<hr />
			<jsp:include page="../EmployeeForm.html"/>	
	<%
		}
	%>
</body>
</html>


























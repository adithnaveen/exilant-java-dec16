<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>Record Inserted Successfully</h2>
	<h2>Your Company is ${param.company }</h2>
	<jsp:useBean id="emp" class="com.exilant.beans.Employee" scope="request"/>
	
	Emp Id is :  <jsp:getProperty property="empId" name="emp"/><hr> 
	Emp Name is :  <jsp:getProperty property="empName" name="emp"/><hr>
	Emp Email is :  <jsp:getProperty property="empEmail" name="emp"/>
	
	
</body>
</html>
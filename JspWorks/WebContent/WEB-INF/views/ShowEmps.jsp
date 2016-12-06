<%@page import="com.exilant.beans.Employee"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="exi" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<table border="3">
		<tr>
			<th>EMPLOYEE ID</th>
			<th>EMPLOYEE NAME</th>
			<th>EMPLOYEE EMAIL</th>
		</tr>
	
		<exi:forEach items="${EMPS}" var="temp">
			<tr>
				<td>${temp.empId }</td>
				<td>${temp.empName }</td>
				<td>${temp.empEmail }</td>
			</tr>
		</exi:forEach>
	</table>
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
</body>
</html>
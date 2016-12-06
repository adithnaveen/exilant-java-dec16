<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page errorPage="ErrorPage.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<!--  this is for static content to get it  -->
<%@include file="Multiplication.html" %>
<!--  this is for dynamic content to get it 
and servlet equivalent is 
	request.getRequestDispatcher("Multiplication.html").include(request, response);
 -->
 <jsp:include page="Multiplication.html"/>


	<table border="3">
	<%
	
		// java code goes here 
		int val = Integer.parseInt(request.getParameter("val"));
		
	for(int i=1; i<=10; i++){
		// 10 x 1 = 10 
%>
	<tr>
		<td><%=val %> X <%= i  %> = <%=val*i %></td>
	</tr>
<%	
	} 
	
	%>
	</table>
</body>
</html>














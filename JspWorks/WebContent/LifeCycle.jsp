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

<%!
	// all methods go here 
	int count=0;

	public void jspInit(){
		// here you cannot access req, res 
		System.out.println("Init called>>>> ");
	}
	
	public void jspDestroy(){
		System.out.println("Destory called... ");
	}
	public int getCount(){
		return count ++;
	}
%>


<%
	// service method
	int count1=0; 
%>


<h1>Count value is <%=getCount() %></h1>
<h1>Count1 value is <%=count1 ++ %></h1>

<%
int i=0;
if(i==0)
	throw  new RuntimeException("i'm trying to throw somthing");
%>

</body>
</html>







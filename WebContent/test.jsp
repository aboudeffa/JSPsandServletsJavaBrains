<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@ page language="java" contentType="text/html; charset=windows-1256"
	pageEncoding="windows-1256"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type"
	content="text/html; charset=windows-1256">
<title>Test JSP</title>
</head>
<body>
	<h3>Testing Jsp's</h3>
	<%!int sum( int x, int y ) {
        return x + y;
    }%>

	<%
	    int a = 1;
	    int b = 2;
	    int c;

	    c = a + b;
	%>
	the value of c is
	<%=c%>

	<%--
	this is a method
	 --%>

	<%
	    int z = sum( 400, 500 );
	%>
	<br> The result is
	<%= z %>
	
	<% for (int i =0; i<5; i++){
	%> <br>
	The new value of i = <%= i %>
	<%} %>
</body>
</html>
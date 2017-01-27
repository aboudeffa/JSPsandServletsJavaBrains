<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=windows-1256"
    pageEncoding="windows-1256"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=windows-1256">
<title>Clock</title>
</head>
<body>

<%@include file="/hello.jsp" %>
<br><br>
The time is: <%= new Date() %>

</body>
</html>
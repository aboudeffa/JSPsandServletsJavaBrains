<%@ page language="java" contentType="text/html; charset=windows-1256"
	pageEncoding="windows-1256"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type"
	content="text/html; charset=windows-1256">
<title>Objects</title>
</head>
<body>

	<%
	    String userName = request.getParameter( "username" );
	    if ( userName != "" && userName != null ) {
	        session.setAttribute( "sessionSavedUser", userName );
	        application.setAttribute( "applicationSavedUser", userName );
	        pageContext.setAttribute( "pageContextSavedUser", userName );
	        pageContext.setAttribute( "applicationSavedUser", userName, pageContext.APPLICATION_SCOPE );
	        pageContext.findAttribute( "username" );
	    }
	%>
	<br /> The username in the request object is :
	<%= userName %>
	<br /> The username in the session object is :
	<%= session.getAttribute( "sessionSavedUser" ) %>
	<br /> The username in the application context object is :
	<%= application.getAttribute( "applicationSavedUser" ) %>
	<br /> The username in the page context object is :
	<%=pageContext.getAttribute( "pageContextSavedUser" )%>


</body>
</html>
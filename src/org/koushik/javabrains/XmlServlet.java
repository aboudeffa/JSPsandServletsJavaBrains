package org.koushik.javabrains;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class XmlServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		out.println("hello from the GET method "+req.getParameter("username"));
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		String username = req.getParameter("username");
		String fullname = req.getParameter("fullname");
		out.println("hello from the POST method "+username+"! \n We know that your full name is "+fullname);
		String prof = req.getParameter("prof");
		out.println("You 're a "+prof);
		//String location = req.getParameter("location");
		String[] location = req.getParameterValues("location");
		out.println("You 're at "+location.length+" places");
		for (String str : location)
			out.println("You 're "+str);
		
		
	}
}

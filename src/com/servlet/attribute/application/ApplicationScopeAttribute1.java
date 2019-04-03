package com.servlet.attribute.application;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ApplicationScopeAttribute1")
public class ApplicationScopeAttribute1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		ServletContext ctx = getServletContext();
		ctx.setAttribute("myname", "ABC");
		
		PrintWriter out = response.getWriter();
		out.append("Hello From ApplicationScopeAttribute1");
	}

}

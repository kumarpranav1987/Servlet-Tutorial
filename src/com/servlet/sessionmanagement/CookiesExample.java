package com.servlet.sessionmanagement;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/CookiesExample")
public class CookiesExample extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		String name = request.getParameter("username");
		Cookie cookie = new Cookie("myname", name);
		response.addCookie(cookie);
		
		PrintWriter out = response.getWriter();
		out.append("Hello " + name);
		
		out.append("<form action=\"OtherServlet\">");
		out.append("<input type=\"submit\" value=\"Go to OtherServlet\">");
		out.append("</form>");
		
	}

}

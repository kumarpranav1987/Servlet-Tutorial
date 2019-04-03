package com.servlet.attribute.request;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/RequestScopeAttribute1")
public class RequestScopeAttribute1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("myname", "ABC");
		RequestDispatcher dis = request.getRequestDispatcher("RequestScopeAttribute2");
		dis.forward(request, response);
	}

}

package com.servlet.requestdisparcher;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/RequestDispatcherExample")
public class RequestDispatcherExample extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String password = request.getParameter("password");
		if(password.equals("abc")) {
			RequestDispatcher dis= request.getRequestDispatcher("Success");
			dis.forward(request, response);
		}else {
			PrintWriter out = response.getWriter();
			out.append("Wrong Password");
			RequestDispatcher dis= request.getRequestDispatcher("requestdispatcher.html");
			dis.include(request, response);
		}
	}

}

package com.servlet.loadonstart;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoadOnStart extends HttpServlet{
	private static final long serialVersionUID = 1L;


	@Override
	public void init() throws ServletException {
		System.out.println("Init Called");
	}

	
	public LoadOnStart() {
		super();
		System.out.println("Constructor Called");
	}


	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Inside doGet of LoadOnStart");
		PrintWriter out = resp.getWriter();
		out.append("From LoadOnStart");
	}

	@Override
	public void destroy() {
		System.out.println("Destroy Called");
	}
}

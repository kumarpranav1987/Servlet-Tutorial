package com.servlet.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class PerformanceFilter implements Filter{

	public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain) throws IOException, ServletException {
		long start = System.nanoTime();
		chain.doFilter(req, res);
		long end = System.nanoTime();
		System.out.println("Time taken = "+ (end-start));
	}

}

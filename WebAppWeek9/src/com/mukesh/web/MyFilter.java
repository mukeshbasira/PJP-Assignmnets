package com.mukesh.web;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

//@WebServlet(urlPatterns = "/*") -- use this if web.xml don't have servelet definition
public class MyFilter implements Filter {
	@Override
	public void init(FilterConfig fc) throws ServletException {}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest req = (HttpServletRequest) request;
		String path = req.getRequestURI().substring(req.getContextPath().length());

		if (  !(path.endsWith(".html") || path.endsWith(".jsp"))) {
			request.getRequestDispatcher("/pages" + path).forward(request, response);

		} else {
			chain.doFilter(request, response); // not needed
		}
	}

	@Override
	public void destroy() {
	}

	public boolean test(int node) {
		// TODO Auto-generated method stub
		return false;
	}



}

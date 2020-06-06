package com.mukesh.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet(urlPatterns = "/*") -- use this if web.xml don't have servelet definition
public class servlethandler extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public servlethandler() {
		super();
	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String pathInfo = request.getPathInfo();
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		System.out.println(pathInfo);


		if(pathInfo.equals("/BuyProduct")){

			request.getRequestDispatcher("/byproduct").forward(request, response);
		}
		else if (pathInfo.equals("/hello")) {


			request.getRequestDispatcher("/hello").forward(request, response);
		}


		else {

			out.println("<html><body>");

			out.println(
					"<h2>Requested endpoint -->>    " + pathInfo + "</h2>");
			out.println("<hr> ");

			out.println(
					"Two endpoints are implemented for tests 1. /hello  2. /BuyProduct" + "</h2>");


			out.println("</body></html>");
		}


	}



	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

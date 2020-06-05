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
		switch (pathInfo) {
		case "/BuyProduct":

			new Buyproduct();

			break;
		case "/Hello":
			System.out.println(pathInfo);
			hello hello = new hello();
			hello.doGet(request, response);
			break;


		default:
			response.setContentType("text/html");


			PrintWriter out = response.getWriter();


			out.println("<html><body>");

			out.println(
					"<h2>Requested endpoint -->>    " + pathInfo + "</h2>");
			out.println("<hr> ");

			out.println(
					"Two endpoints are implemented for tests 1. /Hello  2. /BuyProduct" + "</h2>");


			out.println("</body></html>");

			break;
		}

	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

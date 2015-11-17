package com.ede;

import java.io.IOException;
import java.io.PrintWriter;

import javax.ejb.EJB;
import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MyFirstServlet
 */
@WebServlet("/MyFirstServlet")
public class MyFirstServlet extends HttpServlet {


	private static final long serialVersionUID = 2339210180577078312L;

	@EJB
	private HelloBean bean;
	
	@Inject
	private HelloCdi cdiBean;
	
	
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		
		PrintWriter writer = response.getWriter();
		writer.append("<html>");
		writer.append("<body>");
		writer.append("<h1>" + bean.getSentence() + "</h1>");
		writer.append("<h1>" + cdiBean.getSentence() + "</h1>");
		writer.append("<body>");
		writer.append("</html>");

	}


}

package com.userinfo.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Home
 */
@WebServlet("/Home")
public class Home extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Home() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		String favLanguage = request.getParameter("favLanguage");
		String hometown = request.getParameter("hometown");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		if (firstName == null) {
			firstName = "unknown";
		} if (lastName == null) {
			lastName = "unknown";
		} if (favLanguage == null) {
			favLanguage = "unknown";
		} if (hometown == null) {
			hometown = "unknown";
		}
		out.write("<h1>Hello " + firstName + " " + lastName + "!</h1>"
					+ "<h2><p>Your favorite language is " + favLanguage
					+ ".</p>Your hometown is " + hometown + "</p></h2>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

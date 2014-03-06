package com.dev;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/PresentationServlet")
public class PresentationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String s1=request.getParameter("number");
		int square=(Integer)request.getAttribute("square");
		
		PrintWriter out=response.getWriter();
		out.println("Square of "+s1 + " value is : "+square);
	}

}

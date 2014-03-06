package com.dev;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletChain extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		out.println("First Servlet");
		String s=request.getParameter("param");
		out.println(s);
		RequestDispatcher rd=request.getRequestDispatcher("ServletChain1");
		rd.forward(request, response);
		
	}

}

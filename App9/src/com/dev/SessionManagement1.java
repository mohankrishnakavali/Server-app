package com.dev;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SessionManagement1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String s1=request.getParameter("param1");
		PrintWriter out=response.getWriter();
		out.println("Param1 : "+s1);
		out.println("<form action=\"servlet2\">");
		out.println("param2 : <input type=\"text\" name =\"param2\">");
		out.println(" <input type=\"submit\" value =\"submit\">");
		out.println("</form>");
	}

}

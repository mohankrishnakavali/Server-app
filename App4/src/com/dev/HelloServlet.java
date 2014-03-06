package com.dev;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import javax.servlet.ServletException;
import java.io.IOException;
import java.io.PrintWriter;

public class HelloServlet extends HttpServlet{
	
	private static final long serialVersionUID = 1L;

	public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException,ServletException{
		String p1=req.getParameter("param1");

		PrintWriter out=res.getWriter();
		out.println("Hi welcome to Servlets : "+p1);
		out.close();
	}
}


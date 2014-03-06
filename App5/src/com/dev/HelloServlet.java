package com.dev;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet{
	private static final long serialVersionUID = 1L;

	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException{
		String UN=req.getParameter("userName");
		String PW=req.getParameter("password");
		String cns1=getInitParameter("constant1");
		String cns2=getInitParameter("constant2");
		
		PrintWriter out=res.getWriter();
		/*out.println("User Name is : "+UN);
		out.println("Password is : "+PW);*/
		if(UN.equals("mohan")&&PW.equals("mani"))
		{
			out.println("Success : "+cns1);
		}else{
			out.println("Failure : "+cns2);
		}
		
		
	}
}

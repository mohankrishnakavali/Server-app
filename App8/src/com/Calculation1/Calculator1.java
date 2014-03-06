package com.Calculation1;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Calculator1")
public class Calculator1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String s1=request.getParameter("num1");
		String s2=request.getParameter("num2");
		 int n1=Integer.parseInt(s1);
		 int n2=Integer.parseInt(s2);
		 
		 int total=n1-n2;
		 request.setAttribute("total", total);
		 RequestDispatcher rd=request.getRequestDispatcher("Sub");
		 rd.forward(request, response);
		 
		
	}

}

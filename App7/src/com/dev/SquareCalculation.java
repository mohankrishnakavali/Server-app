package com.dev;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/calc")
public class SquareCalculation extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String s1=request.getParameter("number");
		int i=Integer.parseInt(s1);
		 int n=i *i;
		 
		 request.setAttribute("square", n);
		 RequestDispatcher rd=request.getRequestDispatcher("PresentationServlet");
		 rd.forward(request, response);
	}

}

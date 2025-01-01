package com.example.web;

import com.example.model.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.*;

public class CadastServlet extends HttpServlet{
	public void doPost(HttpServletRequest request,
	 HttpServletResponse response)throws IOException, ServletException{
	
		CadastModel cm = new CadastModel(request.getParameter("name"),
		request.getParameter("lastName"),request.getParameter("userName"));
			
		String name = cm.getCompName();
		request.setAttribute("compName", name);
		
		Cookie ck1 = new Cookie("userName", cm.getUserName());
		response.addCookie(ck1);
		
		RequestDispatcher view = request.getRequestDispatcher("CadastResp.jsp");
		view.forward(request, response);
	}
}
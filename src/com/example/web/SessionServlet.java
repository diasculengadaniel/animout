package com.example.web;

import com.example.model.SessionDataAttribute;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.*;

public class SessionServlet extends HttpServlet{
	public void doGet(HttpServletRequest request,
		HttpServletResponse response)throws IOException, ServletException{
			
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String content = request.getParameter("contentType");
		HttpSession session = request.getSession();
		
		if(session.isNew()){
			SessionDataAttribute sdt = new SessionDataAttribute(content);
			session.setAttribute("data", sdt);
			String category[] = sdt.getCategory();
			out.println("Categorias");
			for(String cat:category)
				out.println("<a href='"+response.encodeUrl("/Session.do")+"'>"+cat+"</a>");
		}else{
			SessionDataAttribute sdt =(SessionDataAttribute) session.getAttribute("data");
			out.println("Até aqui está tudo bem!");
		}
	}	
}
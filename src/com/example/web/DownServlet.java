package com.example.web;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.*;

public class DownServlet extends HttpServlet{
	public void doGet(HttpServletRequest request,
	 HttpServletResponse response)throws IOException, ServletException{
		 
		response.setContentType(request.getParameter("type"));
		
		ServletContext ctx = getServletContext();
		InputStream in = ctx.getResourceAsStream(request.getParameter("file"));
		
		int read = 0;
		byte bytes[] = new byte[1024];
		
		OutputStream os = response.getOutputStream();
		while((read = in.read(bytes))!= -1){
			os.write(bytes, 0, read);
		}
		
		os.flush();
		os.close();
	}
}
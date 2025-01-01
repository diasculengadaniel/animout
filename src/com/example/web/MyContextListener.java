package com.example.web;

import com.example.model.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;

public class MyContextListener implements ServletContextListener{
	
	@Override
	public void contextInitialized(ServletContextEvent event){
		ServletContext ctx = event.getServletContext();
		String num = ctx.getInitParameter("numMaxAnime");
		AnimeListAttribute aL = new AnimeListAttribute(num);
		ctx.setAttribute("aniList",aL);
	}
	
	@Override
	public void contextDestroyed(ServletContextEvent event){
		
	}
}
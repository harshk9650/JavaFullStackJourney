package com.example.pr;
import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

public class Shoes extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
		
		resp.setContentType("text/html");
		
		PrintWriter pw = resp.getWriter();
		
		ServletConfig conff = getServletConfig();
		String dis3 = conff.getInitParameter("sho");
		
		
		
		pw.print("hi welcome to the shoes section");
		pw.print("currently we are giving the "+dis3+"% discount");
		
	}

}

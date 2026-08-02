package com.example.pr;
import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

public class Cosmatics extends GenericServlet  {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		
		res.setContentType("text/html");
		
		PrintWriter pw = res.getWriter();
		
		ServletConfig con = getServletConfig();
		String disc = con.getInitParameter("cos");
		
		pw.print("hii welcome to the casmatics section <br>");
		pw.print("currently we are giving the "+disc+"% discount");
		
		
	}

}

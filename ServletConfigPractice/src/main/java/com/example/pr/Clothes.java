package com.example.pr;
import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

public class Clothes extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html");
		
		PrintWriter pw = res.getWriter();
		
		ServletConfig conf = getServletConfig();
		
		String dis2 = conf.getInitParameter("clt");
		
		pw.print("hii welcome to the clothessection <br>");
		pw.print("currently we are giving the "+dis2+"% discount");
		
	}

}

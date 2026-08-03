package com.example.login;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

public class LoginServlet extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		
		PrintWriter pw = resp.getWriter();
		pw.print("welcome to the login page");
		
		pw.println();
		
		String name = req.getParameter("username");
		String password = req.getParameter("password");
		
		if(name.equals("Harsh") && password.equals("Harsh123")) {
			pw.print("welcome");
		}else {
			pw.print("enter valid password");
		}
		
	}
	

}

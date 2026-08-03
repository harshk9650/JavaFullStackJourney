package com.example.reg;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

public class MyRegistration extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html");
		PrintWriter pw = res.getWriter();
		pw.print("welcome to the registration site");
		pw.println();
		
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		String pass = req.getParameter("password");
		String gender = req.getParameter("gender");
		String course = req.getParameter("course");
		String city = req.getParameter("city");
		
		if(name.equals("Harsh") && email.equals("email") && pass.equals("Harsh") && gender.equals("M") && course.equals("course") &&  city.equals("city")) {
			pw.print("Registration succesfully done");
		}else {
			pw.print("Invalid coredential");
		}
		
		
		
	}

}

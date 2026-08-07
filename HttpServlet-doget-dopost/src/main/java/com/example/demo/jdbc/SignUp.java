package com.example.demo.jdbc;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

public class SignUp extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html");
		PrintWriter pw = res.getWriter();
		pw.println("welcome to the servlet");
		
		String name = req.getParameter("name");
		String username = req.getParameter("username");
	    String password = req.getParameter("password");
	    
	 
		System.out.println("connection is created succesfully");
		
		try {
			Connection con = DbConnection.getConnection();
			PreparedStatement ps = con.prepareStatement("insert into user values(? ,? ,?)");
			ps.setString(1, name);
			ps.setString(2, username);
			ps.setString(3, password);
			int row = ps.executeUpdate();
			if(row>0) {
				pw.print("Registration is done");
			}else {
				pw.print("Registration is not done");
			}
			
		}catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
				
		
		
	}



package com.example.demo.jdbc;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

public class Login extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html");
		PrintWriter pw = res.getWriter();
		pw.print("welcome to the registration site");
		pw.println();
		
	
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		
		Connection con = DbConnection.getConnection();
		try {
			
			
			PreparedStatement ps = con.prepareStatement("select* from user where username=? and password=?");
			ps.setString(1, username);
			ps.setString(2, password);
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				pw.print("user login succesfully");
			}else {
				pw.print("user is invalid");
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		

		
		
		
	}

}


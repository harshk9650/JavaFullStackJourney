package com.pack.session;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/login")
public class Servlet1 extends HttpServlet {

//	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		response.setContentType("text/html");
//		
//		PrintWriter pw = response.getWriter();
//		pw.print("Login succesfully");
//	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
	        throws ServletException, IOException {

	    response.setContentType("text/html");

	    PrintWriter pw = response.getWriter();
	    
	    String username = request.getParameter("username");
	    String password = request.getParameter("password");
	    if(username.equals("harsh") && password.equals("harsh")) {
	    	Cookie ck = new Cookie("user",username);
	     	response.addCookie(ck);
	    	 pw.print("Login successfully");
	     	
	 	    
	    }else {
	    	pw.print("wrong password");
	    	
	    	//response.sendRedirect("index.html");
	    }
	   
	}
	

}

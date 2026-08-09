package com.pack.session;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/Postservlet")
public class Postservlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		
		Cookie arr[] = request.getCookies();
		
		if(arr != null) {
			pw.print("logiin before post");

		}else {
			Cookie ck = arr[0];
			String username = ck.getValue();
			pw.print(username+" is posting");
		}
			
	}

}

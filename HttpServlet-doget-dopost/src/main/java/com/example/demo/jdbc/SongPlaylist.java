package com.example.demo.jdbc;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet("/pls")
public class SongPlaylist extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		pw.print("Your song is playing");
		
		String id = request.getParameter("id");
		pw.print("here this is the id: "+id);
		if(id.equals("101")) {
			pw.print("gajni song is palying");
		}else {
			pw.print("Tare name");
		}
	}

}

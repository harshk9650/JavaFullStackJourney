package com.example.demo1;

import java.sql.*;

public class PreparedCRUD {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Loaded regd Driver");
			
			
			// Create Connection
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/LPU?user=root&password=Harsh@2311");
            System.out.println("Connection Created");

            // ================= UPDATE =================
            PreparedStatement ps = con.prepareStatement(
                    "UPDATE student SET regdNo = ? WHERE id = ?");

            ps.setInt(1, 800);   // New regdNo
            ps.setInt(2, 3);     // Student id

            int count = ps.executeUpdate();

            if (count > 0) {
                System.out.println("Record Updated Successfully");
            } else {
                System.out.println("No Record Found");
            }

            // ================= READ =================
            PreparedStatement ps1 = con.prepareStatement("SELECT * FROM student");

            ResultSet rs = ps1.executeQuery();

            System.out.println("\nStudent Table");
            System.out.println("--------------------------");

            while (rs.next()) {
                System.out.println(
                        rs.getInt("id") + " "
                      + rs.getString("name") + " "
                      + rs.getInt("regdNo"));
            }

            // Close Resources
            rs.close();
            ps.close();
            ps1.close();
            con.close();
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
//		 if (e instanceof ClassNotFoundException ) {
//			 System.out.println("boss class not found");
//			
//		} else {
//			System.out.println("Boss sql");
//		}
		}

	}

}

package DemoProject;

import java.sql.*;
import java.util.*;

public class Project {

	public static void main(String[] args) {
		try {
			
			Scanner sc = new Scanner(System.in);
			Class.forName("com.mysql.cj.jdbc.Driver");// load driver and register
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/LPU?user=root&password=Harsh@2311");
			
			 Statement st = con.createStatement();
			int choice = 0;
			while(choice !=5) {
				System.out.println("========== Student Management ==========\n"
						+ "1. Add Student\n"
						+ "2. View All Students\n"
						+ "3. Update Student Registration Number\n"
						+ "4. Delete Student\n"
						+ "5. Exit");
				choice = sc.nextInt();
				
				switch(choice) {
				
				case 1:
					System.out.print("Enter Id of the student: ");
					int id = sc.nextInt();
					System.out.println();
					
					System.out.print("Enter name of the student: ");
					String name = sc.next();
					
					System.out.println();
					
					System.out.print("Enter regd of the student: ");
					int regdNo = sc.nextInt();
					System.out.println();
					
					int count = st.executeUpdate("insert into student values(" +id+ ", '" +name+"'," +regdNo+")");
					
					if(count>0) {
						System.out.println("Student is addes succesfully ");
					}else {
						System.out.println("student is not added");
					}
					break;
					
				case 2:
					System.out.println("List of all students ");
					ResultSet rs = st.executeQuery("select * from student");
					while(rs.next()) {
						System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
					}
					
					break;
					
				case 3:
					System.out.print("enter the new regdno: ");
					int newg = sc.nextInt();
					
					System.out.println();
					System.out.print("enter the existing id: ");
					int idd=sc.nextInt();
					
					count = st.executeUpdate("update regdNo set regdNo="+newg+"+ where id="+idd+"");
					
					if(count>0) {
						System.out.println("Student details is updated");
					}else {
						System.out.println("student not found");
		
					}
					break;
				case 4:
					System.out.println("here we are for delete the student");
					int ids = sc.nextInt();
					
					
					count = st.executeUpdate("delete from student where id=" + ids);
					
					if(count>0) {
						System.out.println("student is deleted sucessfully");
					}else {
						System.out.println("Student not found");
					}
					break;
				case 5:
					System.out.println("Thankyou ");
					con.close();
					sc.close();
					break;
				
				default:
					System.out.println("invalid choice");
				}
				
			}
			
			
//		//	int count = st.executeUpdate("insert into student values(3456,'hant',100)");
//			
//			ResultSet rs = st.executeQuery("select * from student");
//			
//			while(rs.next()) {
//				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
//			}
//			System.out.println("exit");
		} catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}

	}

}

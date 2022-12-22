package Assignment1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class SearchStudentByRollNo {

	public static void main(String[] args) {
		try {
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter roll no to be searched");
			int rn=sc.nextInt();
		
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/JDBC?useSSL=false","root","password");
			
			Statement s = con.createStatement();
			ResultSet rs= s.executeQuery("Select * from student where rno="+rn);
			while(rs.next()) {
				System.out.print(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getFloat(3)+" "+rs.getString(4));
				System.out.println();
				
			}
			
		} catch (ClassNotFoundException | SQLException e) {
		
			e.printStackTrace();
		}

	}

}

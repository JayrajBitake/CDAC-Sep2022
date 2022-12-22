package Assignment1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectAllStudents {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/JDBC?useSSL=false","root","password");
			
			Statement s = con.createStatement();
			ResultSet rs= s.executeQuery("Select * from student");
			while(rs.next()) {
				System.out.print(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getFloat(3)+" "+rs.getString(4));
				
			}
			
		} catch (ClassNotFoundException | SQLException e) {
		
			e.printStackTrace();
		}

	}

}

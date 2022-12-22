package Assignment1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class MaxSalaryEmployee {
	public static void main(String[] args) {
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/JDBC?useSSL=false","root","password");
			
			Statement s = con.createStatement();
			ResultSet rs= s.executeQuery(" Select name,max(salary) from employees");
			while(rs.next()) {
				System.out.print(rs.getString(1)+" "+rs.getString(2));
				System.out.println();
			}
			
			
			
			
		} catch (ClassNotFoundException | SQLException e) {
		
			e.printStackTrace();

		}
	}

}

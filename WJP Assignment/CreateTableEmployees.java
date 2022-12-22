package Assignment1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTableEmployees {

	public static void main(String[] args) {
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/JDBC?useSSL=false","root","password");
			
			Statement s = con.createStatement();
			
		boolean flag = s.execute("create table Employees (EmpId varchar(10),Name varchar(50),Salary int,JoiningDate date)");
			System.out.println(flag);
			
			s.close();
			
			con.close();
		} catch (ClassNotFoundException | SQLException e) {			
			e.printStackTrace();
		}
		
		System.out.println("done");

	}

}

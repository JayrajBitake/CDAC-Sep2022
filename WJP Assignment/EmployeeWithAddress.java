package Assignment1;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EmployeeWithAddress {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/JDBC?useSSL=false","root","password");
			
			Statement s = con.createStatement();
			ResultSet rs= s.executeQuery(" Select employees.EmpId,name,salary,city,country from employees left join address on employees.empid=address.empid");
			while(rs.next()) {
				System.out.print(rs.getString(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getString(4)+" "+rs.getString(4));
				System.out.println();
			}
			
			
			
			
		} catch (ClassNotFoundException | SQLException e) {
		
			e.printStackTrace();
		}
System.out.print("Done");
	}

}

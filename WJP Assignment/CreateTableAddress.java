package Assignment1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTableAddress {

	public static void main(String[] args) {
try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/JDBC?useSSL=false","root","password");
			
			Statement s = con.createStatement();
			
		boolean flag = s.execute("create table address(addressid varchar(10),city varchar(50),country varchar(20),empid varchar(20))");
			System.out.println(flag);
			
			s.close();
			
			con.close();
		} catch (ClassNotFoundException | SQLException e) {			
			e.printStackTrace();
		}
		
		System.out.println("done");

	}

	}



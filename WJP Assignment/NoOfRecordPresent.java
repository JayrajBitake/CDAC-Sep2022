package Assignment1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class NoOfRecordPresent {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/JDBC?useSSL=false","root","password");
			
			Statement s = con.createStatement();
			ResultSet rs= s.executeQuery("Select * from student order by marks desc");
			ResultSetMetaData rsmd=rs.getMetaData();
			System.out.println("No of record in table are " +rsmd.getColumnCount());
			
		} catch (ClassNotFoundException | SQLException e) {
		
			e.printStackTrace();
		}

	}

}

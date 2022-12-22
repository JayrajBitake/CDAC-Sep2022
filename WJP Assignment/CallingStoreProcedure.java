package Assignment1;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CallingStoreProcedure {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/JDBC?useSSL=false","root","password");
			
			CallableStatement s=con.prepareCall("{call inset(?,?,?,?)}");
			s.setInt(1,10);
			s.setString(2, "JB");
			s.setFloat(3, (float) 33.4);
			s.setString(4, "2200-9-9");
			int i = s.executeUpdate();
			
			
			
			
		} catch (ClassNotFoundException | SQLException e) {
		
			e.printStackTrace();
		}

	}

}

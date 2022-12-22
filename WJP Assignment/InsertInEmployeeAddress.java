package Assignment1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertInEmployeeAddress {

	public static void main(String[] args) {
try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/JDBC?useSSL=false","root","password");
			
			
			 con.setAutoCommit(false);
			 PreparedStatement s=con.prepareStatement("insert into employees values(?,?,?,?)");
				s.setInt(1, 33);
				s.setString(2,"Gony");
				s.setFloat(3,(float) 361455);
				s.setString(4, "2020-9-9");
				boolean e = s.execute();
				System.out.print(e);
				
				PreparedStatement s1=con.prepareStatement("insert into address values(?,?,?,?)");
				s1.setString(1, "123");
				s1.setString(2,"pune");
				s1.setString(3,"India");
				s1.setString(4, "11");
				boolean a = s1.execute();
				System.out.print(a);
				if(!e && !a) {
					con.commit();
				}
//				else {
//					System.out.println("Error in address transactio rolled back");
//					con.rollback();
//				}
	
			s.close();
			
			con.close();
		} catch (ClassNotFoundException | SQLException e) {			
			e.printStackTrace();
		}
		
		System.out.println("done");
	}

}

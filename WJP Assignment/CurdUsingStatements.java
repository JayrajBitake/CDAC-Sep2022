package Assignment1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class CurdUsingStatements {

	public static void main(String[] args) {
		try {
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter roll no");
			int rn=sc.nextInt();
			System.out.println("Enter Name");
			String name=sc.next();
			System.out.println("Marks");
			float marks=sc.nextFloat();
			System.out.println("Enter date of birth yyyy-mm-dd");
			String date=sc.next();
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/JDBC?useSSL=false","root","password");
			
			Statement s = con.createStatement();
			
			int i = s.executeUpdate("insert into Student values("+rn+",'"+name+"',"+marks+",'"+date+"')");
			int u=s.executeUpdate("update student set name='"+name+"',"+"marks="+marks+"where rno="+rn);
			System.out.println("updated rollno"+rn);
			int d=s.executeUpdate("delete from student where rno="+rn);
			System.out.println("Deleted rollno"+rn);
			ResultSet rs= s.executeQuery("Select * from student");
			while(rs.next()) {
				System.out.print(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getFloat(3)+" "+rs.getString(4));
				
			}
			
		} catch (ClassNotFoundException | SQLException e) {
		
			e.printStackTrace();
		}

	}

}

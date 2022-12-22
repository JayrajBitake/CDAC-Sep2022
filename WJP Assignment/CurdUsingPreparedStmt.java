package Assignment1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class CurdUsingPreparedStmt {

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
			System.out.println("Enter roll no to be updated");
			int rnu=sc.nextInt();
			System.out.println("Enter roll no to be deletd");
			int rnd=sc.nextInt();
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/JDBC?useSSL=false","root","password");
			
		PreparedStatement s=con.prepareStatement("insert into student values(?,?,?,?)");
		s.setInt(1, rn);
		s.setString(2,name);
		s.setFloat(3,marks);
		s.setString(4, date);
		int i = s.executeUpdate();
		PreparedStatement s1=con.prepareStatement("update student set name = ?, marks = ?,dateofbirth = ? where rno = ?");
		s1.setString(1,name);
		s1.setFloat(2,marks);
		s1.setString(3,date);
		s1.setInt(4, rnu);		
		int u = s1.executeUpdate();
		System.out.println(u+" rows updated");
		PreparedStatement s2=con.prepareStatement("delete from student  where rno=?");
		s1.setInt(1,rnd);
		int d = s2.executeUpdate();
		System.out.println(rnd+" roll no deleted");
		
		
			
		} catch (ClassNotFoundException | SQLException e) {
		
			e.printStackTrace();
		}
	}

}

package testPrj;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class PreparedStatement_select {
	public static void main(String[] args) throws Exception {
		
		// for select all
//		Class.forName("com.mysql.cj.jdbc.Driver");
//		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
//		PreparedStatement ps=con.prepareStatement("select* from Emp");
//		ResultSet rs=ps.executeQuery();
//		while(rs.next()) {
//			System.out.println(rs.getInt(1));
//			System.out.println(rs.getString(2));
//			System.out.println(rs.getInt(3));
//		}
//		con.close();
//		System.out.println("selection successfully");
		
		
		//select for specific record
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
		PreparedStatement ps=con.prepareStatement("select* from Emp where idEmp=?");
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter id to select:-");
		int id=sc.nextInt();
		
		ps.setInt(1, id);
		
		ResultSet Rs=ps.executeQuery();
		
		while(Rs.next());
		{
			System.out.println(Rs.getInt(1)+" "+Rs.getString(2)+" "+Rs.getInt(3));
		}
		con.close();
		System.out.println(" row is selected");
	}
}

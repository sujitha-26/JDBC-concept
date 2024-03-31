package testPrj;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Scanner;

public class preparedStatement_insert {

	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
		PreparedStatement ps=con.prepareStatement("insert into emp values(?,?,?)");
		Scanner sc = new Scanner(System.in);
		System.out.println("enter id");
		int id=sc.nextInt();
		System.out.println("enter name");
		String name=sc.next();
		System.out.println("enter MGR");
		int MGR=sc.nextInt();
		
		ps.setInt(1, id);
		ps.setString(2, name);
		ps.setInt(3, MGR);
		
		ps.execute();
		con.close();
		System.out.println("row inserted succesfully");

	}

}

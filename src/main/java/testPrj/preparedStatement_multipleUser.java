package testPrj;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class preparedStatement_multipleUser {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
		PreparedStatement ps=con.prepareStatement("insert into Emp values(?,?,?)");
		System.out.println("how many entiries");
		Scanner sc=new Scanner(System.in);
		int entries=sc.nextInt();
		int i=0;
		while(entries>i) {
			System.out.println("Enter id");
			int id=sc.nextInt();
			System.out.println("Enter Name");
			String name=sc.next();
			System.out.println("Enter address");
			String address=sc.next();
			
			ps.setInt(1, id);
			ps.setString(2, name);
			ps.setString(3, address);
			
			ps.execute();
			i++;
		}
		con.close();
		System.out.println("Inserted...");
	}
}

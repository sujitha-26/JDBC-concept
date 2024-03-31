package testPrj;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class preparedStatement_delete {

	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
		PreparedStatement ps=con.prepareStatement("delete from Emp where idEmp=?");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter id to to delete specific record");
		int id=sc.nextInt();
		
		ps.setInt(1,id);
		
		ps.execute();
		con.close();
		System.out.println("row deleted succesfully");

	}

}

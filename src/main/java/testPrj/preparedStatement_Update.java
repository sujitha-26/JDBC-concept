package testPrj;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class preparedStatement_Update {

	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
		PreparedStatement ps=con.prepareStatement("Update Emp set idEmp=? where idEmp=?");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter new id value to change");
		int id=sc.nextInt();
		System.out.println("Enter old id of ref");
		int Oid=sc.nextInt();
		
		ps.setInt(1, id);
		ps.setInt(2, Oid);
		
		ps.execute();
		System.out.println("Updated Succesfully");
		con.close();;
	}

}

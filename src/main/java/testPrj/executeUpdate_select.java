package testPrj;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class executeUpdate_select {

	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
		Statement stm=con.createStatement();
		int value=stm.executeUpdate("select* from Emp");
		con.close();
		System.out.println(value);
		System.out.println("updated succesfully");

	}

}

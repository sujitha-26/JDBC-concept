package testPrj;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class ExecuteUpdate_insert {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
		Statement stm=con.createStatement();
		int value=stm.executeUpdate("insert into emp values(1006,'yyy',2003)");
		con.close();
		System.out.println(value);
		System.out.println("inserted succesfully");
	}
}

package testPrj;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class ExecuteUpdate_delete {

	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
		Statement stm=con.createStatement();
		int value=stm.executeUpdate("delete from Emp where idEmp=1001");
		con.close();
		System.out.println(value);
		System.out.println("deleted succesfully");

	}

}

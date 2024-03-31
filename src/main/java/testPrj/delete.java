package testPrj;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class delete {

	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
		Statement stm=con.createStatement();
		stm.execute("delete from Emp where idEmp=1000");
		con.close();
		System.out.println("deleted succesfully");

	}

}

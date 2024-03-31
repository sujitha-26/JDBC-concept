package testPrj;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class select {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
		Statement statement=con.createStatement();
		statement.execute("select* from Emp where idEmp=1003");
		statement.close();
		System.out.println("selection done");

	}

}

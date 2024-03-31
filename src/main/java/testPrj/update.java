package testPrj;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class update {

	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
		Statement statement=con.createStatement();
		statement.execute("update Emp set idEmp=1001 where Ename='NITHYA'");
		con.close();
		System.out.println("updated succesfully");

	}

}

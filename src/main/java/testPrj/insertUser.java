package testPrj;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class insertUser {

	public static void main(String[] args) throws Exception {
//		Class.forName("com.mysql.cj.jdbc.Driver");
//		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
//		Statement statement=connection.createStatement();
//		statement.execute("insert into Emp values(1000,'sujitha','2001')");
//		connection.close();
//		System.out.println("1st row inserted succesfully");
		
//		Class.forName("com.mysql.cj.jdbc.Driver");
//		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
//		Statement stm=con.createStatement();
//		stm.execute("insert into emp values(800,'NITHYA',2002)");
//		con.close();
//		System.out.println("2nd row inserted succesfully");
		
//		Class.forName("com.mysql.cj.jdbc.Driver");
//		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
//		Statement stm=con.createStatement();
//		stm.execute("insert into emp values(1003,'siva',2003)");
//		con.close();
//		System.out.println("3rd row inserted succesfully");
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
		Statement stm=con.createStatement();
		stm.execute("insert into emp values(1002,'saravanan',2003)");
		con.close();
		System.out.println("4th row inserted succesfully");
		
	}

}

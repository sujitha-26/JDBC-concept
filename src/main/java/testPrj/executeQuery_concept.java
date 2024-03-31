package testPrj;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class executeQuery_concept {
	public static void main(String[] args) throws Exception {
		//insert
//		Class.forName("com.mysql.cj.jdbc.Driver");
//		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
//		Statement stm=con.createStatement();
//		stm.executeQuery("insert into emp values(1005,'sudhie',2003)");
//		con.close();
//		System.out.println("done succesfully");
		
		//update
//		Class.forName("com.mysql.cj.jdbc.Driver");
//		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
//		Statement statement=con.createStatement();
//		statement.executeQuery("update Emp set idEmp=1001 where Ename='NITHYA'");
//		con.close();
//		System.out.println("updated succesfully");
		
		//delete
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
		Statement stm=con.createStatement();
		stm.executeQuery("delete from Emp where idEmp=1000");
		con.close();
		System.out.println("deleted succesfully");
		
		//select
//		Class.forName("com.mysql.cj.jdbc.Driver");
//		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
//		Statement statement=con.createStatement();
//		statement.executeQuery("select* from Emp where idEmp=1003");
//		statement.close();
//		System.out.println("selection done");
	}
}

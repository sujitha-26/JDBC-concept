package testPrj;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class executeConcept_characteristics {

	public static void main(String[] args) throws Exception {
		//select
//		Class.forName("com.mysql.cj.jdbc.Driver");
//		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
//		Statement statement=con.createStatement();
//		boolean test=statement.execute("select* from Emp where idEmp=1003");
//		System.out.println(test);
//		statement.close();
//		System.out.println("selection done");
		
		//=>boolean_cond=>false
		//insert
//		Class.forName("com.mysql.cj.jdbc.Driver");
//		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
//		Statement stm=con.createStatement();
//		boolean test=stm.execute("insert into emp values(1005,'ram',200)");
//		System.out.println(test);
//		con.close();
//		System.out.println("5th row inserted succesfully");
		
		//update=>
//		Class.forName("com.mysql.cj.jdbc.Driver");
//		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
//		Statement statement=con.createStatement();
//		boolean b=statement.execute("update Emp set idEmp=1004 where Ename='RAM'");
//		System.out.println(b);
//		con.close();
//		System.out.println("updated succesfully");
		
		//delete
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
		Statement statement=con.createStatement();
		boolean b=statement.execute("delete from Emp where Ename='RAM'");
		System.out.println(b);
		con.close();
		System.out.println("updated succesfully");
		

	}

}

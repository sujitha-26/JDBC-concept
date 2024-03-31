package testPrj;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class getConnectionMethod_2ndWay {

	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test?user=root&password=root");
		Statement stm=con.createStatement();
		stm.execute("insert into emp values(2001,'lipsi',2011)");
		con.close();
		System.out.println("get Connection 2nd method executed sussesfully");

	}

}

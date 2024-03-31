package testPrj;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class executeQuery_ResultSet {

	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
		Statement stm=con.createStatement();
		ResultSet rs=stm.executeQuery("select* from Emp");
		if(rs.next()) {
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
			//System.out.println(rs.getString(2));
			//System.out.println(rs.getInt(3));
		}
		con.close();
		System.out.println("Executed successfully");

	}

}

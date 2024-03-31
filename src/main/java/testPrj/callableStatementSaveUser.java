package testPrj;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;

public class callableStatementSaveUser {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/advjava_jdbc","root","root");
		CallableStatement callableStatement=con.prepareCall("call saveUser(3001,'suji','tn')");
		//CallableStatement callableStatement=connection.prepareCall("call saveUser(2001,'sedhu','tn')");
		
		callableStatement.execute();
		con.close();
		System.out.println("done successfully");
	}

}

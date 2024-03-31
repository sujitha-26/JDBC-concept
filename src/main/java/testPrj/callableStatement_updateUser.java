package testPrj;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;

public class callableStatement_updateUser {

	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/advjava_jdbc","root","root");
		CallableStatement callableStatement=con.prepareCall("call UpdateUser('sudhie',3001)");
		//CallableStatement callableStatement=connection.prepareCall("call saveUser(2001,'sedhu','tn')");
		
		callableStatement.execute();
		con.close();
		System.out.println("done successfully");
		
		//https://github.com/PoojithaMahesh/jdbcm8/blob/master/src/main/java/mavenjdbcm8/CallableStatementFindUser.java
	}

}

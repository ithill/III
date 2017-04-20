package Homework;

import java.sql.*;

public class PracticeInsert {

	public static void main(String[] args) throws ClassNotFoundException,SQLException{
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		String url = "jdbc:sqlserver://localhost:1433;databasename=jdbc";
		Connection conn = DriverManager.getConnection(url, "sa","P@ssw0rd");
		
		String s = "insert into employee values (?,?,?,?,?,?)";
		PreparedStatement ps = conn.prepareStatement(s);
		ps.setInt(1, 1010);
		ps.setString(2, "lee lee");
		ps.setString(3, "2017-04-20");
		ps.setDouble(4, 44000);
		ps.setInt(5, 400);
		ps.setString(6, "IT");
		
		
		
	}

}

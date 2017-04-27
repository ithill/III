package Homework;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;

public class Test {

	public static void main(String[] args) {
		Connection conn = null;
		try {     
			String connUrl = "jdbc:sqlserver://localhost:1433;databaseName=DB01";
			conn = DriverManager.getConnection(connUrl, "sa", "P@ssw0rd");
			
//			CallableStatement cstmt = conn.prepareCall("{call loop99(?, ?)}");
//			cstmt.setInt(1,3);
//			cstmt.setInt(2,3);
//			cstmt.execute();
			
			CallableStatement cstmt =  conn.prepareCall("{call loop99(?,?)}");
			cstmt.setInt(1, 5);
			cstmt.setInt(2, 5);			
//			cstmt.registerOutParameter(3,Types.VARCHAR);
			cstmt.execute();
			
			String qryStmt = "SELECT result FROM lop99";
			PreparedStatement pstmt = conn.prepareStatement(qryStmt);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getString("result"));
			}

			rs.close();
			cstmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (conn != null)
				try {
					conn.close();
				} catch(SQLException e) { 
					e.printStackTrace();
				}
		}
	}// end of main()
}// end of class StoredProcedureDemo




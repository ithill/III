package Homework;

import java.sql.*;

// Insert one employee
public class Insertplaylist {
	public static void main(String[] args) {
		Connection conn = null;
		try {     
			String connUrl = "jdbc:sqlserver://localhost:1433;databaseName=DB01";
			conn = DriverManager.getConnection(connUrl, "sa", "P@ssw0rd");
			
			String insStmt = "INSERT INTO playlist VALUES (?, ?, ?)";
			PreparedStatement pstmt = conn.prepareStatement(insStmt);
			pstmt.setString(1, "2016-12-25 13:00");
			pstmt.setInt(2, 1);
			pstmt.setString(3, "AÆU");
			
			
			int num = pstmt.executeUpdate();
			System.out.println("insert count = " + num);
			
			pstmt = conn.prepareStatement("SELECT * FROM playlist");
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()) {
				System.out.print("ptime = " + rs.getString("ptime") + ", ");
				System.out.print("movie = " + rs.getInt("movie"));
				System.out.println("roomid ="  + rs.getString("roomid") + ", ");
			}
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
}// end of class InsertDemo

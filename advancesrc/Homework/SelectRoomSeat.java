package Homework;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectRoomSeat {

	public static void main(String[] args) {
		Connection conn = null;
		try {     
			String connUrl = "jdbc:sqlserver://localhost:1433;databaseName=DB01";
			conn = DriverManager.getConnection(connUrl, "sa", "P@ssw0rd");
			
			String qryStmt = "SELECT * FROM m_room";
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(qryStmt);
			
			while(rs.next()) {
			
				String roomid = rs.getString("roomid");
				String seat_row = rs.getString("seat_row");
				String seat_col = rs.getString("seat_col"); 
				
				System.out.println("roomid = " + roomid);
				System.out.println("seat_row = " + seat_row);
				System.out.println("seat_col = " + seat_col);
				System.out.println("----------------------------");
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
}// end of class QueryDemo3


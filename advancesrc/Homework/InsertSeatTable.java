package Homework;

import java.sql.Connection;
import java.sql.DriverManager;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertSeatTable {

	public static void main(String[] args) {
		Connection conn = null;
		try {     
			String connUrl = "jdbc:sqlserver://localhost:1433;databaseName=DB01";
			conn = DriverManager.getConnection(connUrl, "sa", "P@ssw0rd");
			
			FileReader f = new FileReader("D:/JDBC/workspace/Advanced/res/seat.txt");
			BufferedReader br = new BufferedReader(f);
			
			String read;
			while((read = br.readLine()) !=null){
				System.out.println(read);
				String insStmt = "INSERT INTO seats(ptime,movie,seat_num,sold) VALUES (?,?,?,?)";
				PreparedStatement pstmt = conn.prepareStatement(insStmt);
				pstmt.setString(1, "2016-12-25 13:00");
				pstmt.setInt(2, 1);
				pstmt.setString(3, read);
				pstmt.setString(4, "0");
//				pstmt.setInt(5, );
				pstmt.executeUpdate();
			}
		} catch (IOException e){
			e.printStackTrace(); 	
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

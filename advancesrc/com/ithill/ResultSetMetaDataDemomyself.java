package com.ithill;

import java.io.FileWriter;
import java.io.IOException;
import java.sql.*;

public class ResultSetMetaDataDemomyself {
	public static void main(String[] args) {
		Connection conn = null;
		try {
			String connUrl = "jdbc:sqlserver://localhost:1433;databaseName=jdbc";
			conn = DriverManager.getConnection(connUrl, "sa", "P@ssw0rd");

			String qryStmt = "SELECT * FROM department";
			PreparedStatement stmt = conn.prepareStatement(qryStmt);
			ResultSet rs = stmt.executeQuery();

			ResultSetMetaData rsmd = rs.getMetaData();
			int count = rsmd.getColumnCount();
			System.out.println(count);
			for (int i = 1; i <= count; i++) {
				System.out.print(rsmd.getColumnLabel(i) + "(" + rsmd.getColumnType(i) + ", " + rsmd.getColumnTypeName(i)
						+ "), ");
			}
			System.out.print("\n");

			while (rs.next()) {
				for (int i = 1; i <= count; i++) {
					// System.out.print(rs.getString(i) + ", ");
					FileWriter fw1 = new FileWriter("D:/JDBC/workspace/Advanced/res/meta.txt", true);
					fw1.write(rs.getString(i)+",");
					System.out.print("\n");
					fw1.close();
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		} finally {
			if (conn != null)
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
		}
	}// end of main()
}// end of class ResultSetMetaDataDemo

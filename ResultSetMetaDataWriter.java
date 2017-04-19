package com.ithill;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.*;

public class ResultSetMetaDataWriter {
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
			for(int i = 1; i <= count; i++) {
				System.out.print(rsmd.getColumnLabel(i) + "(" + rsmd.getColumnType(i) + ", "
					+ rsmd.getColumnTypeName(i)+"), ");
			}
			System.out.print("\n");
			
			while(rs.next()) {
				FileWriter fw1 = null;
	     		for(int i = 1; i <= count; i++){
	    		    try {
	    		    	String s = rs.getString(i);
	    		    	System.out.println("s = " + s);
						fw1 = new FileWriter("D:/JDBC/JDBC_Sqlserver/advanced/meta.txt",true);
//						FileReader fr1 = new FileReader("D:/JDBC/JDBC_Sqlserver/advanced/meta.txt");
//						String data;
//						while((data=fw1.read()) != -1){
//							System.out.print((char)data +" ");
//						}
	    		    fw1.write(s);
						fw1.close();
						
					} catch (IOException e) {
						e.printStackTrace();
					}finally{
						if(fw1 != null){
							try{
								fw1.close();
							}catch(Exception e){
								e.printStackTrace();
							}
						}
					}
	     		}
	     		System.out.print("\n");
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
}// end of class ResultSetMetaDataDemo 

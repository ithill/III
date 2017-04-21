package Homework;

import java.io.FileWriter;
import java.io.IOException;

public class SeatTable {

	public static void main(String[] args) {
		for(int i=1;i<=25;i++){
			for(int j=1;j<=20;j++){
				System.out.println(i+"-"+j);
				FileWriter fw1;
				try {
					fw1 = new FileWriter("D:/JDBC/workspace/Advanced/res/seat.txt", true);
					fw1.write(i+"-"+j+"\n");
					fw1.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
			
	}

}



package tw.leonchen.myproject.oop.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class TestBufferedByteToCharConvertIOEx1 {

	public static void main(String[] args) throws IOException {
		//InputStream is = System.in;
		//InputStreamReader isr1 = new InputStreamReader(is);
		//BufferedReader br1 = new BufferedReader(isr1);
		
		System.out.println("Please Input Your Favorite Food:(use Q or q to exit)");
		
		BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw1 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("c:/temp/test/yousecret.txt")));
		
		String data;
		while((data=br1.readLine())!=null){
			
			if(data.equalsIgnoreCase("Q")){
				System.out.println("System ShutDown.");
				bw1.close();
				br1.close();
				System.exit(-1);
			}
			
			System.out.println("data=" + data);
			bw1.write(data);
			bw1.newLine();
		}

	}

}

package tw.leonchen.myproject.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TestFileReaderBuffer {

	public static void main(String[] args) throws IOException  {
		BufferedReader fr1 = new BufferedReader(new FileReader("c:/temp/hello.txt"));
		BufferedWriter fw1 = new BufferedWriter(new FileWriter("c:/temp/bufferhard.txt"));
		
		String data;
		while((data=fr1.read()) != -1){
			System.out.print((char)data +" ");
			fw1.write(data);
		}
		fw1.close();
		fr1.close();
	}

}

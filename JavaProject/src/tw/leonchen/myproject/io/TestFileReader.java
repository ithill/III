package tw.leonchen.myproject.io;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TestFileReader {

	public static void main(String[] args) throws IOException  {
		FileReader fr1 = new FileReader("c:/temp/hello.txt");
//		FileWriter fw1 = new FileWriter("c:/temp/hello789.txt");
		FileWriter fw1 = new FileWriter("c:/temp/hello789.txt",true);
		int data;
		while((data=fr1.read()) != -1){
			System.out.print((char)data +" ");
			fw1.write(data);
		}
		fw1.close();
		fr1.close();
	}

}

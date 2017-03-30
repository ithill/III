package tw.leonchen.myproject.io;

import java.io.FileInputStream;
import java.io.IOException;

public class TestFileInput {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("c:/temp/hello.txt"); 
		int data;
		while((data = fis.read())!= -1){
//			System.out.print(data +" ");
			System.out.print((char)data);
		}
		fis.close();
	}

}

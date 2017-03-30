package tw.leonchen.myproject.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;



public class TestFileInput2 {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("c:/temp/hello.txt"); 
		FileOutputStream fos = new FileOutputStream("c:/temp/hello123.txt"); 
		int data;
		while((data = fis.read())!= -1){
			System.out.print((char)data);
			fos.write(data);
		}
		fos.close();
		fis.close();
	}

}

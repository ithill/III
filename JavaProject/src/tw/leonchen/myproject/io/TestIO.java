package tw.leonchen.myproject.io;

import java.io.File;

public class TestIO {

	public static void main(String[] args) {
		File file1 =new File("c:/temp/hello.txt");
		if(file1.exists()){
			System.out.println("filename:" + file1.getName());
			System.out.println("filesize:" + file1.length() + "bytes");
			System.out.println("file parent:" + file1.getParent());
			System.out.println("file path:" + file1.getPath());
		}
		else
			System.out.println("file not exists:");
			
	}

}

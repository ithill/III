package tw.leonchen.my.project.Equals;

public class TestEqualsString{ 	
	
	public static void main(String[] args) {
		String str1 =new String("hello");
		String str2 =new String("hello");	
		//String str1 = "hello";
		//String str2 = "hello";
		
		System.out.println("str1==str2?" + " " +(str1==str2));
		System.out.println("str1.equals(str2)?" + " " +str1.equals(str2));
	}

}

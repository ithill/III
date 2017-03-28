package tw.leonchen.my.project.ArrayString;

public class StringUsage {
	
	String s = "0123456789";
	String s1 = "ithill";
	String s2 = "ithill*lee";
	String s3 = "ithill-lee";
	
	
	void print(){
		
		System.out.println("s.charAt(7)=" + s.charAt(7));
		System.out.println("s.length()=" + s.length());
		System.out.println("s.substring(4,6)=" + s.substring(4,6));
		System.out.println("s1.toUpperCase()=" + s1.toUpperCase());
		System.out.println("s1.indexOf('ii')=" + s1.indexOf("ii"));
			
	}
	
	void print1(){
		
		String[] name = s2.split("\\*");
		for(String str: name){
			System.out.println(str);
		}
	}
	void print2(){
		String[] name = s3.split("-");
		for(String str: name){
			System.out.println(str);
		}
	}
	public static void main(String[] args) {
		StringUsage usage = new StringUsage();
		usage.print();
		usage.print1();
		usage.print2();
		
	}

}

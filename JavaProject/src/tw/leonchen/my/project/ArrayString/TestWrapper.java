package tw.leonchen.my.project.ArrayString;

public class TestWrapper {

	public static void main(String[] args) {
		String s = "12345";
		
		int a = Integer.parseInt(s);
		System.out.println("'12345' changes to " + (a+1) +" "+"because of conversing type.");
		
		Integer i = new Integer(s);
		System.out.println("'12345'also changes to int"+ " " +(i.intValue()+3));
		
		//boxing
		Integer i1 =7;
		System.out.println("'7'also changes to int"+ " " +(i1.intValue()+3));
		
	}

}

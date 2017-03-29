package tw.leonchen.my.project.ExceptionNestedEnum;

import tw.leonchen.my.project.ExceptionNestedEnum.C.D;

class C{
	private static String age = "18";
	
	static class D{
		public void yourAge(){
			System.out.println("age=" + age);
			play();
		} 	
	}	
	public static void play(){
		System.out.println("play game");
	}
}

public class TestStaticNestedClass {

	public static void main(String[] args) {
		C.D d1 = new C.D();
		d1.yourAge();
		//d1.play();
	}
}

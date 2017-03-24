package tw.leonchen.my.project.oop;

public class CallConstructor {
	CallConstructor(){
		this(6);
		System.out.println("1");
	}
	CallConstructor(int a){	
		System.out.println("2");
	}
	
	public static void main(String[] args) {
		CallConstructor call = new CallConstructor();
		System.out.println("3");
	}

}

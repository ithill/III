package tw.leonchen.my.project.oop;

class Human{
	public void sayHello(){
		System.out.println("hi");
		sayHello();
	}
	public void sayGoodBye(){
	System.out.println("bye-bye");
	}
	
}

public class CallTestMethodEx1 {
	public static void main(String[] args) {
		Human obj1 = new Human();
		//obj1.sayGoodBye();
		//obj1.sayHello();		
		System.out.println("ok");
	}

}

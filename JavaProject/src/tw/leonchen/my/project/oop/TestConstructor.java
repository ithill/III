package tw.leonchen.my.project.oop;

public class TestConstructor {
	TestConstructor(){
		System.out.println("execute here");
	}
	
	
	public static void main(String[] args) {
		TestConstructor t = new TestConstructor();
		t.Constructor();
		System.out.println("Understand?");
	}
		
		
	void Constructor(){
		System.out.println("print here");
	}
}

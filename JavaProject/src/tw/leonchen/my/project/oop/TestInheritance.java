package tw.leonchen.my.project.oop;

class Parent{
	String name = "mary";
	
	public void talk(){
		System.out.println("let's talk.");
	}
}	
class Child extends Parent{
	
	public void play(){
		System.out.println("play fun");
	}
}
public class TestInheritance {

	public static void main(String[] args) {
		Child c = new Child();
		c.name = "ithill";
		System.out.println(c.name);
		c.talk();
		c.play();
	}

}

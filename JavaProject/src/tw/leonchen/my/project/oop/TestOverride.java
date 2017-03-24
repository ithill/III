package tw.leonchen.my.project.oop;

class Bird{
	public void fly(){
		System.out.println("fly high");
	}
}

class AngryBird extends Bird{
	public void fly(){
		System.out.println("fly low");
		super.fly();
	}
}
public class TestOverride {

	public static void main(String[] args) {
		AngryBird a = new AngryBird();
		a.fly();
	}

}

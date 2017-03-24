package tw.leonchen.my.project.oop;

class Car{
	public static void move(){
		System.out.println("move");
	}
}

public class TestStaticMethod {

	public static void main(String[] args) {
		Car.move();
	}

}

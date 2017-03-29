package tw.leonchen.my.project.Exception;

interface Flyer{
	void takeOff();
	void land();
	void fly();
}
class Animal{
	public void eat(){
		System.out.println("eat someing");
	}
}
class AirPlane implements Flyer{

	@Override
	public void takeOff() {
		System.out.println("airplane's takeoff");
	}

	@Override
	public void land() {
		System.out.println("airplane's land");
	}

	@Override
	public void fly() {
		System.out.println("airplane's fly");
	}
}


class Bird extends Animal implements Flyer{

	@Override
	public void takeOff() {
		System.out.println("bird's takeoff");
	}

	@Override
	public void land() {
		System.out.println("bird's land");		
	}

	@Override
	public void fly() {
		System.out.println("bird's fly");		
	}

	@Override
	public void eat() {
		System.out.println("bird's eat");			
	}
}
public class TestInterface {
	public void action(Flyer f){
		f.takeOff();
		f.land();
		f.fly();
		
		if(f instanceof Bird){
			
		}
	}

	public static void main(String[] args) {
//		Bird b = new Bird();
//		b.land();
//		b.fly();
//		b.takeOff();
//		b.eat();
//	
//		AirPlane a = new AirPlane();
//		a.takeOff();
//		a.land();
//		a.fly();
//	
		}

}

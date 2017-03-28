package tw.leonchen.my.project.Equals;

class Animal{
	
	public void happy(){
		System.out.println("Animal is happy");
	}
}

class Cat extends Animal{
	
	public void happy(){
		System.out.println("mouw is happy");
	}
	public void jump(){
		System.out.println("mouw jumps away");
	}
}

class Dog extends Animal{
	
	public void happy(){
		System.out.println("wong is happy");
	}
	public void jump(){
		System.out.println("wong jumps away");
	}
}
public class Polymorphism {

	public static void main(String[] args) {
		Animal a = new Cat();
		a.happy();
		Animal a1 = new Dog();
		a1.happy();
	}

}

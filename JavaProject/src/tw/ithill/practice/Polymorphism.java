package tw.ithill.practice;

class Animal{
	private String name;
	
	Animal(String name){
		this.name = name;
	}
	
	public void enjoy(){
		System.out.println("Animal sing");
	}
}

class Cat extends Animal{
	private String eyesColor;
	
	Cat(String n,String c){
		super(n);
		eyesColor = c;
	}
	
	public void enjoy(){
		System.out.println("cat sings");
	}
}

class Dog extends Animal{
	private String furColor;

	Dog(String n,String f){
		super(n);
		furColor = f;
	}
	
	public void enjoy(){
		System.out.println("dog sings");
	}
}

class Lady{
	private String name;
	private Animal pet;

	Lady(String name,Animal pet){
		this.name = name;
		this.pet = pet;
	}

	public void mypetenjoy(){
		pet.enjoy();
	}
}
public class Polymorphism {

	public static void main(String[] args) {
	Cat c = new Cat("mimi","blue");
	Dog d = new Dog("wong","black");
	Lady l1 = new Lady("lee",c);
	Lady l2 = new Lady("chang",d);
	l1.mypetenjoy();
	l2.mypetenjoy();
	
	}

}

package tw.leonchen.my.project.oop;

class Animal{
	String name = "papa";
	
	public void eat(){
		System.out.println("eat meat");
	}
}	
class Cat extends Animal{
	
	public void mow(){
		System.out.println("mow");
		super.eat();
	}		
}
public class TestInheritance2 {

	public static void main(String[] args) {
		Cat cat = new Cat();
		cat.name = "white";
		System.out.println(cat.name);
		cat.mow();
	}

}

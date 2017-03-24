package tw.leonchen.my.project.oop;

class Fish{
	String name ="fish";
	
	Fish(){
	}
	
	Fish(String name){
		this.name = name;
	}
	
	void swim(){
		System.out.println("fish can swim");
	}
}

class SwordFish extends Fish{
	
	SwordFish(){
		super("sword");
	}
	
	void swim(){
		System.out.println("swim faster");
	}
}
public class TestSuper {

	public static void main(String[] args) {
		SwordFish s = new SwordFish();		
		//s.name;
		s.swim();
	}

}

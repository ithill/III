package tw.leonchen.my.project.Equals;

public class Polymorphism1 {

	public void play(Animal a){
		//a.happy();
		
		if(a instanceof Cat){
			Cat c1=(Cat)a;
			c1.jump();
		}
		if(a instanceof Dog){
			Dog d1 = (Dog)a;
			d1.jump();
		}
	}
	public static void main(String[] args) {
		
		Polymorphism1 p = new Polymorphism1(); 	
		p.play(new Cat());
		p.play(new Dog());
	
		
	}
	

}

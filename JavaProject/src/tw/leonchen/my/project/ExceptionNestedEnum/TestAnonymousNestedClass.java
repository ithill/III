package tw.leonchen.my.project.ExceptionNestedEnum;

abstract class Game{
	public abstract void play();
} 

class RPGGame extends Game{

	@Override
	public void play() {
		System.out.println("play RPG games");
	}
	
}
public class TestAnonymousNestedClass {

	public static void main(String[] args) {
		
	}

}

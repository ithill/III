package tw.leonchen.myproject.oop.nestedclass;

abstract class Game{
	public abstract void play();
}

//class RPGGame extends Game{
//
//	@Override
//	public void play() {
//       System.out.println("Play RPG Game.");		
//	}
//	
//}

public class CallTestNestedClassesEx4 {

	public static void main(String[] args) {
//		RPGGame myGame = new RPGGame();
//		myGame.play();
		
		new Game(){
			@Override
			public void play() {
		       System.out.println("Play RPG Game 2.");		
			}
		}.play();
		
//		Game myNewGame = new Game(){
//			@Override
//			public void play() {
//		       System.out.println("Play RPG Game 2.");		
//			}
//		};
//		myNewGame.play();
	}

}

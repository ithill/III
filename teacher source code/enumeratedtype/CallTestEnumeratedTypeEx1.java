package tw.leonchen.myproject.oop.enumeratedtype;

enum PokerGame{
	spade, heart("larry"), diamond, club;
	
	private String name = "henry";
	
	private PokerGame(){
		System.out.println("execute here.");
	}
	
	private PokerGame(String name){
		this.name = name;
	}
	
	public void playCardGame(){
		System.out.println("Play Card Game:" + name);
	}
}

public class CallTestEnumeratedTypeEx1 {

	public static void main(String[] args) {
		PokerGame suit = PokerGame.spade;
		
		switch(suit){
		   case spade:
			   System.out.println(PokerGame.spade);
			   break;
		   case heart:
			   System.out.println(PokerGame.heart);
			   break;
		   case diamond:
			   System.out.println(PokerGame.diamond);
			   break;
		   case club:
			   System.out.println(PokerGame.club);
			   break;
		   default:
			   assert false;
			   break;
		}
		
		PokerGame[] suitName = PokerGame.values();
		for(PokerGame mySuit: suitName){
			System.out.println(mySuit + ":" + mySuit.ordinal());
			mySuit.playCardGame();
		}
	}

}

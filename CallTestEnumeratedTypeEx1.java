package tw.leonchen.myproject.oop.enumeratedtype;

enum PokerGame{
	spade, heart, diamond, club
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
	}

}

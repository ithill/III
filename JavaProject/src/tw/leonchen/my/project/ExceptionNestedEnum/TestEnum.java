package tw.leonchen.my.project.ExceptionNestedEnum;

enum PokerGame{
	spade,heart,diamond,club;
	private String name ="larry";
	
	private PokerGame(){
		System.out.println("execute here");
	}
	
	private PokerGame(String name){
		this.name = name;
	}
	
	public void play(){
		System.out.println("play game :" + name);
	}
}
public class TestEnum {

	public static void main(String[] args) {
		PokerGame suit = PokerGame.spade;
		
		switch(suit):{
			case:
		}
	}

}

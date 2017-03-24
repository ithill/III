package tw.leonchen.my.project.oop;

class Stock{
	public void buyStock(int code){
		System.out.println("buy=" + code);
	}
	public void sellStock(int code){
		System.out.println("sell=" + code);
	}
}


public class CallTestMethodEx2 {

	public static void main(String[] args) {
		Stock s = new Stock();
		s.buyStock(3310);
		s.sellStock(3310);
	}

}

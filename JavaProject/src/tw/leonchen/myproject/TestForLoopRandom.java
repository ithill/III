package tw.leonchen.myproject;

public class TestForLoopRandom {

	public static void main(String[] args) {

		int myluckynum = 5;
		
		for(int i=0; i<10; i++){
			int num = (int)(Math.random()*6+1);
			System.out.println("number=" + num);
			if(myluckynum==num){
				System.out.println("ya");
			}else
				System.out.println("oh oh");
		}
	}

}

package tw.leonchen.myproject;

public class TestWhile {

	public static void main(String[] args) {
		/*int i = 1;
		
		while(i<=5){
			System.out.println("hello" +" "+i );
		    i++;
		}
		*/
		int i = 1;
		long sum = 0;
		while(i <=10){
			sum+=i;
			i++;
		}
		System.out.println("sum=" + sum);
	}

}

package tw.leonchen.myproject;

public class TestEvenOdd {

	public static void main(String[] args) {
		int num = -50;
		if(num>=0){
			System.out.println(num +"is positive");
			if((num%2) ==0){
				System.out.println(num + "is even");
			}else{
				System.out.println(num + "is odd");
			}
		}else{
			System.out.println("error");
		}
		
	}

}

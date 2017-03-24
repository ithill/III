package tw.leonchen.myproject;

public class TestThree {

	public static void main(String[] args) {
		int num = 0;
		for(int i=1; i<=100; i++){
			if(i%3==0){
				System.out.print(i);
			}
			num++;
			if(num==10)
				break;
		}
	}

}

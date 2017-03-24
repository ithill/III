package tw.leonchen.myproject;

public class TestLeapYear {

	public static void main(String[] args) {
		int a=2000;
		if(a%4 ==0 && a%100 !=0){
			System.out.println(a +"is leap year");
		}else if(a%400 == 0){
			
			System.out.println(a +"is also leap year");
		}else
			System.out.println(a +"is not leap year");
	}

}

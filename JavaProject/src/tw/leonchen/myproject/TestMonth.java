package tw.leonchen.myproject;

public class TestMonth {

	public static void main(String[] args) {
		int month = 2;
		
		if(month>12 || month<1 ){
			System.out.println("month is invalid!please input a valid month");
			System.exit(0);
		}
		
		if(month==1 || month==3 || month==5 || month==7 || month==8 ||month==10 ||month==12){
			System.out.println(month +"has 31 days");
		
		}else if(month==4 ||month==6 ||month==9 ||month==11){
			System.out.println(month +"has 30 days");
		}else if(month==2){
			int year = 2004;
		
			if(year%4 ==0 && year%100 !=0){
				
				System.out.println(year +" "+"is leap year and has 29 days");
			
			}else if(year%400 == 0){
				
				System.out.println(year +" "+"is also leap year and has 29 days");
			}else
				
				System.out.println(year +" "+"is not leap year and has 28 days");
	
		}else
			System.out.println("it's finished");


	}
}

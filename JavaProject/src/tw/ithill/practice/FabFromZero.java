package tw.ithill.practice;

public class FabFromZero {

	public static void main(String[] args) {
		int index=10;
		for(int i=1;i<=index; i++){
		System.out.print(f(i)+" ");
		}
	}
	public static long f(int index){
		if(index==1){
			return 0;
		}
		
		if(index==2 || index==3){
			return 1;
		}
		
		long f=2;
		long f1=1;
		long f2=1;
		for(int i=4; i<=index; i++){
				f=f1+f2;
				f1=f2;
				f2=f;
		}
		return f;
	}

}

//public long f(int n) {

//if (((n - 1) == 0) || (n - 1) == 1) {
	//return (n - 1);
//}

//return f(n - 1) + f(n - 2);
//}

//public static void main(String[] args) {
//TestFibonacciSeriesHw fibo = new TestFibonacciSeriesHw();
//for (int i = 1; i <= 48; i++) {
//long num1 = fibo.f(i);
//System.out.println(i + ". " + num1 + " ");



package tw.ithill.practice;

public class TestFabPrint {

	public static void main(String[] args) {
		int index=30;
		for(int i=1;i<=index; i++){
		System.out.print(f(i)+" ");
		}
	}
	public static long f(int index){
		if(index==1 || index==2){
			return 1;
		}
		
		long f=2;
		long f1=1;
		long f2=1;
		for(int i=3; i<=index; i++){
				f=f1+f2;
				f1=f2;
				f2=f;
		}
		return f;
	}


}

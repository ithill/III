package tw.ithill.practice;
public class Fab {

	public static void main(String[] args) {
		System.out.println(f(40));
	}
	public static long f(int index){
		if(index<1){
			System.out.println("error!please input an integer bigger than zero");
			System.exit(0);
		}
		if(index == 1 || index == 2){
			return 1;
		}
		
		long f=2;
		long f1=1;
		long f2=1;
		for(int i=0; i<index-2; i++){
			f=f1+f2;
			f1=f2;
			f2=f;
		}
		return f;
	}
}
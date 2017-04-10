package tw.leonchen.myproject.oop.collections.generics;

class TestGenericsEx1<T>{
	private T t1;
	
	public void setT1(T t1){
		this.t1=t1;
	}
	
	public T getT1(){
		return t1;
	}
}

public class CallTestGenericsEx1 {

	public static void main(String[] args) {
		TestGenericsEx1<Integer> test1 = new TestGenericsEx1<Integer>();
		test1.setT1(6);
		Integer num1 = test1.getT1();
		System.out.println("num1+1=" + (num1+1));
		
		TestGenericsEx1<Double> test2 = new TestGenericsEx1<Double>();
		test2.setT1(3.14);
		Double pi = test2.getT1();
		System.out.println("pi*r*r=" + pi*10*10);
	}

}

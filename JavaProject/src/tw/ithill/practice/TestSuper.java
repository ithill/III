package tw.ithill.practice;

class A{
	protected void print(String s){
		System.out.println(s);
	}
	A(){
		print("A()");
	}
}

class B extends A{
	B(){
		print("B()");
	}
	public void f(){
		print("B:f()");
	}
}
public class TestSuper {

	public static void main(String[] args) {
		B b = new B();
		b.f();
	}

}

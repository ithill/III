package tw.leonchen.my.project.ExceptionNestedEnum;

class A{
	private String name ="mary";
	
	class B{
		public void print(){
			System.out.println("name=" + name);
		}
	}
	public void invokeNested(){
		B b= new B();
		b.print();
	}
}

public class TestNestedClass {

	public static void main(String[] args) {
		A a = new A();
		a.invokeNested();
		
		A.B b =a.new B();
		b.print();
	}

}

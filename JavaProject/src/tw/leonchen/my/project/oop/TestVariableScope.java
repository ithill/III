package tw.leonchen.my.project.oop;

public class TestVariableScope {
	int a = 1;
	static int b =2;
	
	public void f(int c){
		int d = 4;
		
		System.out.println("a=" + a );
		System.out.println("b=" + b );
		System.out.println("c=" + c );
		System.out.println("d=" + d );
	}
	
	public static void f1(int e){
		//System.out.println("a=" + a );
		System.out.println("b=" + b );
		//System.out.println("c=" + c );
		//System.out.println("d=" + d );
		System.out.println("e=" + e );
		
	}
	public static void main(String[] args) {
		TestVariableScope scope = new TestVariableScope();
		scope.f(3);
		TestVariableScope.f1(5);
	}

}

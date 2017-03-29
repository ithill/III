package tw.leonchen.my.project.Exception;

class E{
	private int account = 10000;
	
	public void actionNested(){
		String name = "mary";
		
		class F{
			public void withdraw(int money){
			account	= account-money;
			System.out.println("name=" + name);
			System.out.println("account=" + account);
			}
		}
		F f= new F();
		f.withdraw(3000);
	}
}

public class TestLocalNestedClass {

	public static void main(String[] args) {
		E e = new E();
		e.actionNested();
	}

}

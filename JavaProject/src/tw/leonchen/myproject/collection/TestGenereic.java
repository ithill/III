package tw.leonchen.myproject.collection;

class HardGenerics<T>{
	private T t;
	
	public void setT1(T t){
		this.t = t;
	}
	
	public T getT1(){
		return t;
	}
}

public class TestGenereic {

	public static void main(String[] args) {
		TestGenereic test = new TestGenereic();
		
	}

}

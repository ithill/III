package tw.leonchen.myproject.oop.io;

public class TestAutoCloseableEx1 implements AutoCloseable {

	public void processResource(){
		System.out.println("Resource Processing ... !!");
	}
	
	@Override
	public void close() throws Exception {
        System.out.println("Resource Closed");
	}

}

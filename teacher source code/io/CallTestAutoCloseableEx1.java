package tw.leonchen.myproject.oop.io;

public class CallTestAutoCloseableEx1 {

	public static void main(String[] args) {
		try(TestAutoCloseableEx1 test1 = new TestAutoCloseableEx1()){
			test1.processResource();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

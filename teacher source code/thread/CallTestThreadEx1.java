package tw.leonchen.myproject.oop.thread;

class TestThreadEx1 implements Runnable{

	@Override
	public void run() {
		for(int i=1;i<=10;i++){
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.println(Thread.currentThread().getName() + " i=" + i);
			//System.out.print(Thread.currentThread().getName() + " ");
			//System.out.println("i=" + i);
		}
	}
	
}

public class CallTestThreadEx1 {

	public static void main(String[] args) {
		TestThreadEx1 test1 = new TestThreadEx1();
		
		Thread thread1 = new Thread(test1, "kitty");
		Thread thread2 = new Thread(test1, "mickey");
		
		thread1.start();
		thread2.start();
		
		try {
			thread1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("finished");
	}

}

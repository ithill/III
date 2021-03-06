package tw.leonchen.myproject.io;

class ThreadEx implements Runnable{
	
	public void run(){
		for(int i=0; i<10; i++){
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() +" "+ "i=" + i);
			//System.out.print(Thread.currentThread().getName() + " ");
			//System.out.println("i=" + i);
		}
	}
}

public class CallThread {

	public static void main(String[] args) {
		ThreadEx trd = new ThreadEx();
		
		Thread thread1 = new Thread(trd,"mary");
		Thread thread2 = new Thread(trd,"john");
		
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

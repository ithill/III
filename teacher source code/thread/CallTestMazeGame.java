package tw.leonchen.myproject.oop.thread;

class MazeGame {
	private int x = 0, y = 0;

	public void move(int x, int y) {
		synchronized (this) {
			this.x = x;
			this.y = y;
			this.notify();

			System.out.println("x:" + x + " y:" + y);
		}
	}

	public void checkExit() {
		synchronized (this) {
			try {
				this.wait();
				if (x == 0 && y == 0) {
					System.out.println("I am alive.");
					System.exit(-1);
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
	}
}

class Hero implements Runnable {

	private MazeGame core;

	public Hero(MazeGame core) {
		this.core = core;
	}

	@Override
	public void run() {
		while (true) {
			int x = (int) (Math.random() * 5);
			int y = (int) (Math.random() * 5);
			core.move(x, y);

			try {
				Thread.sleep((int) (Math.random() * 1000));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class MazeGameCheck implements Runnable {

	private MazeGame core;

	public MazeGameCheck(MazeGame core) {
		this.core = core;
	}

	@Override
	public void run() {
		while (true) {
			core.checkExit();
			try {
				Thread.sleep((int)(Math.random()*600));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}

public class CallTestMazeGame {

	public static void main(String[] args) {
		MazeGame core = new MazeGame();

		Hero hero = new Hero(core); // implements Runnable object
		Thread thread1 = new Thread(hero);
		thread1.start();
		
		MazeGameCheck check = new MazeGameCheck(core);
		Thread thread2 = new Thread(check);
		thread2.start();
	}

}

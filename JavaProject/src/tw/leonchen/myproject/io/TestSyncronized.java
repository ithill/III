package tw.leonchen.myproject.io;

class MazeGame{
	private int x,y;
	
	public void move(int x,int y){
		synchronized(this){
			this.x = x;
			this.y = y;
			this.notify();
			System.out.print("x=" + x +"y=" + y);
		}
	}
	
	public void checkExit(){
		synchronized(this){
			try{
				this.wait();
				if(x==0 && y==0){
					System.out.println("fine");
					System.exit(-1);
				}
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
	}
}

class Hero implements Runnable{
	private MazeGame core;
	
	public Hero(MazeGame core){
		this.core = core;
	}

	@Override
	public void run() {
		while(true){
			int x = (int)(Math.random()*5);
			int y = (int)(Math.random()*5);
			core.move(x, y);

			try {
				Thread.sleep((int)(Math.random()*5));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class TestSyncronized {

	public static void main(String[] args) {

	}

}

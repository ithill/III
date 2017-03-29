package tw.leonchen.myproject.collection;

import java.util.*;

public class TestQueue {
	private LinkedList queue;
	
	public void processStoreQueue(){
		queue = new LinkedList();
		queue.offer("info");
		queue.offer("reply");
	}
	
	public void processRetriveQueue(){
		while(queue.peek() != null){
		 String s=(String)queue.poll();
		 System.out.println(s);
		}
	}
	
	public static void main(String[] args) {
		TestQueue test = new TestQueue();
		test.processStoreQueue();
		test.processRetriveQueue();
	}

}

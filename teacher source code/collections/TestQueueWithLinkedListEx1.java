package tw.leonchen.myproject.oop.collections;

import java.util.LinkedList;

public class TestQueueWithLinkedListEx1 {

	private LinkedList queue;

	public void processStoreQueue(){
		queue = new LinkedList();
		queue.offer("info");
		queue.offer("reply");
	}
	
	public void processRerieveQueue(){
		while(queue.peek()!=null){
			String msg = (String)queue.poll();
			System.out.println("msg:" + msg);
		}
	}
	
	public static void main(String[] args) {
		TestQueueWithLinkedListEx1 test1 = new TestQueueWithLinkedListEx1();
		test1.processStoreQueue();
		test1.processRerieveQueue();
	}

}

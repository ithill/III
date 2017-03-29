package tw.leonchen.myproject.oop.collections.generics;

import java.util.ArrayList;
import java.util.Iterator;

public class TestArrayListWithIteratorEx1 {

	public static void main(String[] args) {
		ArrayList<String> fruit = new ArrayList<String>();
		
		fruit.add("Apple");
		fruit.add("PineApple");
		fruit.add("Banana");
		fruit.add("Lichi");
		fruit.add("JackFruit");
		fruit.add("Orange");
		
		System.out.println("fruit=" + fruit);
		
		Iterator<String> i1 = fruit.iterator();
		
		while(i1.hasNext()){
			String myFruit = i1.next();
			System.out.println("myFruit=" + myFruit);
		}
	}

}
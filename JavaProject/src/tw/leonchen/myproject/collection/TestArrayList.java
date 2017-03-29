package tw.leonchen.myproject.collection;

import java.util.*;

public class TestArrayList {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("mary");
		list.add("mary");
		list.add("john");
		list.add(6);
		list.add(new Integer(6));
		list.add(3.14);
		System.out.println("list:" + list);
	}

}

package tw.leonchen.myproject.collection;

import java.util.*;

public class TestHashset {

	public static void main(String[] args) {
		HashSet set =new HashSet();
		set.add("marry");
		set.add("marry");
		set.add("john");
		set.add(5);
		set.add(new Integer(5));
		set.add(3.14);
		System.out.println("set:" + set);
		
	}

}

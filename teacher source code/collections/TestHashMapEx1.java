package tw.leonchen.myproject.oop.collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class TestHashMapEx1 {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		HashMap map1 = new HashMap();
		
		map1.put("1st", "mary");
		map1.put("2nd", "judy");
		map1.put("3rd", "janet");
		map1.put("3rd", "louis");

		Set keys = map1.keySet();
		Set mapping = map1.entrySet();
		Collection values = map1.values();
		
		System.out.println("mapping:" + mapping);
		System.out.println("keys:" + keys);
		System.out.println("values:" + values);
	}

}

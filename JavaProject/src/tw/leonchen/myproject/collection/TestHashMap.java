package tw.leonchen.myproject.collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class TestHashMap {
	
	public static void main(String[] args) {
		HashMap map =new HashMap();
		map.put("1st", "mary");
		map.put("2nd", "john");
		map.put("3rd", "jerry");
		map.put("3rd", "jerry");
		
		Set keys = map.keySet();
		Set mappings = map.entrySet();
		Collection values = map.values();
		System.out.println(keys);
		System.out.println(mappings);
		System.out.println(values);
	
	}
	

}

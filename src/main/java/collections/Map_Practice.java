package collections;

import java.util.Collection;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class Map_Practice {

	public static void main(String[] args) {
		
		//creation of map
		Map<Integer, String> map = new Hashtable();
		
		//addition of elements to map
		map.put(500032, "gachibowli");
		map.put(500085, "madhapur");
		map.put(500012,"uppal");
		map.putIfAbsent(7676868,"hgjygyg");
		
		map.remove(500032);
		System.out.println(map);
		
		//retrieval of keys from map
		Set<Integer> keys = map.keySet();
		for (Integer key : keys) {
			System.out.println(key);
		}
		
		//retrieval of values
		Collection<String> values = map.values();
		for (String value : values) {
			System.out.println(value);
		}
		
		//retrieval of value from the map based on key
        System.out.println(map.get(500032));
        for (Integer key : keys) {
        	System.out.println(key + "------>" + map.get(key));
			
		}
        System.out.println(map.containsKey(500085));
	}
	

}

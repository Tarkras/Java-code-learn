package maps;

import java.util.*;
import java.util.Map.Entry;

public class Maps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/** A Map is useful if you have to search, update or delete elements
		 *  on the basis of a key. The map is based in key and value pair and
		 *  each key and value pair is known as an entry. The map contains unique
		 *  keys adn doesn't allow duplicates. A Map is useful if you have to search,
		 *  update or delete elements on the basis of a key. The value are not
		 *  sorted (Use TreeMap to sort). */
		
		/* See 
		 * https://www.geeksforgeeks.org/map-interface-java-examples/
		 * https://www.javatpoint.com/java-map
		 * */
		
		Map<String, String> maps = new HashMap<String, String>();
		
		maps.put("key1", "Value1");
		maps.put("key2", "Value2");
		maps.put("key3", "Value3");
		maps.put("key4", "Value4");
		maps.put("key5", "Value5");
		maps.put("key6", "Value6");
		
		System.out.println(maps);
		
		System.out.println(maps.get("key6"));
		
		Iterator<Entry<String, String>> i = maps.entrySet().iterator();
		
		while(i.hasNext())
		{
			@SuppressWarnings("rawtypes")
			Map.Entry m = (Map.Entry) i.next();
			
			System.out.println(m.getKey() + " - " + m.getValue());
		}
	}

}

package hashtables;

import java.util.*;

public class HashTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/** A hash table maps keys to values. In Hashtable we specify an object that
		 *  is used as a key, and the value we want to associate to that key. The
		 *  key is then hashed, and the resulting hash code is used as the index
		 *   at which the value is stored within the table. */
		
		/*  See https://www.geeksforgeeks.org/hashtable-in-java/
		 *  https://www.baeldung.com/java-hash-table
		 *  https://www.tutorialspoint.com/java/java_hashtable_class.htm */
		
		Hashtable ht = new Hashtable();
		
		ht.put("1", "one");
		ht.put("2", "two");
		ht.put("3", "three");
		ht.put("4", "four");
		ht.put("5", "five");
		
		Enumeration e = ht.keys();
		
		while(e.hasMoreElements())
		{
			String key = (String)e.nextElement();
			System.out.println(key + " : " + ht.get(key));
		}

	}

}

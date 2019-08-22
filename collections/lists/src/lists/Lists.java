package lists;

import java.util.*;

public class Lists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/** Lists is an ordered collection of objects in which duplicate values can
		 *  be stored. Since List preserves the insertion order, it allows positional
		 *  access and insertion of elements. List Interface is implemented by
		 *  ArrayList, LinkedList, Vector and Stack classes.*/
		
		/* See http://tutorials.jenkov.com/java-collections/list.html
		 * https://www.geeksforgeeks.org/list-interface-java-examples/ */
		
		List<String> cars = new ArrayList<String> ();
		
		cars.add("BMW");
		cars.add("SEAT");
		cars.add("Toyota");
		
		System.out.println(cars);
		System.out.println(cars.get(1));
		
		for(int i = 0; i < cars.size() ; i++)
		{
			System.out.println(cars.get(i));
		}
	}

}

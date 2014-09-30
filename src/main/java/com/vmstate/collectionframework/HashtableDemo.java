package com.vmstate.collectionframework;

import java.util.Collection;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Set;


/**
 * This example demonstrates simple usage of Hastable
 * @author Rajesh abraham
 * @author Geo Thomas
 */
public class HashtableDemo 
{
	public static void main(String args[]) {

		// Hashtable stores key/value pairs in a hash table.
		// Any non-null object can be used as a key or as a value.
		Hashtable table = new Hashtable();


		// Hashtable example to put object into Hashtable
		// put(key, value) is used to insert object into map
		
		table.put("California", "Sacramento");
		table.put("Oregon", "Salem");
		table.put("Washington", "Olympia");
		table.put("Alaska", "Juneau");

		// Hashtable example to get Object from Hashtable
		// get(key) method is used to retrieve Objects from Hashtable
		table.get("California");

		// Hashtable containsKey Example
		// Use containsKey(Object) method to check if an Object exits as key in
		// hashtable
		System.out.println("Does hashtable contains California as key: "
		+ table.containsKey("California"));


		// Hashtable containsValue Example
		// just like containsKey(), containsValue returns true if hashtable
		// contains specified object as value
		System.out.println("Does hashtable contains Salem as value: "
		+ table.containsValue("Salem"));


		// Hashtable enumeration Example
		// hashtabl.elements() return enumeration of all hashtable values
		Enumeration enumeration = table.elements();

		while (enumeration.hasMoreElements()) 
		{
		System.out.println("hashtable values: " + enumeration.nextElement());
		}

		// How to check if Hashtable is empty 
		// use isEmpty method of hashtable to check emptiness of hashtable 
		
		System.out.println("Is table hashtable empty: "
		+ table.isEmpty());


		// How to find size of Hashtable 
		// use hashtable.size() method to find size of hashtable
		System.out.println("Size of hashtable in Java: " + table.size());


		// How to get all values form hashtable 
		// you can use keySet() method to get a Set of all the keys of hashtable
		Set hashtableKeys = table.keySet();
		System.out.println("Set of all the keys of hashtable: " +  table.keySet());

		Collection hashtableValues = table.values();
		System.out.println(" Table Values:"+table.values());


		// Hashtable clear example
		// by using clear() we can reuse an existing hashtable, it clears all
		// mappings.
		table.clear();
		
		System.out.println("Size of hashtable after clear() method : " + table.size());

		}
		
}

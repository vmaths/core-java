package com.vmstate.collectionframework;

import java.util.*;

/**
 * This example demonstrates simple usage of HashMap
 * 
 * @author Rajesh Abraham
 *
 */
public class SampleHashMap 
{
	public static void main(String[] args) 
	{
		HashMap<String, String> map = new HashMap<String, String>();

		// Associates the specified value with the specified key in this map.
		// If the map previously contained a mapping for the key, the old value is replaced.
		map.put("California", "Sacramento");
		map.put("Oregon", "Salem");
		map.put("Washington", "Olympia");
		map.put("Alaska", "Juneau");
		System.out.println(map);
		
		//int size() Returns the number of key-value mappings in this map.
		System.out.println("The number of key-value mappings in this map : " + map.size());
		
		//Object get(Object key) Returns the value to which the specified key is mapped in this identity hash map, 
		//or null if the map contains no mapping for this key.
		String cap = map.get("Oregon");
		System.out.println("The capital of Oregon is " + cap);
		
		String cap1 = map.get("Texas");
		System.out.println("The capital of Texas is " + cap1);
	
		//Object remove(Object key) 
		//Removes the mapping for this key from this map if present.
		map.remove("California");
		System.out.println(map);
		
		// boolean containsKey(Object key) 
		// Returns true if this map contains a mapping for the specified key.
		boolean containsKey = map.containsKey("Oregon");
		if (containsKey== true)
			System.out.println("Given key has a value ");
		else
			System.out.println("Key do not have a value");
		
		// boolean containsValue(Object value) 
		// Returns true if this map maps one or more keys to the specified value.
		
		boolean containsObj = map.containsValue("Salem");
		if (containsObj== true)
			System.out.println("Given object has a key ");
		else
			System.out.println("Object do not have a value");		
	}
}

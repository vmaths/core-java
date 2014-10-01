package com.vmstate.collectionframework;
import java.util.Collection;
import java.util.Enumeration;
import java.util.TreeMap;
import java.util.Set;
import java.util.Iterator;
import java.util.Map;

/**
 * This example demonstrates simple usage of TreeMap
 * 
 * @author Rajesh Abraham
 * @author Geo Thomas
 *
 */
public class SampleTreeMap
{
	   public static void main(String args[]) {

	      // TreeMap is an ordered collection.
		  // TreeMap is sorted in the ascending order of its keys 
	      TreeMap<String, String> tmap = 
	             new TreeMap<String, String>();

	      // TreeMap example to put object into TreeMap
		 // put(key, value) is used to insert object into the TreeMap
	     
	      tmap.put("California", "Sacramento");
	      tmap.put("Oregon", "Salem");
	      tmap.put("Washington", "Olympia");
	      tmap.put("Alaska", "Juneau");
	      System.out.println(tmap);
	      
	      // get() method returns the value to which this map maps the specified key.
			tmap.get("California");
			System.out.println(" Corresponding value to the key California: "
					+ tmap.get("California"));
			// TreeMap containsKey Example
			// Use containsKey(Object) method to check if an Object exists as key in
			// TreeMap
			System.out.println("Does TreeMap contains California as key: "
			+ tmap.containsKey("California"));
			
			// TreeMap containsValue Example
			// just like containsKey(), containsValue returns true if TreeMap
			// contains specified object as value
			System.out.println("DoesTreeMap contains Salem as value: "
			+ tmap.containsValue("Salem"));
		
			// How to find size of TreeMap
			// use TreeMap.size() method to find size of TreeMap
			System.out.println("Size ofTreeMap: " + tmap.size());


			// Set keySet() returns a Set view of the keys contained in this map.
			
			Set treemapkeys = tmap.keySet();
			System.out.println("Set of all the keys of treemap: " +  tmap.keySet());

			// Collection values() returns a collection view of the values contained in this map. 
			
			Collection treemapvalues = tmap.values();
			System.out.println(" Table Values:"+tmap.values());


			// clear() removes all mappings from this TreeMap.
			tmap.clear();
			
			System.out.println("Size of treemap after clear() method : " + tmap.size());



	      
	      }

	   }
	


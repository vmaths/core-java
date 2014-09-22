package com.vmstate.collectionframework;

import java.util.ArrayList;
/**
 * This example demonstrates simple usage of ArrayList
 * The java.util.ArrayList class provides resizable-array and implements the List interface.
 * 
 * @author Rajesh Abraham
 *
 */
public class SampleArrayList 
{
	public static void main(String[] args)
	
	{
		// list1 is an ArrayList with datatype String
		ArrayList<String> list1 = new ArrayList<String>();
		
		// use add() method to add elements to the list
		list1.add("California");
		list1.add("Oregon");
		list1.add("Washington");
		
		System.out.println(list1);
		
		// adding more elements to the list
		list1.add("Alaska");
		System.out.println(list1);
		
		// use remove() method to remove elements from the list
		// here element is removed from index 0 (first position)
		list1.remove(0);
		System.out.println(list1);
		
		// use get() method to retrieve an element from the list
		// here the element index one is returned
		String state = list1.get(1);
		System.out.println("The second state is " + state);

		// use indexOf() method to get the position of an element in the list
		// here the position of the element "Alaska" is returned
		int pos = list1.indexOf("Alaska");
		System.out.println("Alaska is at position " + pos);
		
		// use size() method retrieves total number of elements in the list
		System.out.println("Size of list: " + list1.size());
		
		ArrayList<String> list2 = new ArrayList<String>();
		list2.add("Texas");
		list2.add("Illinois");
		list2.add("Florida");
		list2.add("Kansas");
		System.out.println(list2);
		
		// use addAll() method to add all the elements from list2 to list1
		// this method appends all of the elements in the specified collection to the end of this list 
		list1.addAll(list2);
		System.out.println(list1);
		
		// set() method replaces the element at the specified position in this list with the specified element.
		list1.set(2, "California");
		System.out.println(list1);
		
		// trimToSize() method trims the capacity of this ArrayList instance to be the list's current size. 
		// an application can use this operation to minimize the storage of an ArrayList instance.
		list1.trimToSize();
		System.out.println(list1.size());
		
	}
}


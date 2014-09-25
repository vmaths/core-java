package com.vmstate.collectionframework;

import java.util.LinkedList;
import java.util.List;


	public class LinkedListDemo 
	{
		public static void main(String[]args)
				{
			// create a linked list  
			LinkedList<String> ll = new LinkedList<String>();
		      
			// add elements to the linked list
		      ll.add("California");
		      ll.add("Texas");
		      ll.add("Florida");
		      ll.add("Newyork");
		      ll.add("Illinois");
		      System.out.println("Contents of the list: " );
		      System.out.println("\t" +ll);
		      
		      // add elements to the end of the list
		      ll.addLast("Kansas");
		      System.out.println("Contents of the list after adding an element in the end: " );
		      System.out.println("\t" +ll);
		     
		      // add elements to the beginning of the list
		      ll.addFirst("Alabama");
		      System.out.println("Contents of the list after adding an element in the beginning: " );
		      System.out.println("\t" +ll);
		      
		      // add an element to a particular position
		      ll.add(1, "Georgia");
		      System.out.println("Contents of the list after adding an element at a particular position: " );
		      System.out.println("\t" +ll);
		      
		      // remove elements from the linked list
		      ll.remove("Texas");
		      ll.remove(2);
		      System.out.println("Contents of the list after removing elements: " );
		      System.out.println("\t" +ll);
		     
		      // remove first and last elements
		      ll.removeFirst();
		      ll.removeLast();
		      System.out.println("Contents of the list after removing first and last elements: " );
		      System.out.println("\t" +ll);
		     
		      // get and set a value
		      String val = ll.get(2);
		      System.out.println("Element at the index position 2: " + val );
		     
		      ll.set(2,  "Iowa");
		      System.out.println("List after replacing element at position 2: " + ll);
		   }

}

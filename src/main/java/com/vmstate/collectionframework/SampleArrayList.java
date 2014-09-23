package com.vmstate.collectionframework;

import java.util.ArrayList;
/**
 * This example demonstrates simple usage of ArrayList
 * The java.util.ArrayList class provides resizable-array and implements the List interface.
 * @author Rajesh Abraham 
 * @author Geo Thomas
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
  System.out.println("Elements of List1: ");
  System.out.println("\t " +list1);
  
  // adding more elements to the list
  list1.add("Alaska");
  System.out.println("Elements of List1: ");
  System.out.println("\t " + list1);
  
  // use remove() method to remove elements from the list
  // here element is removed from index 0 (first position)
  list1.remove(0);
  System.out.println("Elements of List1: ");
  System.out.println("\t " +list1);
  
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
  System.out.println("Elements of List2: ");
  System.out.println("\t" +list2);
  
  // contains() method returns true if this list contains the specified element.
  boolean val=list2.contains("Texas");
  if(val==true) System.out.println("The element Texas is present in the list");
  else  System.out.println("The element Texas is not present in the list");
   
  val=list2.contains("Alaska");
  if(val==true) System.out.println("The element Alaska is present in the list");
  else  System.out.println("The element Alaska is not present in the list");
  
  // use addAll() method to add all the elements from list2 to list1
  // this method appends all of the elements in the specified collection to the end of this list 
  list1.addAll(list2);
  System.out.println("Elements of List1: " );
  System.out.println("\t " + list1);
  
  // set() method replaces the element at the specified position in this list with the specified element.
  list1.set(1, "California");
  System.out.println("California is added as second element in list1") ;
  System.out.println("Elements of List1: ");
  System.out.println("\t " + list1);
  
  
  // trimToSize() method trims the capacity of this ArrayList instance to be the list's current size. 
  // an application can use this operation to minimize the storage of an ArrayList instance.
  list1.trimToSize();
  System.out.println("Number of Elements in list1, after trimToSize() : " + list1.size()); 
  
  //clear() method removes all of the elements from this list.
  list2.clear();
  System.out.println("Number of Elements in list2, after clear()  : " +list2.size());
  
 }
}
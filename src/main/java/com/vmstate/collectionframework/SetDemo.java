package com.vmstate.collectionframework;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/** 
 * This example demonstrates set interface
 * This example illustrate hashSet and treeSet implementations
 * 
 * @author Rajesh Abraham
 * @author Geo Thomas
 */
public class SetDemo 
{	
  public static void main(String args[])
  { 
    
     //HashSet is a collection of unique elements
     Set<Integer> set = new HashSet<Integer>();
           set.add(34);
           set.add(22);
           set.add(10);
           set.add(60);
           set.add(30);
           set.add(22);
        System.out.println("The elements of the set");
        System.out.println("\t" +set);
     
        // contains(); used to check whether the specified element present in the list
        //Returns true if a specified object is an element within the collection
        boolean var = set.contains(40);
        if (var==true)System.out.println("The set contains the element");
        else System.out.println("The set do not contain the element");
        
        // size(); returns the number of elements in the collection
        System.out.println("The number of elements in the list : " + set.size());
        
        // remove(); removes a specified object from the collection
        set.remove(30);
        System.out.println("The elements of the set after removal");
        System.out.println("\t" +set);
       
        //TreeSet implements SortedSet interface
        //TreeSet will return a sorted list of items
        TreeSet sortedSet = new TreeSet<Integer>(set);
        System.out.println("The sorted list is:");
        System.out.println("\t" + sortedSet);

        System.out.println("The First element of the set is: "+
                          (Integer)sortedSet.first());
        System.out.println("The last element of the set is: "+
                        (Integer)sortedSet.last());
       
        //clear(); removes all objects from the collection
        set.clear();
        System.out.println("The number of elements in the list after clear : " + set.size());
        
       
        
     }
}
     
     
  

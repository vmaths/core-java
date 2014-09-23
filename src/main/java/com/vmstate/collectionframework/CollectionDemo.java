package com.vmstate.collectionframework;
import java.util.*;

/**This class illustrate few examples of standard implementations of collection interface
 * @author Rajesh Abraham
 * @author Geo Thomas
 */
public class CollectionDemo 
{
	public static void main(String[] args)
	{
	      ArrayList <String >a1 = new ArrayList<String>();
	      a1.add("California");
	      a1.add("Florida");
	      a1.add("Kansas");
	      System.out.println(" ArrayList Elements");
	      System.out.print("\t" + a1);

	      LinkedList<String> l1 = new LinkedList<String>();
	      l1.add("Illinois");
	      l1.add("Newyork");
	      l1.add("New mexico");
	      System.out.println();
	      System.out.println(" LinkedList Elements");
	      System.out.print("\t" + l1);

	      HashSet<String> s1 = new HashSet<String>(); 
	      s1.add("Alaska");
	      s1.add("Arizona");
	      s1.add("Georgia");
	      System.out.println();
	      System.out.println(" Set Elements");
	      System.out.print("\t" + s1);

	      HashMap<String, String> m1 = new HashMap<String, String>(); 
	      m1.put("Texas", "Austin");
	      m1.put("Oregon", "Salem");
	      m1.put("California", "Sacremento");
	      m1.put("Alaska", "Juneau");
	      System.out.println();
	      System.out.println(" Map Elements");
	      System.out.print("\t" + m1);
	   }
	}


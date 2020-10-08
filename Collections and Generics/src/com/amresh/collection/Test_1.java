// Below program shows adding , retrieving  and removing elements from ArrayList

package com.amresh.collection;

import java.util.ArrayList;

public class Test_1 {
	public static void main(String[] args) {

	// creating Array list
		ArrayList al=new ArrayList();
		
		System.out.println("initial size of Array List :"+al.size());
		
	//	Adding elements to the ArrayList
		al.add("red");
		al.add("pink");
		al.add("Black");
		al.add("green");
		al.add("orange");
		
		
		System.out.println("\n Size of ArrayList after addition :"+al.size());
	
	// Displaying the ArrayList 
		System.out.println("\n Contents of ArrayList after add  "+al);
		
	// Removing 4th elements from ArrayList
		al.remove(4);
		System.out.println("\n Contents of ArrayList after remove  "+al);
	
	// Removing "pink" elements from ArrayList
		al.remove("pink");
		System.out.println("\n Contents of ArrayList after removing 'pink'  "+al);
		System.out.println("\n Size of ArrayList after remove :"+al.size());
	
	// Retrieving 1st element from ArrayList
		String alElement	=	(String)al.get(1);
		System.out.println("alElement :"+alElement);
		
	//Inserting element at 2nd Index
		al.add(2,alElement+"rose");
		System.out.println(al);
	}
}

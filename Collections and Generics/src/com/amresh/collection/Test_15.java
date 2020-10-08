//changing default sorting order of objects
package com.amresh.collection;

import java.util.TreeSet;

public class Test_15 {
	public static void main(String[] args) {
		
		/*  creating a TreeSet object using no-arg constructor
		 	so , elements are stored according to natural storing order of adding object 
		 */
		
		TreeSet ts =new TreeSet();
		ts.add("C");
		ts.add("B");
		ts.add("m");
		ts.add("k");
		ts.add("L");
		
		System.out.println("TreeSet object with default comparator :"+ts);
	
		/* Creating a TreeSet object using Comparator parameter constructor,
		  to sort elements according to custom comparator sorting order
		 */
		TreeSet tsc =new TreeSet(new StringComparator());
		tsc.add("C");
		tsc.add("A");
		tsc.add("B");
		tsc.add("K");
		
		System.out.println("tsc object with custom comparator:"+tsc);
		
	}

}

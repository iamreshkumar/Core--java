//Below program explain all Set implemented concrete classes and their functionality
package com.amresh.collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Test_5 {
	public static void main(String[] args) {
		
		HashSet hs	=new HashSet();
		LinkedHashSet	lhs	=new LinkedHashSet();
		TreeSet			ts	=new TreeSet();
		
		// printing initial size of collection objects
		System.out.println("HashSet      	size capacity is :"+hs.size());
		System.out.println("LinkedHashSeze  size capacity is :"+lhs.size());
		System.out.println("TreeSet	        size capacity is :"+ts.size());
		
		//Adding elements to HashSet
		System.out.println("is 20 added :"+hs.add(Integer.toString(20)));
		System.out.println("is a  added :"+hs.add(new Character('a') ));
		System.out.println("is b  added :"+hs.add(new Character('b') ));
		System.out.println("is abc added :"+hs.add("abc"));
		System.out.println("is Abc added :"+hs.add("Abc"));
		System.out.println("is abc added :"+hs.add("abc"));
		System.out.println("is abc added :"+hs.add(new String("abc")));
		System.out.println("is Example added:"+hs.add(new Example()));
		System.out.println("is Example added:"+hs.add(new Example()));
		
		// Adding null to hs
		System.out.println("is null added :"+hs.add(null));
		System.out.println("is null added :"+hs.add(null));
		System.out.println();
		
		//printing HashSet modified size
		System.out.println(hs.size());
		System.out.println("HashSet :"+hs);
		
		System.out.println("====================================================");
	// Adding elements to LinkedHashSet
		
		System.out.println("is 20 added :"+lhs.add(Integer.toString(20)));
		System.out.println("is a  added :"+lhs.add(new Character('a') ));
		System.out.println("is b  added :"+lhs.add(new Character('b') ));
		System.out.println("is abc added :"+lhs.add("abc"));
		System.out.println("is Abc added :"+lhs.add("Abc"));
		System.out.println("is abc added :"+lhs.add("abc"));
		System.out.println("is abc added :"+lhs.add(new String("abc")));
		System.out.println("is Example added:"+lhs.add(new Example()));
		System.out.println("is Example added:"+lhs.add(new Example()));
		
		// Adding null to lhs
		System.out.println("is null added :"+lhs.add(null));
		System.out.println("is null added :"+lhs.add(null));
		System.out.println();
		
		//printing HashSet modified size
		System.out.println(lhs.size());
		System.out.println("LinkedHashSet :"+lhs);
		System.out.println("=====================================================\n");
		
		// Adding homogeneous element to TreeSet
		System.out.println("is abc added :"+ts.add("abc"));
		System.out.println("is xyz added :"+ts.add("xyz"));
		System.out.println("is azz added :"+ts.add("azz"));
		System.out.println("is abc added :"+ts.add(new String("pqr")));
		
		//Adding heterogeneous element
	//	System.out.println("is integer added:"+ts.add(new Integer(10)));
		
		//Adding null to TreeSet
		System.out.println("is null added:"+ts.add(null));
		System.out.println("is null added:"+ts.add(null));
		
		// Printing TreeSet modified size element
		System.out.println(ts.size());
		System.out.println("TreeSet :"+ts);
	}
}

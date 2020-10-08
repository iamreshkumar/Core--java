//Example_2 class is deriving from comparable and overriding compareTo()
package com.amresh.collection;

import java.util.TreeSet;

public class Test_14 {
	public static void main(String[] args) {
		
		TreeSet ts=new TreeSet();
		
	//	ts.add(new Example_2());
		ts.add(new Example_2 (20));
	//	ts.add(new Example_2 ());
		ts.add(new Example_2 (3));
		ts.add(new Example_2 (45));
	
		
		System.out.println(ts.size());
		System.out.println(ts);
		
	}
}

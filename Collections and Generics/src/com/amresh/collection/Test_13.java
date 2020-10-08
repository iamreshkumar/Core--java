// Below program shows adding Example_1 objects to Tree set
// --> Example_1 class is not deriving from comparable

package com.amresh.collection;

import java.util.TreeSet;

public class Test_13 {
	public static void main(String[] args) {
		
		TreeSet ts=new TreeSet();
		ts.add(new Example_1());
		
		System.out.println(ts);
		
	}
	
}

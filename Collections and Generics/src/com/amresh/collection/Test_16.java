/*	Adding non-comparable objects to Treeset by uusing custom Comparator.
 * StringBuffer is a non-comparable object. Below program shows adding StringBuffer objects to TreeSet
 * ----> check once SBComparator.java*/
package com.amresh.collection;

import java.util.TreeSet;

public class Test_16 {
	public static void main(String[] args) {
		
		TreeSet ts=new TreeSet(new SBComparator());
		
		ts.add(new StringBuffer("a"));
		ts.add(new StringBuffer("b"));
		ts.add(new StringBuffer("c"));
		ts.add(new StringBuffer("k"));
		ts.add(new StringBuffer("l"));
		
		System.out.println(ts);
	}

}

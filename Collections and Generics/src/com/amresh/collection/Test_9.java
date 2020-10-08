//Develop a program to retrive elements from LinkedHashSet Object by using Iterator
package com.amresh.collection;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Test_9 {
	public static void main(String[] args) {
		
		LinkedHashSet	lhs=new LinkedHashSet();
		
		lhs.add("Harsh");
		lhs.add("Arushi");
		lhs.add("somya");
		
		Iterator itr=lhs.iterator();
		
		while(itr.hasNext()) {
			Object ele =itr.next();
			System.out.println(ele);
		}
	}
}

//Develop a program to change lower case to upper case using LinkedHashSet and Iterator.
package com.amresh.collection;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Test_10 {
	public static void main(String[] args) {

		LinkedHashSet lhs=new LinkedHashSet();
		
		lhs.add("amresh");
		lhs.add("sonu");
		lhs.add("sahil");
		lhs.add("moni");
	
		Iterator lhsIterator=lhs.iterator();
		while(lhsIterator.hasNext()) {
			
			Object obj =lhsIterator.next();
			
			if(obj instanceof String) {
				String str=((String)obj).toUpperCase();
				System.out.println("Modified String::"+str);
			}
			else
			{
				System.out.println("Object :"+obj);
			}
		}
	}
}

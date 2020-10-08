//Develop a program to retrive elements from ArrayList Object by using Iterator
package com.amresh.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Test_8 {
	public static void main(String[] args) {
		
		ArrayList	al=new ArrayList();
		
		al.add("amresh");
		al.add("Ayush");
		al.add("Sheriyansh");
		
		Iterator it=al.iterator();
		
		while(it.hasNext()) {
			Object ele=it.next();
			System.out.println(ele);
		}
	}
}

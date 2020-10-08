package com.amresh.collection;

import java.util.ArrayList;
import java.util.ListIterator;

public class Test_11 {
	public static void main(String[] args) {
		
	ArrayList al=new ArrayList();
	
	al.add("a");
	al.add("b");
	al.add("c");
	al.add(6);
	al.add(7);
	al.add("c");
	
	System.out.println("ArrayList elements ::"+al);
	
	int count =1;
	
	ListIterator litr=al.listIterator();
	
	while(litr.hasNext()) {
		Object obj=litr.next();
		System.out.println("current element :"+obj);
		
		if(obj instanceof String) {
			String s=(String)obj;
			litr.set(s.toUpperCase());
		}
		else if(obj instanceof Integer){
			if(count==1) {
				litr.add(20);
				count++;
			}
		}
	}
	System.out.println("Array List elements after Iteration::"+al);
	// Reterving elements in reverse order
	
	while(litr.hasPrevious()) {
		Object obj=litr.previous();
		System.out.println(obj);
	}
  }
}

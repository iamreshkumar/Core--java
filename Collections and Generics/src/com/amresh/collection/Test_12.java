/*write a program to create ArrayList object with
 *--> 3 String objects and 3 integer objects
 *--> while iterating replace all string objectd with their uppercase
 * -> Insert the number 20 after the first integer object
 */
package com.amresh.collection;

import java.util.ArrayList;
import java.util.ListIterator;

public class Test_12 {
	public static void main(String[] args) {
		
		ArrayList al=new ArrayList();
		
		al.add("a");
		al.add(5);
		al.add("b");
		al.add("c");
		al.add(7);
		int count=1;
		
		System.out.println("AL elements before iteration :"+al);
		
		ListIterator litr=al.listIterator();
		while(litr.hasNext()) {
			
			Object obj=litr.next();
			System.out.println("current element::"+obj);
		
			if(obj instanceof String) {
				String s=(String)obj;
				litr.set(s.toUpperCase());
			}
			else if(obj instanceof Integer) {
				if(count==1) {
					litr.add(20);
					count++;
				}
			}
		}
		System.out.println("AL elements ::"+al);
		//retriving elements in reverse order
		while(litr.hasPrevious()) {
			Object obj=litr.previous();
			System.out.println(obj);
		}
	}

}

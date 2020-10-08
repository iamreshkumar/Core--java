//Develop a program to retrive elements from ArrayList object by using Enumeration
package com.amresh.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;

public class Test_7 {
	public static void main(String[] args) {
		ArrayList al =new ArrayList();
		
		al.add(10);
		al.add(20);
		
		Enumeration e=Collections.enumeration(al);
		
		while(e.hasMoreElements()) {
			Object obj =e.nextElement();
			System.out.println(obj);
		}
		
	}
}

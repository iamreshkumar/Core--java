//Develop a program to retrive elements from vector object by using Enumeration.

package com.amresh.collection;

import java.util.Enumeration;
import java.util.Vector;

public class Test_6 {
	public static void main(String[] args) {
		
		Vector v	=new Vector();
		v.add(10);
		v.add(20);
		
		Enumeration e =v.elements();
		
		while(e.hasMoreElements()) {
			Object obj=e.nextElement();
			System.out.println(obj);
		}
	}
}

//Below program shows storing and removing elements from vector class 
package com.amresh.collection;

import java.util.Vector;

public class Test_2 {
	public static void main(String[] args) {
		
		Vector v	=new Vector();
		
		for(int i=0;i<=9;i++) {
			v.addElement(new Integer(i*10));
		}
		System.out.println("inital elements:"+v);
		
		v.removeElementAt(0);
		v.removeElementAt(1);
		
		System.out.println("Elements after removing :"+v);
	}
}

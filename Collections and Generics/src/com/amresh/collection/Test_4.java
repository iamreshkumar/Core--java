//Below program shows java based program stack programs.
package com.amresh.collection;

import java.util.Stack;

public class Test_4 {
	public static void main(String[] args) {
		
		Stack st	= new Stack();
		st.push(new Integer(10));
		st.push(new Integer(20));
		st.push(new Integer(30));
		st.push(new Integer(40));
	
	System.out.println(st);
	
		System.out.println(st.pop());
		System.out.println(st);
		
		System.out.println(st.peek());
		System.out.println(st);
		System.out.println(st.search(new Integer(10)));
	}
}

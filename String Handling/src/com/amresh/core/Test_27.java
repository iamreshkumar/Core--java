// Replacing existing chars
package com.amresh.core;

public class Test_27 {
	public static void main(String[] args) {
		
		StringBuffer sb=new StringBuffer("abc bbc cbc");
		System.out.println("SB chars:"+sb);
		
		sb.setCharAt(3,'-');
		System.out.println("SB chars:"+sb);
		
		sb.setCharAt(5, 'B');
		System.out.println("SB chars:"+sb);
		
	}
}

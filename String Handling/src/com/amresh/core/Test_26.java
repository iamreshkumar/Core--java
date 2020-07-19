//inserting new characters
package com.amresh.core;

public class Test_26 {
	public static void main(String[] args) {
		
		StringBuffer sb=new StringBuffer("265452321");
		System.out.println("Sb chars:"+sb);
		
		sb.insert(2, '-');
		System.out.println("Sb chars:"+sb);
		
		sb.insert(5, '-');
		System.out.println("Sb chars:"+sb);
		
	//	sb.insert(sb.length()-1, null);
		sb.insert(sb.length()-1, (String)null);
		sb.insert(sb.length(), (String)null);
		System.out.println("SB chars:"+sb);
		
	//	sb.insert(sb.length(),(char[])null);
	//	sb.insert(20, "b");
	//	sb.insert(-5, "b");
		
		sb.insert(0, "b");
		System.out.println("SB chars:"+sb);
		System.out.println();
		
		
	}
}

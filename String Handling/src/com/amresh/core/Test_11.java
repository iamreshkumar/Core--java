// search for substring anywhere in the current string
//  [ public boolean contains(String s) ]
package com.amresh.core;

public class Test_11 {
	public static void main(String[] args) {
		
		String s1="javaAmresh";
		
	//	System.out.println(s1.contains('a'));
		System.out.println(s1.contains("a"));
		System.out.println(s1.contains("A"));
		System.out.println(s1.contains("Amresh"));
		System.out.println(s1.contains("amresh"));
		System.out.println(s1.equals("Amresh"));
		System.out.println(s1.equals("javaAmresh"));
		System.out.println(s1.contains("javaAmresh"));
		
	}
}

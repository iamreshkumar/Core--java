/*  Retrieving substring , fixed substring and dynamic substring
 	[public string substring(int start) ]
 	[public String substring(int start,int end)]
 */


package com.amresh.core;

public class Test_13 {
	public static void main(String[] args) {
		
		String s1="Java programming language";
		
		System.out.println(s1.substring(5));
		System.out.println(s1.substring(5,11));
		System.out.println(s1.substring(5,12));
		
		System.out.println(s1.substring(5,5));
	//	System.out.println(s1.substring(12,5));
		
	//	System.out.println(s1.substring(-1,12));
	//	System.out.println(s1.substring(4,27));
	//	System.out.println(s1.substring(5, 25));
	//	System.out.println(s1.substring(5,26));
		
		String s2="java Programming Language";
	//	System.out.println(s2.substring(5,12));
	
		int start=s2.indexOf("Program");
		int end=start+7;
		
		System.out.println(s2.substring(start, end));
	}
}

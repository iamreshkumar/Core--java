/*	Q.) Write a program to perform and insert opreations.
 * 			Take a string "object language"
 * 				CHange this string as object-Oriented Programming language */

package com.amresh.core;

public class InserOpreation {
	public static void main(String[] args) {
		
		StringBuffer sb=new StringBuffer("object language");
	
		sb.insert(6,"-Oriented Programming");
		
		
		System.out.println(sb);
		
	}
}

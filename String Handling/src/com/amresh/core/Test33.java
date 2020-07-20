/*Q.)  Write a program to reverse the string words?
 		i/p---> How Are You
 		o/p--->You are How
 */
package com.amresh.core;

public class Test33 {
	
		
		public static String reverseStringWords(String s) {
			
			String[]  stringwords =s.split("");
			int 	noOfWords	=stringwords.length;
			
			StringBuilder resultBuffer =new StringBuilder();
			
				for(int i=noOfWords-1; i>=0;i--) {
					resultBuffer.append("");
				}
			
				return resultBuffer.toString().trim();
		}
		public static void main(String[] args) {
			
			System.out.println(reverseStringWords("How are you"));
		
	}
}















//		unable to understand briefly


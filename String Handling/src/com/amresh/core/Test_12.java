/*checking statrsWith() and endsWith()
	[public boolean startsWith(String s)
	 public boolean endsWith(String s)		]
*/
package com.amresh.core;

public class Test_12 {
		public static void main(String[] args) {
			
			String s1="abc bbc cbc";
			
			System.out.println(s1.startsWith("abc"));
			System.out.println(s1.endsWith("abc"));
			
			System.out.println(s1.startsWith("cbc"));
			System.out.println(s1.endsWith("cbc"));
			
			System.out.println(s1.startsWith("abc bbc"));
			System.out.println(s1.endsWith("abc bbc"));
			
			System.out.println(s1.startsWith("bbc cbc"));
			System.out.println(s1.endsWith("bbc cbc"));
		
			System.out.println(s1.startsWith("abc bbc cbc "));
			System.out.println(s1.endsWith("abc bbc cbc "));
			
			
			System.out.println(s1.startsWith("Abc"));
			System.out.println(s1.endsWith("cbc"));
			
			System.out.println(s1.equals("abc"));
			System.out.println(s1.contains("abc"));
		
			System.out.println(s1.startsWith("abc"));
			System.out.println(s1.endsWith("abc"));
			System.out.println(s1.endsWith("cbc"));
		
		}
}

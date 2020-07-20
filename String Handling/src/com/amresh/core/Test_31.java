//Q. What is the capacity of length of SB object in below program
package com.amresh.core;

public class Test_31 {
	public static void main(String[] args) {
		
		StringBuffer sb =new StringBuffer();
		
		for(int i=1; i<=17; i++) {
			sb.append(i);
		}
		
		System.out.println(sb.capacity());
		System.out.println(sb.length());
	}
}

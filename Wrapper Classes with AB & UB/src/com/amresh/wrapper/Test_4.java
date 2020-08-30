// Write a program to add two numbers by reading them from command line ...
package com.amresh.wrapper;

public class Test_4 {
	public static void main(String[] args) {
		
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		
		int c=a+b;
		
		System.out.println("Sum::"+c);
	}
}

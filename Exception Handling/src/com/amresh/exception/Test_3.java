//in this application there is a chance of raising three exceptions.
package com.amresh.exception;

public class Test_3 {
	public static void main(String[] args) {
		
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
	
		int c=a/b;
		
		System.out.println("Result :"+c);
	}
}

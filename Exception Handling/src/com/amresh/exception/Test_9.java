// No exception raised in the program
package com.amresh.exception;

public class Test_9 {
	public static void main(String[] args) {
		try {
			System.out.println("In outer try");
		
			try {
				System.out.println("In inner try");
			}
			catch(ArithmeticException ae) {
				System.out.println("In inner catch");
			}
		}
		catch(ArithmeticException a) {
			System.out.println("In outer try/catch");
		}
		System.out.println("after outer try/catch");
	}
}

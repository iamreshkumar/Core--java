//Exception is raised in method before outer try
package com.amresh.exception;

public class Test_10 {
	public static void main(String[] args) {
		System.out.println(10/0);
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

//Exception is raised in outer try,inner try's catch & also outer try's catched matched
package com.amresh.exception;

public class Test_11 {
	public static void main(String[] args) {
		
		try {
			System.out.println("In outer try");
			System.out.println(10/0);
			try {
				System.out.println("In inner try");
			}
			catch(ArithmeticException a) {
				System.out.println("In inner catch");
			}
			System.out.println("after inner try catch");
		}
		catch(ArithmeticException ae) {
			System.out.println("In outer catch");
		}
		System.out.println("after outer try/catch");
		
	}
}

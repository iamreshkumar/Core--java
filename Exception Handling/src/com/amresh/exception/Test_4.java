/*	Below program shows handling and catching exceptions to print user understandable message
 	Relevant to the exception raised in program.To catch exception we must define a catch
 	 block with that exception class parameter.
  */
package com.amresh.exception;

public class Test_4 {
	public static void main(String[] args) {
		
		try {
			int a=20;
			int b=0;
			int c=a/b;
			
			System.out.println(c);
		}
		catch(ArrayIndexOutOfBoundsException aiob) {
			System.out.println("Please pass atleast two integer value");
		}
		catch(NumberFormatException nfe) {
			System.out.println("Please pass only integer values");
		}
		catch(ArithmeticException ae) {
			System.out.println("Please do not pass secound value 0");
		}
	}

}

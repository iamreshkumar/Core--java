/* Write a program
	--> To add the given two number if no exception is raised 
	--> To add 4,5 if ArrayIndexOutOfBoundsException is raised
	--->To add 6,7 if NumberFormatException raised
	--->To add 8,9 if ArithmeticException is raised 
*/	
package com.amresh.exception;

public class Test_6 {
	public static void main(String[] args) {
		
		try {
			int a=2;
			int b=8;			// try here 0,2,8
			
			int c=a/b;
			System.out.println("Result :"+(a+b));
		}
		catch(ArrayIndexOutOfBoundsException aiob) {
			System.out.println("Result :"+(4+5));
		}
		catch(NumberFormatException nfe) {
			System.out.println("Result :"+(6+7));
		}
		catch(ArithmeticException ae) {
			System.out.println("Result :"+(8+9));
		}
	}
}

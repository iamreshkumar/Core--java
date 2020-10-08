package com.amresh.exception;

public class Test_8 {
	public static void main(String[] args) {
		
		try {
			int a=Integer.parseInt(args[0]);
			System.out.println("a  :"+a);
			try {
				int[]x =new int[a];
				System.out.println("array size:"+x.length);
			}
			catch(NegativeArraySizeException nas) {
				int[]x =new int[3];
				System.out.println("array size:"+x.length);
			}
			int b=a+20;
			System.out.println("b   :"+b);
			
		}
		catch(ArrayIndexOutOfBoundsException aiob) {
			System.out.println("pass one int value");
		}
		catch(NumberFormatException nfe) {
			System.out.println("Pass only int value");
		}
	}
}

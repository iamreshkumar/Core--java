package com.amresh.exception;

public class Test_7 {
	public static void main(String[] args) {
		
		try {
			System.out.println(10/0);
		}
		catch(ArithmeticException ae) {
			System.out.println("getMessage() method output");
			System.out.println(ae.getMessage());
			System.out.println("==========================");
			
			System.out.println("toString() method output");
			System.out.println(ae.toString());
			System.out.println("===========================\n");
			
			System.out.println("printstack trace() output");
			ae.printStackTrace();
			System.out.println("=============================\n");
		
			System.out.println("jvm default output");
			throw ae;
		}
	}
}

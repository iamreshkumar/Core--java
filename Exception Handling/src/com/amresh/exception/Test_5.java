package com.amresh.exception;

public class Test_5 {
	public static void main(String[] args) {
		
		try {
			System.out.println("In try 1");
		}
		catch(Exception e) {
			System.out.println("In catch 1");
		}
		System.out.println("after try/catch1");
		
		try {
			System.out.println("In try 2");
		}
		catch(Exception e) {
			System.out.println("In catch 2");
		}
		System.out.println("after try/catch 2");
	}
}

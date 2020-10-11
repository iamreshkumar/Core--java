package com.amresh;

public class Test_1 {
	public static void main(String[] args) {
		
		try {
			int i=Integer.parseInt(args[0]);
			int j=Integer.parseInt(args[1]);
		
			int k=i+j;
			System.out.println("Result ::"+k);
		}
		catch(ArrayIndexOutOfBoundsException aiob) {
			System.out.println("Wrong input pls input atleast two integer values with space seperator");
		}
		catch(NumberFormatException nfe) {
			System.out.println("pls input only integer");
		}
		catch(Exception e) {
			System.out.println("Error");
		}
		
	}
}

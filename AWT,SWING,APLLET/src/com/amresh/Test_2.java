
package com.amresh;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test_2 {
	public static void main(String[] args) {
		
		try {
			// connecting to keyboard
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			
			//reading data from keyboard
			System.out.println("Enter first");
			
			System.out.println("Enter first integer");
			String fno=br.readLine();
			
			System.out.println("Enter secound integer");
			String sno=br.readLine();
			
			//converting numbers from String from to int form
			int i=Integer.parseInt(fno);
			int j=Integer.parseInt(sno);
			
			// adding two numbers
			int k=i+j;
			
			//printing result
			System.out.println("Result ::"+k);
			
		}
		catch(IOException ie) {
			ie.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}

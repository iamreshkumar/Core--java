/*	Q.)		Write a program to reverse the words in string objects the string objects 
  
  			i/p----> How are You ?
  			o/p----> You?are How

*/
package com.amresh.core;
import java.util.Scanner;
public class Test_24 {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Strings");
		
		String str=sc.nextLine();
		String result=StringWordReverse.reverseStringWords(str);
		
		System.out.println("Original String:"+str);
		System.out.println("Reverse String::"+result);
	}

}

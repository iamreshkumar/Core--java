/* Finding length of the string
										[public int length() ]
*/
package com.amresh.core;

import java.util.Scanner;

public class Test_2 {
	public static void main(String[] args) {
		
		String s1="";
		String s2="";
		String s3="ab";
		String s4=new String();
		String s5=new String("");
		String s6=new String("");
		String s7=new String("Amresh");
		
		System.out.println("S1 length is:"+s1.length());
		System.out.println("s2 length is:"+s2.length());
		System.out.println("s3 length is:"+s3.length());
		System.out.println("s4 length is:"+s4.length());
		System.out.println("s5 length is:"+s5.length());
		System.out.println("s6 length is:"+s6.length());
		System.out.println("S7 length is:"+s7.length());
		
		String s8=null;
		//System.out.println("s8 length:"+s8.length());
		
		String s9="null";
		System.out.println("s9 length is:"+s9.length());
		
		String s10;
	//	System.out.println("s10 length is:"+s10.length());
	
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the String 1::");
		String s11=sc.nextLine();
		System.out.println(s11.length());
		
	//	System.out.println("s12 length is:"+s12.length());
		System.out.println("s13 length is:"+s13.length());
	
	}
	static String s12;
	static String s13="Amresh";
}

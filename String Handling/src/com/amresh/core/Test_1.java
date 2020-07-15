/* checking String empty or not 
 
  			[ public boolean isEmpty() ]
  */

package com.amresh.core;

import java.util.Scanner;

public class Test_1 {
	public static void main(String[] args) {
		
		String s1="";
		String s2="";
		String s3="a";
		String s4=new String();
		String s5=new String("");
		String s6=new String("");
		String s7=new String("a");
		
		System.out.println("is s1 Empty:"+s1.isEmpty() );
		System.out.println("is s2 Empty:"+s2.isEmpty() );
		System.out.println("is s3 Empty:"+s3.isEmpty() );
		System.out.println("is s4 Empty:"+s4.isEmpty() );
		System.out.println("is s5 Empty:"+s5.isEmpty() );
		System.out.println("is s6 Empty:"+s6.isEmpty() );
		System.out.println("is s7 Empty:"+s7.isEmpty() );
		
		
		String s8=null;
		
	//	System.out.println("is s8 empty:"+s8.isEmpty());
		
		String s9;
	//	System.out.println("is s9 empty:"+s9.isEmpty());		//CE:: local variable must be initialized
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter String 1 ::");
		System.out.println(sc.nextLine().isEmpty());
		
		System.out.println("Enter String 2 ::");
		System.out.println(sc.nextLine().isEmpty());
		
		System.out.println("Enter String 3 ::");
		System.out.println(sc.nextLine().isEmpty());
		
		
		
		
	}
}

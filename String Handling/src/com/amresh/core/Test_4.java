/*	Printing String objects content
  						[public StringtoString() ]
 */

package com.amresh.core;

public class Test_4 {
	public static void main(String[] args) {
		
		String s1="Amresh";
		System.out.println("S1:"+s1);
		System.out.println("s1:"+s1.toString());
		System.out.println();
		
		String s2=new String("MNU Technologies");
		System.out.println("S2:"+s2);
		System.out.println("s2:"+s2.toString());
		System.out.println();
		
		String s3=null;
		System.out.println("s3:"+s3);
	//	System.out.println("s3:"+s3.toString());
		
		String s4;
	//	System.out.println("S4:"+s4);
	
		System.out.println("s5:"+s5);
		
		
		A a1 = new A(567);
		
		System.out.println("a1:"+a1);
		
		A a2=null;
		System.out.println("a2:"+a2);
		
		A a3;
	//	System.out.println("a3:"+a3);
	
	System.out.println("a4:"+a4);
	}
	static String s5;
	static A a4;
}

class A{
	private int x;
	A(int x){
		this.x=x;
	}
	
	@Override
	public String toString() {
		return ""+x;
	}
}
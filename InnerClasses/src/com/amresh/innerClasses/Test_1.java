package com.amresh.innerClasses;

public class Test_1 {
	
		static int a=10;
		int b=20;
		private int c=30;
		
		static class A{
			
	public static void main(String[] args) {
	
		System.out.println(a);
	//	System.out.println(b);
	//	System.out.println(c);
		
		Test_1  t =new Test_1();
		
		System.out.println(t.a);
		System.out.println(t.b);
		System.out.println(t.c);
	}
		
	}
}

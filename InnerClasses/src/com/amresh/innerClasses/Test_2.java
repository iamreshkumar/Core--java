//Below program shows accessing inner classs member from outer class
package com.amresh.innerClasses;

public class Test_2 {
	static class A{
		private int y=20;
		
		static void m1() {
			System.out.println("inner class SM m1");
		}
	public static void main(String[] args) {
		A.m1();
		
		A a=new A();
		System.out.println(a.y);
		}
	}
}

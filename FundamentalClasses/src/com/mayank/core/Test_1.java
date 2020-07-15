package com.mayank.core;

public class Test_1 {
 public static void main(String[] args) {
	
	 String s1= "abc";
	 Integer io=50;
	 Object obj=new A();
	 
	 B b1= new B();
	 B b2=new C();
	 
	 A.m1(s1);
	 A.m1(io);
	 A.m1(obj);
	 A.m1(b1);
	 A.m1(b2);
}
}

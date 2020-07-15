package com.mayank.core;

public class HashCodeDemo {
	public static void main(String[] args) {
		
		Example e=new Example();
		Example e1=new Example();
		Example e2=new Example();
		
		System.out.println(e.hashCode());
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
		
		System.out.println("x ="+e.x);
		System.out.println("y="+e.y);
	}
}


class Example{
	int x=10;
	int y=20;
}
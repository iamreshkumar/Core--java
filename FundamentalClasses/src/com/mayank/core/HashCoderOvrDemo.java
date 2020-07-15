package com.mayank.core;

public class HashCoderOvrDemo {
	public static void main(String[] args) {
	
		Example1 e=new Example1();
		Example1 e1=new Example1();
		
		System.out.println(e.hashCode());
		System.out.println(e1.hashCode());
	}
}

class Example1{
	int x=10;
	int y=20;
	
	@Override
	public int hashCode() {
		return x+y;
	}
}
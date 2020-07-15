package com.mayank.core;

public class Example_2  implements Cloneable{
	int x=10;
	int y=20;
	
	public static void main(String[] args)throws CloneNotSupportedException {
		
		Example_2 e1 = new Example_2();
		Example_2 e2 = (Example_2)e1.clone();        
		
		System.out.println(e1);
		System.out.println(e2);
	}
}

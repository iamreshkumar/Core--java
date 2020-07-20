package com.amresh.core;

public class Test_30 {
	public static void main(String[] args) {
		
		StringBuffer sb1=new StringBuffer(3);
		System.out.println("Sb1 capacity:"+sb1.capacity());
		System.out.println("sb1 size:"+sb1.length());
		System.out.println("sb1 chars:"+sb1);
		
		sb1.append("a");
		sb1.append("b");
		sb1.append("c");
		sb1.append("d");
		
		System.out.println("Sb1 capacity:"+sb1.capacity());
		System.out.println("sb1 size:"+sb1.length());
		System.out.println("sb1 chars:"+sb1);
		System.out.println();
		
		sb1.append("efghi");
		System.out.println("Sb1 capacity:"+sb1.capacity());
		System.out.println("sb1 size:"+sb1.length());
		System.out.println("sb1 chars:"+sb1);
		System.out.println();
		
		StringBuffer sb2=new StringBuffer(2);
		System.out.println("Sb2 capacity:"+sb2.capacity());
		System.out.println("sb2 size:"+sb2.length());
		System.out.println("sb2 chars:"+sb2);
		System.out.println();
		
		sb2.append("abcdefg");
		System.out.println("Sb2 capacity:"+sb2.capacity());
		System.out.println("sb2 size:"+sb2.length());
		System.out.println("sb2 chars:"+sb2);
		System.out.println();
	
		
	}
}

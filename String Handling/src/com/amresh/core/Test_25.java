package com.amresh.core;

public class Test_25 {
	public static void main(String[] args) {
		
		StringBuffer sb=new StringBuffer();
		System.out.println("StringBuffer Capacity :"+sb.capacity());
		System.out.println("StringBufferLength :"+sb.length());
		System.out.println("SB chars:"+sb);
		System.out.println();
		
		sb.append("a");
		System.out.println("StringBuffer Capacity :"+sb.capacity());
		System.out.println("StringBufferLength :"+sb.length());
		System.out.println("SB chars:"+sb);
		System.out.println();
		
		sb.append(10);
		System.out.println("StringBuffer Capacity :"+sb.capacity());
		System.out.println("StringBufferLength :"+sb.length());
		System.out.println("SB chars:"+sb);
		System.out.println();
		
		pqr p1=new pqr();
		sb.append(p1);
		System.out.println("StringBuffer Capacity :"+sb.capacity());
		System.out.println("StringBufferLength :"+sb.length());
		System.out.println("SB chars:"+sb);
		System.out.println();
		
	//	sb.append(null);
		sb.append((String)null);
		System.out.println("StringBuffer Capacity :"+sb.capacity());
		System.out.println("StringBufferLength :"+sb.length());
		System.out.println("SB chars:"+sb);
		System.out.println();
		
	//	sb.append((char[])null);
		System.out.println();
		
	
		
	}
}


class pqr{
	@Override
	public String toString(){
		return "Hi AMRESH";
	}
}
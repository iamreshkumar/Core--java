// Deleting char of sequence chars
package com.amresh.core;

public class Test_28 {
	public static void main(String[] args) {
		
		StringBuffer sn= new StringBuffer("Amresh MCA Fresher");
		System.out.println("SB chars:"+sn);
		
		sn.delete(7,10);
		System.out.println(sn);
		
		sn.deleteCharAt(4);
		System.out.println("Sb chars:"+sn);
		
		StringBuffer sb2=new StringBuffer("abcdef");
		System.out.println("SB chars:"+sb2);
		
		sb2.deleteCharAt(1);
		sb2.deleteCharAt(2);
		System.out.println("Sb chars:"+sb2);
		System.out.println();
		}
}

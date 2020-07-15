/*	Compare String objects for equality with and without case
 	[ public boolean equals(Object o)& public boolean equalsIgnoreCase(String s]
 */

package com.amresh.core;

import java.awt.image.SampleModel;

public class Test_6 {
	public static void main(String[] args) {
		String s1="a";
		String s2="a";
		String s3=new String("a");
		String s4=new String("a");
		
		StringBuffer sb1=new StringBuffer("a");
		StringBuffer sb2=new StringBuffer("a");
		
		System.out.println(s1==s2);
		System.out.println(s3==s4);
		System.out.println(sb1==sb2);
		System.out.println();
		
		System.out.println(s1.equals(s2));
		System.out.println(s2.equals(s4));
		System.out.println(sb1.equals(sb2));
		
		String s5="a";
		String s6="A";
		
		System.out.println(s5==s6);
		System.out.println(s5.equals(s6));
		System.out.println(s5.equalsIgnoreCase(s6));
		
		
		C  c1=new C(5);
		C  c2=new C(5);
		C  c3=new C(6);
		C c4=c3;
		
		System.out.println(c1==c2);
		System.out.println(c2==c3);
		System.out.println(c3==c4);
		
		System.out.println(c1.equals(c2));
		System.out.println(c2.equals(c3));
		System.out.println(c3.equals(c4));
		
		sample1 s=new sample1();
		
	//	System.out.println(c1==s);
		System.out.println(c1.equals(s));
		System.out.println(s.equals(c1));
		System.out.println(s==null);
		System.out.println(s.equals(null));
		System.out.println(c1==null);
		System.out.println(c1.equals(null));
		
	}
}

class C{
	int x;
	
	public C(int x) {
	this.x=x;
	}
	public boolean equals(Object obj) {
		if(obj instanceof C) {
			C c=(C)obj;
			return (this.x==c.x);
		}
		return false;
	}
}

class sample1{}
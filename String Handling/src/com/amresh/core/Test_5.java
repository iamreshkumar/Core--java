/* retriving hashCode of String object 
 			[ public int hashCode() ]*/

package com.amresh.core;

public class Test_5 {
  public static void main(String[] args) {
	
	  String s1 =new String("a");
	  String s2=new String ("a");
	  String s3=new String("Amresh");
	  
	  System.out.println(s1.hashCode());
	  System.out.println(s2.hashCode());
	  System.out.println(s3.hashCode());
	  
	  System.out.println(System.identityHashCode(s1));
	  System.out.println(System.identityHashCode(s2));
	  System.out.println(System.identityHashCode(s3));
	  System.out.println();
	  
	  String s4="b";
	  String s5="b";
	  
	  System.out.println(s4.hashCode());
	  System.out.println(s5.hashCode());
	  
	  System.out.println(System.identityHashCode(s4));
	  System.out.println(System.identityHashCode(s5));
	  System.out.println();
	  
	  B b1=new B(5);
	  B b2=new B(5);
	  B b3=new B(6);
	  
	  System.out.println(b1.hashCode());
	  System.out.println(b2.hashCode());
	  System.out.println(b3.hashCode());
	  
	  System.out.println(System.identityHashCode(b1));
	  System.out.println(System.identityHashCode(b2));
	  System.out.println(System.identityHashCode(b3));
	  
	  b1.x=101;
	  b2.x=102;
	  b3.x=103;
	  
	  System.out.println(b1.hashCode());
	  System.out.println(b2.hashCode());
	  System.out.println(b3.hashCode());
	  
	  System.out.println(System.identityHashCode(b1));
	  System.out.println(System.identityHashCode(b2));
	  System.out.println(System.identityHashCode(b3));
	  
	  
	  
  }
}


class B{
	int x;

	public B(int x) {
		this.x = x;
	}
	public int hashCode() {
		return x;
	}
}
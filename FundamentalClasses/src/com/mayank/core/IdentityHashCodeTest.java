package com.mayank.core;

public class IdentityHashCodeTest {
  public static void main(String[] args) {
	
	System.out.println("MAIN Method");
	
	Example2 e1=new Example2(5);
	Example2 e2=new Example2(6);
	Example2 e3=new Example2(5);
	Example2 e4=new Example2(7);
	
	System.out.println(e1.hashCode());
	System.out.println(e2.hashCode());
	System.out.println(e3.hashCode());
	System.out.println(e4.hashCode());
	
	System.out.println();
	
	System.out.println(System.identityHashCode(e1));
	System.out.println(System.identityHashCode(e2));
	System.out.println(System.identityHashCode(e3));
	System.out.println(System.identityHashCode(e4));
	
	System.out.println();
	System.out.println(e1.JVMHC());
	System.out.println(e2.JVMHC());
	System.out.println(e3.JVMHC());
	System.out.println(e4.JVMHC());
	
  }
}


class Example2{
	
	private int x;
	Example2(int x){
		this.x=x;
	}
	
	@Override
	public int hashCode() {
		return x;
	}
	public int JVMHC() {
		return super.hashCode();
	}
}
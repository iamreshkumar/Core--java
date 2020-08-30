package com.amresh.wrapper;

public class Test_3 {

	public static void main(String[] args) {
		
		Byte 	b=40;			System.out.println(b);
		Short 	s=50;			System.out.println(s);
		Integer i=60;			System.out.println(i);
		Long 	l=70L;			System.out.println(l);
		Float 	f=80f;			System.out.println(f);
		Double	d=89D;			System.out.println(d);
		Character c='a';		System.out.println(c);
		Boolean bo=true;		System.out.println(bo);
		
		System.out.println();
		
		Byte 	by=Byte.valueOf((byte)40);			System.out.println(by);
		Short 	so=Short.valueOf(s);				System.out.println(so);
		Integer io=Integer.valueOf(i);				System.out.println(io);
		Long	lo=Long.valueOf(l);					System.out.println(lo);
		Float 	fl=Float.valueOf(f);				System.out.println(fl);
	//	Double	do=Double.valueOf(d);;				System.out.println(do);
		Character ch=Character.valueOf(c);			System.out.println(ch);
		Boolean boo=Boolean.valueOf(bo);				System.out.println(boo);
	
	
	}
}

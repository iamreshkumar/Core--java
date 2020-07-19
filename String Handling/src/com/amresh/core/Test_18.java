/*	String object concatation
 	[public String concat(String s) ]	*/
package com.amresh.core;

public class Test_18 {
	public static void main(String[] args) {
		
		String s1="Amresh";
		String s2=s1.concat("kumar");
		
		System.out.println(s1);
		System.out.println(s2);
		
		String s3="a";
		s2.concat("b");
		System.out.println("s3:"+s3);
		
		String s4=s3.concat("c");
		System.out.println("S3:"+s3);
		System.out.println("s4:"+s4);
		System.out.println(s3==s4);
		
		s3=s3.concat("d");
		System.out.println("s3:"+s3);
		
		System.out.println(s2.concat("e"));
		System.out.println(s3);
		
		System.out.println(s3=s3.concat("f"));
		System.out.println(s3);
		
		String s5=s3.concat("");
		System.out.println("s3:"+s3);
		System.out.println("s5"+s5);
		System.out.println(s3==s5);
		
		String s6="";
		String s7=s6.concat(s3);
		System.out.println("s6"+s6);
		System.out.println("s7:"+s7);
		System.out.println(s6==s7);
		
		String s8	="p";;
		String s9	=s8+"q";
		String s10	=s8+"q";
		String s11	=""+s8;
		
		System.out.println("s8:"+s8);
		System.out.println("s9:"+s9);
		System.out.println("s10:"+s10);
		System.out.println(s10==s11);
		System.out.println(s8==s9);
		System.out.println(s8==s10);
		System.out.println(s11==s11);
		
		
		String s12="a";
		String s13="b";
		String s14="c";
		
		
		String s15="abc";
		String s16="a"+"b"+"c";
		String s17="a".concat("b").concat("c");
		
		
		System.out.println(s15==s16);
		System.out.println(s15==s17);
		
		String s18="a";
		String s19=s18.concat("b");
		String s20=s19.concat("b");
		
		System.out.println(s18==s19);
		
		String s21=s1.concat("");
		String s22=s1.concat("");
		
		System.out.println(s18==s20);
		System.out.println(s18==s21);
		System.out.println(s21==s22);
		
	}

}

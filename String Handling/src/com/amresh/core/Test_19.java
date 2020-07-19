/*	String object joining with some delimeter 
 	[public string join(String delim,charSequnce...cs) ] 
*/

package com.amresh.core;

public class Test_19 {
	
	public static void main(String[] args) {
		
		String s12=String.join("-","a","b","c","d","e");
		String s13=String.join("","a","b","c","d");
		String s14=String.join("-");
		String s15=String.join("-","a","b");
		String s16=String.join("-","a","b");
		String s17=String.join("-","a", new StringBuffer("b"),new StringBuilder("c"));
		
		System.out.println(s12);
		System.out.println(s13);
		System.out.println(s14);
		System.out.println(s15);
		System.out.println(s16);
		System.out.println(s17);
		
		
		// performance
		String s18="p";
		String s19=s18+"q";
		
		String s20=s18.concat("q");
		
		// concating more strings
		String s21="a"+"b"+"c"+"d";
		String s22="a".concat("b").concat("c").concat("d");
		String s23=String.join("","a","b","c","d");
		String s24=String.join("-","a","b","c","d");;
	
		System.out.println(s21);
		System.out.println(s22);
		System.out.println(s23);
		System.out.println(s24);
		System.out.println();
	}
}

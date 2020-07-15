/*comparing string object data with the data available in stringBuffer and StringBuilder objects
 			[public boolean contentEquals(StringBuffer cs) ]
 			[public boolean contentEquals(Character cs]
 */

package com.amresh.core;

public class Test_8 {
	public static void main(String[] args) {
		
		String s1=new String("a");
		String s2=new String("a");
		StringBuffer s3=new StringBuffer ("a");
		
		System.out.println(s1.equals(s2));
		System.out.println(s1==s2);
		System.out.println(s1.contentEquals(s2));
		System.out.println();
		
		System.out.println(s1.equals(s3));
		System.out.println(s1.contentEquals(s3));
		
	//	System.out.println(s3.contentEquals(s1));
	//	System.out.println(s1==s3);
	
	}
}

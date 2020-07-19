/*Converting any data value,including primitive types into string type
		[public String valueOf(xxx value)
*/
package com.amresh.core;

public class Test_17 {
	public static void main(String[] args) {
		
		System.out.println(String.valueOf(10));
		System.out.println(String.valueOf(10.64f));
		System.out.println(String.valueOf('a'));
		System.out.println(String.valueOf(true));
		
		System.out.println(String.valueOf("abc"));
		System.out.println(String.valueOf(new char[] {'a','b'}));
	//	System.out.println(String.valueOf(null));
		System.out.println(String.valueOf((String)null));
		System.out.println(String.valueOf((A1)null));
		
		System.out.println(String.valueOf(new A1()));
		System.out.println(String.valueOf(new B1()));

	}
}

class A1{
	
}

class B1{
	
	public String toString() {
		return "Hi";
	}
}

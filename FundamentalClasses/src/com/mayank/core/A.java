/*  Develop a class to accept all types of objects as argument.
		Then print that object's class name from that class
*/

package com.mayank.core;

public class A {

	static void m1(Object obj) {
		String name=obj.getClass().getName();
		
		System.out.println("The passed object is of type ::"+name);
	}
}


class B{
	
}

class C extends B{
	
}


// For test class check the file named with "Test_1.java" 
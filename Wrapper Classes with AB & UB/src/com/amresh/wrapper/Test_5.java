package com.amresh.wrapper;


public class Test_5 {

	public static void main(String[] args) {
		
		m1("pk");
		m1("MB");
		m1("AK");
		
		m1("MK");
	}
	static void m1(String name) {
		switch(name) {
		case "pk":
			System.out.println("Pk is hero of java---with rank 1");
			break;
		case "MB":
			System.out.println("MB is hero of java---with rank 2");
			break;
		case "AK":
			System.out.println("Ak  is also hero of java---with rank 3");
			break;
		default:
			System.out.println(name+"  You are Simple java programmer");
	
			
		  
	}
	}
}

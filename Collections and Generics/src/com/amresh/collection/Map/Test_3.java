package com.amresh.collection.Map;

import java.util.LinkedHashSet;

public class Test_3 {
		public static void main(String[] args) {
			
		LinkedHashSet lhs=new LinkedHashSet();
		
		lhs.add(new Student(1,"Amresh",1));
		lhs.add(new Student(2,"Elina",1));
		lhs.add(new Student(1,"Suresh",3));
		lhs.add(new Student(3,"Sahil",4));
		lhs.add(new Student(2,"Anand",2));
		lhs.add(new Student(3,"helyportor",1));
		
	//	lhs.add(new Intger(8));
		lhs.add(new Integer(10));
		lhs.add(new String ("a"));
		
		System.out.println(lhs);
		
		lhs.remove(new Student (3,"Sahil",4));
		System.out.println("After removing :");
		System.out.println(lhs);
		
		}
		
		
}

package com.amresh.collection.Map;

import java.util.Enumeration;
import java.util.Hashtable;

public class Test_2 {
	public static void main(String[] args) {
		
		Hashtable ht=new Hashtable();
		
		ht.put("Amresh",new Double(10.25));
		ht.put("Sushil",new Double(255.25));
		ht.put("Sahil",new Double(16.25));
		
		System.out.println("ht elements :"+ht);
		
		Enumeration e=ht.keys();
		System.out.println("Employee Name \t\t Employee sal");
		
		while(e.hasMoreElements()) {
			String key=(String)e.nextElement();
			System.out.println(key+"\t\t"+ht.get(key));
		}
		System.out.println();
		
		double sal=((Double)ht.get("Amresh")).doubleValue();
		sal+=11.25;
		
		ht.put("khusi",new Double(sal));
		ht.put("scott", new Double(sal));
		
		e=ht.keys();
		System.out.println();
		System.out.println("The changed values are:");
		
		while(e.hasMoreElements()) {
			String key =(String)e.nextElement();
			System.out.println(key+"\t\t"+ht.get(key));
		}
		
	}
}

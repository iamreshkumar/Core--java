package com.amresh.collection;

import java.util.Vector;

public class Test_3 {

	public static void main(String[] args) {
		
		Vector v = new Vector(3);
		
		System.out.println("Inital capacity and size of vectors...... \n");
		System.out.println("Capacity  :"+v.capacity());
		System.out.println("Size      :"+v.size());
		
		System.out.println();
		
		Customer c1	= new Customer("Amresh",22, 
											  new Address("2-3/14","Meghakids", "Hydrabad","9939382215"));
		
		Customer c2	= new Customer("Sanjay Singh",50, 
				  new Address("03-170","yogi Sathan Harpur Hari", "Mahua","8521573961"));
		
		Customer c3	= new Customer("Shobha singh",44, 
				 new Address("03-170","yogi Sathan Harpur Hari", "Mahua","9955452318"));
		
		Customer c4	= new Customer("Nisha kumari",21, 
				 new Address("03-170","yogi Sathan Harpur Hari", "Mahua","----------"));
		
		Customer c5	= new Customer("Nilu kumari",24, 
				 new Address("03-170","somnaha River", "Samastipur","----------"));
		
		
		v.add(c1);
		v.add(c2);
		
		System.out.println("Reached it's capacity or not");
		System.out.println("Capacity  :"+v.capacity());
		System.out.println("Size      :"+v.size());
		System.out.println();
		
		
		v.add(c3);
		System.out.println("Reached it's capacity or not");
		System.out.println("Capacity  :"+v.capacity());
		System.out.println("Size      :"+v.size());
		System.out.println();
		
		v.add(c4);
		System.out.println("Reached it's capacity or not");
		System.out.println("Capacity  :"+v.capacity());
		System.out.println("Size      :"+v.size());
		System.out.println();
		
		v.add(c5);
		System.out.println("Reached it's capacity or not");
		System.out.println("Capacity  :"+v.capacity());
		System.out.println("Size      :"+v.size());
		System.out.println();
		
		System.out.println("The customer lable are---");
		System.out.println();
		
		for(int i=0;i<v.size();i++) {
			System.out.println(v.get(i));
			System.out.println();
		}
		
	}
}

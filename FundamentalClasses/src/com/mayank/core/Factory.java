package com.mayank.core;

public class Factory {
	public static void main(String[] args)throws CloneNotSupportedException{
		
		Bike b1 = new Bike(5963,2020,"pulsur 180 cc");
	//	Bike b2 = new Bike(4953,2020,"Passion Pro");
		
		Bike b2 = (Bike)b1.clone();
		
		System.out.println(b1==b2);
		
		b1.setBikeNumber(1338);
		b2.setBikeNumber(1452);
		
		System.out.println("b1 object details:"+b1);
		
		System.out.println("b2 object details:"+b2);
	}
}

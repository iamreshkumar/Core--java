package com.mayank.core;

public class Bike implements Cloneable {

	private int engineNumber;
	private int modelNumber;
	private String type;
	private int bikeNumber;
	
	public Bike(int engineNumber, int modelNumber, String type) {
		this.engineNumber = engineNumber;
		this.modelNumber = modelNumber;
		this.type = type;
	
	}


	public void setBikeNumber(int bikeNumber) {
		this.bikeNumber = bikeNumber;
	}
	
	// Overriding clone method to develop above design
	
	public Bike clone()throws CloneNotSupportedException{
		Bike newBike=(Bike)super.clone();
		
		newBike.engineNumber=this.engineNumber+10;
		return newBike;
		
	}
	
	public String toString() {
		return "Bike Number : " +bikeNumber+ "\n"+
				"Engine Number : "  +engineNumber+"\n"+
				"Model Numer:" +modelNumber+ "\n"+
				"Type:"+type;				
	}	
}

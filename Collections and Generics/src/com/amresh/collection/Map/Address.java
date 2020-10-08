package com.amresh.collection.Map;

public class Address implements java.io.Serializable {
	int hno;
	int streetNo;
	String city;
	
	public Address(int hno, int streetNo, String city) {
		this.hno = hno;
		this.streetNo = streetNo;
		this.city = city;
	}

	@Override
	public String toString() {
		return "Address [hno=" + hno + ", streetNo=" + streetNo + ", city=" + city + "]";
	}
}

package com.amresh.collection;

 class Example_2 implements Comparable{

	int x;

	public Example_2(int x) {
		this.x = x;
	}

	@Override
	public int compareTo(Object obj) {
		Example_2 e =(Example_2)obj;
		return e.x-this.x;
	}

	@Override
	public String toString() {
		return "Example_2 [x=" + x + "]";
	}
	
	
	
	
}

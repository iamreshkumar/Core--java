package com.mayank.core;



class Example3{
	int x=10;
	int y=20;
}

class Test1{
	
}
public class Comparision {
  public static void main(String[] args) {
	
	  
	// comparing primitive values using "==" opreator
	  int x=10;
	  int y=20;
	  int z=10;
	  
	  System.out.println(x==y);
	  System.out.println(y==z);
  
	 // comparing object's using "==" opreator
	  
	  Example3 e1=new Example3();
	  Example3 e2=new Example3();
	  Example3 e3=e2;
	  
	  System.out.println(e1==e2);
	  System.out.println(e2==e3);
  
  
	  boolean bo=true;
	  
	 // System.out.println(x==bo);
  
	  Test t1=new Test();
	 // System.out.println(e1==t1);
  
	 // comparing objects using equals method
	  
		  System.out.println(e1.equals(e2));
		  System.out.println(e2.equals(e3));
		  System.out.println(e1.equals(t1));
	  
	  // comparing two nulls using == opreator
	  
		  //  case #1 :  Comparing null with other null returns true 
		  	  System.out.println(null==null);
		  
		  //  case #2 :  comparing null with null refrence variables returns true
			  Example3 e4=null;
			  System.out.println(null==e4);
	  
		  //  case #3 : Comparing null with object refrence variables returns false
			  Example3 e5=new Example3();
			  System.out.println(null==e5);
		  
		  //  case #4 : Comparing null with object also return false
			  System.out.println(null==new Example3());
	  
	// Comparing two nulls using equals() method
			  
			//  case #5 : We cannot invoke method using null,it leads to compile time Error
			   //System.out.println(null.equals(null));
  
			//  case #6 : We cannot invoke method using null refrenced variable,it leads compile time error
				  Example3 e6=null;
				  
				 // System.out.println(e6.equals(null));
  
			//  case #7 : we can invoke equals () method by using by passing null, result false
				  Example3 e7= new Example3();
				  System.out.println(e7.equals(null));
  }
  
}

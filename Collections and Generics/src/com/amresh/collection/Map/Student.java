// understanding hashcode and equals() method using with collection object
package com.amresh.collection.Map;

import java.io.Serializable;

public class Student implements Serializable{
	int sno;
	String name;
	int whichClass;
	
	public Student(int sno, String name, int whichClass) {
		this.sno = sno;
		this.name = name;
		this.whichClass = whichClass;
	}

	@Override
	public int hashCode() {
		return whichClass;
	}

	@Override
	public boolean equals(Object obj) {
			// Below condition should be presented else there is a chance of getting ClassCastException
		if(obj instanceof Student) {
			Student s=(Student)obj;
			
			if(this.sno==s.sno   &&
			   this.name.equals(s.name)	&&
			   this.whichClass==s.whichClass
					
			) 
				return true;
			}
			return false;
		}


	@Override
	public String toString() {
		return "Student [sno=" + sno + ", name=" + name + ", whichClass=" + whichClass + "]";
	}
}

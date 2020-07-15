/* Below application shows overriding hashcode() method for generating hash code for student object with their state.
	Because student is a real world object we must generate hash code based on state but not based on refrence */
	
package com.mayank.core;

public class StudentTest {

	public static void main(String[] args) {
		
		Student s1=new Student(101,"Amresh","CoreJava");
		Student s2=new Student(102,"Mayank","java");
		
		
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
		System.out.println(s1);
		System.out.println(s2);
		
	}
}


class Student{
	private  int sno;
	private String sname;
	private String course;
	
	public Student(int sno,String sname,String course) {
		this.sno=sno;
		this.sname=sname;
		this.course=course;
	}
	
	@Override
	public int hashCode() {
		return sno;
	}
	
	public String toString() {
		return "sno:" 	  +sno+ "\n"+
			   "name:"	  +sname+ "\n"+
			   "course:" +course+ "\n";
	}
}
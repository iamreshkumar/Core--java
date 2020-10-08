package com.amresh.collection.Map;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.LinkedHashMap;

public class College {
	public static void main(String[] args)throws Exception{
		
		LinkedHashMap lhm =new LinkedHashMap();
		
		lhm.put(new Student(12,"Amresh",12), new Address(1,2,"Hyd"));
		lhm.put(new Student(12,"Happy",2), new Address(1-7,82,"Punjab"));
		lhm.put(new Student(9,"Singh",07), new Address(1,2-45,"BR"));
		
		System.out.println(lhm);
		
		// Stroring Student information in file permamently for future refrence
		FileOutputStream fos=new FileOutputStream("Studentinfo.ser");
		ObjectOutputStream os=new ObjectOutputStream(fos);
		
		os.writeObject(lhm);
		System.out.println("Student info is saved Sucessfully");
	}
}

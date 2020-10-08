package com.amresh.collection.Map;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

public class CollegeWebsite {
	public static void main(String[] args)throws Exception{
		
		//reading student information from file
		
		FileInputStream  fis=new FileInputStream("Studentinfo.ser");
		ObjectInputStream ois= new  ObjectInputStream(fis);
		
		LinkedHashMap  lhm= (LinkedHashMap)ois.readObject();
		Set keySet	=lhm.keySet();
		Iterator keyItr =keySet.iterator();
		
		while(keyItr.hasNext()) {
			Object key =keyItr.next();
			Object value=lhm.get(key);
			
			System.out.println(key+"student Address");
			System.out.println(value);
			System.out.println();
		}
	}
}

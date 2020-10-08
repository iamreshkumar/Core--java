package com.amresh.collection.Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Test_1 {
	public static void main(String[] args) {
		
		HashMap 		hm=new HashMap();
		LinkedHashMap 	lhm=new LinkedHashMap();
		TreeMap 		tm=new TreeMap();
		
		hm.put("Amresh",new Double(4000.0));
		hm.put("Ayush",new Double(5000.0));
		hm.put("Harsh",new Double(6000.0));
	
		lhm.put("Shriyansh",new Double(4000.0));
		lhm.put("Aryushi",new Double(4000.0));
		lhm.put("Somya",new Double(6000.0));
		
		tm.put("Nilu",new Double(45000.0));
		tm.put("Nisha",new Double(95000.0));
		tm.put("Nitish",new Double(15000.0));
	
		// Getting th set of keys and getting the Iterator
		
		Set	set	=hm.keySet();
		Iterator hmitr=set.iterator();
		
		System.out.println("\n The Account Balance HashMap Account holders:");
		while(hmitr.hasNext()) {
			Object key =hmitr.next();
			Object value=hm.get(key);
			System.out.println(key+":"+value);
		}
		System.out.println();
	
		System.out.println("\n The Account Balance of LinkedHashMap Account holders:");
		//Getting the collection of values getting iterator
		Collection lhmcol=lhm.values();
		Iterator	lhmitr=lhmcol.iterator();
		while(lhmitr.hasNext()) {
			System.out.println(lhmitr.next());
		}
		
		System.out.println();
		System.out.println("\n The Account balance of TreeMap Account Holders:");
		
		//Getting the set of Entries and obtaining Iterator
		Set 		tmset=tm.entrySet();
		Iterator 	tmitr=tmset.iterator();
		
		while(tmitr.hasNext()) {
			Map.Entry me=(Map.Entry)tmitr.next();
			
			System.out.println(me.getKey()+":");
			System.out.println(me.getValue());
		}
		double balance =((Double)hm.get("Amresh")).doubleValue();
		hm.put("Amresh",new Double(balance+1000));
		
		System.out.println("Amresh's  new Balance is ::"+hm.get("Amresh"));
	}
}

package com.amresh.core;

public class StringWordReverse {

	public static String reverseStringWords(String s) {
		
		String[] stringWords=s.split(" ");
		String resultString="";
		
		for(int i=stringWords.length-1;i>=0; i--) {
			resultString +=stringWords[i]+"";
		}
		return resultString;
	}
}

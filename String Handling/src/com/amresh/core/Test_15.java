/* String tokenizer*/
package com.amresh.core;

import java.util.StringTokenizer;

public class Test_15 {
	public static void main(String[] args) {
		
		StringTokenizer st= new StringTokenizer("Amresh kumar");
							new StringTokenizer("Amresh kumar","a");
							new StringTokenizer("Amresh kumar","a",true);
							
		System.out.println("Number of Tokens:"+st.countTokens());
		while(st.hasMoreTokens()) {
			String token=st.nextToken();
			System.out.println(token);
		}
		
	}
}

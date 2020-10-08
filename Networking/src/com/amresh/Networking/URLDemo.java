package com.amresh.Networking;

import java.net.URL;

public class URLDemo {
	public static void main(String[] args) {
		
		try {
			URL u=new URL("http://system1:1024/NetDemo2.java");
			System.out.println("\n Protocol :"+u.getProtocol());
			System.out.println("\n Host     :"+u.getHost());
			System.out.println("\n Port     :"+u.getPort());
			System.out.println("\n File     :"+u.getFile());
			System.out.println("\n Path     :"+u.toExternalForm());
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}

// To know computer Name and it's IP Address
package com.amresh.Networking;

import java.net.InetAddress;

public class InetAddressDemo {
	public static void main(String[] args) {
		
		try {
			InetAddress add=InetAddress.getLocalHost();
			System.out.println("\n Local Host details:"+add);
			System.out.println("The Host IP Address is :"+add.getHostAddress());
			System.out.println("The Host name is :"+add.getHostName());
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}

package com.amresh.Networking;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Date;

public class UDPServer {
	public static void main(String[] args) {
		
		try {
			Date date;
			String strDate;
			DatagramSocket ds=new DatagramSocket(1111);
			
			int i=0;
			
			while(true) {
				date =new Date();
				strDate =date.toString();
				byte dbyte[] =strDate.getBytes();
				
				InetAddress address = InetAddress.getByName("localhost");
				
				DatagramPacket packet =new DatagramPacket(dbyte,dbyte.length,address,1221);
				
				ds.send(packet);
				System.out.println((++i)+"packet sent");
				Thread.sleep(1000);
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}

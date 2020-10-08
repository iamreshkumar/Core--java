package com.amresh.Networking;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UDPClient {
	public static void main(String[] args) {
		
		try {
			String strDate;
			DatagramSocket ds=new DatagramSocket(1211);
			byte rdata[] =new byte[64];
			DatagramPacket packet=new DatagramPacket(rdata,rdata.length);
			
			while(true) {
				ds.receive(packet);
				strDate =new String(packet.getData());
				System.out.println("Server Date and Time is::"+strDate);
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}

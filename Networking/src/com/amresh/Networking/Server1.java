package com.amresh.Networking;

import java.io.DataOutputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server1 {
	public static void main(String[] args) {
	
		try {
			ServerSocket ss=new ServerSocket(444);
			System.out.println("Server is ready");
			
			Socket s=ss.accept();
			
			System.out.println("Connection is accepted");
			System.out.println("sent a message to the client");
			
			OutputStream out=s.getOutputStream();
			DataOutputStream dos1=new DataOutputStream(out);
			
			dos1.close();
			s.close();
			ss.close();
			
		}
		catch(Exception e) {
			System.out.println("Exception:"+e);
		}
	}
}

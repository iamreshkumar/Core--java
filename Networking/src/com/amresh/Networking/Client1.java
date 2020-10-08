//just for practice
package com.amresh.Networking;

import java.io.DataInputStream;
import java.io.InputStream;
import java.net.Socket;

public class Client1 {
	public static void main(String[] args) {
		
		try {
			Socket s =new Socket("localhost",444);
			
			InputStream in=s.getInputStream();
			DataInputStream dis1=new DataInputStream(in);
			
			String msg1 =dis1.readLine();
			System.out.println("Server msg is:"+msg1);
			dis1.close();
			s.close();
		}
		catch(Exception e) {
			System.out.println("Exception :"+e);
		}
	}
}

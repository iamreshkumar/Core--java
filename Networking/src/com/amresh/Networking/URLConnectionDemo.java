package com.amresh.Networking;

import java.io.File;
import java.net.URL;
import java.net.URLConnection;
import java.io.*;
import java.util.*;


public class URLConnectionDemo {
	public static void main(String[] args) {

	try {
		int c;
		File file	=new File("Example.txt");
		String filePath	="file://"+file.getAbsolutePath();
		URL fileURL		=new URL(filePath);
		
		URLConnection ucon= fileURL.openConnection();
		
		System.out.println("\n Date:"+new Date (ucon.getDate()));
		System.out.println("Content-Type:"+ucon.getContentType());
		System.out.println("Expries:"+ucon.getExpiration());
		System.out.println("LastModified::"+ucon.getLastModified());
		
		int len =ucon.getContentLength();
		System.out.println("Content Length:"+len+"bytes");
		
		if(len>0) {
			System.out.println("\n ============CONTENT================");
		InputStream in =ucon.getInputStream();
			
			int i=len;
			while((c=in.read())!=-1) {
				System.out.println((char)c);
			}
			in.close();
		}
		else {
			System.out.println("No content Available");
		}
	}
	catch(Exception e) {
		e.printStackTrace();
	}
  }
}


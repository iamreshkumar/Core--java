package com.amresh;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;

public class MyFramee extends Frame {

	Label l1,l2,l3;
	TextField tf1,tf2,tf3;
	Button b1,b2;
	
	MyFramee(){
		
		
		// creating component objects
		l1=new Label("Enter first integer Number");
		l2=new Label("Enter secound integer Number");
		l3=new Label("Result");
		
		tf1=new TextField(20);
		tf2=new TextField(20);
		tf3=new TextField(20);
	
		b1=new Button("Add");
		b2=new Button("Clear");
		
	
		//setting frame object properties
		setTitle("Addition window");
		setSize(500,500);
	//	setVisible(true);
		setLayout(new FlowLayout());
		setLayout(getLayout());
		
		// updating font color
		setFont(new Font("Arial",Font.BOLD,24));
		setBackground(Color.CYAN);
		setForeground(Color.BLUE);
		
		
		
		// adding component to container
		add(l1);			add(l3);
		add(tf1);			add(tf3);
		
		add(l2);			add(b1);
		add(tf2);			add(b2);
	
	}
	 
	public static void main(String[] args) {
		MyFrame f=new MyFrame();
		
		
	
		System.out.println("Frame object created");
	}
}

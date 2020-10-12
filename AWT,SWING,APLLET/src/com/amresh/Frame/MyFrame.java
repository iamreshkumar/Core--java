package com.amresh.Frame;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends Frame implements ActionListener {

	Label lo,l1,l2,l3;
	TextField t1,t2,t3;
	Button b1,b2,b3,b4,b5;
	
	MyFrame(){
		
		// creating component object
		lo=new Label("WELCOME TO AMRESH CALCULATOR");
		l1=new Label("Enter First Integer Nmber");
		l2=new Label("Enter secound Integer Number");
		l3=new Label("Result");
		
		t1=new TextField(20);
		t2=new TextField(20);
		t3=new TextField(20);
		
		b1=new Button("add");
		b3=new Button("subtract");
		b4=new Button("multiply");
		b5=new Button("divide");
		b2=new Button("clear");
		
		// adding components to container
		add(lo);
		add(l1);
		add(t1);
		
		add(l2);
		add(t2);
		
		add(l3);
		add(t3);
		
		add(b1);
		add(b3);
		add(b4);
		add(b5);
		add(b2);
		
		// registering event logic Handling
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		
		//set Font and color
		setFont(new Font("Arial",Font.BOLD,24));
		setBackground(Color.YELLOW);
		setForeground(Color.RED);
		
		//set Frame properties
		setTitle("Addition window");
		setSize(5000,5000);
		setVisible(true);
		
		setLayout(new FlowLayout());
		
	}
		
		//Event handling logic
		
		public void actionPerformed(ActionEvent ae) {
			//returns buttom name, that has been clicked by user
			String buttonName=ae.getActionCommand();
			
			if(buttonName.equals("add")) {
				String s1=t1.getText();
				String s2=t2.getText();
				
				int n1=Integer.parseInt(s1);
				int n2=Integer.parseInt(s2);
				
				int n3=n1+n2;
				
				t3.setText(""+n3);
			}
			else if(buttonName.equals("subtract")) {
				String s1=t1.getText();
				String s2=t2.getText();
				
				int n1=Integer.parseInt(s1);
				int n2=Integer.parseInt(s2);
				
				int n3=n1-n2;
				
				t3.setText(""+n3);
			}
			else if (buttonName.equals("multiply")) {
				String s1=t1.getText();
				String s2=t2.getText();
				
				int n1=Integer.parseInt(s1);
				int n2=Integer.parseInt(s2);
				
				int n3=n1*n2;
				
				t3.setText(""+n3);
			}
			else if (buttonName.equals("divide")) {
				String s1=t1.getText();
				String s2=t2.getText();
				
				int n1=Integer.parseInt(s1);
				int n2=Integer.parseInt(s2);
				
				int n3=n1/n2;
				
				t3.setText(""+n3);
			}
			else if(buttonName.equals("clear")){
				
				t1.setText("");
				t2.setText("");
				t3.setText("");
				
					
			}
			
		}
		public static void main(String[] args) {
			
			MyFrame f=new MyFrame();
			
			System.out.println("Frame Object creadted");
		}
		
	
}

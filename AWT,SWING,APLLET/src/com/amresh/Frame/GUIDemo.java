package com.amresh.Frame;

import java.awt.*;
import java.awt.Button;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Label;
import java.awt.TextField;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUIDemo {

	Label l1,l2,l3;
	TextField tf1,tf2,tf3;
	Button add,cancle;
	Toolkit tk;
	Dimension d;
	
	GUIDemo(String name){
		super(name);
		setVisible(true);
		
		// creating window with monitor size
		tk=Toolkit.getDefaultToolkit();
		d=tk.getScreenSize();
		int h=d.height;
		int w=d.width;
		
//		setSize(w,h);
//		setLayout(null);
		
//		setFont(new Font("Arial",Font.BOLD,24));
		
		setBackGroundcolor(cyan);
		setForegroundcolor(blue);
		
		l1=new Label("Fno");
		l1.setBounds(100, 20,50, 20);
		add(l1);
		
		tf1=new TextField(20);
		tf1.setBounds(180,20,200,25);
		add(tf1);
		
		l2=new Label("seno");
		l2.setBounds(100,40,70,40);
		add(l2);
		
		tf2=new TextField(20);
		tf2.setBounds(180,50,200,25);
		add(tf2);
		
		l3=new Label("Re");
		l2.setBounds(100, 70,70,40);
		add(l3);
		
		tf3=new TextField(20);
		tf3.setBounds(180,80,200,25);
		
		add=new Button("click me");
		add.setBounds(100,100,200,25);
		add(add);
		
		cancle=new Button("cancle");
		cancle.setBounds(300,100,200,25);
	add(cancle);
		
		add.addActionListener((ActionListener) this);
		cancle.addActionListener((ActionListener) this);
	
	}
	
	public void actionPerformed(ActionEvent ae) {
		
		try {
			if(ae.getSource()==add) {
				try {
					int a=Integer.parseInt(tf1.getText());
					int b=Integer.parseInt(tf2.getText());
					int c=a+b;
					
					tf3.setText(""+c);
				}
				catch(NumberFormatException nfe) {
					nfe.printStackTrace();
				}
				catch(NullPointerException npe) {
					npe.printStackTrace();
				}
				catch(Exception e) {
					e.printStackTrace();
				}
			}
			if(ae.getActionCommand().equals("cancle")) {
				try {
					tf1.setText("");
					tf2.setText("");
					tf3.setText("");
				}
				catch(NumberFormatException nfe) {
					nfe.printStackTrace();
				}
				catch(NullPointerException npe) {
					npe.printStackTrace();
				}
				catch(Exception e) {
					e.printStackTrace();
				}
				
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		
		new GUIDemo("Addition frame").show();
		
	}
	
	
}

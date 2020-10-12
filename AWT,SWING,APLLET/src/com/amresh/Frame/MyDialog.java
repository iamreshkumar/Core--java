package com.amresh.Frame;

import java.awt.Button;
import java.awt.Color;
import java.awt.Dialog;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;

public class MyDialog extends Dialog {

	Button b;
	Font f;
	
	MyDialog(Frame frm,String name){
		
		super(frm,name,true);
		setBounds(50,150,220,100);
		setForeground(Color.CYAN);
		setLayout(new FlowLayout());
		
		f=new Font("Arial",Font.BOLD,30);
		setFont(f);
		
		b=new Button("close");
		add(b);
	
	}
	public void paint(Graphics g) {
		g.drawString("This is custom dailog Box", 30,80);
	}
	
}

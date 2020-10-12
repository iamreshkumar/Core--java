package com.amresh.Frame;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DilogDemo extends Frame implements ActionListener{
	
	Button b1;
	MyDialog dlg;
	Font f;
	
	
	DilogDemo() {
			setBackground(Color.pink);
			setForeground(Color.green);
			setTitle("Dialog Demo");
			setLayout(new FlowLayout());
			
			f=new Font("Arial",Font.BOLD,30);
			setFont(f);
			
			dlg=new MyDialog(this,"Dialog Box");
			
			b1=new Button("show Dailog");
			b1.addActionListener(this);
			
			dlg.b.addActionListener(this);
			add(b1);
			
			setSize(300,300);
			show();
			
	}
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource()==b1)
			dlg.show();
		
		if(ae.getSource()==dlg.b)
			dlg.dispose();
	}

	
	public static void main(String[] args) {
		new DailogDemo();
	}

}

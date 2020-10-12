package com.amresh.Frame;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DailogDemo extends Frame implements ActionListener{

	MyDialog  dlg;
	Button b1;
	Font f;
	
	DailogDemo(){
		setBackground(Color.pink);
		setForeground(Color.blue);
		setTitle("DailogDemo");
		setLayout(new FlowLayout());
		
		f=new Font("Arial",Font.BOLD,24);
		setFont(f);
		
		dlg=new MyDialog(this,"DailogBox");
		
		b1=new Button("Show dailog");
		b1.addActionListener(this);
		
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

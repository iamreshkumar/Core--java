package com.amresh.Frame;

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class javaEditor extends Frame implements ActionListener {

	TextArea ta;
	FileDailog dlg;
	Font f;
	String strFileName,str;
	
	MenuBar mb;
	Menu mFile,mFormat,msubColor,msubStyle;
	MenuItem miNew,miOpen,miSave,miExit;
	MenuItem miPink,miOrange,miGray,miPlain,miBold,miItalic;
	
	javaEditor(){
		
		setBackground(Color.YELLOW);
		setForeground(Color.RED);
		setTitle("MenueDemo");
		
		f=new Font("Arial",Font.BOLD,24);
		setFont(f);
		
		mb=new MenuBar();
		
		mFile=new Menu("File");
		mFormat =new Menu("Format");
		msubColor =new Menu("Color");
		msubStyle =new Menu("Style");
		
		miNew =new MenuItem("New");
		miNew.addActionListener(this);
		
		miOpen=new MenuItem("Open");
		miOpen.addActionListener(this);
		
		miSave=new MenuItem("Save");
		miSave.addActionListener(this);
		
		miExit =new MenuItem("Exit");
		miExit.addActionListener(this);
		
		miPink =new MenuItem("Pink");
		miPink.addActionListener(this);
		
		miOrange =new MenuItem("Orange");
		miOrange.addActionListener(this);
		
		miGray=new MenuItem("Gray");
		miGray.addActionListener(this);
		
		miPlain=new MenuItem("Plain");
		miPlain.addActionListener(this);
		
		miBold=new MenuItem("Bold");
		miBold.addActionListener(this);
		
		miItalic=new MenuItem("Italic");
		miItalic.addActionListener(this);
		
		mFile.add(miNew);
		mFile.add(miOpen);
		mFile.add(miSave);
		mFile.add(miExit);
		
		mFormat.add(msubColor);
		mFormat.add(msubStyle);
		
		msubColor.add(miPink);
		msubColor.add(miOrange);
		msubColor.add(miGray);
		
		msubStyle.add(miPlain);
		msubStyle.add(miBold);
		msubStyle.add(miItalic);
		
		mb.add(mFile);
		mb.add(mFormat);
		
		setMenuBar(mb);
		ta=new TextArea();
		add.ta();
		
		setSize(400,400);
		show();
		
	}
	
	public void actionPerformed1(java.awt.event.ActionEvent ae) {
		
		if(ae.getSource()==miNew) {
			ta.setText("");
		}
		
		if(ae.getSource()==miOpen) {
			dlg=new FileDailog(this,"Open",FileDailog.LOAD);
			dlg.show();
			
			try {
				strFileName =dlg.getDirectory
			}
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}

}

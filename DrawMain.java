//Syrobia
//package com.github.syrobia.dragonslayer.drawmain;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class DrawMain extends JPanel{
	
	public DrawMain() {
		addMouseListener (new DrawMain());
		setBackground (Color.green);
	}
	
	public void paintMain (Graphics g) {
		Graphics2D e = (Graphics2D) g;
		
	}
	
	//Runner	
	public static void main(String[] args) {
		JFrame frame = new JFrame("DragonSlayer -by Syrobia");
		frame.setSize(420, 640);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

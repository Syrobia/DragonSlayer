//Syrobia
//package com.github.syrobia.dragonslayer.drawmain;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.Ellipse2D;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class DrawMain {
	
	public void DrawMain (Graphics g) {
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

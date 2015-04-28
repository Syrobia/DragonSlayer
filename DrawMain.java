//Syrobia-This is just a test class for the JPanel component --> This may also be used to start to implement the actual game?
//package com.github.syrobia.dragonslayer.drawmain;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class DrawMain extends JPanel implements MouseMotionListener{
	private int mX, mY;
	public DrawMain() {
		logic();
	}
	

	public void mouseMoved(MouseEvent me) {
    		mX = (int) me.getPoint().getX();
		mY = (int) me.getPoint().getY();
	}
	public void mouseDragged(MouseEvent me) {
    		mouseMoved(me);
	}
	public void mousePressed(MouseEvent e) {
		//put stuff here
	}
	public void mouseReleased(MouseEvent e){
		//put stuff here 
	}
	
	public void paintMain (Graphics g) {
		Graphics2D e = (Graphics2D) g;
		
	}
	
	public void logic() {	
	JFrame frame = new JFrame("DragonSlayer -by Syrobia");
	frame.setSize(420, 640);
	frame.setVisible(true);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	addMouseListener (new DrawMain());
	setBackground (Color.green);
	}
	//Runner	
	public static void main(String[] args) {
		DrawMain();
	}
}

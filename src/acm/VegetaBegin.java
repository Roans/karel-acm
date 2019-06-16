package acm;

import java.awt.Color;

import acm.graphics.GImage;
import acm.program.GraphicsProgram;

public class VegetaBegin extends GraphicsProgram {
	public void init() {
		this.setBackground(Color.BLACK);
	    this.setSize(1920, 1080);
	    	}

	public void run() {
		GImage logo = new GImage("C:\\Users\\Roans\\Desktop\\VegetaSprite1.jpg");
		double x = (getWidth() - logo.getWidth()) / 2;
		double y = (getHeight() - logo.getHeight()) / 2;
		add(logo, x, y);
		pause(500);
		remove(logo);
		GImage logo2 = new GImage("C:\\Users\\Roans\\Desktop\\VegetaSprite2.jpg");
		add(logo2, x, y);
	
	}
}


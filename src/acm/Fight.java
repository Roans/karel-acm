package acm;

import java.awt.Color;
import java.util.Random;

import acm.graphics.GImage;
import acm.program.GraphicsProgram;

public class Fight extends GraphicsProgram {
	public void init() {
		this.setBackground(Color.BLACK);
		this.setSize(1920, 1080);
		bomb = new GBomb(BALL_RADIUS);
		bomb.setColor(Color.BLUE);
		bomb.setFilled(true);

	}

	public void run() {
		GImage vegeta1 = new GImage("C:\\Users\\Roans\\Desktop\\VegetaSprite1.jpg");
		double x = (getWidth() - vegeta1.getWidth() - 780) / 2;
		double y = (getHeight() - vegeta1.getHeight()) / 2;
		add(vegeta1, x, y);
		GImage car = new GImage("C:\\Users\\Roans\\Desktop\\cars.png");
		add(car, x + 900, y);

		pause(500);
		remove(vegeta1);
		GImage vegeta2 = new GImage("C:\\Users\\Roans\\Desktop\\VegetaSprite2.jpg");
		add(vegeta2, x, y);
	    double vegetaX = vegeta2.getX();
	    //System.out.println(vegetaX+200);
	    //System.out.println(getWidth() / 2 - 300);
		//add(bomb, getWidth() / 2 - 300, getHeight() / 2 - 115);
	    add(bomb, vegetaX + 200, getHeight() / 2 - 115);

		waitForClick();

		sizeIncrease();
		for (int z = 1; z < 85; z++) {
			bomb.move(10, 0);
			pause(50);
		}
		remove(vegeta2);
		add(vegeta1, x, y);

		sizeIncrease2();
		remove(bomb);
		remove(car);

		GImage explosion = new GImage("C:\\Users\\Roans\\Desktop\\explosion.png");
		add(explosion, x + 900, y);
		pause(300);
		remove(explosion);
	}

	private void sizeIncrease() {
		int i = 1;
		String x;

		for (i = 1; i < 8; i++) {
			bomb.setSize(BALL_RADIUS * i, BALL_RADIUS * i);
			pause(PAUSE_TIME);

		}
	}

	private void sizeIncrease2() {
		int i = 7;
		String x;

		for (i = 7; i < 50; i++) {
			bomb.setSize(BALL_RADIUS * i, BALL_RADIUS * i);
			pause(PAUSE_TIME);

		}
	}

	private static final double BALL_RADIUS = 20;
	private static final int PAUSE_TIME = 500;

	private GBomb bomb;

	public static double getRandomDoubleBetweenRange(double min, double max) {
		double x = (Math.random() * ((max - min) + 1)) + min;
		return x;
	}
}
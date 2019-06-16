package acm;

import java.awt.Color;
import java.util.Random;

import acm.program.GraphicsProgram;

public class BouncingBall extends GraphicsProgram {

	/** Initialize the ball and its velocity components */
	public void init() {
		ball = new GBall(X,Y);
		ball.setColor(Color.MAGENTA);
		ball.setFilled(true);
		add(ball, getWidth() / 2, getHeight() / 2);
		dx = 2;
		dy = 1;
	}

	/** Run forever bouncing the ball */
	public void run() {
		waitForClick();
		while (true) {
			advanceOneTimeStep();
			pause(PAUSE_TIME);
			
		}
	}

	/* Check for bounces and advance the ball */
	private void advanceOneTimeStep() {
		Random rand = new Random();
		float r = rand.nextFloat();
		float g = rand.nextFloat();
		float b = rand.nextFloat();
		Color color = new Color(r, g, b);
		double bx = ball.getX();
		double by = ball.getY();
		if (bx < X || bx > getWidth() - X) {
			dx = -dx;
			ball.setColor(color);
		}
		if (by < Y || by > getHeight() - Y) {
			dy = -dy;
			ball.setColor(color);
		}
		ball.move(dx, dy);
	}

	private void jelly() {
			Random rand = new Random();
			
			double z = getRandomDoubleBetweenRange(0,10);
		    ball.setSize(z,z);
	       	pause(PAUSE_TIME2);
	       	}
	
	/* Private constants */
	private static final double X = 100;
	private static final double Y= 150;
	private static final int PAUSE_TIME = 1;
	private static final int PAUSE_TIME2 = 100;

	/* Private instance variables */
	private GBall ball; /* The ball object */
	private double dx; /* Velocity delta in the x direction */
	private double dy; /* Velocity delta in the y direction */
	public static double getRandomDoubleBetweenRange(double min, double max){
	    double x = (Math.random()*((max-min)+1))+min;
	    return x;
	}
}

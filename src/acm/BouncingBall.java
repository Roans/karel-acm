package acm;

import java.awt.Color;
import java.util.Random;

import acm.program.GraphicsProgram;

public class BouncingBall extends GraphicsProgram {

	/** Initialize the ball and its velocity components */
	public void init() {
		ball = new GBall(BALL_RADIUS);
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
		if (bx < BALL_RADIUS || bx > getWidth() - BALL_RADIUS) {
			dx = -dx;
			ball.setColor(color);
		}
		if (by < BALL_RADIUS || by > getHeight() - BALL_RADIUS) {
			dy = -dy;
			ball.setColor(color);
		}
		ball.move(dx, dy);
	}

	/* Private constants */
	private static final double BALL_RADIUS = 100;
	private static final int PAUSE_TIME = 1;

	/* Private instance variables */
	private GBall ball; /* The ball object */
	private double dx; /* Velocity delta in the x direction */
	private double dy; /* Velocity delta in the y direction */
}

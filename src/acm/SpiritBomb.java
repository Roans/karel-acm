package acm;

import java.awt.Color;
import java.util.Random;
import acm.program.GraphicsProgram;

public class SpiritBomb extends GraphicsProgram {
	public void init() {
	    this.setBackground(Color.BLACK);
	    this.setSize(1920, 1080);
	    bomb = new GBomb(BALL_RADIUS);
		bomb.setColor(Color.BLUE);
		bomb.setFilled(true);
		add(bomb, getWidth() / 2, getHeight() / 2);
		
	}
	
	public void run() {
		waitForClick();
		sizeIncrease();
		remove(bomb);
		}
		
	private void sizeIncrease() {
		int i=1;
		String x;
		
		for(i=1;i<8;i++) {
			 bomb.setSize(BALL_RADIUS*i,BALL_RADIUS*i);
			 pause(PAUSE_TIME);
			 double z = getRandomDoubleBetweenRange(i-1,i);
			 /*for(int j=0;j<3;j++) {
				 bomb.setSize(BALL_RADIUS*z,BALL_RADIUS*z);
				 bomb.setSize(BALL_RADIUS*i,BALL_RADIUS*i);
			 }
			 */
		}
	}

	private static final double BALL_RADIUS = 20;
	private static final int PAUSE_TIME = 500;
	
	private GBomb bomb;
	
	public static double getRandomDoubleBetweenRange(double min, double max){
	    double x = (Math.random()*((max-min)+1))+min;
	    return x;
	}
}

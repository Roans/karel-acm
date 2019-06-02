package acm;

import java.awt.Color;
import java.util.Random;
import acm.graphics.*;
import acm.program.GraphicsProgram;
import java.awt.Color;

public class RandomCircles extends GraphicsProgram {

	private static final int X = 150;
	private static final int Y = 150;
	private static final int X_POS = 200;
	private static final int Y_POS = 180;

	public void run() {

		Random rand = new Random();

		for (int i = 1; i < 50; i++) {
			float r = rand.nextFloat();
			float g = rand.nextFloat();
			float b = rand.nextFloat();
			Color color = new Color(r, g, b);
			int randomNum = rand.nextInt(20);
			int randomNum2 = rand.nextInt(20);
			int randomNum3 = rand.nextInt(4);

			GOval redOval = new GOval(X * randomNum3 / 2, Y * randomNum3 / 2);
			redOval.setColor(color);
			redOval.setFilled(true);
			add(redOval, X_POS * randomNum / 2, Y_POS * randomNum2 / 2);
		}

	}

}

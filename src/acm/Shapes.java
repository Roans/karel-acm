package acm;

import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class Shapes extends GraphicsProgram {
	
	public void run() {
		double centerY = getHeight() / 2;

		// make and add a blue square
		GRect blueSquare = new GRect(80, 80); 
		blueSquare.setColor(Color.BLUE); 
		blueSquare.setFilled(true); 
		//add(blueSquare, 70, 70); 

		// add a long yellow rectangle
		GRect yellowRect = new GRect(40, 360);
		yellowRect.setColor(Color.YELLOW);
		yellowRect.setFilled(true);
		add(yellowRect, 600, 10);

		// make and add a red oval
		GOval redOval = new GOval(120, centerY);
		redOval.setColor(Color.RED);
		redOval.setFilled(true);
		add(redOval, 200, 180); // 

		// make and add a rectangle which fits around the red oval
		GRect circleOutline = new GRect(120, centerY);
		//add(circleOutline, 200, 180);

		// add a piece of text
		GLabel label = new GLabel("Programming is Awesome!");
		label.setFont("Courier-52");
		//add(label, 10, centerY);

	}
}
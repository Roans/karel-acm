package acm;

import acm.graphics.GLabel;
import acm.program.GraphicsProgram;

public class HelloWorld extends GraphicsProgram {

	private static final String HEADLINE = "Hello, World!";

	/** Runs the program */
	public void run() {
		GLabel label = new GLabel(HEADLINE);
		this.resize(600, 400);
		label.setFont("Serif-44");

		println("WIDTH  " + getWidth());
		println("HEIGHT  " + getHeight());
		println("ASCENT " + label.getAscent());
		add(label, 60, 150);

		while (true) {
			if (label.getX() == 600) {
				println("breaking");
				break;
			}
			println(label.getX());
			println(label.getWidth());
			label.move(10, 0);
			pause(10);

		}
		println("the end");
	}
}

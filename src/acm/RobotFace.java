package acm;

import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class RobotFace extends GraphicsProgram {

 private static final int HEAD_WIDTH = 150;
 private static final int HEAD_HEIGHT = 250;
 private static final int EYE_RADIUS = 20;
 private static final int MOUTH_WIDTH = 100;
 private static final int MOUTH_HEIGHT = 30;

public void run() {
	this.resize(600, 400);
double cx = getWidth()/2;
double cy = getHeight()/2;
addHead(cx - HEAD_WIDTH/2, cy - HEAD_HEIGHT/2);
addEye(cx - HEAD_WIDTH/4, cy - HEAD_HEIGHT/4);
addEye(cx + HEAD_WIDTH/4, cy - HEAD_HEIGHT/4);
addMouth(cx - MOUTH_WIDTH/2, cy + HEAD_HEIGHT/4);
 }
 /*
 * Add a head with top left at position x,y. Adding a head consists
 * of drawing a rectangle with the given width, height, and color.
 */
 private void addHead(double x, double y) {
 drawRectangle(x, y, HEAD_WIDTH, HEAD_HEIGHT, Color.GRAY);
 }
 /*
 * Add an eye centered at cx, cy. Adding an eye consists of drawing
 * a circle with the given radius and color.
 */
 private void addEye(double cx, double cy) {
drawCircle(cx, cy, EYE_RADIUS, Color.YELLOW);
 }
 /*
 * Add a mouth with top left at x,y. Adding a mouth consists of
 * drawing a rectangle with given width, height and color.
 */
 private void addMouth(double x, double y) {
drawRectangle(x,y, MOUTH_WIDTH, MOUTH_HEIGHT, Color.WHITE);
 }

 /*
 * This method draws a general rectangle with its top left
 * at position x,y with a specified width, height and color.
 */
 private void drawRectangle(double x, double y, double width,
 double height, Color c) {
GRect rect = new GRect(x,y,width, height);
rect.setFilled(true);
rect.setColor(c);
add(rect);
 }
 /*
 * This method draws a general circle centered at (cx,cy),
 * with a given radius r and a Color c.
 */
 private void drawCircle(double cx, double cy, double r, Color c) {
double x = cx - r;
double y = cy - r;
GOval circle = new GOval(2 * r, 2 * r);
circle.setFilled(true);
circle.setColor(c);
add(circle, x, y);
 }
}

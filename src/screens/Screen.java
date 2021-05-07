package screens;

import processing.core.PApplet;
/**
 * The screen class is the superclass of all screens and all the are displayed between games including the 
 * main menu and other future screens.
 * @author Eric Decasper
 *
 */

public abstract class Screen {
	/**
	 * This method draws the th
	 * @param PApplet g the drawer
	 */
	public abstract void draw(PApplet g);
	public abstract void update();
	public int clickMouse(int x, int y) {
		return -1;
	}
}

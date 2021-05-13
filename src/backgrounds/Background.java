package backgrounds;

import processing.core.PApplet;

/**
 * Superclass of all backgrounds 
 * @author Vikram Penumarti
 * @version 1.0
 */
public class Background 
{
	float time;
	float difficulty;
	int runs;
	private int r, g, b;
	
	/**
	 * Sets the amount of times draw() has run, the time passed, and the difficulty factor, and gets colors 
	 * @param r the red color value
	 * @param g the green color value
	 * @param b the blue color value
	 */
	public Background(int r, int g, int b)
	{
		runs = 0;
		time = 0;
		difficulty = 1;
		this.r = r;
		this.g = g;
		this.b = b;
	}
	
	/**
	 * Method that draws the backgrounds
	 * @param s PApplet object 
	 */
	public void draw(PApplet s)
	{
		s.background(r, g, b);
		time++;
		scroll(s);
	}
	
	/**
	 * Scrolls down the screen
	 * @param s PApplet object
	 */
	public void scroll(PApplet s)
	{		
		runs++;
		
		time += difficulty;
		
		s.line(s.width/5, 0, s.width/5, s.height);
		s.line(s.width - s.width/5, 0, s.width - s.width/5, s.height);	
	}
}

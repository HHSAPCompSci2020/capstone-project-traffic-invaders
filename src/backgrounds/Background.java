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
	
	public Background(int r, int g, int b)
	{
		runs = 0;
		time = 0;
		difficulty = 1;
		this.r = r;
		this.g = g;
		this.b = b;
	}
	
	public void draw(PApplet s)
	{
		s.background(r, g, b);
		time++;
		scroll(s);
	}
	
	public void scroll(PApplet s)
	{		
		runs++;
		
		time += difficulty;
		
		s.line(s.width/5, 0, s.width/5, s.height);
		s.line(s.width - s.width/5, 0, s.width - s.width/5, s.height);	
	}
}

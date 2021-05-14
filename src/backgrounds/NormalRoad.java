package backgrounds;

import processing.core.PApplet;

/**
 * Road background player and cars drive on 
 * @author Vikram Penumarti
 * @version 1.0
 */
public class NormalRoad extends Background
{
	/**
	 * Passes the rgb color value to the superclass constructor
	 */
	private static float scrollRate;
	public NormalRoad()
	{
		super(100, 100, 100);
		scrollRate = 0;
	}
	
	/**
	 * Draws the normal road
	 * @param s PApplet object
	 */
	public void draw(PApplet s)
	{
		super.draw(s);
	}
	
	/**
	 * Scrolls the screen down
	 * @param s PApplet object
	 */
	public void scroll(PApplet s)
	{
		super.scroll(s);
		
		for(int i = 0; i <= 1000; i++)
		{
			s.fill(255,255,255);
			scrollRate = time;
			s.rect(s.width/2 - s.width/40, -i * 3 * s.height/20 + scrollRate, s.width/40, s.height/20);
		}
		
		if(runs % 1800 == 0)
		{
			difficulty++;
		}
	}
	public static float getScrollRate() {
		return scrollRate;
	}
}

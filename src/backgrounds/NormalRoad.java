package backgrounds;

import processing.core.PApplet;

/**
 * Road background player and cars drive on 
 * @author Vikram Penumarti
 * @version 1.0
 */
public class NormalRoad extends Background
{
	private static float scrollRate;
	
	/**
	 * Passes the rgb color value to the superclass constructor
	 */
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
			
			//draws rectangle at middle of screen
			//draws rectangle at time (including difficulty consideration) + (-amount of dividers * )
			s.rect(s.width/2 - s.width/40, -i * 3 * s.height/20 + scrollRate, s.width/40, s.height/20);
		}
		
		//difficulty increases every 30 seconds, 1800 calls
		if(runs % 1800 == 0)
		{
			difficulty++;
		}
	}
	
	/**
	 * Gets the scroll rate of the screen
	 * @return scrollRate
	 */
	public static float getScrollRate() {
		return scrollRate;
	}
}

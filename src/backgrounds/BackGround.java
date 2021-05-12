package backgrounds;

import processing.core.PApplet;

/**
 * Superclass of all backgrounds 
 * @author Vikram Penumarti
 * @version 1.0
 */
public class BackGround 
{
	private float time;
	private float difficulty;
	private int runs;
	
	public BackGround()
	{
		runs = 0;
		time = 0;
		difficulty = 1;
	}
	
	public void draw(PApplet s)
	{
		time++;
		scroll(s);
	}
	
	public void scroll(PApplet s)
	{		
		runs++;
		
		time += difficulty;
		
		s.background(100);
		
		s.line(s.width/5, 0, s.width/5, s.height);
		s.line(s.width - s.width/5, 0, s.width - s.width/5, s.height);
		
		for(int i = 0; i <= 1000; i++)
		{
			s.rect(s.width/2 - s.width/40, -i * 3 * s.height/20 + time, s.width/40, s.height/20);
		}
		
		if(runs % 1800 == 0)
		{
			difficulty++;
		}
	}
}

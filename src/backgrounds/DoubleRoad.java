package backgrounds;

import processing.core.PApplet;

public class DoubleRoad extends Background
{
	public DoubleRoad()
	{
		super(194, 178, 128);
	}
	
	public void draw(PApplet s)
	{
		super.draw(s);
	}
	
	public void scroll(PApplet s)
	{
		super.scroll(s);
		
		for(int i = 0; i <= 1000; i++)
		{
			s.rect(2 * s.width/5 - s.width/40, -i * 3 * s.height/20 + time, s.width/40, s.height/20);
			s.rect(3 * s.width/5 - s.width/40, -i * 3 * s.height/20 + time, s.width/40, s.height/20);
		}
		
		if(runs % 1800 == 0)
		{
			difficulty++;
		}
	}
}

package backgrounds;

import processing.core.PApplet;

/**
 * Superclass of all backgrounds 
 * @author Vikram Penumarti
 * @version 1.0
 */
public class BackGround 
{
	public BackGround()
	{
		
	}
	
	public void draw(PApplet s)
	{
		s.line(s.width/5, 0, s.width/5, s.height);
		s.line(s.width - s.width/5, 0, s.width - s.width/5, s.height);
		
		s.fill(255, 255, 0);
		s.rect(s.width/2 - s.width/40, 0, s.width/20, s.height/20);
		s.rect(s.width/2 - s.width/40, s.height/5, s.width/20, s.height/20);
		s.rect(s.width/2 - s.width/40, 2 * s.height/5, s.width/20, s.height/20);
		s.rect(s.width/2 - s.width/40, 3 * s.height/5, s.width/20, s.height/20);
		s.rect(s.width/2 - s.width/40, 4 * s.height/5, s.width/20, s.height/20);
		s.rect(s.width/2 - s.width/40, s.height - s.height/25, s.width/20, s.height/25);

	}
}

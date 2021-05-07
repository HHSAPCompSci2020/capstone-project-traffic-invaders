package screens;

import processing.core.PApplet;

public class MainMenu extends Screen{
	public MainMenu() {
		
	}

	@Override
	public void draw(PApplet g) {
		g.background(0, 204, 204);// background is set to cyan
		g.stroke(0, 0, 0); //sets the stroke to black
		g.text("MAINMENU", g.width / 2 - g.textWidth("Game") / 2, g.height / 2); 
	}

}

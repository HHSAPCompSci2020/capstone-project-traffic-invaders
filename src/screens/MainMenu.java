package screens;

import processing.core.PApplet;

/**
 * Is the opening screen which the player will see when they first launch the game, die, or want to quit
 * @author Eric Decasper
 * @version 1.0
 */
public class MainMenu extends Screen{
	
	/**
	 * Will initialize variables here later on
	 */
	public MainMenu() {
		
	}


	/**
	 * Draws the main menu on the drawing surface
	 * @param PApplet g - A PApplet object which sets the main menu
	 */
	public void draw(PApplet g) {
		g.background(0, 204, 204);// Background is set to cyan
		g.stroke(0, 0, 0); //sets the stroke to black
		g.text("MAINMENU", g.width / 2 - g.textWidth("MAINMENU") / 2, g.height / 2); 
	}

	
	/**
	 * Updates the screen
	 */
	public void update() {
		// TODO Auto-generated method stub
		
	}

	

}

package screens;

import backgrounds.Background;
import processing.core.PApplet;

/**
 * Is the opening screen which the player will see when they first launch the
 * game, die, or want to quit
 * 
 * @author Eric Decasper
 * @version 1.0
 */
public class GameOver extends Screen {


	public GameOver() {
	}

	/**
	 * Draws the game over on the drawing surface
	 * 
	 * @param PApplet g - A PApplet object which sets the main menu
	 */
	public void draw(PApplet g) {
		g.background(0, 0, 0);// Background is set to cyan
		g.stroke(0, 0, 0); // sets the stroke to black
		g.text("Game Over", g.width / 2 - g.textWidth("Game Over") / 2, g.height / 2);
		g.text("You final Score Was:  " + Background.getSpeed(), g.width / 2 - g.textWidth("You final Score Was: ")/2, g.height / 2 + 20);
		
	}

	/**
	 * Updates the screen
	 */
	public void update() {

	}

}

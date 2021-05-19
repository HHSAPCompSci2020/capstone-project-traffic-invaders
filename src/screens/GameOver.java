package screens;

import backgrounds.Background;
import processing.core.PApplet;
import processing.core.PConstants;

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
		g.background(0, 0, 0);
		g.fill(74, 134, 232);
		g.textSize(43);
		g.text("Game Over", g.width / 2 - g.textWidth("Game Over") / 2, 205);
		g.fill(255,255,255);
		g.filter(PConstants.BLUR, 6);
		g.textSize(40);
		g.text("Game Over", g.width / 2 - g.textWidth("Game Over") / 2, 200);
		g.textSize(20);
		g.text("You final Score Was: " + Background.getScore(), g.width / 2 - g.textWidth("You final Score Was: " + + Background.getSpeed())/2, g.height / 2 + 20);
		
	}

	/**
	 * Updates the screen
	 */
	public void update() {

	}

}

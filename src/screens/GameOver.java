package screens;

import java.util.ArrayList;

import javax.swing.JButton;

import processing.core.PApplet;

/**
 * Is the opening screen which the player will see when they first launch the
 * game, die, or want to quit
 * 
 * @author Eric Decasper
 * @version 1.0
 */
public class GameOver extends Screen {

	/**
	 * Will initialize variables here later on
	 */
	public GameOver() {
	}

	/**
	 * Draws the main menu on the drawing surface
	 * 
	 * @param PApplet g - A PApplet object which sets the main menu
	 */
	public void draw(PApplet g) {
		g.background(0, 0, 0);// Background is set to cyan
		g.stroke(0, 0, 0); // sets the stroke to black
		g.text("Game Over", g.width / 2 - g.textWidth("Game Over") / 2, g.height / 2);

	}

	/**
	 * Updates the screen
	 */
	public void update() {

	}

}
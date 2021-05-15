package screens;

import processing.core.PApplet;

/**
 * Is the opening screen which the player will see when they first launch the
 * game, die, or want to quit
 * 
 * @author Eric Decasper
 * @version 1.0
 */
public class MainMenu extends Screen {

	boolean onTop = false;

	/**
	 * Will initialize variables here later on
	 */
	public MainMenu() {
	}

	/**
	 * Draws the main menu on the drawing surface
	 * 
	 * @param PApplet g - A PApplet object which sets the main menu
	 */
	public void draw(PApplet g) {
		g.background(0, 0, 0);// Background is set to cyan
		g.stroke(0, 0, 0); // sets the stroke to black
		g.text("MAINMENU", g.width / 2 - g.textWidth("MAINMENU") / 2, g.height / 2);
		g.fill(255, 255, 255);
		g.rect(g.width / 2 - 50, g.height / 2 + 20, 100, 30);
		g.fill(0, 102, 0);
		g.text("Start Game", g.width / 2 - g.textWidth("Stargame") / 2, g.height / 2 + 40);

	}

	/**
	 * Updates the screen
	 */
	public void update() {

	}

	/**
	 * @param mouseX - the x coordinate of the click
	 * @param mouseY - the y coordinate of the click
	 * The clicked method checks if the click was within the button
	 * area, and returns 1 if it is.
	 */
	public static int clicked(int mouseX, int mouseY) {
		if (mouseX >  350 && mouseX < 450 && mouseY > 320 && mouseY < 350) {
			return 1;
		}
		else
			return 0;
	}

}

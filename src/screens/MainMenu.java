package screens;

import processing.core.PApplet;
import processing.core.PConstants;
import processing.core.PFont;
import processing.core.PImage;

/**
 * Is the opening screen which the player will see when they first launch the
 * game, die, or want to quit
 * 
 * @author Eric Decasper
 * @version 1.0
 */
public class MainMenu extends Screen {

	boolean onTop = false;
	PImage bg;
	PFont font;

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
		g.push();
		font = g.createFont("lib/font.ttf", 40);
		g.textFont(font);
		bg = g.loadImage("lib/background.png");
		g.background(bg);
		g.pushStyle(); 
		g.fill(74, 134, 232);
		g.textSize(43);
		g.text("Traffic", g.width / 2 - g.textWidth("Traffic") / 2, 105);
		g.text("Invaders", g.width / 2 - g.textWidth("Invaders") / 2, 155);
		g.popStyle(); 
		g.fill(255, 255, 255);
		g.textSize(40);
		g.text("Traffic", g.width / 2 - g.textWidth("Traffic") / 2, 100);
		g.text("Invaders", g.width / 2 - g.textWidth("Invaders") / 2, 150);
		g.strokeWeight(4);
		g.stroke(58, 130, 245);
		g.fill(74, 134, 232, 75);
		g.rect(g.width / 2 - 120, 200, 240, 45, 13, 13, 13, 13);
		g.fill(255, 255, 255);
		g.textSize(20);
		g.text("Start", g.width / 2 - g.textWidth("Start") / 2, 235);
		g.pop();

	}

	/**
	 * Updates the screen
	 */
	public void update() {

	}

	/**
	 * @param mouseX - the x coordinate of the click
	 * @param mouseY - the y coordinate of the click The clicked method checks if
	 *               the click was within the button area, and returns 1 if it is.
	 */
	public static int clicked(int mouseX, int mouseY) {
		if (mouseX > 280 && mouseX < 520 && mouseY > 200 && mouseY < 245) {
			return 1;
		} else
			return 0;
	}

}

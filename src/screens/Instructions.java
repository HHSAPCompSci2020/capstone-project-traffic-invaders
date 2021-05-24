package screens;

import backgrounds.Background;
import processing.core.PApplet;
import processing.core.PConstants;
import processing.core.PFont;

/**
 * @author Karan Dalal
 * @version 1.0
 */
public class Instructions extends Screen {

	PFont font;
	static int finalScore;

	/**
	 * @param PApplet g - A PApplet object which sets the main menu
	 */
	public void draw(PApplet g) {
		font = g.createFont("lib/font.ttf", 40);
		g.textFont(font);
		g.pushStyle();
		g.background(0, 0, 0);
		g.fill(74, 134, 232);
		g.textSize(43);
		g.text("Instructions", g.width / 2 - g.textWidth("Instructions") / 2, 105);
		g.fill(255, 255, 255);
		g.textSize(40);
		g.text("Instructions", g.width / 2 - g.textWidth("Instructions") / 2, 100);
		g.textSize(12);
		g.text("These are the instructions for how to play the game.",
				g.width / 2 - g.textWidth("These are the instructions for how to play the game.") / 2,
				g.height / 2 - 50);
		g.text("These are the instructions for how to play the game.",
				g.width / 2 - g.textWidth("These are the instructions for how to play the game.") / 2,
				g.height / 2 - 30);
		g.text("These are the instructions for how to play the game.",
				g.width / 2 - g.textWidth("These are the instructions for how to play the game.") / 2,
				g.height / 2 - 10);
		g.strokeWeight(4);
		g.stroke(58, 130, 245);
		g.fill(74, 134, 232, 75);
		g.rect(g.width / 2 - 135, 500, 270, 45, 13, 13, 13, 13);
		g.fill(255, 255, 255);
		g.textSize(20);
		g.text("Return", g.width / 2 - g.textWidth("Return") / 2, 535);
		g.popStyle();
	}

	/**
	 * Updates the screen
	 */
	public void update() {

	}

	public static double finalScore() {
		return finalScore;
	}

}

package screens;

import processing.core.PApplet;
import processing.core.PConstants;
import processing.core.PFont;
import processing.core.PImage;

public class PlayerSelect extends Screen {

	PImage bg;
	PFont font;
	PImage player1, player2, player3;
	static String selection = "default";
	double mouseX = 0, mouseY = 0;

	@Override
	public void draw(PApplet g) {
		mouseX = g.mouseX;
		mouseY = g.mouseY;
		player1 = g.loadImage("images/player1.png");
		player2 = g.loadImage("images/policeCar.png");
		g.push();
		font = g.createFont("lib/font.ttf", 40);
		g.textFont(font);
		bg = g.loadImage("lib/background.png");
		g.background(bg);
		g.pushStyle();
		g.fill(74, 134, 232);
		g.textSize(43);
		g.text("Select Player", g.width / 2 - g.textWidth("Select Player") / 2, 105);
		g.popStyle();
		g.fill(255, 255, 255);
		g.textSize(40);
		g.text("Select Player", g.width / 2 - g.textWidth("Select Player") / 2, 100);
		// Sections
		g.strokeWeight(4);
		// Section 1
		if (selection == "default") {
			g.stroke(255, 255, 255);
		} else {
			g.noStroke();
		}
		g.fill(74, 134, 232, 75);
		g.rect(50, 175, 200, 300, 13, 13, 13, 13);
		g.fill(255, 255, 255);
		g.textSize(15);
		g.text("Player 1", (100 - (g.textWidth("Player 1") / 2)) + 50, 300);
		g.push();
		g.imageMode(PConstants.CENTER);
		g.translate(150, 225);
		g.rotate((float) (PConstants.PI / 2.0));
		g.image(player1, (float) 0, (float) 0, (float) (97 * 0.7), (float) (191 * 0.7));
		g.pop();
		// Section 2
		if (selection == "cop") {
			g.stroke(255, 255, 255);
		} else {
			g.noStroke();
		}
		g.fill(74, 134, 232, 75);
		g.rect(300, 175, 200, 300, 13, 13, 13, 13);
		g.fill(255, 255, 255);
		g.textSize(15);
		g.text("Cop Car", (100 - (g.textWidth("Cop Car") / 2)) + 300, 300);
		g.push();
		g.imageMode(PConstants.CENTER);
		g.translate(400, 225);
		g.rotate((float) (PConstants.PI / 2.0));
		g.image(player2, (float) 0, (float) 0, (float) (186 * 0.350918635), (float) (381 * 0.350918635));
		g.pop();
		// Section 3
		if (selection == "other") {
			g.stroke(255, 255, 255);
		} else {
			g.noStroke();
		}
		g.fill(74, 134, 232, 75);
		g.rect(550, 175, 200, 300, 13, 13, 13, 13);
		g.fill(255, 255, 255);
		g.textSize(15);
		g.text("Player 3", (100 - (g.textWidth("Player 3") / 2)) + 550, 300);
		g.push();
		g.imageMode(PConstants.CENTER);
		g.translate(650, 225);
		g.rotate((float) (PConstants.PI / 2.0));
		g.image(player1, (float) 0, (float) 0, (float) (97 * 0.7), (float) (191 * 0.7));
		g.pop();

		// Return Button
		g.strokeWeight(4);
		g.stroke(58, 130, 245);
		g.fill(74, 134, 232, 75);
		g.rect(g.width / 2 - 135, 500, 270, 45, 13, 13, 13, 13);
		g.fill(255, 255, 255);
		g.textSize(20);
		g.text("Return", g.width / 2 - g.textWidth("Return") / 2, 535);
		g.pop();

	}

	@Override
	public void update() {
		// TODO Auto-generated method stub

	}

	public static void setSelection(String s) {
		selection = s;
	}

}

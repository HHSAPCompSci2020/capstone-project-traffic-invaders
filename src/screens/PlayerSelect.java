package screens;

import processing.core.PApplet;
import processing.core.PFont;
import processing.core.PImage;

public class PlayerSelect extends Screen {

	PImage bg;
	PFont font;

	@Override
	public void draw(PApplet g) {
		g.push();
		font = g.createFont("lib/font.ttf", 40);
		g.textFont(font);
		bg = g.loadImage("lib/background.png");
		g.background(bg);
		g.pushStyle();
		g.fill(74, 134, 232);
		g.textSize(43);
		g.text("Select", g.width / 2 - g.textWidth("Select") / 2, 105);
		g.text("Player", g.width / 2 - g.textWidth("Player") / 2, 155);
		g.popStyle();
		g.fill(255, 255, 255);
		g.textSize(40);
		g.text("Select", g.width / 2 - g.textWidth("Select") / 2, 100);
		g.text("Player", g.width / 2 - g.textWidth("Player") / 2, 150);
		// Return Button
		g.strokeWeight(4);
		g.stroke(58, 130, 245);
		g.fill(74, 134, 232, 75);
		g.rect(g.width / 2 - 135, 200, 270, 45, 13, 13, 13, 13);
		g.fill(255, 255, 255);
		g.textSize(20);
		g.text("Return", g.width / 2 - g.textWidth("Return") / 2, 235);
		g.pop();

	}

	@Override
	public void update() {
		// TODO Auto-generated method stub

	}

	public static int clicked(int mouseX, int mouseY) {
		if (mouseX > 265 && mouseX < 535 && mouseY > 200 && mouseY < 245) {
			return 1;
		} else
			return 0;
	}

}

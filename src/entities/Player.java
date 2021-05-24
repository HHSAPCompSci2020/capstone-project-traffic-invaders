package entities;

import processing.core.PApplet;
import processing.core.PImage;
import structure.Game;

/**
 * Represents the vehicle which the player is
 * 
 * @author Eric Decasper
 * @version 1.0
 */
public class Player extends Entity {
	private int disX, disY;
	private boolean left, right, up, down;
	private int velocity, maxVelocity, friction, dragBack;
	private int health, beginHealth;
	private PImage img;
	public String toSet = "images/blueTruck.png";

	public Player(int x, int y, int width, int height) {

		super(x, y, width, height);

		health = 3;
		beginHealth = 3;
		disX = 0;
		disY = 1;
		left = false;
		right = false;
		up = false;
		down = false;
		velocity = 3;
		maxVelocity = 8;
		friction = 1;
		dragBack = 2;
	}

	@Override
	public void act() {
		if (right != left) {
			if (velocity + Math.abs(disX) < maxVelocity) {
				if (right) {
					disX += velocity;
				} else if (left) {
					disX -= velocity;
				}
			}
		}
		if (up != down) {
			if (velocity + Math.abs(disY) < maxVelocity) {
				if (down) {
					disY += velocity;
				} else if (up) {
					disY -= velocity;
				}
			}
		}
		// System.out.println("Right: " + right +" left: " + left + " Up: " + up + "
		// down: " + down);
		setLoc(getX() + disX, getY() + disY);
		if (disY > dragBack) {
			disY -= friction;
		}
		if (disY < dragBack) {
			disY += friction;
		}
		if (disX > 0) {
			disX -= friction;
		}
		if (disX < 0) {
			disX += friction;
		}

	}

	@Override
	public void draw(PApplet g) {
		img = g.loadImage(toSet);

		g.pushMatrix();
		g.pushStyle();
		g.fill(0, 255, 255);
		g.tint(255, 255, 255);
		g.image(img, getX(), getY(), getWidth(), getHeight() + 10);

		// Health bar
		g.fill(255, 255, 255);
		g.rect(getX() - 10, getY() + getHeight() + 15, getWidth() + 20, 10);
		if(Game.getCoolDown()) {
			g.fill(255, 0, 0);
		}else {
			g.fill(0, 255, 0);
		}
		
		g.rect(getX() - 10, getY() + getHeight() + 15,
				(int) ((getWidth() + 20) * ((double) getHealth() / getBeginHealth())), 10);
		g.popMatrix();
		g.popStyle();
	}

	public int getHealth() {
		return health;
	}

	public int getBeginHealth() {
		return beginHealth;
	}

	public void hit() {
		health--;
	}

	public void setUp(boolean x) {
		up = x;
	}

	public void setDown(boolean x) {
		down = x;
	}

	public void setRight(boolean x) {
		right = x;
	}

	public void setLeft(boolean x) {
		left = x;
	}

	public void setImage(String set) {
		toSet = set;
	}

	public void setHealth(int set) {
		beginHealth = set;
		health = set;
	}

	public void setVelocity(int set) {
		maxVelocity = set;
	}

	public void reset() {
		health = getBeginHealth();
		disX = 0;
		disY = 1;
		left = false;
		right = false;
		up = false;
		down = false;
	}
}
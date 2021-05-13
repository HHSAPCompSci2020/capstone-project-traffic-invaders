package entities;

import processing.core.PApplet;

/**
 * Represents the vehicle which the player is
 * 
 * @author Eric Decasper
 * @version 1.0
 */
public class Player extends Entity {
	private int disX, disY;
	private boolean left, right, up, down;
	private int velocity, velDiag;
	
	public Player(int x, int y, int width, int height) {

		super(x, y, width, height);
		disX = 10;
		disY = 10;
		left = false;
		right = false;
		up = false;
		down = false;
		velocity = 2;
		velDiag = (int) (Math.pow(2.0, (0.5)) / 2) * velocity;
	}
	// public player()

	@Override
	public void act() {
		if(up && right) {
			disY -= velDiag;
			disX += velDiag;
		}else if(up && left) {
			disY -= velDiag;
			disX -= velDiag;
		}else if(down && right) {
			disY += velDiag;
			disX += velDiag;
		}else if(down && left) {
			disY += velDiag;
			disX -= velDiag;
		}else if(up) {
			disY -= velocity;
		}else if(down) {
			disY += velocity;
		}else if(right) {
			disX += velocity;
		}else if(left) {
			disX -= velocity;
		}
		setLoc(getX() + disX, getY() + disY);
	}

	@Override
	public void draw(PApplet g) {
		g.pushMatrix();
		g.fill(0, 255, 255);
		g.rect(getX(), getY(), getWidth(), getHeight());
		g.popMatrix();
	}
	
	public void setUp(boolean x) {
		up = x;
	}
	public void setDown(boolean x) {
		down = x;
	}
	public void setRight(boolean x) {
		left = x;
	}
	public void setLeft(boolean x) {
		right = x;
	}
}
package entities;

import processing.core.PApplet;
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
	private int velocity, velDiag, maxVelocity, friction;
	private int health; 
	
	
	public Player(int x, int y, int width, int height) {

		super(x, y, width, height);
		health = 3;
		disX = 0;
		disY = 1;
		left = false;
		right = false;
		up = false;
		down = false;
		velocity = 4;
		maxVelocity = 8;
		friction = 2;
		velDiag = (int) (Math.pow(2.0, (0.5)) / 2) * velocity;
	}
	// public player()

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
		//System.out.println("Right: " + right +"   left: " + left + "    Up: " + up + "   down: " + down);
		setLoc(getX() + disX, getY() + disY);
		if(disY > 1) {
			disY -= friction;
		}
		if(disY < 1) {
			disY += friction;
		}
		if(disX > 0) {
			disX -= friction;
		}
		if(disX < 0) {
			disX += friction;
		}

	}

	@Override
	public void draw(PApplet g) {
		g.pushMatrix();
		if(Game.getCoolDown()) {
			g.fill(0,0,0);
		}else {
			g.fill(0, 255, 255);
		}
		
		g.rect(getX(), getY(), getWidth(), getHeight());
		
		
		
		g.fill(255, 255, 255);
		g.rect(getX() - 10, getY() + getHeight() + 10, getWidth() + 20, 10);
		g.fill(0, 255, 0);
		g.rect(getX() - 10, getY() + getHeight() + 10, (int) ((getWidth() + 20) * ((double) getHealth() / 3.0)), 10);
		g.popMatrix();
	}
	public int getHealth() {
		return health;
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
}
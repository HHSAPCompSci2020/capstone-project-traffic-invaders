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
	private int velocity, velDiag, maxVelocity;

	public Player(int x, int y, int width, int height) {

		super(x, y, width, height);
		disX = 0;
		disY = 1;
		left = false;
		right = false;
		up = false;
		down = false;
		velocity = 2;
		maxVelocity = 5;
		velDiag = (int) (Math.pow(2.0, (0.5)) / 2) * velocity;
	}
	// public player()

	@Override
	public void act() {
//		if(up && right) {
//			if()
//			disY -= velDiag;
//			disX += velDiag;
//		}else if(up && left) {
//			disY -= velDiag;
//			disX -= velDiag;
//		}else if(down && right) {
//			disY += velDiag;
//			disX += velDiag;
//		}else if(down && left) {
//			disY += velDiag;
//			disX -= velDiag;
//		}else if(up) {
//			disY -= velocity;s
//		}else if(right) {
//			disX += velocity;
//		}else if(left) {
//			disX -= velocity;
//		}
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
		System.out.println("Right: " + right +"   left: " + left + "    Up: " + up + "   down: " + down);
		setLoc(getX() + disX, getY() + disY);
		if(disY > 1) {
			disY -= velocity;
		}
		if(disY < 1) {
			disY += velocity;
		}
		if(disX > 0) {
			disX -= velocity;
		}
		if(disX < 0) {
			disX += velocity;
		}

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
		right = x;
	}

	public void setLeft(boolean x) {
		left = x;
	}
}
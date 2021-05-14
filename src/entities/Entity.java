package entities;

import processing.core.PApplet;

/**
 * The superclass to Car and Player, contain base behaviors of the two
 * @author Eric Decasper
 * @version 1.0
 */
public abstract class Entity {
	private int x, y, width, height;
	
	public Entity(int x, int y, int width, int height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		
	}
	
	public abstract void act();

	public abstract void draw(PApplet g);
	
	public boolean isPointInside(int x, int y) {
		if ((getX() < x && x < getX() + width) && (this.getY() < y && y < (getY() + height))) {
			return true;
		}else {
			return false;
		}
	}
	public int getX(){
		return x; 
	}
	public int getY() {
		return y;
	}
	public int getWidth() {
		return width;
	}
	public int getHeight() {
		return height;
	}
	public void setLoc(int x, int y) {
		this.x = x; 
		this.y = y;
	}
	
}
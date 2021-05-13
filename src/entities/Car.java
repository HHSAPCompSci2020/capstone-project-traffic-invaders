package entities;

import processing.core.PApplet;

/**
 * The cars which act as obstacles to the main character
 * @author Eric Decasper
 * @version 1.0
 */
public class Car extends Entity
{

	public Car(int x, int y, int width, int height) {
		super(x, y, width, height);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void act() {
		// TODO Auto-generated method stub
		setLoc(getX(), getY() - 2);
	}

	@Override
	public void draw(PApplet g) {
		// TODO Auto-generated method stub
		g.pushMatrix();
		g.fill(0, 255, 255);
		g.rect(getX(), getY(), getWidth(), getHeight());
		g.popMatrix();
	}
	
}
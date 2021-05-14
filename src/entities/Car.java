package entities;

import backgrounds.NormalRoad;
import processing.core.PApplet;

/**
 * The cars which act as obstacles to the main character
 * @author Eric Decasper
 * @version 1.0
 */
public class Car extends Entity
{
	/**
	 * Constructs the car.
	 * @param x The upper left x coordinate of the rectangle.
	 * @param y	The upper left y coordinate of the rectangle
	 * @param width The width of the rectangle
	 * @param height The height of the rectangle
	 */
	public Car(int x, int y, int width, int height) {
		super(x, y, width, height);
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * The act method handles all the movement of the car moving the cars down the road at the specified rate.
	 */
	@Override
	public void act() {
		// TODO Auto-generated method stub
		setLoc(getX(), getY() + ((int) NormalRoad.getScrollRate()) / 100);
	}
	
	/**
	 * The draw method draws the car with all its attributes. 
	 * @param g the PApplet object passed into the method.
	 */
	@Override
	public void draw(PApplet g) {
		// TODO Auto-generated method stub
		g.pushMatrix();
		//g.fill(0, 255, 255);
		g.rect(getX(), getY(), getWidth(), getHeight());
		g.fill(0, 0, 0);
		g.rect(getX() - 5, getY() + 10, 5, 20);
		g.rect(getX() + getWidth(), getY() + 10, 5, 20);
		
		g.rect(getX() - 5, getY() + getHeight() - 30, 5, 20);
		g.rect(getX() + getWidth(), getY() + getHeight() - 30, 5, 20);
		g.popMatrix();
	}
	
}
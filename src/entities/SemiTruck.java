package entities;

import backgrounds.Background;
import processing.core.PApplet;
import processing.core.PImage;

/**
 * The cars which act as obstacles to the main character
 * @author Eric Decasper
 * @version 1.0
 */
public class SemiTruck extends Entity
{
	private PImage img;
	private int speed;
	public SemiTruck(int x, int y, int width, int height, int speed) {
		super(x, y, width, height);
		this.speed = speed;
		// TODO Auto-generated constructor stub
	}

	/**
	 * The act method handles all the movement of the car moving the cars down the road at the specified rate.
	 */
	@Override
	public void act() {
		// TODO Auto-generated method stub
		setLoc(getX(), getY() + speed);
	}

	/**
	 * The draw method draws the car with all its attributes.
	 * @param g the PApplet object passed into the method.
	 */
	@Override
	public void draw(PApplet g) {
		// TODO Auto-generated method stub
		img = g.loadImage("semiTruck1.png");
		g.image(img, getX(), getY(), getWidth(), getHeight() + 10);

	}

}

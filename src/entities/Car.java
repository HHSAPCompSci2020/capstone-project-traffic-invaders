package entities;

import backgrounds.NormalRoad;
import processing.core.PApplet;
import processing.core.PImage;

/**
 * The cars which act as obstacles to the main character
 * @author Eric Decasper
 * @version 1.0
 */
public class Car extends Entity
{
	private PImage img;
	public Car(int x, int y, int width, int height) {
		super(x, y, width, height);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void act() {
		// TODO Auto-generated method stub
		setLoc(getX(), getY() + ((int) NormalRoad.getScrollRate()) / 100);
	}

	@Override
	public void draw(PApplet g) {
		// TODO Auto-generated method stub
		img = g.loadImage("car1.png");
		g.image(img, getX(), getY(), getWidth(), getHeight() + 10);
		//g.pushMatrix();
		//g.fill(0, 255, 255);
//		g.rect(getX(), getY(), getWidth(), getHeight());
//		g.fill(0, 0, 0);
//		g.rect(getX() - 5, getY() + 10, 5, 20);
//		g.rect(getX() + getWidth(), getY() + 10, 5, 20);
//		
//		g.rect(getX() - 5, getY() + getHeight() - 30, 5, 20);
//		g.rect(getX() + getWidth(), getY() + getHeight() - 30, 5, 20);
		//g.popMatrix();
	}
	
}
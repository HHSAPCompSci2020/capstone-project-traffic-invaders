package screens;

import java.util.ArrayList;

import entities.Car;
import entities.Entity;
import entities.Player;
import processing.core.PApplet;

	
public class MainGame extends Screen{
	private ArrayList<Entity> entities;
	
	public MainGame(Player x) {
		entities = new ArrayList<>();
	}
	@Override
	public void draw(PApplet g) {
		for (Entity e : entities) {
			e.draw(g);
		}
	}

	@Override
	public void update() {
		
		entities.add(new Car(25, 0, 10, 10));
		
		for (Entity e : entities) {
			e.act();
		}
	}

}

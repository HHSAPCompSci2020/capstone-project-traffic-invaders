package screens;

import java.util.ArrayList;

import backgrounds.Background;
import entities.Car;
import entities.Entity;
import entities.Player;
import entities.SemiTruck;
import processing.core.PApplet;

	
public class MainGame extends Screen{
	private static ArrayList<Entity> entities;
	
	private int tick;
	/**
	 * The MainGame constructor initializes variables.
	 * @param x the player object.
	 */
	public MainGame(Player x) {
		entities = new ArrayList<>();
		tick = 0;
	}
	/**
	 * Draws all the entities that should be on the screen on the screen.
	 * @param g PApplet drawing object
	 */
	@Override
	public void draw(PApplet g) {
		
		for (Entity e : entities) {
			e.draw(g);
		}
	}

	/**
	 * The update method adds a new car obstacle every so often at a random x location on the road.
	 */
	@Override
	public void update() {
		tick++;

		if(tick % 50 == 0) {
			if(Math.random() * 5 > 3) {
				entities.add(new SemiTruck((int) (Math.random() * (Background.getSecondLineX() - Background.getFirstLineX()) - 100) + Background.getFirstLineX() + 50, -125, 50, 125));
			}else {
				entities.add(new Car((int) (Math.random() * (Background.getSecondLineX() - Background.getFirstLineX()) - 100) + Background.getFirstLineX() + 50, -75, 50, 75));
			}
			
			
		}
		ArrayList<Entity> rem = new ArrayList<>();
		for (Entity e : entities) {
			if(e.getY() > 800) {
				rem.add(e);
			}
			e.act();
		}
	
        for (Entity e : rem) {
            entities.remove(e);
        }
        rem.clear();
	}
	/**
	 * The remove method removes the entity passed in from the array list
	 * @param e
	 */
	public static void remove(Entity e) {
		entities.remove(entities.indexOf(e));
	}
	public static ArrayList<Entity> getEntities(){
		return entities;
	}
}

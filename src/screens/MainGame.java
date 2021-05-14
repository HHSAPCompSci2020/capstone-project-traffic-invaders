package screens;

import java.util.ArrayList;

import backgrounds.Background;
import entities.Car;
import entities.Entity;
import entities.Player;
import processing.core.PApplet;

	
public class MainGame extends Screen{
	private static ArrayList<Entity> entities;
	
	private int tick;
	public MainGame(Player x) {
		entities = new ArrayList<>();
		tick = 0;
	}
	@Override
	public void draw(PApplet g) {
		for (Entity e : entities) {
			g.fill(255, 102, 0);
			e.draw(g);
		}
	}

	@Override
	public void update() {
		tick++;

		if(tick % 50 == 0) {
			entities.add(new Car((int) (Math.random() * (Background.getSecondLineX() - Background.getFirstLineX()) - 50) + Background.getFirstLineX() + 50, -75, 50, 75));
		}
		
		for (Entity e : entities) {
			e.act();
		}
	}
	public static ArrayList<Entity> getEntities(){
		return entities;
	}
}

package structure;

import java.util.ArrayList;

import backgrounds.Background;
import backgrounds.NormalRoad;
import entities.Entity;
import entities.Player;
import processing.core.PApplet;
import screens.GameOver;
import screens.MainGame;
import screens.MainMenu;
import screens.Screen;

/**
 * The Game class represents the actual game panel where the game is played on
 * 
 * @author Karan Dalal
 * @version 1.0
 *
 */
public class Game extends PApplet {

	private Screen screen;

	private Background b;

	public static CurrentScreen current;
	private int tick, lastHit;
	private static boolean onCoolDown;

	private enum CurrentScreen {
		MENU, GAME, GAMEOVER;
	}

	private static Player player;

	/**
	 * The setup method sets up the game panel for play with the MainMenu screen.
	 */
	public void setup() {
		tick = 0;
		lastHit = 0;
		current = CurrentScreen.MENU;
		screen = new MainMenu();
		surface.setSize(800, 600);
		surface.setResizable(false);

		b = new NormalRoad();
	}

	/**
	 * The draw method in game draws the screens and everything that is displayed on
	 * the window
	 */
	public void draw() {
		if (current == CurrentScreen.GAME) {
			b.draw(this);
			player.draw(this);
			player.act();
			collision(player);

		}

		screen.draw(this);
		screen.update();

	}

	public void mousePressed() {
		int type = MainMenu.clicked(mouseX, mouseY);
		if (current == CurrentScreen.MENU) {
			if (type == 1) {
				player = new Player(width / 2, height - 100, 50, 75);
				screen = new MainGame(player);
				current = CurrentScreen.GAME;
			}
		}
	}

	public void keyPressed() {
		if (current == CurrentScreen.GAME) {
			if (key == 'a') {
				player.setLeft(true);
			} else if (key == 's') {
				player.setDown(true);
			} else if (key == 'w') {
				player.setUp(true);
			} else if (key == 'd') {
				player.setRight(true);
			}
		}
	}

	public void keyReleased() {
		if (current == CurrentScreen.GAME) {
			if (key == 'a') {
				player.setLeft(false);
			} else if (key == 's') {
				player.setDown(false);
			} else if (key == 'w') {
				player.setUp(false);
			} else if (key == 'd') {
				player.setRight(false);
			}
		}
	}

	public void collision(Player player) {
		tick++;
		System.out.println(onCoolDown);

		ArrayList<Entity> entities = MainGame.getEntities();
		// System.out.println(lastHit - tick);
		if (!onCoolDown) {
			for (Entity e : entities) {
				if (e instanceof Player) {
					continue;
				}
				if (player.isPointInside(e.getX(), e.getY()) || player.isPointInside(e.getX() + e.getWidth(), e.getY())
						|| player.isPointInside(e.getX(), e.getY() + e.getHeight())
						|| player.isPointInside(e.getX() + e.getWidth(), e.getY() + e.getHeight())) {
					System.out.println("hit");
					player.hit();
					onCoolDown = true;
					lastHit = tick;

					if (player.getHealth() <= 0) {
						screen = new GameOver();
						current = CurrentScreen.GAMEOVER;
					}

				}
			}
		} else if (tick - lastHit > 100) {
			onCoolDown = false;
		}
		if (player.getX() < Background.getFirstLineX()) {
			player.setLoc(Background.getFirstLineX(), player.getY());
		}
		if (player.getX() + player.getWidth() > Background.getSecondLineX()) {
			player.setLoc(Background.getSecondLineX() - player.getWidth(), player.getY());
		}
		if (player.getY() < 0) {
			player.setLoc(player.getX(), 0);
		}
		if (player.getY() + player.getHeight() > 600) {
			if (!onCoolDown) {
				onCoolDown = true;
				player.hit();
				lastHit = tick;
				if (player.getHealth() <= 0) {
					screen = new GameOver();
					current = CurrentScreen.GAMEOVER;
				}
			} else if (tick - lastHit > 100) {
				onCoolDown = false;

			}
			player.setLoc(player.getX(), 600 - player.getHeight());
		}
	}

	public static boolean getCoolDown() {
		return onCoolDown;
	}
}
package structure;

import java.util.ArrayList;
import backgrounds.*;
import entities.*;
import processing.core.PApplet;
import screens.BackgroundSelect;
import screens.GameOver;
import screens.MainGame;
import screens.MainMenu;
import screens.PlayerSelect;
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
	public int rCol, gCol, bCol;
	PApplet g;
	static ArrayList<Integer> allScores = new ArrayList<Integer>();

	public static CurrentScreen current;
	private int tick, lastHit;
	private static boolean onCoolDown;
	private boolean mouseMode;

	private enum CurrentScreen {
		MENU, PLAYERSELECT, BACKGROUNDSELECT, GAME, GAMEOVER;
	}

	private static Player player = new Player(800 / 2, 400, 50, 75);

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
		mouseMode = false;

	}

	/**
	 * The draw method in game draws the screens and everything that is displayed on
	 * the window
	 */
	public void draw() {
		b = BackgroundManager.getBackground();
		b.draw(this);
		if (current == CurrentScreen.GAME) {
			player.draw(this);
//			if (!Background.getPaused()) {
			player.act();
//			}
			collision(player);
		}
		if (current == CurrentScreen.GAME && mouseMode) {
			if (player.getX() + player.getWidth() > mouseX) {
				player.setLeft(true);
			} else {
				player.setLeft(false);
			}
			if (player.getX() < mouseX) {
				player.setRight(true);
			} else {
				player.setRight(false);
			}
			if (player.getY() + player.getHeight() > mouseY) {
				player.setUp(true);
			} else {
				player.setUp(false);
			}
			if (player.getY() < mouseY) {
				player.setDown(true);
			} else {
				player.setDown(false);
			}
		}
		screen.draw(this);
//		if (!Background.getPaused()) {
		screen.update();
//		}

	}

	/**
	 * The mousePressed method detects when the mouse is pressed and checks whether
	 * to switch the screen and start the game
	 */
	public void mousePressed() {
		int type = MainMenu.clicked(mouseX, mouseY);
		if (current == CurrentScreen.MENU) {
			if (type == 1) {
				screen = new MainGame(player);
				b.reset();
				current = CurrentScreen.GAME;
			} else if (type == 2) {
				screen = new BackgroundSelect();
				current = CurrentScreen.BACKGROUNDSELECT;
			} else if (type == 3) {
				screen = new PlayerSelect();
				current = CurrentScreen.PLAYERSELECT;
			}
		} else if (current == CurrentScreen.PLAYERSELECT) {
			if (mouseX > 50.0 && mouseX < 250.0 && mouseY > 175.0 && mouseY < 375.0) {
				PlayerSelect.setSelection("default");
				player.setImage("player1.png");
			} else if (mouseX > 300.0 && mouseX < 500.0 && mouseY > 175.0 && mouseY < 375.0) {
				PlayerSelect.setSelection("cop");
				player.setImage("policeCar.png");
			} else if (mouseX > 550.0 && mouseX < 750.0 && mouseY > 175.0 && mouseY < 375.0) {
				PlayerSelect.setSelection("other");
				player.setImage("player1.png");
			} else if (mouseX > 265 && mouseX < 535 && mouseY > 500 && mouseY < 545) {
				screen = new MainMenu();
				current = CurrentScreen.MENU;
			}
		} else if (current == CurrentScreen.BACKGROUNDSELECT) {
			if (mouseX > 50.0 && mouseX < 250.0 && mouseY > 175.0 && mouseY < 375.0) {
				BackgroundSelect.setSelection("normal");
				BackgroundManager.setBackground("normal");
				b = BackgroundManager.getBackground();
			} else if (mouseX > 300.0 && mouseX < 500.0 && mouseY > 175.0 && mouseY < 375.0) {
				BackgroundSelect.setSelection("country");
				BackgroundManager.setBackground("country");
				b = BackgroundManager.getBackground();
			} else if (mouseX > 550.0 && mouseX < 750.0 && mouseY > 175.0 && mouseY < 375.0) {
				BackgroundSelect.setSelection("desert");
				BackgroundManager.setBackground("desert");
				b = BackgroundManager.getBackground();
			} else if (mouseX > 265 && mouseX < 535 && mouseY > 500 && mouseY < 545) {
				screen = new MainMenu();
				current = CurrentScreen.MENU;
			}
		} else if (current == CurrentScreen.GAMEOVER) {
			if (mouseX > 265 && mouseX < 535 && mouseY > 400 && mouseY < 445) {
				player.reset();
				screen = new MainMenu();
				current = CurrentScreen.MENU;
				b.reset();
			}
//		} else if (current == CurrentScreen.GAME) {
//			if (mouseX > 730 && mouseX < 780 && mouseY > 10 && mouseY < 60) {
////				Background.setPaused(true);
//			} else if (Background.getPaused() && (mouseX > 730 && mouseX < 780 && mouseY > 10 && mouseY < 60)) {
////				Background.setPaused(false);
//			}
		}

	}

	/**
	 * This method when in the game screen will set the boolean variable of the
	 * direction of movement that is entered by the user as true when a "wasd" key
	 * is pressed.
	 */
	public void keyPressed() {
		if (!mouseMode) {
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
	}

	/**
	 * This method when in the game screen will set the boolean variable of the
	 * direction of movement that is released by the user as false when a "wasd" key
	 * is released.
	 */
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
			} else if (key == 'e') {
				player.setLeft(false);
				player.setDown(false);
				player.setUp(false);
				player.setRight(false);

				mouseMode = !mouseMode;
			}
		}
	}

	/**
	 * This method handles all the collisions between the player and the incoming
	 * cars. After being hit it also implements a cool down or invulnerability
	 * period. This method also prevents the player from leaving the road
	 *
	 * @param player the main user.
	 */
	public void collision(Player player) {
		tick++;

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
						allScores.add((int) GameOver.finalScore());
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
					allScores.add((int) GameOver.finalScore());
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

	public static ArrayList<Integer> getScores() {
		return allScores;
	}

}

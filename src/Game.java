import backgrounds.Background;
import backgrounds.NormalRoad;
import entities.Player;
import processing.core.PApplet;
import screens.MainGame;
import screens.MainMenu;
import screens.Screen;

/**
 * The Game class represents the actual game panel where
 * the game is played on
 * @author Karan Dalal
 * @version 1.0
 *
 */
public class Game extends PApplet{
	
	private Screen screen;
	
	private Background b;
	
	public static CurrentScreen current; 
	
	private enum CurrentScreen {
		MENU, GAME;
	}

	private static Player player;
	/**
	 * The setup method sets up the game panel for play with the MainMenu screen.
	 */
	public void setup() {
		current = CurrentScreen.MENU;
		screen = new MainMenu();
		surface.setSize(800,600);
		surface.setResizable(true);

		b = new NormalRoad();
	}
	
	/**
	 * The draw method in game draws the screens and everything that is displayed on the window
	 */
	public void draw() {
		if(current == CurrentScreen.GAME) {
			b.draw(this);
			player.draw(this);
			player.act();

		}

		

		screen.draw(this);
		screen.update();

	
		
	}
	
	public void mousePressed() {
		int type = MainMenu.clicked(mouseX, mouseY);
		if(current == CurrentScreen.MENU) {
			if(type == 1) {
				player = new Player(width / 2, height - 50, 50 , 75);
				screen = new MainGame(player);
				current = CurrentScreen.GAME;
			}
		}
	}
	
	
	public void keyPressed() {
		if(key == 'a') {
			player.setLeft(true);
		}else if(key == 's') {
			player.setDown(true);
		}else if(key == 'w') {
			player.setUp(true);
		}else if(key == 'd') {
			player.setRight(true);
		}
	}
	public void keyReleased() {
		if(key == 'a') {
			player.setLeft(false);
		}else if(key == 's') {
			player.setDown(false);
		}else if(key == 'w') {
			player.setUp(false);
		}else if(key == 'd') {
			player.setRight(false);
		}
	}
	
}

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
	
	private static Player player;
	/**
	 * The setup method sets up the game panel for play with the MainMenu screen.
	 */
	public void setup() {
		player = new Player(50,50, 50, 50);
		screen = new MainGame(player);
		surface.setSize(400,300);
		surface.setResizable(true);

		b = new NormalRoad();
	}
	
	/**
	 * The draw method in game draws the screens and everything that is displayed on the window
	 */
	public void draw() {
//		background(0,0,0);
//		screen.draw(this);
//		screen.update();
		
		b.draw(this);
		screen.draw(this);
		screen.update();
		player.draw(this);
		player.act();
	
	}
	
}

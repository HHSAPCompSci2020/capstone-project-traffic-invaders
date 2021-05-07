import processing.core.PApplet;
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

	/**
	 * The setup method sets up the game panel for play with the MainMenu screen.
	 */
	public void setup() {
		screen = new MainMenu();
		surface.setSize(400,300);
		surface.setResizable(false);

	}
	
	/**
	 * The draw method constantly uns and updates the screen.
	 */
	public void draw() {
		background(0,0,0);
		screen.draw(this);
		screen.update();
	}
	
}

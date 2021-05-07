import processing.core.PApplet;
import screens.MainMenu;
import screens.Screen;

/**
 * The Game class represents the actual game panel where
 * the game is played on
 * @author Karan Dalal
 * @verion 1.0
 *
 */
public class Game extends PApplet{
	
	private Screen screen;

	public void setup() {
		screen = new MainMenu();
		surface.setSize(400,300);
		surface.setResizable(false);

	}
	
	public void draw() {
		background(0,0,0);
		screen.draw(this);
		screen.update();
	}
	
}

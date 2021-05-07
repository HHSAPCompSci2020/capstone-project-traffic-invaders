import processing.core.PApplet;
import screens.MainMenu;
import screens.Screen;

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

package backgrounds;

import processing.core.PApplet;
import processing.core.PConstants;

/**
 * Superclass of all backgrounds
 * 
 * @author Vikram Penumarti
 * @version 1.0
 */
public class Background {
	static float time;
	static int score;
	static int difficulty;
	int runs;

	private int r, g, b;

	public static boolean paused = false;

	private static int firstLineX;
	private static int secondLineX;

	/**
	 * Sets the amount of times draw() has run, the time passed, and the difficulty
	 * factor, and gets colors
	 * 
	 * @param r the red color value
	 * @param g the green color value
	 * @param b the blue color value
	 */
	public Background(int r, int g, int b) {
		score = 0;
		runs = 0;
		time = 0;
		difficulty = 1;

		firstLineX = 0;
		secondLineX = 0;

		this.r = r;
		this.g = g;
		this.b = b;
	}

	/**
	 * Method that draws the backgrounds
	 * 
	 * @param s PApplet object
	 */
	public void draw(PApplet s) {
		s.background(r, g, b);

		// every time draw() is called time increases
		if (!paused) {
			time++;
			score++;
		}
		s.text("Score: " + score, s.width / 16, s.height / 12);
		scroll(s);
		paused(s);

	}

	public void paused(PApplet s) {
		if (paused) {
			s.noStroke();
			s.fill(100, 100, 100);
			s.rect(0, 0, 800, 600);
			s.fill(0, 0, 0);
			s.rect(s.width / 2 - 100, s.height / 2 - 150, 200, 200);
			s.fill(255, 255, 255);
			s.rect(s.width / 2 - 60, s.height / 2 - 118, 48, 136);
			s.rect(s.width / 2 + 12, s.height / 2 - 118, 48, 136);
		} else {
			s.noStroke();
			s.fill(0, 0, 0);
			s.rect(730, 10, 50, 50);
			s.fill(255, 255, 255);
			s.rect(740, 18, 12, 34);
			s.rect(758, 18, 12, 34);
		}
	}

	/**
	 * Scrolls down the screen
	 * 
	 * @param s PApplet object
	 */
	public void scroll(PApplet s) {
		runs++;

		time += difficulty;

		firstLineX = s.width / 5;
		secondLineX = s.width - s.width / 5;
		s.line(firstLineX, 0, firstLineX, s.height);
		s.line(secondLineX, 0, secondLineX, s.height);
	}

	/**
	 * Gets the coordinates of the first line
	 * 
	 * @return firstLineX
	 */
	public static int getFirstLineX() {
		return firstLineX;
	}

	/**
	 * Gets the coordinates of the second line
	 * 
	 * @return secondLineX
	 */
	public static int getSecondLineX() {
		return secondLineX;
	}

	/**
	 * Gets the speed of the screen
	 * 
	 * @return time
	 */
	public static float getSpeed() {
		return time;
	}

	public static int getDifficulty() {
		return difficulty;
	}

	public static int getScore() {
		return score;
	}

	public void reset() {
		score = 0;
		time = 0;
	}

	public static void setPaused(boolean b) {
		paused = b;
	}

	public static boolean getPaused() {
		return paused;
	}

}
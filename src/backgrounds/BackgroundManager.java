package backgrounds;

/**
 * Manages the backgrounds, picks which one to use when
 * 
 * @author Vikram Penumarti
 * @version 1.0
 */
public class BackgroundManager {
	public static Background b = new NormalRoad();

	public static void setBackground(String s) {
		if (s == "normal") {
			b = new NormalRoad();
		} else if (s == "country") {
			b = new CountryRoad();
		} else if (s == "desert") {
			b = new DesertRoad();
		}
	}

	public static Background getBackground() {
		return b;
	}
}

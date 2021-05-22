package backgrounds;

/**
 * Manages the backgrounds, picks which one to use when
 * @author Vikram Penumarti
 * @version 1.0
 */
public class BackgroundManager
{
	private static Background b;
	
	public static Background chooseBackground()
	{
		int choose = (int)(Math.random() * 2);
		
		if(choose == 0)
		{
			b = new CountryRoad();
		}
		else if(choose == 1)
		{
			b = new NormalRoad();
		}
		else if(choose == 2)
		{
			b = new DesertRoad();
		}
		return b;
	}
}

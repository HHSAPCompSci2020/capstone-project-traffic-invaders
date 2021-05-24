package music;

import jay.jaysound.JayLayer;

public class Music
{
	private JayLayer sound;
	String[] songs;
	
	public Music()
	{
		super();
		sound = new JayLayer("Songs/","Songs/",false);
		songs = new String[] {"Crash.mp3", "Song1.mp3", "Song2.mp3", "Song3.mp3", "GameOver.mp3"};

		sound.addPlayList();
		sound.addSong(0, "Song2.mp3");
//		sound.addSong(0, "Song3.mp3");
//		sound.addSong(0, "Song1.mp3");

		sound.addPlayList();
		sound.addSong(1, "Crash.mp3");

		sound.addPlayList();
		sound.addSong(2, "GameOver.mp3");
	}
	
	public void playMusic()
	{
		sound.changePlayList(0);
		sound.nextSong();
	}
	
	public void gameOver()
	{
		sound.changePlayList(2);
		sound.nextSong();
	}
	
	public void crash()
	{
		sound.changePlayList(1);
		sound.nextSong();
	}
	
//	public void toggle()
//	{
//		if(sound.isPlaying())
//		{
//			sound.stopSong();
//		}
//		else
//		{
//			playMusic();
//		}
//	}
}
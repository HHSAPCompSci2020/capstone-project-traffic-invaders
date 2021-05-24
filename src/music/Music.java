package music;

import jay.jaysound.JayLayer;

public class Music
{
	private JayLayer sound;
//	private String[] soundEffects;
	String[] songs;
//	private boolean play;
	
	public Music()
	{
		super();
		sound = new JayLayer("Songs/","Songs/",false);
		songs = new String[] {"Crash.mp3", "Song1.mp3", "GameOver.mp3"};
//		soundEffects = new String[] {"GameOver.mp3", "Crash.mp3"};
//		sound.addSoundEffect("GameOver.mp3");
//		sound.addSoundEffect("Crash.mp3");

		sound.addPlayList();
		sound.addSong(0, "Song1.mp3");

		sound.addPlayList();
		sound.addSong(1, "Crash.mp3");

		sound.addPlayList();
		sound.addSong(2, "GameOver.mp3");
		
//		play = true;
	}
	
	public void playMusic()
	{
//		sound.addPlayList();
//		sound.addSong(0, "Song1.mp3");
		
//		if(play)
//		{
			sound.changePlayList(0);
			sound.nextSong();
//		}
	}
	
	public void gameOver()
	{
//		sound.addPlayList();
//		sound.addSong(1, "GameOver.mp3");
//		play = false;
		sound.changePlayList(2);
		sound.nextSong();
//		play = true;
		
//		sound.stopSong();
////		sound.playSoundEffect(0);
//		sound.nextSong();
	}
	
	public void crash()
	{
//		sound.addPlayList();
//		sound.addSong(1, "Crash.mp3");
//		play = false;
		sound.changePlayList(1);
		sound.nextSong();
//		play = true;
		
////		sound.playSoundEffect(1);
//		sound.nextSong();
	}
}
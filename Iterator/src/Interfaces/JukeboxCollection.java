package Interfaces;

import classes.Jukebox;
import classes.MusicGenre;

public interface JukeboxCollection {
	public void addJukebox(Jukebox j);
	public void removeJukebox(Jukebox j);
	public JukeboxIterator iterator(MusicGenre genre);
}

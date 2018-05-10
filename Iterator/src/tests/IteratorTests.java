package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import Interfaces.JukeboxIterator;
import classes.Jukebox;
import classes.JukeboxStorage;
import classes.MusicGenre;

public class IteratorTests {
	private JukeboxStorage jukebox;
	@Before
	public void setUp() throws Exception {
		jukebox = new JukeboxStorage();
		
		jukebox.addJukebox(new Jukebox(MusicGenre.METAL, 15));
		jukebox.addJukebox(new Jukebox(MusicGenre.AVANTGARDE, 13));
		jukebox.addJukebox(new Jukebox(MusicGenre.CLASSICAL, 10));
		jukebox.addJukebox(new Jukebox(MusicGenre.ROCK, 23));
		jukebox.addJukebox(new Jukebox(MusicGenre.HIP_HOP, 16));
		jukebox.addJukebox(new Jukebox(MusicGenre.AVANTGARDE, 23));
	}

	@Test
	public void testIteratorKeepingTrackOfItems() {
		JukeboxIterator iterator = jukebox.iterator(MusicGenre.AVANTGARDE);
		//	Jukebox has two Avantgarde playlists
		while(iterator.hasNext()){
			Jukebox jb = iterator.next();
			System.out.println(jb.getGenre());
			assertNotNull(jb);
		}
		assertFalse(iterator.hasNext());
		
	}

}

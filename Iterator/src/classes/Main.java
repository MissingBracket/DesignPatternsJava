package classes;

import Interfaces.JukeboxIterator;

public class Main {

	public static void main(String[] args) {
		JukeboxStorage storage = new JukeboxStorage();
		storage.addJukebox(new Jukebox(MusicGenre.METAL, 15));
		storage.addJukebox(new Jukebox(MusicGenre.AVANTGARDE, 13));
		storage.addJukebox(new Jukebox(MusicGenre.CLASSICAL, 10));
		storage.addJukebox(new Jukebox(MusicGenre.ROCK, 23));
		storage.addJukebox(new Jukebox(MusicGenre.HIP_HOP, 16));
		storage.addJukebox(new Jukebox(MusicGenre.AVANTGARDE, 23));
		storage.addJukebox(new Jukebox(MusicGenre.POP, 5));
		storage.addJukebox(new Jukebox(MusicGenre.ROCK, 33));
		JukeboxIterator iterator = storage.iterator(MusicGenre.AVANTGARDE);
		while(iterator.hasNext()){
			Jukebox jb = iterator.next();
			System.out.println(jb.toString());
		}
	}

}

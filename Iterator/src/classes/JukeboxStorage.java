package classes;

import java.util.ArrayList;
import java.util.List;

import Interfaces.JukeboxCollection;
import Interfaces.JukeboxIterator;

/**
 * Implementation of own collection interface
 * @author smiley
 */
public class JukeboxStorage implements JukeboxCollection{

	private List<Jukebox> jukeboxes;
	
	public JukeboxStorage() {
		jukeboxes = new ArrayList<>();
	}
	
	@Override
	public void addJukebox(Jukebox j) {
		this.jukeboxes.add(j);
		
	}

	@Override
	public void removeJukebox(Jukebox j) {
		this.jukeboxes.remove(j);
		
	}

	@Override
	public JukeboxIterator iterator(MusicGenre genre) {
		return new JukeboxIteratorImpl(genre, this.jukeboxes);
	}
	/**
	 * @author smileperience
	 *Implementation of iterator for own collection
	 */
	private class JukeboxIteratorImpl implements JukeboxIterator{


		private MusicGenre music;
		private List<Jukebox> jukeboxes;
		private int position;
		
		/**
		 * @param g - Genre of music to search for
		 * @param jukeboxes - List of jukeboxes to search through
		 */
		public JukeboxIteratorImpl(MusicGenre g, List<Jukebox> jukeboxes) {
			this.music=g;
			this.jukeboxes=jukeboxes;
		}
		
		@Override
		public boolean hasNext() {
			while(position < jukeboxes.size()){
				Jukebox box = jukeboxes.get(position);
				if(box.getGenre().equals(music)){
					return true;
				}else
					position++;
			}
			return false;
		}

		@Override
		public Jukebox next() {
			Jukebox jb = jukeboxes.get(position);
			position++;
			return jb;
		}
		
	}

}

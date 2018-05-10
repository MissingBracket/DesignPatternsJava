package Interfaces;

import classes.Jukebox;

/**
 * Interface for creating simple iterator
 * @author smiley
 */
public interface JukeboxIterator {

	/**
	 * @return information whether a collection has another member
	 */
	public boolean hasNext();
	
	/**
	 * @return another member of collection
	 */
	public Jukebox next();
}
